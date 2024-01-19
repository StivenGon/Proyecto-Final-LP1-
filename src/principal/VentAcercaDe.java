package principal;

// *** @author Criss.- ***

import java.awt.Color;


public class VentAcercaDe extends javax.swing.JFrame {
    
    public VentAcercaDe() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBN = new javax.swing.JPanel();
        txtSistemaGestion = new javax.swing.JLabel();
        txtEtic = new javax.swing.JLabel();
        txtVer1 = new javax.swing.JLabel();
        txtColaboradores = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BtnFrenteCerrar = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        BtnFondoCerrar = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        FondoBN.setBackground(new java.awt.Color(255, 255, 255));
        FondoBN.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSistemaGestion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtSistemaGestion.setForeground(new java.awt.Color(255, 255, 255));
        txtSistemaGestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSistemaGestion.setText("Sistema de Gestion Administrativa");
        FondoBN.add(txtSistemaGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 480, 40));

        txtEtic.setFont(new java.awt.Font("Roboto", 1, 54)); // NOI18N
        txtEtic.setForeground(new java.awt.Color(255, 255, 255));
        txtEtic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEtic.setText("ETIC");
        FondoBN.add(txtEtic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, 50));

        txtVer1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        txtVer1.setForeground(new java.awt.Color(255, 255, 255));
        txtVer1.setText("ver.: 1.0");
        FondoBN.add(txtVer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, -1));

        txtColaboradores.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtColaboradores.setForeground(new java.awt.Color(255, 255, 255));
        txtColaboradores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtColaboradores.setText("Colaboradores del Proyecto:");
        FondoBN.add(txtColaboradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        txtNombre1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre1.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre1.setText("• Oscar Stiven Aguilar Gonzalez");
        FondoBN.add(txtNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 30));

        txtNombre2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre2.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNombre2.setText("• Cristhian Abel Aguilar Gonzalez");
        FondoBN.add(txtNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 200, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Almacenamiento, trámite y reportes de los mismos.");
        FondoBN.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 480, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Grados, Materias, Docentes.");
        FondoBN.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 480, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Procesamiento de Matriculados, Asistencia de Estudiantes,");
        FondoBN.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 480, 20));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sofware desarrollado para la gestión administrativa de una escuela");
        FondoBN.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 480, 20));

        BtnFrenteCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BtnFrenteCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnFrenteCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFrenteCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFrenteCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFrenteCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFrenteCerrarMousePressed(evt);
            }
        });

        txtCerrar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtCerrar.setForeground(new java.awt.Color(0, 51, 255));
        txtCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCerrar.setText("Cerrar");

        javax.swing.GroupLayout BtnFrenteCerrarLayout = new javax.swing.GroupLayout(BtnFrenteCerrar);
        BtnFrenteCerrar.setLayout(BtnFrenteCerrarLayout);
        BtnFrenteCerrarLayout.setHorizontalGroup(
            BtnFrenteCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnFrenteCerrarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtCerrar)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        BtnFrenteCerrarLayout.setVerticalGroup(
            BtnFrenteCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFrenteCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtCerrar))
        );

        FondoBN.add(BtnFrenteCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 120, 20));

        BtnFondoCerrar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BtnFondoCerrarLayout = new javax.swing.GroupLayout(BtnFondoCerrar);
        BtnFondoCerrar.setLayout(BtnFondoCerrarLayout);
        BtnFondoCerrarLayout.setHorizontalGroup(
            BtnFondoCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        BtnFondoCerrarLayout.setVerticalGroup(
            BtnFondoCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        FondoBN.add(BtnFondoCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 140, 40));

        Background.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo2.png"))); // NOI18N
        FondoBN.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBN, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoBN, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFrenteCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteCerrarMousePressed
        // Código para cerrar la ventana "Acerca de"
        dispose(); // Cierra sólo la ventana "Acerca de"
    }//GEN-LAST:event_BtnFrenteCerrarMousePressed

    private void BtnFrenteCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteCerrarMouseEntered
        // Animacion (AcercaDe) para el boton cerrar ventana
        BtnFrenteCerrar.setBackground(Color.blue);
        txtCerrar.setForeground(Color.white);
    }//GEN-LAST:event_BtnFrenteCerrarMouseEntered

    private void BtnFrenteCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteCerrarMouseExited
        // Animacion (AcercaDe) para el boton cerrar ventana
        BtnFrenteCerrar.setBackground(Color.white);
        txtCerrar.setForeground(Color.blue);
    }//GEN-LAST:event_BtnFrenteCerrarMouseExited

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
            java.util.logging.Logger.getLogger(VentAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentAcercaDe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentAcercaDe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel BtnFondoCerrar;
    private javax.swing.JPanel BtnFrenteCerrar;
    private javax.swing.JPanel FondoBN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtColaboradores;
    private javax.swing.JLabel txtEtic;
    private javax.swing.JLabel txtNombre1;
    private javax.swing.JLabel txtNombre2;
    private javax.swing.JLabel txtSistemaGestion;
    private javax.swing.JLabel txtVer1;
    // End of variables declaration//GEN-END:variables
}
