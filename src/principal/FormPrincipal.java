package principal;

import java.awt.Color;
import ventanas.PanelInscripcion;
import ventanas.PanelAsistencia;
import ventanas.PanelPagos;
import ventanas.PanelDocentes;
import ventanas.PanelCronograma;

// *** @author Criss.- *** //

public class FormPrincipal extends javax.swing.JFrame {

    public FormPrincipal() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        BtnCronograma = new javax.swing.JPanel();
        txtCronograma = new javax.swing.JLabel();
        BtnDocente = new javax.swing.JPanel();
        txtDocente = new javax.swing.JLabel();
        BtnPago = new javax.swing.JPanel();
        txtPago = new javax.swing.JLabel();
        BtnAsistencia = new javax.swing.JPanel();
        txtAsistencia = new javax.swing.JLabel();
        BtnInscripcion = new javax.swing.JPanel();
        txtInscripcion = new javax.swing.JLabel();
        FondoSuperior = new javax.swing.JLabel();
        BtnFondoCerrar = new javax.swing.JPanel();
        BtnFrenteCerrar = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        fondoLogoETIC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setPreferredSize(new java.awt.Dimension(1000, 650));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCronograma.setBackground(new java.awt.Color(255, 255, 255));
        BtnCronograma.setPreferredSize(new java.awt.Dimension(150, 40));
        BtnCronograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCronogramaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCronogramaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCronogramaMouseExited(evt);
            }
        });

        txtCronograma.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtCronograma.setForeground(new java.awt.Color(0, 0, 255));
        txtCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCronograma.setText("Cronograma");

        javax.swing.GroupLayout BtnCronogramaLayout = new javax.swing.GroupLayout(BtnCronograma);
        BtnCronograma.setLayout(BtnCronogramaLayout);
        BtnCronogramaLayout.setHorizontalGroup(
            BtnCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnCronogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCronograma, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnCronogramaLayout.setVerticalGroup(
            BtnCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnCronogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCronograma, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(BtnCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, 210, 40));

        BtnDocente.setBackground(new java.awt.Color(255, 255, 255));
        BtnDocente.setPreferredSize(new java.awt.Dimension(150, 40));
        BtnDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDocenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnDocenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnDocenteMouseExited(evt);
            }
        });

        txtDocente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtDocente.setForeground(new java.awt.Color(0, 0, 255));
        txtDocente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDocente.setText("Docentes");

        javax.swing.GroupLayout BtnDocenteLayout = new javax.swing.GroupLayout(BtnDocente);
        BtnDocente.setLayout(BtnDocenteLayout);
        BtnDocenteLayout.setHorizontalGroup(
            BtnDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnDocenteLayout.setVerticalGroup(
            BtnDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDocente, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(BtnDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 230, 40));

        BtnPago.setBackground(new java.awt.Color(255, 255, 255));
        BtnPago.setPreferredSize(new java.awt.Dimension(150, 40));
        BtnPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPagoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPagoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPagoMouseExited(evt);
            }
        });

        txtPago.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtPago.setForeground(new java.awt.Color(0, 0, 255));
        txtPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPago.setText("Pagos");

        javax.swing.GroupLayout BtnPagoLayout = new javax.swing.GroupLayout(BtnPago);
        BtnPago.setLayout(BtnPagoLayout);
        BtnPagoLayout.setHorizontalGroup(
            BtnPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnPagoLayout.setVerticalGroup(
            BtnPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPago, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(BtnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 230, 40));

        BtnAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        BtnAsistencia.setPreferredSize(new java.awt.Dimension(150, 40));
        BtnAsistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAsistenciaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAsistenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAsistenciaMouseExited(evt);
            }
        });

        txtAsistencia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtAsistencia.setForeground(new java.awt.Color(0, 0, 255));
        txtAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAsistencia.setText("Asistencia");

        javax.swing.GroupLayout BtnAsistenciaLayout = new javax.swing.GroupLayout(BtnAsistencia);
        BtnAsistencia.setLayout(BtnAsistenciaLayout);
        BtnAsistenciaLayout.setHorizontalGroup(
            BtnAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAsistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnAsistenciaLayout.setVerticalGroup(
            BtnAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAsistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(BtnAsistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 220, 40));

        BtnInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        BtnInscripcion.setPreferredSize(new java.awt.Dimension(150, 40));
        BtnInscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInscripcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnInscripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnInscripcionMouseExited(evt);
            }
        });

        txtInscripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtInscripcion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtInscripcion.setForeground(new java.awt.Color(0, 0, 255));
        txtInscripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtInscripcion.setText("Inscripcion");

        javax.swing.GroupLayout BtnInscripcionLayout = new javax.swing.GroupLayout(BtnInscripcion);
        BtnInscripcion.setLayout(BtnInscripcionLayout);
        BtnInscripcionLayout.setHorizontalGroup(
            BtnInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnInscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnInscripcionLayout.setVerticalGroup(
            BtnInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnInscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(BtnInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 220, 40));

        FondoSuperior.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoSuperior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo3.png"))); // NOI18N
        Background.add(FondoSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BtnFondoCerrar.setBackground(new java.awt.Color(0, 0, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFrenteCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFrenteCerrarLayout.setVerticalGroup(
            BtnFrenteCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BtnFondoCerrarLayout = new javax.swing.GroupLayout(BtnFondoCerrar);
        BtnFondoCerrar.setLayout(BtnFondoCerrarLayout);
        BtnFondoCerrarLayout.setHorizontalGroup(
            BtnFondoCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFondoCerrarLayout.setVerticalGroup(
            BtnFondoCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Background.add(BtnFondoCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 630, -1, -1));

        fondoLogoETIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoETIC2.png"))); // NOI18N
        fondoLogoETIC.setPreferredSize(new java.awt.Dimension(1366, 620));
        Background.add(fondoLogoETIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1366, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFrenteCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteCerrarMouseEntered
        // Animacion (Cerrar) para el boton cerrar ventana
        BtnFrenteCerrar.setBackground(Color.blue);
        txtCerrar.setForeground(Color.white);
    }//GEN-LAST:event_BtnFrenteCerrarMouseEntered

    private void BtnFrenteCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteCerrarMouseExited
        // Animacion (Cerrar) para el boton cerrar ventana
        BtnFrenteCerrar.setBackground(Color.white);
        txtCerrar.setForeground(Color.blue);
    }//GEN-LAST:event_BtnFrenteCerrarMouseExited

    private void BtnFrenteCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteCerrarMousePressed
        // Código para cerrar la ventana "Principal"
        dispose(); // Cierra sólo la ventana "Principal"
    }//GEN-LAST:event_BtnFrenteCerrarMousePressed

    private void BtnInscripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInscripcionMouseEntered
        // TODO add your handling code here:
        BtnInscripcion.setBackground(Color.blue);
        txtInscripcion.setForeground(Color.white);
    }//GEN-LAST:event_BtnInscripcionMouseEntered

    private void BtnAsistenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAsistenciaMouseEntered
        // TODO add your handling code here:
        BtnAsistencia.setBackground(Color.blue);
        txtAsistencia.setForeground(Color.white);
    }//GEN-LAST:event_BtnAsistenciaMouseEntered

    private void BtnPagoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPagoMouseEntered
        // TODO add your handling code here:
        BtnPago.setBackground(Color.blue);
        txtPago.setForeground(Color.white);
    }//GEN-LAST:event_BtnPagoMouseEntered

    private void BtnDocenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDocenteMouseEntered
        // TODO add your handling code here:
        BtnDocente.setBackground(Color.blue);
        txtDocente.setForeground(Color.white);
    }//GEN-LAST:event_BtnDocenteMouseEntered

    private void BtnCronogramaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCronogramaMouseEntered
        // TODO add your handling code here:
        BtnCronograma.setBackground(Color.blue);
        txtCronograma.setForeground(Color.white);
    }//GEN-LAST:event_BtnCronogramaMouseEntered

    private void BtnInscripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInscripcionMouseExited
        // TODO add your handling code here:
        BtnInscripcion.setBackground(Color.white);
        txtInscripcion.setForeground(Color.blue);
    }//GEN-LAST:event_BtnInscripcionMouseExited

    private void BtnAsistenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAsistenciaMouseExited
        // TODO add your handling code here:
        BtnAsistencia.setBackground(Color.white);
        txtAsistencia.setForeground(Color.blue);
    }//GEN-LAST:event_BtnAsistenciaMouseExited

    private void BtnPagoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPagoMouseExited
        // TODO add your handling code here:
        BtnPago.setBackground(Color.white);
        txtPago.setForeground(Color.blue);
    }//GEN-LAST:event_BtnPagoMouseExited

    private void BtnDocenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDocenteMouseExited
        // TODO add your handling code here:
        BtnDocente.setBackground(Color.white);
        txtDocente.setForeground(Color.blue);
    }//GEN-LAST:event_BtnDocenteMouseExited

    private void BtnCronogramaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCronogramaMouseExited
        // TODO add your handling code here:
        BtnCronograma.setBackground(Color.white);
        txtCronograma.setForeground(Color.blue);
    }//GEN-LAST:event_BtnCronogramaMouseExited

    private void BtnInscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInscripcionMouseClicked
        // Hacer el llamado al "PanelInscripcion"
        PanelInscripcion panelInscripcion = new PanelInscripcion();
        panelInscripcion.setVisible(true); // Muestra el "Panel de Inscripcion"
    }//GEN-LAST:event_BtnInscripcionMouseClicked

    private void BtnAsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAsistenciaMouseClicked
        // Hacer el llamado al "PanelAsistencia"
        PanelAsistencia panelAsistencia = new PanelAsistencia();
        panelAsistencia.setVisible(true); // Muestra el "Panel de Asistencia"
    }//GEN-LAST:event_BtnAsistenciaMouseClicked

    private void BtnPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPagoMouseClicked
        // Hacer el llamado al "PanelPagos"
        PanelPagos panelPagos = new PanelPagos();
        panelPagos.setVisible(true); // Muestra el "Panel de Pagos"
    }//GEN-LAST:event_BtnPagoMouseClicked

    private void BtnDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDocenteMouseClicked
        // Hacer el llamado al "PanelDocentes"
        PanelDocentes panelDocentes = new PanelDocentes();
        panelDocentes.setVisible(true); // Muestra el "Panel de Docentes"
    }//GEN-LAST:event_BtnDocenteMouseClicked

    private void BtnCronogramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCronogramaMouseClicked
        // Hacer el llamado al "PanelCronograma"
        PanelCronograma panelCronograma = new PanelCronograma();
        panelCronograma.setVisible(true); // Muestra el "Panel de Cronograma"
    }//GEN-LAST:event_BtnCronogramaMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BtnAsistencia;
    private javax.swing.JPanel BtnCronograma;
    private javax.swing.JPanel BtnDocente;
    private javax.swing.JPanel BtnFondoCerrar;
    private javax.swing.JPanel BtnFrenteCerrar;
    private javax.swing.JPanel BtnInscripcion;
    private javax.swing.JPanel BtnPago;
    private javax.swing.JLabel FondoSuperior;
    private javax.swing.JLabel fondoLogoETIC;
    private javax.swing.JLabel txtAsistencia;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtCronograma;
    private javax.swing.JLabel txtDocente;
    private javax.swing.JLabel txtInscripcion;
    private javax.swing.JLabel txtPago;
    // End of variables declaration//GEN-END:variables
}
