/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Dominio.Registro;
import Servicio.Fachada;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class jfrmEliminar extends javax.swing.JFrame {

    Fachada fachada;
    
    public jfrmEliminar() {
        initComponents();
        fachada = Fachada.getInstancia();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblEliminar = new javax.swing.JLabel();
        jbtnEliminar = new javax.swing.JButton();
        jbtnVolver = new javax.swing.JButton();
        jtxtDepartamento = new javax.swing.JTextField();
        jlblDepartamento = new javax.swing.JLabel();
        jlblFecha = new javax.swing.JLabel();
        jCalendar = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlblEliminar.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 36)); // NOI18N
        jlblEliminar.setText("Eliminar Registro");

        jbtnEliminar.setText("Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnVolver.setText("Volver");
        jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverActionPerformed(evt);
            }
        });

        jlblDepartamento.setText("Ingrese departamento del Registro");

        jlblFecha.setText("Ingrese la fecha del Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblDepartamento)
                                    .addComponent(jlblFecha))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jlblEliminar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnVolver)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblEliminar)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblDepartamento))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlblFecha)
                    .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jbtnVolver)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverActionPerformed
        jfrmOpciones unFrm=new jfrmOpciones();
        unFrm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnVolverActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
        String departamento;
        int id=0;
        int dia = jCalendar.getCalendar().get(Calendar.DAY_OF_MONTH);
        int mes = jCalendar.getCalendar().get(Calendar.MONTH) + 1;
        int año = jCalendar.getCalendar().get(Calendar.YEAR);
        departamento = this.jtxtDepartamento.getText();
        ArrayList unaLista = (ArrayList) fachada.getRegistroCRUD().Registros();
        if(unaLista.isEmpty()){
            JOptionPane.showMessageDialog(null, "No hay registros creados");
        }
        else {
            for (int i = 0; i < unaLista.size(); i++) {
                Registro tmpReg = (Registro) unaLista.get(i);
                if(tmpReg.getDia() == dia && tmpReg.getMes() == mes){
                    fachada.getRegistroCRUD().Borrar(id);
                    JOptionPane.showMessageDialog(null, "Registro eliminado");
                }
            }
            
        }
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jCalendar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JLabel jlblDepartamento;
    private javax.swing.JLabel jlblEliminar;
    private javax.swing.JLabel jlblFecha;
    private javax.swing.JTextField jtxtDepartamento;
    // End of variables declaration//GEN-END:variables
}
