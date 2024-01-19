package ventanas;

//*** @author Oscar Stiven & Cristhian Abel.- ***//
import clases.Conexion;
import clases.Controlador;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PanelDocentes extends javax.swing.JFrame {

    String objeto = "";
    String id = "id";
    Controlador controlador;
    boolean editar = false;
    String cadenaSQL = null;
    int estado = 0;
    int gencod = 0;
    ResultSet resultado;
    private static Conexion con = new Conexion();

    public PanelDocentes() {
        initComponents();
        setLocationRelativeTo(null); //Centra la ventana generada en la pantalla
        controlador = new Controlador();
        inicializar();
        recuperarDocentes();
    }

    // Limpiar Campos en los cuales se cargan los datos
    private void inicializar() {
        //gencod = controlador.generarCodigo(objeto, id);
        CuadroID.setText(String.valueOf(gencod));
        CuadroNombre.setText(null);
        //CuadroIdMateria.setText(String.valueOf(gencod));
        CuadroCI.setText(null);
        CuadroSalario.setText(null);
        CuadroIdMateria.setText(String.valueOf(gencod));
        CuadroMateria.setText(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoBlanco = new javax.swing.JPanel();
        txtDocentes = new javax.swing.JLabel();
        PanelDocentes = new javax.swing.JTabbedPane();
        CargaDatosDocente = new javax.swing.JPanel();
        txtID = new javax.swing.JLabel();
        CuadroID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JLabel();
        CuadroNombre = new javax.swing.JTextField();
        txtCI = new javax.swing.JLabel();
        CuadroCI = new javax.swing.JTextField();
        txtCursoAsig = new javax.swing.JLabel();
        CuadroSalario = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JLabel();
        CuadroIdMateria = new javax.swing.JTextField();
        txtDescripcion1 = new javax.swing.JLabel();
        CuadroMateria = new javax.swing.JTextField();
        VerDocentes = new javax.swing.JPanel();
        TablaDocentes = new javax.swing.JScrollPane();
        tblDocentes = new javax.swing.JTable();
        BtnFondoGuardar = new javax.swing.JPanel();
        BtnFrenteGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();
        BtnFondoModificar = new javax.swing.JPanel();
        BtnFrenteModificar = new javax.swing.JPanel();
        txtModificar = new javax.swing.JLabel();
        BtnFondoEliminar = new javax.swing.JPanel();
        BtnFrenteEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        BtnFondoReporte = new javax.swing.JPanel();
        BtnFrenteReporte = new javax.swing.JPanel();
        txtReporte = new javax.swing.JLabel();
        BtnFondoCerrar = new javax.swing.JPanel();
        BtnFrenteCerrar = new javax.swing.JPanel();
        txtCerrar = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoBlanco.setBackground(new java.awt.Color(255, 255, 255));

        txtDocentes.setBackground(new java.awt.Color(255, 255, 255));
        txtDocentes.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        txtDocentes.setForeground(new java.awt.Color(0, 0, 255));
        txtDocentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDocentes.setText("DOCENTES");

        PanelDocentes.setBackground(new java.awt.Color(255, 255, 255));
        PanelDocentes.setForeground(new java.awt.Color(0, 0, 255));
        PanelDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelDocentes.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N

        CargaDatosDocente.setBackground(new java.awt.Color(255, 255, 255));
        CargaDatosDocente.setForeground(new java.awt.Color(0, 51, 255));
        CargaDatosDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CargaDatosDocente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        txtID.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtID.setForeground(new java.awt.Color(0, 51, 255));
        txtID.setText("ID:");

        CuadroID.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        CuadroID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroIDActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 51, 255));
        txtNombre.setText("NOMBRE Y APELLIDO:");

        CuadroNombre.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtCI.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtCI.setForeground(new java.awt.Color(0, 51, 255));
        txtCI.setText("DOCUMENTO DE IDENTIDAD:");

        CuadroCI.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtCursoAsig.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtCursoAsig.setForeground(new java.awt.Color(0, 51, 255));
        txtCursoAsig.setText("SALARIO:");

        CuadroSalario.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtDescripcion.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(0, 51, 255));
        txtDescripcion.setText("ID-MATERIA:");

        CuadroIdMateria.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        txtDescripcion1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        txtDescripcion1.setForeground(new java.awt.Color(0, 51, 255));
        txtDescripcion1.setText("MATERIA:");

        CuadroMateria.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        javax.swing.GroupLayout CargaDatosDocenteLayout = new javax.swing.GroupLayout(CargaDatosDocente);
        CargaDatosDocente.setLayout(CargaDatosDocenteLayout);
        CargaDatosDocenteLayout.setHorizontalGroup(
            CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CargaDatosDocenteLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CargaDatosDocenteLayout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CuadroID, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CargaDatosDocenteLayout.createSequentialGroup()
                        .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCursoAsig, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CuadroMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
                            .addComponent(CuadroIdMateria)
                            .addComponent(CuadroSalario)
                            .addComponent(CuadroNombre)
                            .addComponent(CuadroCI))))
                .addGap(48, 48, 48))
        );
        CargaDatosDocenteLayout.setVerticalGroup(
            CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargaDatosDocenteLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CuadroNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCursoAsig)
                    .addComponent(CuadroSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CargaDatosDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CuadroMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        PanelDocentes.addTab("Carga de Datos", CargaDatosDocente);

        VerDocentes.setBackground(new java.awt.Color(255, 255, 255));
        VerDocentes.setForeground(new java.awt.Color(0, 51, 255));
        VerDocentes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        VerDocentes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N

        TablaDocentes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        tblDocentes.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tblDocentes.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaDocentes.setViewportView(tblDocentes);

        javax.swing.GroupLayout VerDocentesLayout = new javax.swing.GroupLayout(VerDocentes);
        VerDocentes.setLayout(VerDocentesLayout);
        VerDocentesLayout.setHorizontalGroup(
            VerDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerDocentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, 1284, Short.MAX_VALUE))
        );
        VerDocentesLayout.setVerticalGroup(
            VerDocentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VerDocentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TablaDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE))
        );

        PanelDocentes.addTab("Lista de Docentes", VerDocentes);

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

        BtnFondoReporte.setBackground(new java.awt.Color(0, 0, 255));
        BtnFondoReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnFrenteReporte.setBackground(new java.awt.Color(255, 255, 255));
        BtnFrenteReporte.setForeground(new java.awt.Color(255, 255, 255));
        BtnFrenteReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnFrenteReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFrenteReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFrenteReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnFrenteReporteMousePressed(evt);
            }
        });

        txtReporte.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txtReporte.setForeground(new java.awt.Color(0, 51, 255));
        txtReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtReporte.setText("Generar Reporte");

        javax.swing.GroupLayout BtnFrenteReporteLayout = new javax.swing.GroupLayout(BtnFrenteReporte);
        BtnFrenteReporte.setLayout(BtnFrenteReporteLayout);
        BtnFrenteReporteLayout.setHorizontalGroup(
            BtnFrenteReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFrenteReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFrenteReporteLayout.setVerticalGroup(
            BtnFrenteReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BtnFondoReporteLayout = new javax.swing.GroupLayout(BtnFondoReporte);
        BtnFondoReporte.setLayout(BtnFondoReporteLayout);
        BtnFondoReporteLayout.setHorizontalGroup(
            BtnFondoReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnFondoReporteLayout.setVerticalGroup(
            BtnFondoReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnFondoReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnFrenteReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(BtnFondoReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnFondoCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 1290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addComponent(txtDocentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoBlancoLayout.setVerticalGroup(
            FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoBlancoLayout.createSequentialGroup()
                .addComponent(txtDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelDocentes, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoBlancoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnFondoModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnFondoReporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        int fila = tblDocentes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro antes de proceder!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String id = tblDocentes.getValueAt(tblDocentes.getSelectedRow(), 0).toString();
        String cadenaSQL = "DELETE FROM Docentes WHERE id_Docente = " + id;
        cadenaSQL += "; DELETE FROM Materia WHERE id_Materia = " + id;
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblDocentes.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarDocentes();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblDocentes.repaint();
            tblDocentes.validate();

            // Opcional: Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(this, "Registro eliminado con éxito", "Eliminación Exitosa", JOptionPane.INFORMATION_MESSAGE);
        }

        PanelDocentes.setSelectedIndex(1);
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
        int filaSeleccionada = tblDocentes.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un registro!", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        // Obtener el ID del docente seleccionado
        String idDocenteSeleccionado = tblDocentes.getValueAt(filaSeleccionada, 0).toString();

        // Crear una instancia de Controlador
        Controlador controlador = new Controlador();

        try {
            // Consulta SQL para obtener los datos del docente y la materia
            String cadenaSQL = "SELECT D.id_Docente, D.nombreDocente, D.documentoDocente, D.salarioDocente, M.id_Materia, M.nombreMateria "
                    + "FROM Docentes D "
                    + "JOIN Cronograma Cr ON D.id_Docente = Cr.id_Docente_Docentes "
                    + "JOIN Curso C ON Cr.id_Curso_Curso = C.id_Curso "
                    + "JOIN Asistencia A ON C.id_Curso = A.id_Curso_Curso "
                    + "JOIN Materia M ON A.asitencia_Materia = M.id_Materia "
                    + "WHERE D.id_Docente = ?";

            // Llamar al método consultar con el parámetro idDocenteSeleccionado
            try (PreparedStatement pstmt = controlador.obtenerConexion().prepareStatement(cadenaSQL)) {
                pstmt.setString(1, idDocenteSeleccionado);

                // Obtener el resultado de la consulta
                try (ResultSet resultadoConsulta = pstmt.executeQuery()) {
                    if (resultadoConsulta.next()) {
                        // Mostrar datos en los cuadros de texto
                        CuadroID.setText(resultadoConsulta.getString("id_Docente"));
                        CuadroNombre.setText(resultadoConsulta.getString("nombreDocente"));
                        CuadroCI.setText(resultadoConsulta.getString("documentoDocente"));
                        CuadroSalario.setText(resultadoConsulta.getString("salarioDocente"));
                        CuadroIdMateria.setText(resultadoConsulta.getString("id_Materia"));
                        CuadroMateria.setText(resultadoConsulta.getString("nombreMateria"));

                        // Cambiar el estado de la variable 'editar' a true
                        editar = true;

                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontraron datos para el ID seleccionado.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }

        } catch (SQLException ex) {
            System.err.println("ERROR RECUPERANDO DATOS: " + ex);
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

        String idDocente = CuadroID.getText();
        String nombre = CuadroNombre.getText();
        String cedulaIdentidad = CuadroCI.getText();
        String Salario = CuadroSalario.getText();
        String idMateria = CuadroIdMateria.getText();
        String Materia = CuadroMateria.getText();
        // String fecha = CuadroFecha.getText();

        // Condicional si los campos de introducción de datos están vacios
        if (nombre.isEmpty() || cedulaIdentidad.isEmpty() || idMateria.isEmpty() || Materia.isEmpty()) {
            String mensaje = "Todos los campos deben estar rellenos para la carga de datos...!";
            JOptionPane.showMessageDialog(this, mensaje);
            return;
        }
        // cadena SQL para insertar datos a la tabla
        if (!editar) {
            // Cadena SQL para insertar datos para la tabla DOCENTES
            cadenaSQL = "INSERT INTO Docentes VALUES (";
            cadenaSQL += idDocente;
            cadenaSQL += ",'";
            cadenaSQL += nombre;
            cadenaSQL += "','";
            cadenaSQL += cedulaIdentidad;
            cadenaSQL += "','";
            cadenaSQL += Salario;
            cadenaSQL += "');";

            cadenaSQL += "INSERT INTO Materia VALUES (";
            cadenaSQL += idMateria;
            cadenaSQL += ",'";
            cadenaSQL += Materia;
            cadenaSQL += "');";
        } else {
                // Cadena SQL para actualizar datos en la tabla DOCENTES
    cadenaSQL = "UPDATE Docentes SET "
            + "nombreDocente = '" + nombre + "', "
            + "documentoDocente = '" + cedulaIdentidad + "', "
            + "salarioDocente = '" + Salario + "' "
            + "WHERE id_Docente = " + idDocente + ";";

    // Cadena SQL para actualizar datos en la tabla Materia
    cadenaSQL += "UPDATE Materia SET "
            + "nombreMateria = '" + Materia + "' "
            + "WHERE id_Materia = " + idMateria + ";";

        }

        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        //inicializar();

        if (operacion) {
            // Actualizar el modelo de la tabla
            DefaultTableModel modeloTabla = (DefaultTableModel) tblDocentes.getModel();
            modeloTabla.setRowCount(0);  // Limpiar datos existentes
            recuperarDocentes();          // Recargar datos desde la base de datos

            // Refrescar la vista de la tabla
            tblDocentes.repaint();
            tblDocentes.validate();

            // Mostrar un JOptionPane con el mensaje de carga exitosa
            String mensajeExito = "Datos cargados exitosamente";
            JOptionPane.showMessageDialog(this, mensajeExito);
        

        // Lllamada al método inicializar para refrescar y limpiar campos
        inicializar();
    }

    }//GEN-LAST:event_BtnFrenteGuardarMousePressed

    private void CuadroIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroIDActionPerformed

    private void BtnFrenteReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteReporteMouseEntered
        // Animacion (Reporte) para el boton "Reporte"
        BtnFrenteReporte.setBackground(Color.blue);
        txtReporte.setForeground(Color.white);
    }//GEN-LAST:event_BtnFrenteReporteMouseEntered

    private void BtnFrenteReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteReporteMouseExited
        // Animacion (Reporte) para el boton "Reporte"
        BtnFrenteReporte.setBackground(Color.white);
        txtReporte.setForeground(Color.blue);
    }//GEN-LAST:event_BtnFrenteReporteMouseExited

    private void BtnFrenteReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFrenteReporteMousePressed
        // ACA VA CÓDIGO PARA REALIZAR EJECUCIONES
                String path = "C:\\Users\\Aspire 5738z\\Desktop\\SistemaDeGestion-ETIC\\src\\reportes\\reporteDocentes.jasper";
        Connection conexion = con.retornarConexion();
        JasperReport jr = null;
        try {
            jr = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jp = JasperFillManager.fillReport(jr, null,conexion);
            JasperViewer jv = new JasperViewer(jp);
            jv.setVisible(true);
            jv.setTitle(path);
            conexion.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_BtnFrenteReporteMousePressed
    public void recuperarDocentes() {
        // Se hace la carga de datos en la correspondiente tabla
        //String cadenaSQL = "SELECT id_Docente, nombreDocente, documentoDocente, salarioDocente FROM Docentes";
        //controlador.cargarJTable((DefaultTableModel) tblDocentes.getModel(), cadenaSQL);
                String cadenaSQL = "SELECT id_Docente, nombreDocente, documentoDocente, salarioDocente FROM Docentes";
        controlador.cargarJTable((DefaultTableModel) tblDocentes.getModel(), cadenaSQL);
    }
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelDocentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnFondoCerrar;
    private javax.swing.JPanel BtnFondoEliminar;
    private javax.swing.JPanel BtnFondoGuardar;
    private javax.swing.JPanel BtnFondoModificar;
    private javax.swing.JPanel BtnFondoReporte;
    private javax.swing.JPanel BtnFrenteCerrar;
    private javax.swing.JPanel BtnFrenteEliminar;
    private javax.swing.JPanel BtnFrenteGuardar;
    private javax.swing.JPanel BtnFrenteModificar;
    private javax.swing.JPanel BtnFrenteReporte;
    private javax.swing.JPanel CargaDatosDocente;
    private javax.swing.JTextField CuadroCI;
    private javax.swing.JTextField CuadroID;
    private javax.swing.JTextField CuadroIdMateria;
    private javax.swing.JTextField CuadroMateria;
    private javax.swing.JTextField CuadroNombre;
    private javax.swing.JTextField CuadroSalario;
    private javax.swing.JPanel FondoBlanco;
    private javax.swing.JTabbedPane PanelDocentes;
    private javax.swing.JScrollPane TablaDocentes;
    private javax.swing.JPanel VerDocentes;
    private javax.swing.JLabel background;
    private javax.swing.JTable tblDocentes;
    private javax.swing.JLabel txtCI;
    private javax.swing.JLabel txtCerrar;
    private javax.swing.JLabel txtCursoAsig;
    private javax.swing.JLabel txtDescripcion;
    private javax.swing.JLabel txtDescripcion1;
    private javax.swing.JLabel txtDocentes;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtID;
    private javax.swing.JLabel txtModificar;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtReporte;
    // End of variables declaration//GEN-END:variables
}
