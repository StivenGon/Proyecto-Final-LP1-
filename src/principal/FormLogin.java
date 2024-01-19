package principal;

import java.awt.Color;
import javax.management.StringValueExp;
import javax.swing.JOptionPane;

//*** @author Oscar Stiven & Cristhian Abel ***//
public class FormLogin extends javax.swing.JFrame {

    int xMouse, yMouse; // Variables que "leen" la posición del Mouse
    private final String USUARIO_VALIDO = "admin";
    private final String CONTRASENA_VALIDA = "123456";

    public FormLogin() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
        CajaNombreUsuario.setToolTipText(null); // Anula cuadro de diálogo de ayuda
        CajaPasswordUsuario.setToolTipText(null); // Anula cuadro de diálogo de ayuda
        BtnAcercaDe.setToolTipText("Acerca de"); // Muestra un pequeño texto "Acerca de" en el botón 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        BtnAcercaDe = new javax.swing.JLabel();
        SistemaDeGestion = new javax.swing.JLabel();
        Administrativa = new javax.swing.JLabel();
        LogoETIC = new javax.swing.JLabel();
        IniciarSesion = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JLabel();
        CajaNombreUsuario = new javax.swing.JTextField();
        TextoContraseña = new javax.swing.JLabel();
        CajaPasswordUsuario = new javax.swing.JPasswordField();
        BtnIngresar = new javax.swing.JPanel();
        TextIngresar = new javax.swing.JLabel();
        BtnIngresarFondo = new javax.swing.JPanel();
        fondo1 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JPanel();
        TextoX = new javax.swing.JLabel();
        BarraSuperior = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAcercaDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AcercaDe.png"))); // NOI18N
        BtnAcercaDe.setToolTipText("Acerca de...");
        BtnAcercaDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAcercaDeMouseClicked(evt);
            }
        });
        background.add(BtnAcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 50, 50));

        SistemaDeGestion.setFont(new java.awt.Font("Roboto Medium", 0, 35)); // NOI18N
        SistemaDeGestion.setForeground(new java.awt.Color(255, 255, 255));
        SistemaDeGestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SistemaDeGestion.setText("Sistema de Gestión");
        background.add(SistemaDeGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 440, 60));

        Administrativa.setFont(new java.awt.Font("Roboto Medium", 0, 35)); // NOI18N
        Administrativa.setForeground(new java.awt.Color(255, 255, 255));
        Administrativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Administrativa.setText("Administrativa");
        background.add(Administrativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 440, 60));

        LogoETIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogoETIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoETIC.png"))); // NOI18N
        LogoETIC.setDisabledIcon(null);
        background.add(LogoETIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 600));

        IniciarSesion.setFont(new java.awt.Font("Roboto Medium", 0, 45)); // NOI18N
        IniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        IniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IniciarSesion.setText("INICIAR SESIÓN");
        background.add(IniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 440, 60));

        TextoUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        TextoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TextoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoUsuario.setText("Usuario");
        background.add(TextoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 440, 30));

        CajaNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CajaNombreUsuario.setForeground(new java.awt.Color(153, 153, 153));
        CajaNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaNombreUsuario.setText("Ingrese su Nombre de Usuario");
        CajaNombreUsuario.setToolTipText(""); // NOI18N
        CajaNombreUsuario.setBorder(null);
        CajaNombreUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CajaNombreUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaNombreUsuarioMousePressed(evt);
            }
        });
        background.add(CajaNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 310, 30));

        TextoContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 24)); // NOI18N
        TextoContraseña.setForeground(new java.awt.Color(255, 255, 255));
        TextoContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoContraseña.setText("Contraseña");
        background.add(TextoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 450, 30));

        CajaPasswordUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CajaPasswordUsuario.setForeground(new java.awt.Color(153, 153, 153));
        CajaPasswordUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CajaPasswordUsuario.setText("**********");
        CajaPasswordUsuario.setToolTipText(""); // NOI18N
        CajaPasswordUsuario.setBorder(null);
        CajaPasswordUsuario.setNextFocusableComponent(TextIngresar);
        CajaPasswordUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajaPasswordUsuarioMousePressed(evt);
            }
        });
        background.add(CajaPasswordUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 310, 30));

        BtnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        TextIngresar.setBackground(new java.awt.Color(255, 255, 255));
        TextIngresar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TextIngresar.setForeground(new java.awt.Color(0, 51, 255));
        TextIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextIngresar.setText("Ingresar");
        TextIngresar.setNextFocusableComponent(TextIngresar);
        TextIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TextIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TextIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnIngresarLayout = new javax.swing.GroupLayout(BtnIngresar);
        BtnIngresar.setLayout(BtnIngresarLayout);
        BtnIngresarLayout.setHorizontalGroup(
            BtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        BtnIngresarLayout.setVerticalGroup(
            BtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TextIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(BtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 230, 40));

        BtnIngresarFondo.setBackground(new java.awt.Color(255, 255, 255));
        BtnIngresarFondo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout BtnIngresarFondoLayout = new javax.swing.GroupLayout(BtnIngresarFondo);
        BtnIngresarFondo.setLayout(BtnIngresarFondoLayout);
        BtnIngresarFondoLayout.setHorizontalGroup(
            BtnIngresarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        BtnIngresarFondoLayout.setVerticalGroup(
            BtnIngresarFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        background.add(BtnIngresarFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 250, 60));

        fondo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.png"))); // NOI18N
        background.add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 440, 600));

        BtnSalir.setBackground(new java.awt.Color(0, 51, 204));
        BtnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnSalirMouseExited(evt);
            }
        });

        TextoX.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        TextoX.setForeground(new java.awt.Color(255, 255, 255));
        TextoX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextoX.setText("X");
        TextoX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnSalirLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TextoX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(BtnSalirLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TextoX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        BarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraSuperiorMouseDragged(evt);
            }
        });
        BarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraSuperiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BarraSuperiorLayout = new javax.swing.GroupLayout(BarraSuperior);
        BarraSuperior.setLayout(BarraSuperiorLayout);
        BarraSuperiorLayout.setHorizontalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        BarraSuperiorLayout.setVerticalGroup(
            BarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        background.add(BarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMousePressed
        // Barra superior de la ventana principal (cuando se hace clic)
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_BarraSuperiorMousePressed

    private void BarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraSuperiorMouseDragged
        // Barra superior de la ventana (cuando se arrastra)
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_BarraSuperiorMouseDragged

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        // Funcion para cerrar la ventana (X)
        System.exit(0);
    }//GEN-LAST:event_BtnSalirMouseClicked

    private void BtnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseEntered
        // Animacion (inicio) para el boton cerrar ventana (X)
        BtnSalir.setBackground(Color.red);
        TextoX.setForeground(Color.white);
    }//GEN-LAST:event_BtnSalirMouseEntered

    private void BtnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseExited
        // Animacion (fin) para el boton cerrar ventana (X)
        BtnSalir.setBackground(Color.blue);
        TextoX.setForeground(Color.white);
    }//GEN-LAST:event_BtnSalirMouseExited

    private void TextIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextIngresarMouseEntered
        // Animación para el botón "Ingresar"
        BtnIngresar.setBackground(Color.blue);
        TextIngresar.setForeground(Color.white);
    }//GEN-LAST:event_TextIngresarMouseEntered

    private void TextIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextIngresarMouseExited
        // Animación para el botón "Ingresar"
        BtnIngresar.setBackground(Color.white);
        TextIngresar.setForeground(Color.blue);
    }//GEN-LAST:event_TextIngresarMouseExited

    private void CajaNombreUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaNombreUsuarioMousePressed
        // Animacion de la Caja para el "Nombre de Usuario"
        if (CajaNombreUsuario.getText().equals("Ingrese su Nombre de Usuario")) {
            CajaNombreUsuario.setText("");
            CajaNombreUsuario.setForeground(Color.black);
        }
        if (String.valueOf(CajaPasswordUsuario.getPassword()).isEmpty()) {
            CajaPasswordUsuario.setText("**********");
            CajaPasswordUsuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajaNombreUsuarioMousePressed

    private void CajaPasswordUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajaPasswordUsuarioMousePressed
        // Animacion de la Caja para el "Password"
        if (CajaNombreUsuario.getText().isEmpty()) {
            CajaNombreUsuario.setText("Ingrese su Nombre de Usuario");
            CajaNombreUsuario.setForeground(Color.gray);
        }
        if (String.valueOf(CajaPasswordUsuario.getPassword()).equals("**********")) {
            CajaPasswordUsuario.setText("");
            CajaPasswordUsuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_CajaPasswordUsuarioMousePressed

    private void TextIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextIngresarMouseClicked
        // ACA TIENE QUE ENLAZARSE CON OTRA VENTANA DEL PROYECTO
        //FormPrincipal objFormPrincipal = new FormPrincipal();
        //objFormPrincipal.setVisible(rootPaneCheckingEnabled);
        
            String usuarioIngresado = CajaNombreUsuario.getText().trim();
    String contrasenaIngresada = String.valueOf(CajaPasswordUsuario.getPassword());

    if (usuarioIngresado.equals(USUARIO_VALIDO) && contrasenaIngresada.equals(CONTRASENA_VALIDA)) {
        // Las credenciales son válidas, puedes abrir la nueva ventana
        FormPrincipal objFormPrincipal = new FormPrincipal();
        objFormPrincipal.setVisible(true);
    } else {
        // Las credenciales son incorrectas, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_TextIngresarMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // Para reestablecer las animaciones de las cajas "Usuario" y "Password"
        CajaNombreUsuario.setText("Ingrese su Nombre de Usuario");
        CajaNombreUsuario.setForeground(Color.gray);
        CajaPasswordUsuario.setText("**********");
        CajaPasswordUsuario.setForeground(Color.gray);
    }//GEN-LAST:event_formMousePressed

    private void BtnAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAcercaDeMouseClicked
        // Ventana "Acerca De"
        VentAcercaDe objVentAcercaDe = new VentAcercaDe();
        objVentAcercaDe.setVisible(rootPaneCheckingEnabled);

        //JOptionPane.showMessageDialog(null, "PRUEBA");
    }//GEN-LAST:event_BtnAcercaDeMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Administrativa;
    private javax.swing.JPanel BarraSuperior;
    private javax.swing.JLabel BtnAcercaDe;
    private javax.swing.JPanel BtnIngresar;
    private javax.swing.JPanel BtnIngresarFondo;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JTextField CajaNombreUsuario;
    private javax.swing.JPasswordField CajaPasswordUsuario;
    private javax.swing.JLabel IniciarSesion;
    private javax.swing.JLabel LogoETIC;
    private javax.swing.JLabel SistemaDeGestion;
    private javax.swing.JLabel TextIngresar;
    private javax.swing.JLabel TextoContraseña;
    private javax.swing.JLabel TextoUsuario;
    private javax.swing.JLabel TextoX;
    private javax.swing.JPanel background;
    private javax.swing.JLabel fondo1;
    // End of variables declaration//GEN-END:variables
}
