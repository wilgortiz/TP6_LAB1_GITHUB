/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp6.vistas;

import tp6.negocio.Cliente;

/**
 *
 * @author wilgortiz
 */
public class ViewBorrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewBorrarCliente
     */
    public ViewBorrarCliente() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTcampoTelefono = new javax.swing.JTextField();
        JBbuscar = new javax.swing.JButton();
        jBborrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextoResultado = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(153, 51, 255));

        jLabel1.setFont(new java.awt.Font("Playfair Display SC", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrar Clientes");

        jLabel2.setText("TELEFONO");

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTcampoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTcampoTelefonoActionPerformed(evt);
            }
        });

        JBbuscar.setText("BUSCAR");
        JBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBbuscarActionPerformed(evt);
            }
        });

        jBborrar.setText("BORRAR");
        jBborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBborrarActionPerformed(evt);
            }
        });

        jTextoResultado.setColumns(20);
        jTextoResultado.setRows(5);
        jTextoResultado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(jTextoResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jBborrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTcampoTelefono)
                .addGap(18, 18, 18)
                .addComponent(JBbuscar)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTcampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBbuscar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBborrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBbuscarActionPerformed
        String Buscar_telefono = jTcampoTelefono.getText();

        Cliente encuentra = Menu.miDirectorio.buscarCliente(Buscar_telefono);
        if (encuentra != null) {
            jTextoResultado.setText("\n NOMBRE: " + encuentra.getNombre()
                    + "\n APELLIDO: " + encuentra.getApellido() + "\n CIUDAD: " + encuentra.getCiudad() + "\n DIRECCIÓN: " + encuentra.getDireccion());
        } else {
            jTextoResultado.setText("          Cliente no encontrado          ");
        }

    }//GEN-LAST:event_JBbuscarActionPerformed

    private void jTcampoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcampoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcampoTelefonoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void limpiar() {
        jTextoResultado.setText("");
    }
    private void jBborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBborrarActionPerformed
        String Buscar_telefono = jTcampoTelefono.getText();
        //llama al metodo y lo ejecuta directamente
        Menu.miDirectorio.borrarCliente(Buscar_telefono);
        limpiar(); //llamo a este metodo para limpiar la pantalla
// TODO add your handling code here:
    }//GEN-LAST:event_jBborrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBbuscar;
    private javax.swing.JButton jBborrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcampoTelefono;
    private javax.swing.JTextArea jTextoResultado;
    // End of variables declaration//GEN-END:variables
}