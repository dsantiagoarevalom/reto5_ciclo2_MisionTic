package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import utilidades.Propiedades;

public abstract class Conexion {
    private String usuario;
    private String clave;
    private String url;
    private String driver;
    protected Connection objConexionBD;
    
    public Conexion() {
        String archivoVariables = "archivoAcceso";
        usuario = Propiedades.leer(archivoVariables, "usuario").replaceAll("\"", "");
        clave = Propiedades.leer(archivoVariables, "clave").replaceAll("\"", "");
        url = Propiedades.leer(archivoVariables, "url").replaceAll("\"", "");
        driver = Propiedades.leer(archivoVariables, "driver").replaceAll("\"", "");
        
        activar();
    }
    private void activar(){
        try{
            Class.forName(driver);
            objConexionBD = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException e){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
