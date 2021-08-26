/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import javax.swing.JInternalFrame;

/**
 *
 * @author Santiago Arévalo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemIngresoNotas = new javax.swing.JMenuItem();
        jMenuItemListarNotas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso Notas Estudiantes");
        setBackground(new java.awt.Color(112, 224, 149));
        setPreferredSize(new java.awt.Dimension(520, 440));
        setResizable(false);

        panelPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPrincipal.setForeground(new java.awt.Color(122, 224, 149));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(500, 370));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Semana2_Java\\17_Reto_5\\data\\Imagenes\\principal2.png")); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 370));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(122, 224, 149));
        jMenuBar2.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        jMenuBar2.setPreferredSize(new java.awt.Dimension(114, 30));

        jMenu3.setText("Archivo");
        jMenu3.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jMenuItemAcercaDe.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jMenuItemAcercaDe.setText("Información");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAcercaDe);

        jMenuItemSalir.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemSalir);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Acciones");
        jMenu4.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N

        jMenuItemIngresoNotas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jMenuItemIngresoNotas.setText("Ingresar Notas");
        jMenuItemIngresoNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresoNotasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemIngresoNotas);

        jMenuItemListarNotas.setFont(new java.awt.Font("Comic Sans MS", 2, 12)); // NOI18N
        jMenuItemListarNotas.setText("Listar Notas");
        jMenuItemListarNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemListarNotasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemListarNotas);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void agregarVentana(JInternalFrame nuevaVentana){
        if(panelPrincipal.getComponentCount()>0){
            panelPrincipal.removeAll();
        }
        panelPrincipal.add(nuevaVentana);
    }
    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        Informacion ventanaInformacion;
        ventanaInformacion = new Informacion();
        agregarVentana(ventanaInformacion);
        ventanaInformacion.show();
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemIngresoNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresoNotasActionPerformed
        IngresoNotas ventanaIngresoNotas = new IngresoNotas();
        agregarVentana(ventanaIngresoNotas);
        ventanaIngresoNotas.show();
    }//GEN-LAST:event_jMenuItemIngresoNotasActionPerformed

    private void jMenuItemListarNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemListarNotasActionPerformed
        ListarNotas ventanaListarNotas = new ListarNotas();
        agregarVentana(ventanaListarNotas);
        ventanaListarNotas.show();
    }//GEN-LAST:event_jMenuItemListarNotasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemIngresoNotas;
    private javax.swing.JMenuItem jMenuItemListarNotas;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
