/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Dominio.Registro;
import Servicio.Fachada;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Usuario1
 */
public class jfrmBuscarModificar extends javax.swing.JFrame {

        Fachada fachada;
        
    public jfrmBuscarModificar() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jbtnModificar = new javax.swing.JButton();
        jlblBuscarDepto = new javax.swing.JLabel();
        jbtnMostrarRegistros = new javax.swing.JButton();
        jlblFecha = new javax.swing.JLabel();
        jlblNombreDepto = new javax.swing.JLabel();
        jtxtNombreDepto = new javax.swing.JTextField();
        jCalendar = new com.toedter.calendar.JDateChooser();
        jbtnVolver = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblTablaRegistros = new javax.swing.JTable();
        jtxtIdSeleccionada = new javax.swing.JTextField();
        jlblIdSeleccionada = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnModificar.setText("Modificar");
        jbtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnModificarActionPerformed(evt);
            }
        });

        jlblBuscarDepto.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 36)); // NOI18N
        jlblBuscarDepto.setText("Buscar registro");

        jbtnMostrarRegistros.setText("Mostrar registros");
        jbtnMostrarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMostrarRegistrosActionPerformed(evt);
            }
        });

        jlblFecha.setText("Fecha:");

        jlblNombreDepto.setText("Nombre depto:");

        jbtnVolver.setText("Volver");
        jbtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVolverActionPerformed(evt);
            }
        });

        jtblTablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Departamento", "Tipo de Precipitación", "Fecha", "Hora", "Precipitación", "Temperatura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblTablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtblTablaRegistrosMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jtblTablaRegistros);

        jlblIdSeleccionada.setText("Id Seleccionada:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnMostrarRegistros)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblFecha)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlblNombreDepto)
                                .addGap(5, 5, 5)
                                .addComponent(jtxtNombreDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jlblIdSeleccionada)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtIdSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblBuscarDepto)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblBuscarDepto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblIdSeleccionada)
                            .addComponent(jtxtIdSeleccionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblNombreDepto)
                            .addComponent(jtxtNombreDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jlblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jbtnMostrarRegistros)
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbtnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnMostrarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMostrarRegistrosActionPerformed
        ArrayList unaLista = (ArrayList) fachada.getRegistroCRUD().Registros();
        Object Registros[][] = new Object[unaLista.size()][7];
        for (int i = 0; i < unaLista.size(); i++) {
            Registro tmpRegistro = (Registro) unaLista.get(i);
            Registros[i][0] = tmpRegistro.getId();
            Registros[i][1] = tmpRegistro.getDepartamento();
            Registros[i][2] = tmpRegistro.getTipo_precipitacion();
            Registros[i][3] = tmpRegistro.getDia() + "/" + tmpRegistro.getMes() + "/" + tmpRegistro.getAño();
            Registros[i][4] = tmpRegistro.getHora() + ":" + tmpRegistro.getMinutos();
            Registros[i][5] = tmpRegistro.getPrecipitacion();
            Registros[i][6] = tmpRegistro.getTemperatura();
            this.
            jtblTablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
                    Registros,
                    new Object[]{
                        "Id", "Departamento", "Tipo de Precipitación", "Fecha",
                        "Hora", "Precipitación", "Temperatura",}));
        }
    }//GEN-LAST:event_jbtnMostrarRegistrosActionPerformed

    private void jbtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnModificarActionPerformed
        if(this.jtxtIdSeleccionada.getText() == null){
            JOptionPane.showMessageDialog(null, "Selecciones un registro");
        } else {
            jfrmModificar unFrm=new jfrmModificar();
            unFrm.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jbtnModificarActionPerformed

    private void jbtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVolverActionPerformed
        jfrmOpciones unFrm=new jfrmOpciones();
        unFrm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnVolverActionPerformed

    private void jtblTablaRegistrosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblTablaRegistrosMousePressed
        JTable aTable = (JTable) evt.getSource();
        Point point = evt.getPoint();
        int row = aTable.rowAtPoint(point);
        if (evt.getClickCount() == 1) {
            int id = Integer.parseInt(jtblTablaRegistros.getValueAt(jtblTablaRegistros.getSelectedRow(), 0).toString());
            fachada.agarrarIdDepartamento(id);
            this.jtxtIdSeleccionada.setText(String.valueOf(id));
        }
    }//GEN-LAST:event_jtblTablaRegistrosMousePressed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jCalendar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbtnModificar;
    private javax.swing.JButton jbtnMostrarRegistros;
    private javax.swing.JButton jbtnVolver;
    private javax.swing.JLabel jlblBuscarDepto;
    private javax.swing.JLabel jlblFecha;
    private javax.swing.JLabel jlblIdSeleccionada;
    private javax.swing.JLabel jlblNombreDepto;
    private javax.swing.JTable jtblTablaRegistros;
    private javax.swing.JTextField jtxtIdSeleccionada;
    private javax.swing.JTextField jtxtNombreDepto;
    // End of variables declaration//GEN-END:variables

}