package ventanas;

//*** @author Oscar Stiven & Cristhian Abel.- ***//
import clases.Controlador;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PanelPagos extends javax.swing.JFrame {

    String objeto = "";
    String id = "id";
    Controlador controlador;
    boolean editar = false;
    String cadenaSQL = null;
    int estado = 0;
    int gencod = 0;
    ResultSet resultado;

    public PanelPagos() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
        controlador = new Controlador();
        recuperarPagos();
    }

    // Limpiar Campos en los cuales se cargan los datos
    private void inicializar() {
        //gencod = controlador.generarCodigo(objeto, id);
        CuadroIDCurso.setText(String.valueOf(gencod));
        CuadroIDAlumno.setText(String.valueOf(gencod));
        //CuadroNombreCurso.setText(null);
        //CuadroNombreAlumno.setText(null);
        CuadroFecha.setText(null);
        //CuadroDescripcion.setText(null);
        //CuadroAño.setText(null);
        //CuadroMontoCuota.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        txtPagos = new javax.swing.JLabel();
        PanelPagos = new javax.swing.JTabbedPane();
        CargaDatosPago = new javax.swing.JPanel();
        txtIDCurso = new javax.swing.JLabel();
        CuadroIDCurso = new javax.swing.JTextField();
        txtIDAlumno = new javax.swing.JLabel();
        CuadroIDAlumno = new javax.swing.JTextField();
        txtFecha = new javax.swing.JLabel();
        CuadroFecha = new javax.swing.JTextField();
        VerPagos = new javax.swing.JPanel();
        TablaPagos = new javax.swing.JScrollPane();
        tblPagos = new javax.swing.JTable();
        BtnFondoGuardar = new javax.swing.JPanel();
        BtnFrenteGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();
        BtnFondoModificar = new javax.swing.JPanel();
        BtnFrenteModificar = new javax.swing.JPanel();
        txtModificar = new javax.swing.JLabel();
        BtnFondoEliminar = new javax.swing.JPanel();
        BtnFrenteEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        BtnFondoCerrar = new javax.swing.JPanel();
        BtnFrenteCerrar = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        txtPagos.setBackground(new java.awt.Color(255, 255, 255));
        txtPagos.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtPagos.setForeground(new java.awt.Color(0, 0, 255));
        txtPagos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPagos.setText("PAGOS");

        PanelPagos.setBackground(new java.awt.Color(255, 255, 255));
        PanelPagos.setForeground(new java.awt.Color(0, 0, 255));
        PanelPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelPagos.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        CargaDatosPago.setBackground(new java.awt.Color(255, 255, 255));
        CargaDatosPago.setForeground(new java.awt.Color(0, 51, 255));
        CargaDatosPago.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargaDatosPago.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txtIDCurso.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtIDCurso.setForeground(new java.awt.Color(0, 51, 255));
        txtIDCurso.setText("ID-CURSO:");

        CuadroIDCurso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CuadroIDCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroIDCursoActionPerformed(evt);
            }
        });

        txtIDAlumno.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtIDAlumno.setForeground(new java.awt.Color(0, 51, 255));
        txtIDAlumno.setText("ID-ALUMNO:");

        CuadroIDAlumno.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 51, 255));
        txtFecha.setText("FECHA:");

        CuadroFecha.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        javax.swing.GroupLayout CargaDatosPagoLayout = new javax.swing.GroupLayout(CargaDatosPago);
        CargaDatosPago.setLayout(CargaDatosPagoLayout);
        CargaDatosPagoLayout.setHorizontalGroup(
            CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaDatosPagoLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CuadroIDAlumno, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(CuadroIDCurso, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
        );
        CargaDatosPagoLayout.setVerticalGroup(
            CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaDatosPagoLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        PanelPagos.addTab("Carga de Datos", CargaDatosPago);

        VerPagos.setBackground(new java.awt.Color(255, 255, 255));
        VerPagos.setForeground(new java.awt.Color(0, 51, 255));
        VerPagos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VerPagos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        TablaPagos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        tblPagos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaPagos.setViewportView(tblPagos);

        javax.swing.GroupLayout VerPagosLayout = new javax.swing.GroupLayout(VerPagos);
        VerPagos.setLayout(VerPagosLayout);
        VerPagosLayout.setHorizontalGroup(
            VerPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE))
        );
        VerPagosLayout.setVerticalGroup(
            VerPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        PanelPagos.addTab("Lista de Pagos", VerPagos);

        BtnFondoGuardar.setBackground(new java.awt.Color(0, 0, 255));
        BtnFondoGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnFrenteGuardar.setBackground(new java.awt.Color(255, 255, 255));
        BtnFrenteGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnFrenteGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFrenteGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFrenteGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFrenteGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFrenteGuardarMousePressed(evt);
            }
        });

        txtGuardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(0, 51, 255));
        txtGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGuardar.setText("Guardar");

        javax.swing.GroupLayout BtnFrenteGuardarLayout = new javax.swing.GroupLayout(BtnFrenteGuardar);
        BtnFrenteGuardar.setLayout(BtnFrenteGuardarLayout);
        BtnFrenteGuardarLayout.setHorizontalGroup(
            BtnFrenteGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFrenteGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFrenteGuardarLayout.setVerticalGroup(
            BtnFrenteGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BtnFondoGuardarLayout = new javax.swing.GroupLayout(BtnFondoGuardar);
        BtnFondoGuardar.setLayout(BtnFondoGuardarLayout);
        BtnFondoGuardarLayout.setHorizontalGroup(
            BtnFondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFondoGuardarLayout.setVerticalGroup(
            BtnFondoGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnFondoModificar.setBackground(new java.awt.Color(0, 0, 255));
        BtnFondoModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnFrenteModificar.setBackground(new java.awt.Color(255, 255, 255));
        BtnFrenteModificar.setForeground(new java.awt.Color(255, 255, 255));
        BtnFrenteModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFrenteModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFrenteModificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFrenteModificarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFrenteModificarMousePressed(evt);
            }
        });

        txtModificar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtModificar.setForeground(new java.awt.Color(0, 51, 255));
        txtModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtModificar.setText("Modificar");

        javax.swing.GroupLayout BtnFrenteModificarLayout = new javax.swing.GroupLayout(BtnFrenteModificar);
        BtnFrenteModificar.setLayout(BtnFrenteModificarLayout);
        BtnFrenteModificarLayout.setHorizontalGroup(
            BtnFrenteModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFrenteModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFrenteModificarLayout.setVerticalGroup(
            BtnFrenteModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BtnFondoModificarLayout = new javax.swing.GroupLayout(BtnFondoModificar);
        BtnFondoModificar.setLayout(BtnFondoModificarLayout);
        BtnFondoModificarLayout.setHorizontalGroup(
            BtnFondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFondoModificarLayout.setVerticalGroup(
            BtnFondoModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnFondoEliminar.setBackground(new java.awt.Color(0, 0, 255));
        BtnFondoEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnFrenteEliminar.setBackground(new java.awt.Color(255, 255, 255));
        BtnFrenteEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnFrenteEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFrenteEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFrenteEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFrenteEliminarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFrenteEliminarMousePressed(evt);
            }
        });

        txtEliminar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(0, 51, 255));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("Eliminar");

        javax.swing.GroupLayout BtnFrenteEliminarLayout = new javax.swing.GroupLayout(BtnFrenteEliminar);
        BtnFrenteEliminar.setLayout(BtnFrenteEliminarLayout);
        BtnFrenteEliminarLayout.setHorizontalGroup(
            BtnFrenteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFrenteEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFrenteEliminarLayout.setVerticalGroup(
            BtnFrenteEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BtnFondoEliminarLayout = new javax.swing.GroupLayout(BtnFondoEliminar);
        BtnFondoEliminar.setLayout(BtnFondoEliminarLayout);
        BtnFondoEliminarLayout.setHorizontalGroup(
            BtnFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFondoEliminarLayout.setVerticalGroup(
            BtnFondoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnFondoCerrar.setBackground(new java.awt.Color(0, 0, 255));
        BtnFondoCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFondoCerrar.setPreferredSize(new java.awt.Dimension(164, 25));

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
                .addComponent(txtCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
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

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(BtnFondoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BtnFondoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BtnFondoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnFondoCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(txtPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(txtPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnFondoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1330, 670));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo4.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1366, 710));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

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

    private void BtnFrenteEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteEliminarMouseEntered
        // Animacion (Eliminar) para el boton "Eliminar"
        BtnFrenteEliminar.setBackground(Color.blue);
        txtEliminar.setForeground(Color.white);
    }//GEN-LAST:event_BtnFrenteEliminarMouseEntered

    private void BtnFrenteEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteEliminarMouseExited
        // Animacion (Eliminar) para el boton "Eliminar"
        BtnFrenteEliminar.setBackground(Color.white);
        txtEliminar.setForeground(Color.blue);
    }//GEN-LAST:event_BtnFrenteEliminarMouseExited

    private void BtnFrenteEliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteEliminarMousePressed
        // ACA VA CÓDIGO PARA REALIZAR EJECUCIONES
        // Establecer el idioma español del OptionPane
        int confirmacion = JOptionPane.showOptionDialog(
                this,
                "Confirma borrar el registro:",
                "ATENCION",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Sí", "No"},
                "Sí");

        if (confirmacion == JOptionPane.NO_OPTION) {
            return;
        }

        int fila = tblPagos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro antes de proceder!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String id = tblPagos.getValueAt(tblPagos.getSelectedRow(), 0).toString();
        String cadenaSQL = "DELETE FROM PagoCuota WHERE id_Curso_Curso = " + id;
        //cadenaSQL += "; DELETE FROM Curso WHERE id_Curso = " + id;
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarPagos();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblPagos.repaint();
            tblPagos.validate();

            // Opcional: Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro eliminado con éxito", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }

        PanelPagos.setSelectedIndex(1);
    }//GEN-LAST:event_BtnFrenteEliminarMousePressed

    private void BtnFrenteModificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificarMouseEntered
        // Animacion (Modificar) para el boton "Modificar"
        BtnFrenteModificar.setBackground(Color.blue);
        txtModificar.setForeground(Color.white);
    }//GEN-LAST:event_BtnFrenteModificarMouseEntered

    private void BtnFrenteModificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificarMouseExited
        // Animacion (Modificar) para el boton "Modificar"
        BtnFrenteModificar.setBackground(Color.white);
        txtModificar.setForeground(Color.blue);
    }//GEN-LAST:event_BtnFrenteModificarMouseExited

    private void BtnFrenteModificarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificarMousePressed
        // ACA VA CÓDIGO PARA REALIZAR EJECUCIONES
        int fila = tblPagos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String var = tblPagos.getValueAt(tblPagos.getSelectedRow(), 0).toString();
        try {
            // Obtener datos de la tabla PagoCuota
            cadenaSQL = "SELECT * FROM PagoCuota WHERE id_Curso_Curso = " + var;
            resultado = controlador.consultar(cadenaSQL);

            if (resultado.next()) {
                // Llenar los campos del formulario con los datos de PagoCuota
                CuadroIDCurso.setText(resultado.getString("id_Curso_Curso"));
                CuadroIDAlumno.setText(resultado.getString("id_alumnos_Alumnos"));
                CuadroFecha.setText(resultado.getString("fecha"));

                // Otros campos que puedas necesitar
                // ...
                // Establecer el índice del panel que contiene el formulario
                PanelPagos.setSelectedIndex(0);
                CuadroIDCurso.grabFocus();
                editar = true;
            }
        } catch (SQLException ex) {
            System.err.println("ERROR AL MODIFICAR: " + ex);
        } finally {
            controlador.desconectar();
        }
    }//GEN-LAST:event_BtnFrenteModificarMousePressed

    private void BtnFrenteGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteGuardarMouseEntered
        // Animacion (Guardar) para el boton "Guardar"
        BtnFrenteGuardar.setBackground(Color.blue);
        txtGuardar.setForeground(Color.white);
    }//GEN-LAST:event_BtnFrenteGuardarMouseEntered

    private void BtnFrenteGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteGuardarMouseExited
        // Animacion (Guardar) para el boton "Guardcar"
        BtnFrenteGuardar.setBackground(Color.white);
        txtGuardar.setForeground(Color.blue);
    }//GEN-LAST:event_BtnFrenteGuardarMouseExited

    private void BtnFrenteGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteGuardarMousePressed
        // ACA VA CÓDIGO PARA REALIZAR EJECUCIONES

        String idCurso = CuadroIDCurso.getText();
        String idAlumno = CuadroIDAlumno.getText();
        String fecha = CuadroFecha.getText();
        //String curso = CuadroCursoAsig.getText();
        //String Descripcion = CuadroDescripcion.getText();
        //String Fecha = CuadroAño.getText();
        //String cuota = CuadroMontoCuota.getText();

        // Condicional si los campos de introducción de datos están vacios
        if (idCurso.isEmpty() || idAlumno.isEmpty() || fecha.isEmpty()) {
            String mensaje = "Todos los campos deben estar rellenos para la carga de datos...!";
            JOptionPane.showMessageDialog(this, mensaje);
            return;
        }
        // cadena SQL para insertar datos a la tabla
        if (!editar) {
            cadenaSQL = "INSERT INTO PagoCuota VALUES (";
            cadenaSQL += idCurso;
            cadenaSQL += ",'";
            cadenaSQL += idAlumno;
            cadenaSQL += "','";
            cadenaSQL += fecha;
            cadenaSQL += "');";

        } else {
            cadenaSQL = "UPDATE PagoCuota SET id_alumnos_Alumnos = '" + idAlumno + "', fecha = '" + fecha + "' WHERE id_Curso_Curso = '" + idCurso + "'";

        }
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        //inicializar();

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblPagos.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarPagos();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblPagos.repaint();
            tblPagos.validate();

            // Mostrar un JOptionPane con el mensaje de carga exitosa
            String mensajeExito = "Datos cargados exitosamente";
            JOptionPane.showMessageDialog(this, mensajeExito);
        }

        // Lllamada al método inicializar para refrescar y limpiar campos
        inicializar();
    }//GEN-LAST:event_BtnFrenteGuardarMousePressed

    private void CuadroIDCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroIDCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroIDCursoActionPerformed
    public void recuperarPagos() {
        // Se hace la carga de datos en la correspondiente tabla
        //String cadenaSQL = "SELECT id_Curso_Curso, id_alumnos_Alumnos, fecha FROM PagoCuota";
        //controlador.cargarJTable((DefaultTableModel) tblPagos.getModel(), cadenaSQL);
        String cadenaSQL = "SELECT\n"
                + "    P.id_Curso_Curso AS Id_Curso,\n"
                + "    C.descripcionCurso AS Nombre_Curso,\n"
                + "    P.id_alumnos_Alumnos AS Id_Alumno,\n"
                + "    A.nombreAlumno AS Nombre_Alumno,\n"
                + "    P.fecha\n"
                + "FROM\n"
                + "    PagoCuota AS P\n"
                + "JOIN Curso AS C ON P.id_Curso_Curso = C.id_Curso\n"
                + "JOIN Alumnos AS A ON P.id_alumnos_Alumnos = A.id_alumnos;";
        controlador.cargarJTable((DefaultTableModel) tblPagos.getModel(), cadenaSQL);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnFondoCerrar;
    private javax.swing.JPanel BtnFondoEliminar;
    private javax.swing.JPanel BtnFondoGuardar;
    private javax.swing.JPanel BtnFondoModificar;
    private javax.swing.JPanel BtnFrenteCerrar;
    private javax.swing.JPanel BtnFrenteEliminar;
    private javax.swing.JPanel BtnFrenteGuardar;
    private javax.swing.JPanel BtnFrenteModificar;
    private javax.swing.JPanel CargaDatosPago;
    private javax.swing.JTextField CuadroFecha;
    private javax.swing.JTextField CuadroIDAlumno;
    private javax.swing.JTextField CuadroIDCurso;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JTabbedPane PanelPagos;
    private javax.swing.JScrollPane TablaPagos;
    private javax.swing.JPanel VerPagos;
    private javax.swing.JLabel background;
    private javax.swing.JTable tblPagos;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtIDAlumno;
    private javax.swing.JLabel txtIDCurso;
    private javax.swing.JLabel txtModificar;
    private javax.swing.JLabel txtPagos;
    // End of variables declaration//GEN-END:variables
}
