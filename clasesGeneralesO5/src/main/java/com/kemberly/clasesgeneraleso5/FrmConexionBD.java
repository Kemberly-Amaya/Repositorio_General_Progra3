/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.kemberly.clasesgeneraleso5;

import DAO.Estudiantes;
import Entidades.Estudiante;
import Entidades.Nota;
import com.kemberly.BD.ConexionAMYSQL;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kembe
 */
public class FrmConexionBD extends javax.swing.JFrame {

    /**
     * Creates new form FrmConexionBD
     */
    public FrmConexionBD() {
        initComponents();
        Cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProbarConexion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbEstudiante = new javax.swing.JTable();
        btnModelo = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TxtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        btnProbarConexion.setBackground(new java.awt.Color(0, 204, 204));
        btnProbarConexion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProbarConexion.setText("Conexion BD");
        btnProbarConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbarConexionActionPerformed(evt);
            }
        });

        TbEstudiante.setBackground(new java.awt.Color(204, 204, 255));
        TbEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TbEstudiante);

        btnModelo.setText("Modelaje de Tabla");
        btnModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModeloActionPerformed(evt);
            }
        });

        btnInsertar.setText("Insertar");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProbarConexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModelo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnProbarConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProbarConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbarConexionActionPerformed
        // TODO add your handling code here:
        ConexionAMYSQL ClaseDeConexion = new ConexionAMYSQL();
        ClaseDeConexion.getConecction();
    }//GEN-LAST:event_btnProbarConexionActionPerformed

    private void btnModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModeloActionPerformed

        //Creacion  instancia tipo Nota
        Nota nota = new Nota();
        
        //Acceso a travez de la tabla madre Nota
        nota.getApellido();
        nota.getNota();
        nota.getNombreMateria();
        
        
//      //Modelado de tabla con codigo

//        String titulos[] = {"Nombre","Apellido"};//variable tipo arreglo de dos
//        //dimensiones las cuales eran represantadas como columna
//        
//        
//        //Ejemplos de arreglos
//        Double numero[] = new Double[3];
//
//        DefaultTableModel df = new DefaultTableModel(null, titulos);
//        
//        //Objeto tipo DAO
//         Estudiantes es = new Estudiantes();
//         ArrayList <Estudiante> listar = es.ListadoEstudiantes();
//         
//         Iterator iterar = listar.iterator();
//         
//         String fila[] = new String[2];
//         
//         while (iterar.hasNext()){
//             
//             Estudiante estBucle =(Estudiante)iterar.next();
//             fila[0] = estBucle.getNombre();
//             fila[1] = estBucle.getApellido();
//             df.addRow(fila);
//         
//         
//         }
//         
//        TbEstudiante.setModel(df);
    }//GEN-LAST:event_btnModeloActionPerformed
    public void Cargar() {
  //Modelado de tabla con codigo
        String titulos[] = {"Nombre","Apellido"};//variable tipo arreglo de dos
        //dimensiones las cuales eran represantadas como columna
        
        
        //Ejemplos de arreglos
        Double numero[] = new Double[3];

        DefaultTableModel df = new DefaultTableModel(null, titulos);
        
        //Objeto tipo DAO
         Estudiantes es = new Estudiantes();
         ArrayList <Estudiante> listar = es.ListadoEstudiantes();
         
//         Iterator iterar = listar.iterator();
         
        String fila[] = new String[2];

        //Foreach, usar para recorrer metodo
//            for (var listado : es.ListadoEstudiantes) --- Otra forma de hacerlo
        for (var iteracion : listar) {
//             Estudiante estBucle = new Estudiante();
            fila[0] = iteracion.getNombre();
            fila[1] = iteracion.getApellido();
            df.addRow(fila);
        }
                TbEstudiante.setModel(df); 
//         while (iterar.hasNext()){
//             
//             Estudiante estBucle =(Estudiante)iterar.next();
//             fila[0] = estBucle.getNombre();
//             fila[1] = estBucle.getApellido();
//             df.addRow(fila);
//         }
         
    
}
    
    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        Estudiante es = new Estudiante();
        Estudiantes esDao = new Estudiantes();
        
        es.setNombre(TxtNombre.getText());
        es.setApellido(TxtApellido.getText());
        esDao.AgregarEstudiante(es);
        Cargar();
    }//GEN-LAST:event_btnInsertarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConexionBD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmConexionBD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TbEstudiante;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnModelo;
    private javax.swing.JButton btnProbarConexion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
