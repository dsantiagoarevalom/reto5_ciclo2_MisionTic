package dao;

import configuracion.Conexion;
import interfaces.Acciones;
import java.util.List;
import modelos.Notas;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAONotas extends Conexion implements Acciones<Notas> {

    private String sql;
    private PreparedStatement consulta;

    public DAONotas() {
    }

    @Override
    public boolean agregar(Notas objeto) {
        try {
            sql = "INSERT INTO notas (nombreestudiante, nota1, nota2, nota3, definitiva) VALUES (?,?,?,?,?)";
            consulta = objConexionBD.prepareStatement(sql);
            consulta.setString(1, objeto.getNombreestudiante());
            consulta.setString(2, String.valueOf(objeto.getNota1()));
            consulta.setString(3, String.valueOf(objeto.getNota2()));
            consulta.setString(4, String.valueOf(objeto.getNota3()));
            consulta.setString(5, String.valueOf(objeto.getDefinitiva()));
            int filas = consulta.executeUpdate();
            objConexionBD.close();
            return filas > 0;
        } catch (SQLException e) {
            Logger.getLogger(DAONotas.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }

    @Override
    public List<Notas> consultar() {
        try {
            ResultSet resultado;
            List<Notas> arregloNotas = new ArrayList<>();
            sql = "SELECT idnota, nombreestudiante, nota1, nota2, nota3, definitiva FROM notas ORDER BY idnota ASC";
            consulta = objConexionBD.prepareStatement(sql);
            resultado = consulta.executeQuery();
            while (resultado.next()){
                Notas objConsulta = new Notas();
                objConsulta.setIdnota(Integer.parseInt(resultado.getObject(1).toString()));
                objConsulta.setNombreestudiante(resultado.getObject(2).toString());
                objConsulta.setNota1(Double.parseDouble(resultado.getObject(3).toString()));
                objConsulta.setNota2(Double.parseDouble(resultado.getObject(4).toString()));
                objConsulta.setNota3(Double.parseDouble(resultado.getObject(5).toString()));
                objConsulta.setDefinitiva(Double.parseDouble(resultado.getObject(6).toString()));
                arregloNotas.add(objConsulta);
            }
            objConexionBD.close();
            return arregloNotas;
        } catch (SQLException e) {
            Logger.getLogger(DAONotas.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
