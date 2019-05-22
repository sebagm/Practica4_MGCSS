/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.mycompany.gtp.manejaCuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Seba Garcia
 */
public class AddCuenta extends javax.swing.JFrame {

    private manejaCuenta mc;
    private int id_usu;
    /**
     * Creates new form AddCuenta
     */
    public AddCuenta(int id) {
        initComponents();
        mc = new manejaCuenta();
        id_usu = id;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelGTP = new javax.swing.JLabel();
        labelAC = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        labelNU = new javax.swing.JLabel();
        tf_NU = new javax.swing.JTextField();
        labelC = new javax.swing.JLabel();
        tf_C = new javax.swing.JTextField();
        labelD = new javax.swing.JLabel();
        tf_D = new javax.swing.JTextField();
        btn_A = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(100, 100));
        setPreferredSize(new java.awt.Dimension(700, 450));
        setSize(new java.awt.Dimension(700, 450));

        labelGTP.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        labelGTP.setText("GuardaTuPassword");

        labelAC.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        labelAC.setText("Añadir Cuenta");

        btnAtras.setText("Volver a Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        labelNU.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelNU.setText("Nombre de usuario o correo electrónico:");

        tf_NU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NUActionPerformed(evt);
            }
        });

        labelC.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelC.setText("Contraseña:");

        tf_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CActionPerformed(evt);
            }
        });

        labelD.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        labelD.setText("Descripción:");

        tf_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_DActionPerformed(evt);
            }
        });

        btn_A.setText("Añadir");
        btn_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btn_A, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(tf_NU, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelNU)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tf_D, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(tf_C, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelGTP, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(labelAC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelGTP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(labelAC)
                .addGap(18, 18, 18)
                .addComponent(labelNU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_NU, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_C, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_D, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btn_A, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void tf_NUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NUActionPerformed

    private void tf_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CActionPerformed

    private void tf_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_DActionPerformed

    private void btn_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AActionPerformed
        if(tf_C.getText().isEmpty() || tf_D.getText().isEmpty() || tf_NU.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane, "Error: No puede haber campos vacíos", "Ventana de información", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            if( mc.crearCuenta(tf_NU.getText(), tf_C.getText(), tf_D.getText()) > 0 )
                JOptionPane.showMessageDialog(rootPane, "Cuenta añadida correctamente", "Ventana de información", JOptionPane.INFORMATION_MESSAGE);
            else
                JOptionPane.showMessageDialog(rootPane, "Error: No se pudo añadir la cuenta", "Ventana de información", JOptionPane.INFORMATION_MESSAGE);
        }
        this.dispose();
    }//GEN-LAST:event_btn_AActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btn_A;
    private javax.swing.JLabel labelAC;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelGTP;
    private javax.swing.JLabel labelNU;
    private javax.swing.JTextField tf_C;
    private javax.swing.JTextField tf_D;
    private javax.swing.JTextField tf_NU;
    // End of variables declaration//GEN-END:variables
}
