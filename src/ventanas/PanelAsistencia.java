package ventanas;

//*** @author Oscar Stiven & Cristhian Abel.- ***//
import clases.Controlador;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PanelAsistencia extends javax.swing.JFrame {

    String objeto = "";
    String id = "id";
    Controlador controlador;
    boolean editar = false;
    String cadenaSQL = null;
    int estado = 0;
    int gencod = 0;
    ResultSet resultado;

    public PanelAsistencia() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
        controlador = new Controlador();
        //inicializar();
        recuperarAsistencia();
    }

    // Limpiar Campos en los cuales se cargan los datos
    private void inicializar() {
        //gencod = controlador.generarCodigo(objeto, id);
        CuadroIdCurso.setText(String.valueOf(gencod));
        CuadroIdAlumno.setText(String.valueOf(gencod));
        CuadroIdMateria.setText(String.valueOf(gencod));
        // CuadroNombreMateriaFromId.setText(null);
        //CuadroNombreCursoFromId.setText(null);
        //CuadroNombreAlumnoFromId.setText(null);
        CuadroFecha.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        txtAsistencia = new javax.swing.JLabel();
        PanelAsistencia = new javax.swing.JTabbedPane();
        CargaDatosAsistencia = new javax.swing.JPanel();
        txtIDCurso = new javax.swing.JLabel();
        CuadroIdCurso = new javax.swing.JTextField();
        txtIDAlumno = new javax.swing.JLabel();
        CuadroIdAlumno = new javax.swing.JTextField();
        txtIDMateria = new javax.swing.JLabel();
        CuadroIdMateria = new javax.swing.JTextField();
        txtFecha = new javax.swing.JLabel();
        CuadroFecha = new javax.swing.JTextField();
        txtEstado = new javax.swing.JLabel();
        BtnPresente = new javax.swing.JToggleButton();
        VerAsistencia = new javax.swing.JPanel();
        TablaAsistencia = new javax.swing.JScrollPane();
        tblAsistencia = new javax.swing.JTable();
        BtnFondoCerrar = new javax.swing.JPanel();
        BtnFrenteCerrar = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        BtnFondoModificar = new javax.swing.JPanel();
        BtnFrenteModificar = new javax.swing.JPanel();
        txtModificar = new javax.swing.JLabel();
        BtnFondoEliminar = new javax.swing.JPanel();
        BtnFrenteEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        BtnFondoGuardar = new javax.swing.JPanel();
        BtnFrenteGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        txtAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        txtAsistencia.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtAsistencia.setForeground(new java.awt.Color(0, 0, 255));
        txtAsistencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAsistencia.setText("ASISTENCIA");

        PanelAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        PanelAsistencia.setForeground(new java.awt.Color(0, 0, 255));
        PanelAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelAsistencia.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        CargaDatosAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        CargaDatosAsistencia.setForeground(new java.awt.Color(0, 51, 255));
        CargaDatosAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargaDatosAsistencia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txtIDCurso.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtIDCurso.setForeground(new java.awt.Color(0, 51, 255));
        txtIDCurso.setText("ID-CURSO:");

        CuadroIdCurso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CuadroIdCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroIdCursoActionPerformed(evt);
            }
        });

        txtIDAlumno.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtIDAlumno.setForeground(new java.awt.Color(0, 51, 255));
        txtIDAlumno.setText("ID-ALUMNO:");

        CuadroIdAlumno.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtIDMateria.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtIDMateria.setForeground(new java.awt.Color(0, 51, 255));
        txtIDMateria.setText("ID-MATERIA:");

        CuadroIdMateria.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 51, 255));
        txtFecha.setText("FECHA:");

        CuadroFecha.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtEstado.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 51, 255));
        txtEstado.setText("ESTADO:");

        BtnPresente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        BtnPresente.setForeground(new java.awt.Color(0, 51, 255));
        BtnPresente.setSelected(true);
        BtnPresente.setText("Presente");
        BtnPresente.setBorder(null);
        BtnPresente.setBorderPainted(false);
        BtnPresente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPresente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPresenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CargaDatosAsistenciaLayout = new javax.swing.GroupLayout(CargaDatosAsistencia);
        CargaDatosAsistencia.setLayout(CargaDatosAsistenciaLayout);
        CargaDatosAsistenciaLayout.setHorizontalGroup(
            CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaDatosAsistenciaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDMateria)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaDatosAsistenciaLayout.createSequentialGroup()
                        .addComponent(BtnPresente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CargaDatosAsistenciaLayout.createSequentialGroup()
                        .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CuadroFecha)
                            .addComponent(CuadroIdMateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(CuadroIdAlumno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuadroIdCurso, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(55, 927, Short.MAX_VALUE))))
        );
        CargaDatosAsistenciaLayout.setVerticalGroup(
            CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaDatosAsistenciaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIDMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CargaDatosAsistenciaLayout.createSequentialGroup()
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargaDatosAsistenciaLayout.createSequentialGroup()
                        .addComponent(CuadroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPresente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        PanelAsistencia.addTab("Carga de Datos", CargaDatosAsistencia);

        VerAsistencia.setBackground(new java.awt.Color(255, 255, 255));
        VerAsistencia.setForeground(new java.awt.Color(0, 51, 255));
        VerAsistencia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VerAsistencia.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        TablaAsistencia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        tblAsistencia.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblAsistencia.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaAsistencia.setViewportView(tblAsistencia);

        javax.swing.GroupLayout VerAsistenciaLayout = new javax.swing.GroupLayout(VerAsistencia);
        VerAsistencia.setLayout(VerAsistenciaLayout);
        VerAsistenciaLayout.setHorizontalGroup(
            VerAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerAsistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE))
        );
        VerAsistenciaLayout.setVerticalGroup(
            VerAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerAsistenciaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        PanelAsistencia.addTab("Lista de Asistencia", VerAsistencia);

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
            .addComponent(txtCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
        );
        BtnFrenteCerrarLayout.setVerticalGroup(
            BtnFrenteCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(txtGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
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

        javax.swing.GroupLayout FondoBlancoLayout = new javax.swing.GroupLayout(FondoBlanco);
        FondoBlanco.setLayout(FondoBlancoLayout);
        FondoBlancoLayout.setHorizontalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoBlancoLayout.createSequentialGroup()
                        .addComponent(BtnFondoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(BtnFondoModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(BtnFondoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnFondoCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addComponent(txtAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(txtAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnFondoEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(24, 24, 24))
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

        int fila = tblAsistencia.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro antes de proceder!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String id = tblAsistencia.getValueAt(tblAsistencia.getSelectedRow(), 0).toString();
        String cadenaSQL = "DELETE FROM Asistencia WHERE id_Curso_Curso = " + id;
        cadenaSQL += "; DELETE FROM Curso WHERE id_Curso = " + id;
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblAsistencia.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarAsistencia();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblAsistencia.repaint();
            tblAsistencia.validate();

            // Opcional: Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro eliminado con éxito", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }

        PanelAsistencia.setSelectedIndex(1);
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
        int fila = tblAsistencia.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String var = tblAsistencia.getValueAt(tblAsistencia.getSelectedRow(), 0).toString();
        try {
            cadenaSQL = "SELECT * FROM Asistencia WHERE id_Curso_Curso = " + var;
            resultado = controlador.consultar(cadenaSQL);
            
if (resultado.next()) {
    CuadroIdCurso.setText(resultado.getString("id_Curso_Curso"));
    CuadroIdAlumno.setText(resultado.getString("asistencia_Alumno"));
    CuadroIdMateria.setText(resultado.getString("asitencia_Materia"));
    if (resultado.getInt("estado") == 1) {
        BtnPresente.setSelected(true);
        BtnPresente.setText("Presente");
    } else {
        BtnPresente.setSelected(false);
        BtnPresente.setText("Ausente");
    }
    CuadroFecha.setText(resultado.getString("fecha"));
    PanelAsistencia.setSelectedIndex(0);
    CuadroIdCurso.grabFocus();
    editar = true;
}
        } catch (SQLException ex) {
            System.err.println("ERROR ACTUALIZANDO: " + ex);
        }
        controlador.desconectar();
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
        String estado;
        if (BtnPresente.isSelected()) {
            estado = "Presente";
        } else {
            estado = "Ausente";
        }

        String idCurso = CuadroIdCurso.getText();
        String idAlumno = CuadroIdAlumno.getText();
        String idMateria = CuadroIdMateria.getText();
        //String nombreAlumno = CuadroNombreAlumno.getText();
        //String documento = CuadroCI.getText();
        //String curso = CuadroCursoAsig.getText();
        //String Materia = CuadroMateria.getText();
        String Fecha = CuadroFecha.getText();
        String Estado = String.valueOf(estado);

        // Condicional si los campos de introducción de datos están vacios
        if (idCurso.isEmpty() || idAlumno.isEmpty() || /*Materia.isEmpty() ||*/ Fecha.isEmpty() || Estado.isEmpty()) {
            String mensaje = "Todos los campos deben estar rellenos para la carga de datos...!";
            JOptionPane.showMessageDialog(this, mensaje);
            return;
        }

        // cadena SQL para insertar datos a la tabla
        if (!editar) {
            cadenaSQL = "INSERT INTO Asistencia VALUES (";
            cadenaSQL += idCurso;
            cadenaSQL += ",'";
            cadenaSQL += idAlumno;
            cadenaSQL += "','";
            cadenaSQL += idMateria;
            cadenaSQL += "','";
            cadenaSQL += Estado;
            cadenaSQL += "','";
            cadenaSQL += Fecha;
            cadenaSQL += "');";

        } else {
            cadenaSQL = "UPDATE Asistencia SET ";
            cadenaSQL += "id_Curso_Curso = " + idCurso + ", ";
            cadenaSQL += "asistencia_Alumno = " + idAlumno + ", ";
            cadenaSQL += "asitencia_Materia = " + idMateria + ", ";
            cadenaSQL += "estado = '" + Estado + "', ";
            cadenaSQL += "fecha = '" + Fecha + "' ";
            cadenaSQL += "WHERE id_Curso_Curso = " + idCurso;
        }
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        //inicializar();

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblAsistencia.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarAsistencia();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblAsistencia.repaint();
            tblAsistencia.validate();

            // Mostrar un JOptionPane con el mensaje de carga exitosa
            String mensajeExito = "Datos cargados exitosamente";
            JOptionPane.showMessageDialog(this, mensajeExito);
        }

        // Lllamada al método inicializar para refrescar y limpiar campos
        inicializar();
    }//GEN-LAST:event_BtnFrenteGuardarMousePressed

    private void BtnFrenteReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteReporteMouseEntered

    }//GEN-LAST:event_BtnFrenteReporteMouseEntered

    private void BtnFrenteReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteReporteMouseExited

    }//GEN-LAST:event_BtnFrenteReporteMouseExited

    private void BtnFrenteReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteReporteMousePressed
        // ACA VA CÓDIGO PARA REALIZAR EJECUCIONES
    }//GEN-LAST:event_BtnFrenteReporteMousePressed

    private void BtnPresenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPresenteActionPerformed
        // TODO add your handling code here:
        if (BtnPresente.isSelected()) {
            BtnPresente.setText("Presente");
        } else {
            BtnPresente.setText("Ausente");
        }
    }//GEN-LAST:event_BtnPresenteActionPerformed

    private void CuadroIdAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroIdAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroIdAlumnoActionPerformed

    private void CuadroIdMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroIdMateriaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CuadroIdMateriaActionPerformed

    private void CuadroIdCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroIdCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroIdCursoActionPerformed

    private void BtnFrenteModificar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteModificar1MouseEntered

    private void BtnFrenteModificar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteModificar1MouseExited

    private void BtnFrenteModificar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteModificar1MousePressed

    private void BtnFrenteBusquedaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteBusquedaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteBusquedaMouseEntered

    private void BtnFrenteBusquedaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteBusquedaMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_BtnFrenteBusquedaMouseExited

    private void BtnFrenteBusquedaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteBusquedaMousePressed
        // AQUI VA EL CODIGp

    }//GEN-LAST:event_BtnFrenteBusquedaMousePressed

    private void BtnFrenteModificar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteModificar3MouseEntered

    private void BtnFrenteModificar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteModificar3MouseExited

    private void BtnFrenteModificar3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteModificar3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnFrenteModificar3MousePressed
    public void recuperarAsistencia() {
        //String cadenaSQL = "SELECT id_Curso_Curso, asistencia_Alumno FROM Asistencia";
        //controlador.cargarJTable((DefaultTableModel) tblAsistencia.getModel(), cadenaSQL);
        String cadenaSQL = "SELECT\n"
                + "    C.id_Curso,\n"
                + "    C.descripcionCurso AS Nombre_Curso,\n"
                + "    A.id_alumnos,\n"
                + "    A.nombreAlumno AS Nombre_Alumno,\n"
                + "    M.id_Materia,\n"
                + "    M.nombreMateria AS Nombre_Materia,\n"
                + "    ASI.estado,\n"
                + "    ASI.fecha\n"
                + "FROM\n"
                + "    Curso AS C\n"
                + "JOIN Matriculados AS Matri ON C.id_Curso = Matri.id_Curso\n"
                + "JOIN Alumnos AS A ON Matri.id_Alumno = A.id_alumnos\n"
                + "JOIN Asistencia AS ASI ON C.id_Curso = ASI.id_Curso_Curso\n"
                + "JOIN Materia AS M ON ASI.asitencia_Materia = M.id_Materia;";
        controlador.cargarJTable((DefaultTableModel) tblAsistencia.getModel(), cadenaSQL);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelAsistencia().setVisible(true);
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
    private javax.swing.JToggleButton BtnPresente;
    private javax.swing.JPanel CargaDatosAsistencia;
    private javax.swing.JTextField CuadroFecha;
    private javax.swing.JTextField CuadroIdAlumno;
    private javax.swing.JTextField CuadroIdCurso;
    private javax.swing.JTextField CuadroIdMateria;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JTabbedPane PanelAsistencia;
    private javax.swing.JScrollPane TablaAsistencia;
    private javax.swing.JPanel VerAsistencia;
    private javax.swing.JLabel background;
    private javax.swing.JTable tblAsistencia;
    private javax.swing.JLabel txtAsistencia;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtIDAlumno;
    private javax.swing.JLabel txtIDCurso;
    private javax.swing.JLabel txtIDMateria;
    private javax.swing.JLabel txtModificar;
    // End of variables declaration//GEN-END:variables
}
