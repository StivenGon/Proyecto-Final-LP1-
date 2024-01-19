package ventanas;

//*** @author Oscar Stiven & Cristhian Abel.- ***//
import clases.Controlador;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class PanelCronograma extends javax.swing.JFrame {

    String objeto = "";
    String id = "id";
    Controlador controlador;
    boolean editar = false;
    String cadenaSQL = null;
    int estado = 0;
    int gencod = 0;
    ResultSet resultado;

    public PanelCronograma() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
        controlador = new Controlador();
        inicializar();
        recuperarCronograma();
    }

    // Limpiar Campos en los cuales se cargan los datos
    private void inicializar() {
        //gencod = controlador.generarCodigo(objeto, id);
        CuadroIdDocente.setText(String.valueOf(gencod));
        CuadroNombre.setText(null);
        CuadroIdMateria.setText(String.valueOf(gencod));
        CuadroMateria.setText(null);
        CuadroIdCurso.setText(String.valueOf(gencod));
        CuadroCurso.setText(null);
        CuadroFecha.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        txtCronograma = new javax.swing.JLabel();
        PanelCronograma = new javax.swing.JTabbedPane();
        CargaDatosCronograma = new javax.swing.JPanel();
        txtID = new javax.swing.JLabel();
        CuadroIdDocente = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        CuadroNombre = new javax.swing.JTextField();
        txtCI = new javax.swing.JLabel();
        CuadroIdMateria = new javax.swing.JTextField();
        txtCursoAsig = new javax.swing.JLabel();
        CuadroMateria = new javax.swing.JTextField();
        txtMontoCuota = new javax.swing.JLabel();
        CuadroFecha = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        CuadroIdCurso = new javax.swing.JTextField();
        txtDescripcion1 = new javax.swing.JLabel();
        CuadroCurso = new javax.swing.JTextField();
        VerCronograma = new javax.swing.JPanel();
        TablaCronograma = new javax.swing.JScrollPane();
        tblCronograma = new javax.swing.JTable();
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

        txtCronograma.setBackground(new java.awt.Color(255, 255, 255));
        txtCronograma.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtCronograma.setForeground(new java.awt.Color(0, 0, 255));
        txtCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCronograma.setText("CRONOGRAMA");

        PanelCronograma.setBackground(new java.awt.Color(255, 255, 255));
        PanelCronograma.setForeground(new java.awt.Color(0, 0, 255));
        PanelCronograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelCronograma.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        CargaDatosCronograma.setBackground(new java.awt.Color(255, 255, 255));
        CargaDatosCronograma.setForeground(new java.awt.Color(0, 51, 255));
        CargaDatosCronograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargaDatosCronograma.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txtID.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 51, 255));
        txtID.setText("ID-DOCENTE:");

        CuadroIdDocente.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CuadroIdDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroIdDocenteActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 255));
        txtNombre.setText("DOCENTE:");

        CuadroNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtCI.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtCI.setForeground(new java.awt.Color(0, 51, 255));
        txtCI.setText("ID-MATERIA:");

        CuadroIdMateria.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtCursoAsig.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtCursoAsig.setForeground(new java.awt.Color(0, 51, 255));
        txtCursoAsig.setText("MATERIA:");

        CuadroMateria.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtMontoCuota.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtMontoCuota.setForeground(new java.awt.Color(0, 51, 255));
        txtMontoCuota.setText("DIA:");

        CuadroFecha.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CuadroFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroFechaActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 51, 255));
        txtDescripcion.setText("ID-CURSO:");

        CuadroIdCurso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtDescripcion1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtDescripcion1.setForeground(new java.awt.Color(0, 51, 255));
        txtDescripcion1.setText("CURSO:");

        CuadroCurso.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        javax.swing.GroupLayout CargaDatosCronogramaLayout = new javax.swing.GroupLayout(CargaDatosCronograma);
        CargaDatosCronograma.setLayout(CargaDatosCronogramaLayout);
        CargaDatosCronogramaLayout.setHorizontalGroup(
            CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaDatosCronogramaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaDatosCronogramaLayout.createSequentialGroup()
                        .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuadroIdDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CuadroIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CuadroNombre)))
                    .addGroup(CargaDatosCronogramaLayout.createSequentialGroup()
                        .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCursoAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMontoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CuadroMateria)
                            .addGroup(CargaDatosCronogramaLayout.createSequentialGroup()
                                .addComponent(CuadroIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 870, Short.MAX_VALUE))
                            .addComponent(CuadroCurso)
                            .addComponent(CuadroFecha)))
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        CargaDatosCronogramaLayout.setVerticalGroup(
            CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaDatosCronogramaLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroIdDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCursoAsig)
                    .addComponent(CuadroMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMontoCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCronograma.addTab("Carga de Datos", CargaDatosCronograma);

        VerCronograma.setBackground(new java.awt.Color(255, 255, 255));
        VerCronograma.setForeground(new java.awt.Color(0, 51, 255));
        VerCronograma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VerCronograma.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        TablaCronograma.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        tblCronograma.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblCronograma.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaCronograma.setViewportView(tblCronograma);

        javax.swing.GroupLayout VerCronogramaLayout = new javax.swing.GroupLayout(VerCronograma);
        VerCronograma.setLayout(VerCronogramaLayout);
        VerCronogramaLayout.setHorizontalGroup(
            VerCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerCronogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaCronograma, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE))
        );
        VerCronogramaLayout.setVerticalGroup(
            VerCronogramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerCronogramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaCronograma, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        PanelCronograma.addTab("Lista", VerCronograma);

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
                    .addComponent(PanelCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(txtCronograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(txtCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelCronograma, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnFondoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoCerrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(FondoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1330, 660));

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

        int fila = tblCronograma.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro antes de proceder!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String id = tblCronograma.getValueAt(tblCronograma.getSelectedRow(), 0).toString();
        String cadenaSQL = "DELETE FROM Cronograma WHERE id_Docente_Docentes = " + id;
        //cadenaSQL += "; DELETE FROM Curso WHERE id_Curso = " + id;
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblCronograma.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarCronograma();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblCronograma.repaint();
            tblCronograma.validate();

            // Opcional: Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro eliminado con éxito", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }

        PanelCronograma.setSelectedIndex(1);

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
        // ACA VA CÓDIGO PARA REALIZAR EJECUCIONES
        int fila = tblCronograma.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String var = tblCronograma.getValueAt(tblCronograma.getSelectedRow(), 0).toString();
        try {
            cadenaSQL = "SELECT C.id_Curso_Curso, D.id_Docente, D.nombreDocente, "
                    + "M.id_Materia, M.nombreMateria, CC.id_Curso, CC.descripcionCurso, C.Dia "
                    + "FROM Cronograma C "
                    + "JOIN Docentes D ON C.id_Docente_Docentes = D.id_Docente "
                    + "JOIN Materia M ON C.id_Materia_Materia = M.id_Materia "
                    + "JOIN Curso CC ON C.id_Curso_Curso = CC.id_Curso "
                    + "WHERE C.id_Curso_Curso = ?";

            try (PreparedStatement pstmt = controlador.obtenerConexion().prepareStatement(cadenaSQL)) {
                pstmt.setString(1, var);

                try (ResultSet resultadoConsulta = pstmt.executeQuery()) {
                    if (resultadoConsulta.next()) {
                        CuadroIdDocente.setText(resultadoConsulta.getString("id_Docente"));
                        CuadroNombre.setText(resultadoConsulta.getString("nombreDocente"));
                        CuadroIdMateria.setText(resultadoConsulta.getString("id_Materia"));
                        CuadroMateria.setText(resultadoConsulta.getString("nombreMateria"));
                        CuadroIdCurso.setText(resultadoConsulta.getString("id_Curso_Curso"));
                        CuadroCurso.setText(resultadoConsulta.getString("descripcionCurso"));
                        CuadroFecha.setText(resultadoConsulta.getString("Dia"));
                        PanelCronograma.setSelectedIndex(0);
                        CuadroIdDocente.grabFocus();
                        editar = true;

                    }
                }
            }
        } catch (SQLException ex) {
            System.err.println("ERROR ACTUALIZANDO: " + ex);
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

        String idDocente = CuadroIdDocente.getText();
        String nombre = CuadroNombre.getText();
        String idMateria = CuadroIdMateria.getText();
        String Materia = CuadroMateria.getText();
        String idCurso = CuadroIdCurso.getText();
        String curso = CuadroCurso.getText();
        String fecha = CuadroFecha.getText();

        // Condicional si los campos de introducción de datos están vacios
        if (nombre.isEmpty() || idMateria.isEmpty() || curso.isEmpty() || fecha.isEmpty()) {
            String mensaje = "Todos los campos deben estar rellenos para la carga de datos...!";
            JOptionPane.showMessageDialog(this, mensaje);
            return;
        }
        // cadena SQL para insertar datos a la tabla
        if (!editar) {
            cadenaSQL = "INSERT INTO Cronograma VALUES (";
            cadenaSQL += idDocente;
            cadenaSQL += ",";
            cadenaSQL += idMateria;
            cadenaSQL += ",";
            cadenaSQL += idCurso;
            cadenaSQL += ",'";
            cadenaSQL += fecha;
            cadenaSQL += "');";
            //cadenaSQL += documento;
            //cadenaSQL += "');";

        } else {
            // Cadena SQL para actualizar datos en la tabla Cronograma
            cadenaSQL = "UPDATE Cronograma SET "
                    + "id_Docente_Docentes = " + idDocente + ", "
                    + "id_Materia_Materia = " + idMateria + ", "
                    + "id_Curso_Curso = " + idCurso + ", "
                    + "Dia = '" + fecha + "' "
                    + "WHERE id_Curso_Curso = " + idCurso + ";";
        }
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        //inicializar();

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblCronograma.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarCronograma();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblCronograma.repaint();
            tblCronograma.validate();

            // Mostrar un JOptionPane con el mensaje de carga exitosa
            String mensajeExito = "Datos cargados exitosamente";
            JOptionPane.showMessageDialog(this, mensajeExito);
        }

        // Lllamada al método inicializar para refrescar y limpiar campos
        inicializar();
    }//GEN-LAST:event_BtnFrenteGuardarMousePressed

    private void CuadroIdDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroIdDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroIdDocenteActionPerformed

    private void CuadroFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroFechaActionPerformed
    public void recuperarCronograma() {
        // Se hace la carga de datos en la correspondiente tabla
        //String cadenaSQL = "SELECT id_Docente_Docentes, id_Materia_Materia, id_Curso_Curso, Dia FROM Cronograma";
        //controlador.cargarJTable((DefaultTableModel) tblCronograma.getModel(), cadenaSQL);
        String cadenaSQL = "SELECT\n"
                + "    Cr.id_Docente_Docentes AS Id_Docente,\n"
                + "    D.nombreDocente AS Nombre_Docente,\n"
                + "    Cr.id_Materia_Materia AS Id_Materia,\n"
                + "    M.nombreMateria AS Nombre_Materia,\n"
                + "    Cr.id_Curso_Curso AS Id_Curso,\n"
                + "    Cu.descripcionCurso AS Descripcion_Curso,\n"
                + "    Cr.Dia\n"
                + "FROM\n"
                + "    Cronograma AS Cr\n"
                + "JOIN Docentes AS D ON Cr.id_Docente_Docentes = D.id_Docente\n"
                + "JOIN Materia AS M ON Cr.id_Materia_Materia = M.id_Materia\n"
                + "JOIN Curso AS Cu ON Cr.id_Curso_Curso = Cu.id_Curso;";
        controlador.cargarJTable((DefaultTableModel) tblCronograma.getModel(), cadenaSQL);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelCronograma().setVisible(true);
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
    private javax.swing.JPanel CargaDatosCronograma;
    private javax.swing.JTextField CuadroCurso;
    private javax.swing.JTextField CuadroFecha;
    private javax.swing.JTextField CuadroIdCurso;
    private javax.swing.JTextField CuadroIdDocente;
    private javax.swing.JTextField CuadroIdMateria;
    private javax.swing.JTextField CuadroMateria;
    private javax.swing.JTextField CuadroNombre;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JTabbedPane PanelCronograma;
    private javax.swing.JScrollPane TablaCronograma;
    private javax.swing.JPanel VerCronograma;
    private javax.swing.JLabel background;
    private javax.swing.JTable tblCronograma;
    private javax.swing.JLabel txtCI;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtCronograma;
    private javax.swing.JLabel txtCursoAsig;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtDescripcion1;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtModificar;
    private javax.swing.JLabel txtMontoCuota;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
