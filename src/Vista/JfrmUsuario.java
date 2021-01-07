
package Vista;

import Controlador.CtlUsuario;
import Controlador.CtlClase;
import Controlador.CtlSocios;
import Controlador.CtlCategoria;
import Controlador.CtlDetalle;
import Modelo.ClsUsuario;
import Modelo.ClsClases;
import Modelo.ClsSocios;
import Modelo.ClsCategoria;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Amaikase
 */
public class JfrmUsuario extends javax.swing.JFrame {

    CtlUsuario controller;
    CtlClase controllerClase;
    CtlSocios controllerSocios;
    CtlCategoria controllerCategoria;
    CtlDetalle controllerDT;
    private ArrayList<String> sociosArr = new ArrayList<String>();
    int idClase;
    
    public JfrmUsuario() {
        this.idClase = idClase;
        initComponents();
        controller = new CtlUsuario();
        controllerClase = new CtlClase();
        controllerSocios = new CtlSocios();
        controllerCategoria = new CtlCategoria();
        controllerDT = new CtlDetalle();
        this.setSize(new Dimension(500, 500));
        this.setMinimumSize(new Dimension(750, 500));
        listar();
        listarClases();
        listarSocios();
        listarCategoria();
        mostrar();
        DefaultTableModel modelo = (DefaultTableModel) tblClaseSocio.getModel();
        tblClaseSocio.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {                	
                },
                new String [] {
                	"NOMBRE SOCIOS"
                }
            ));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        panelGeneral = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        panelCategoria2 = new javax.swing.JPanel();
        txtNombreCategoria = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardarCategoria = new javax.swing.JButton();
        btnModificarCategoria = new javax.swing.JButton();
        btnEliminarCategoria = new javax.swing.JButton();
        btnAtrasCategoria = new javax.swing.JButton();
        panelCategoria1 = new javax.swing.JPanel();
        btnNuevoRegistro = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();
        txtIdCategoria = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        panelInstructores1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        btnNuevoInstructores = new javax.swing.JButton();
        panelInstructores2 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnAtrasInstructoes = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdIntructores = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        panelClase2 = new javax.swing.JPanel();
        btnGuardarClase = new javax.swing.JButton();
        btnAtrasClase = new javax.swing.JButton();
        btnModificarClase = new javax.swing.JButton();
        btnEliminarClase = new javax.swing.JButton();
        comboClase = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel s =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        horaFin = new javax.swing.JSpinner(s);
        jLabel7 = new javax.swing.JLabel();
        Date dat = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(dat, null, null, Calendar.HOUR_OF_DAY);
        horaInicio = new javax.swing.JSpinner(sm);
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreClase = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        comboClaseSocio = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblClaseSocio = new javax.swing.JTable();
        panelClase1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClases = new javax.swing.JTable();
        btnNuevoClases = new javax.swing.JButton();
        txtIdClase = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        panelSocios1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblSocio = new javax.swing.JTable();
        btnNuevoSocios = new javax.swing.JButton();
        panelSocios2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTelefonoSocio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        comboSocios = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        calendarSocio = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtApellidoSocio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreSocio = new javax.swing.JTextField();
        btnEliminarSocio = new javax.swing.JButton();
        btnModificarSocio = new javax.swing.JButton();
        btnAtrasSocios = new javax.swing.JButton();
        btnGuardarSocio = new javax.swing.JButton();
        txtIdSocios = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNombreCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreCategoriaKeyTyped(evt);
            }
        });

        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        jLabel11.setText("Nombre categoria:");

        jLabel12.setText("Valor mensualidad:");

        btnGuardarCategoria.setText("Guardar");
        btnGuardarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarCategoriaMouseClicked(evt);
            }
        });

        btnModificarCategoria.setText("Modificar");
        btnModificarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarCategoriaMouseClicked(evt);
            }
        });

        btnEliminarCategoria.setText("Eliminar");
        btnEliminarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarCategoriaMouseClicked(evt);
            }
        });

        btnAtrasCategoria.setText("Atras");
        btnAtrasCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasCategoriaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCategoria2Layout = new javax.swing.GroupLayout(panelCategoria2);
        panelCategoria2.setLayout(panelCategoria2Layout);
        panelCategoria2Layout.setHorizontalGroup(
            panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoria2Layout.createSequentialGroup()
                .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCategoria2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)))
                    .addGroup(panelCategoria2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnAtrasCategoria)
                        .addGap(68, 68, 68)
                        .addComponent(btnGuardarCategoria)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCategoria2Layout.createSequentialGroup()
                        .addComponent(btnModificarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                        .addComponent(btnEliminarCategoria)
                        .addGap(23, 23, 23))
                    .addGroup(panelCategoria2Layout.createSequentialGroup()
                        .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addComponent(txtValor))
                        .addContainerGap())))
        );
        panelCategoria2Layout.setVerticalGroup(
            panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoria2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(34, 34, 34)
                .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(panelCategoria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCategoria)
                    .addComponent(btnModificarCategoria)
                    .addComponent(btnEliminarCategoria)
                    .addComponent(btnAtrasCategoria))
                .addGap(37, 37, 37))
        );

        btnNuevoRegistro.setText("Nuevo Registro");
        btnNuevoRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoRegistroMouseClicked(evt);
            }
        });

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
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
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCategoria);

        javax.swing.GroupLayout panelCategoria1Layout = new javax.swing.GroupLayout(panelCategoria1);
        panelCategoria1.setLayout(panelCategoria1Layout);
        panelCategoria1Layout.setHorizontalGroup(
            panelCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCategoria1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoRegistro)
                .addGap(240, 240, 240))
        );
        panelCategoria1Layout.setVerticalGroup(
            panelCategoria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCategoria1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(btnNuevoRegistro)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(panelCategoria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCategoria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGeneral.addTab("Categoria", jPanel5);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Telefono", "Direccion"
            }
        ));
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        btnNuevoInstructores.setText("Nuevo Registro");
        btnNuevoInstructores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoInstructoresMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelInstructores1Layout = new javax.swing.GroupLayout(panelInstructores1);
        panelInstructores1.setLayout(panelInstructores1Layout);
        panelInstructores1Layout.setHorizontalGroup(
            panelInstructores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInstructores1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoInstructores)
                .addGap(235, 235, 235))
        );
        panelInstructores1Layout.setVerticalGroup(
            panelInstructores1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInstructores1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnNuevoInstructores)
                .addGap(19, 19, 19))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnAtrasInstructoes.setText("Atras");
        btnAtrasInstructoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasInstructoesMouseClicked(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        jLabel4.setText("Direccion:");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        jLabel3.setText("Telefono:");

        jLabel2.setText("Apellido:");

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel1.setText("Nombre:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelInstructores2Layout = new javax.swing.GroupLayout(panelInstructores2);
        panelInstructores2.setLayout(panelInstructores2Layout);
        panelInstructores2Layout.setHorizontalGroup(
            panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInstructores2Layout.createSequentialGroup()
                .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInstructores2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnAtrasInstructoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addGap(149, 149, 149)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelInstructores2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombre)
                            .addComponent(txtDireccion))))
                .addContainerGap())
            .addGroup(panelInstructores2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelInstructores2Layout.setVerticalGroup(
            panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInstructores2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelInstructores2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnAtrasInstructoes)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdIntructores, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(panelInstructores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(panelInstructores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelInstructores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInstructores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(txtIdIntructores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelGeneral.addTab("Instructores", jPanel1);

        btnGuardarClase.setText("Guardar");
        btnGuardarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarClaseMouseClicked(evt);
            }
        });

        btnAtrasClase.setText("Atras");
        btnAtrasClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasClaseMouseClicked(evt);
            }
        });

        btnModificarClase.setText("Modificar");
        btnModificarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarClaseMouseClicked(evt);
            }
        });
        btnModificarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarClaseActionPerformed(evt);
            }
        });

        btnEliminarClase.setText("Eliminar");
        btnEliminarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarClaseMouseClicked(evt);
            }
        });

        comboClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "elegir...", "1", "2", "3" }));
        comboClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboClaseActionPerformed(evt);
            }
        });

        jLabel15.setText("Instructor:");

        JSpinner.DateEditor d = new JSpinner.DateEditor(horaFin, "HH:mm:ss");
        horaFin.setEditor(d);

        jLabel7.setText("Hora fin:");

        JSpinner.DateEditor de = new JSpinner.DateEditor(horaInicio, "HH:mm:ss");
        horaInicio.setEditor(de);

        jLabel6.setText("Hora inicio:");

        jLabel5.setText("Nombre clase:");

        txtNombreClase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreClaseKeyTyped(evt);
            }
        });

        jLabel16.setText("Socio:");

        comboClaseSocio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("+");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setText("-");
        btnQuitar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuitarMouseClicked(evt);
            }
        });

        tblClaseSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane6.setViewportView(tblClaseSocio);

        javax.swing.GroupLayout panelClase2Layout = new javax.swing.GroupLayout(panelClase2);
        panelClase2.setLayout(panelClase2Layout);
        panelClase2Layout.setHorizontalGroup(
            panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClase2Layout.createSequentialGroup()
                .addComponent(btnAtrasClase)
                .addGap(208, 208, 208)
                .addComponent(btnGuardarClase)
                .addGap(33, 33, 33)
                .addComponent(btnModificarClase)
                .addGap(63, 63, 63)
                .addComponent(btnEliminarClase)
                .addContainerGap(131, Short.MAX_VALUE))
            .addGroup(panelClase2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(horaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(txtNombreClase)
                    .addComponent(horaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addComponent(comboClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboClaseSocio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClase2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnQuitar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClase2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        panelClase2Layout.setVerticalGroup(
            panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClase2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelClase2Layout.createSequentialGroup()
                        .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(horaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(horaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(comboClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(comboClaseSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnQuitar))
                .addGap(18, 36, Short.MAX_VALUE)
                .addGroup(panelClase2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarClase)
                    .addComponent(btnAtrasClase)
                    .addComponent(btnModificarClase)
                    .addComponent(btnEliminarClase)))
        );

        tblClases.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClasesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClases);

        btnNuevoClases.setText("Nuevo Registro");
        btnNuevoClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoClasesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelClase1Layout = new javax.swing.GroupLayout(panelClase1);
        panelClase1.setLayout(panelClase1Layout);
        panelClase1Layout.setHorizontalGroup(
            panelClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClase1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClase1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoClases)
                .addGap(290, 290, 290))
        );
        panelClase1Layout.setVerticalGroup(
            panelClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelClase1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnNuevoClases)
                .addContainerGap())
        );

        txtIdClase.setText("jTextField1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelClase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelClase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(txtIdClase, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelClase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelClase2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(txtIdClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelGeneral.addTab("Clases", jPanel2);

        tblSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tblSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSocioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblSocio);

        btnNuevoSocios.setText("Nuevo Registro");
        btnNuevoSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoSociosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSocios1Layout = new javax.swing.GroupLayout(panelSocios1);
        panelSocios1.setLayout(panelSocios1Layout);
        panelSocios1Layout.setHorizontalGroup(
            panelSocios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSocios1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(panelSocios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSocios1Layout.createSequentialGroup()
                        .addComponent(btnNuevoSocios)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSocios1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelSocios1Layout.setVerticalGroup(
            panelSocios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSocios1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoSocios)
                .addContainerGap())
        );

        jLabel14.setText("Telefono:");

        txtTelefonoSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoSocioKeyTyped(evt);
            }
        });

        jLabel13.setText("Categoria:");

        comboSocios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "elegir...", "1", "2", "3" }));

        jLabel10.setText("Fecha nacimiento:");

        jLabel9.setText("Apellido socio:");

        txtApellidoSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoSocioKeyTyped(evt);
            }
        });

        jLabel8.setText("Nombre socio:");

        txtNombreSocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreSocioKeyTyped(evt);
            }
        });

        btnEliminarSocio.setText("Eliminar");
        btnEliminarSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarSocioMouseClicked(evt);
            }
        });

        btnModificarSocio.setText("Modificar");
        btnModificarSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarSocioMouseClicked(evt);
            }
        });

        btnAtrasSocios.setText("Atras");
        btnAtrasSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAtrasSociosMouseClicked(evt);
            }
        });

        btnGuardarSocio.setText("Guardar");
        btnGuardarSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarSocioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelSocios2Layout = new javax.swing.GroupLayout(panelSocios2);
        panelSocios2.setLayout(panelSocios2Layout);
        panelSocios2Layout.setHorizontalGroup(
            panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSocios2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSocios2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(127, 127, 127)
                        .addComponent(comboSocios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelSocios2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(132, 132, 132)
                        .addComponent(txtTelefonoSocio))
                    .addGroup(panelSocios2Layout.createSequentialGroup()
                        .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtrasSocios)
                            .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)))
                        .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSocios2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(calendarSocio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtApellidoSocio)
                                    .addComponent(txtNombreSocio)))
                            .addGroup(panelSocios2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                                .addComponent(btnGuardarSocio)
                                .addGap(39, 39, 39)
                                .addComponent(btnModificarSocio)
                                .addGap(43, 43, 43)
                                .addComponent(btnEliminarSocio)
                                .addGap(77, 77, 77)))))
                .addContainerGap())
        );
        panelSocios2Layout.setVerticalGroup(
            panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSocios2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(21, 21, 21)
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(comboSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(txtTelefonoSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelSocios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarSocio)
                    .addComponent(btnModificarSocio)
                    .addComponent(btnAtrasSocios)
                    .addComponent(btnGuardarSocio)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIdSocios, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelSocios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSocios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelSocios1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSocios2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(txtIdSocios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelGeneral.addTab("Socios", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneral)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar(){        
        for (Component component : panelCategoria2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelInstructores2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelSocios2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelClase2.getComponents()) {
        component.setVisible(false); 
        }
        txtIdIntructores.setVisible(false);
        txtIdCategoria.setVisible(false);
        txtIdClase.setVisible(false);
        txtIdSocios.setVisible(false);
        tblCategoria.getColumnModel().getColumn(0).setResizable(false);
        tblCategoria.getColumnModel().getColumn(0).setMaxWidth(0);
        tblUsuario.getColumnModel().getColumn(0).setMaxWidth(0);
        tblClases.getColumnModel().getColumn(0).setMaxWidth(0);
        tblSocio.getColumnModel().getColumn(0).setMaxWidth(0);
    }
     
    private void btnNuevoRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoRegistroMouseClicked
        for (Component component : panelCategoria2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelCategoria1.getComponents()) {
        component.setVisible(false); 
        }
     
        btnEliminarCategoria.setVisible(false);
        btnModificarCategoria.setVisible(false);
    }//GEN-LAST:event_btnNuevoRegistroMouseClicked

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked
        int id = (int)tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0);
        //System.out.println(id);
        ClsCategoria usuario = controllerCategoria.SolicitarBuscar(id);
        cargarInformacionCategoria(usuario);
       
        for (Component component : panelCategoria2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelCategoria1.getComponents()) {
        component.setVisible(false); 
        }
        btnGuardarCategoria.setVisible(false);
    }//GEN-LAST:event_tblCategoriaMouseClicked

    private void btnGuardarSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarSocioMouseClicked
        if(txtNombreSocio.getText().isEmpty()){                    
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreSocio.setBackground(Color.pink);
            txtApellidoSocio.setBackground(Color.white);
            comboSocios.setBackground(Color.white);
            calendarSocio.setBackground(Color.white);
            txtTelefonoSocio.setBackground(Color.white);        
        }else if(txtApellidoSocio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreSocio.setBackground(Color.white);
            txtApellidoSocio.setBackground(Color.pink);
            comboSocios.setBackground(Color.white);
            calendarSocio.setBackground(Color.white);
            txtTelefonoSocio.setBackground(Color.white);
        }else if(comboSocios.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreSocio.setBackground(Color.white);
            txtApellidoSocio.setBackground(Color.white);
            comboSocios.setBackground(Color.red);
            calendarSocio.setBackground(Color.white);
            txtTelefonoSocio.setBackground(Color.white);
        }else if(txtTelefonoSocio.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreSocio.setBackground(Color.white);
            txtApellidoSocio.setBackground(Color.white);
            comboSocios.setBackground(Color.white);
            calendarSocio.setBackground(Color.white);
            txtTelefonoSocio.setBackground(Color.pink);
        }else if(calendarSocio.getDate() == null){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreSocio.setBackground(Color.white);
            txtApellidoSocio.setBackground(Color.white);
            calendarSocio.setBackground(Color.red);
            comboSocios.setBackground(Color.white);
            txtTelefonoSocio.setBackground(Color.white);            
        }
        else{
            int id = 0;
            String nombre = txtNombreSocio.getText();
            String apellido = txtApellidoSocio.getText();
            Date fecha = calendarSocio.getDate();
            String categoria =  (String)comboSocios.getSelectedItem();
            int telefono =  Integer.parseInt(txtTelefonoSocio.getText());

            if(controllerSocios.SolicitudGuardar(id, nombre, apellido, fecha, categoria, telefono)){
                JOptionPane.showMessageDialog(this, "Guardado con exito");
                limpiarSocios();
                listarSocios();
                txtNombreSocio.setBackground(Color.white);
                txtApellidoSocio.setBackground(Color.white);
                calendarSocio.setBackground(Color.white);
                comboSocios.setBackground(Color.white);
                txtTelefonoSocio.setBackground(Color.white);
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }
        }
        listarClases();
    }//GEN-LAST:event_btnGuardarSocioMouseClicked

    private void btnModificarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarClaseActionPerformed
        
    }//GEN-LAST:event_btnModificarClaseActionPerformed

    private void btnAtrasClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasClaseMouseClicked
        for (Component component : panelClase2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelClase1.getComponents()) {
        component.setVisible(true); 
        }
        txtNombreClase.setBackground(Color.white);
        limpiarClases();
    }//GEN-LAST:event_btnAtrasClaseMouseClicked

    private void btnGuardarClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarClaseMouseClicked
        if(txtNombreClase.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreClase.setBackground(Color.pink);            
        }else if(comboClase.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
             txtNombreClase.setBackground(Color.white);
        }
        else{
            int id = controller.obtenerId(comboClase.getSelectedItem().toString());
            String nombre = txtNombreClase.getText();
            java.sql.Time horaInici = new java.sql.Time(((Date)horaInicio.getValue()).getTime());
            java.sql.Time horafi = new java.sql.Time(((Date)horaFin.getValue()).getTime());
            String instructor =  (String)comboClase.getSelectedItem();

            if(controllerClase.SolicitudGuardar(id,nombre, horaInici, horafi,instructor)){
                  JOptionPane.showMessageDialog(this, "Guardado con exito");
                  limpiarClases();
                  listarClases();
                  txtNombreClase.setBackground(Color.white);
                  controllerDT.SolicitudGuardar(sociosArr, controllerClase.obtenerIdUltimaClase());
            }else{
                  JOptionPane.showMessageDialog(this, "Error al guardar");
           }
       }listarClases();
    }//GEN-LAST:event_btnGuardarClaseMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int id = Integer.parseInt(txtIdIntructores.getText());
        if(controller.solicitudEliminar(id)){
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            
            listar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        for (Component component : panelInstructores2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelInstructores1.getComponents()) {
        component.setVisible(true); 
        }
        limpiar();
        listarClases();
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String direccion = txtDireccion.getText();
        int id= Integer.parseInt(txtIdIntructores.getText());
        if(controller.SolicitudModificar(id,nombre, apellido, telefono, direccion)){
            JOptionPane.showMessageDialog(this, "Modificado exitosamente");            
            listar();
        }else{
            JOptionPane.showMessageDialog(this, "error al modificar");
        }
        for (Component component : panelInstructores2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelInstructores1.getComponents()) {
        component.setVisible(true); 
        }
        listarClases();
    }//GEN-LAST:event_btnModificarMouseClicked

    private void btnAtrasInstructoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasInstructoesMouseClicked
        for (Component component : panelInstructores2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelInstructores1.getComponents()) {
        component.setVisible(true); 
        }
        txtNombre.setBackground(Color.white);
        txtApellido.setBackground(Color.white);
        txtTelefono.setBackground(Color.white);
        txtDireccion.setBackground(Color.white);
        limpiar();
    }//GEN-LAST:event_btnAtrasInstructoesMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombre.setBackground(Color.pink);
            txtApellido.setBackground(Color.white);
            txtTelefono.setBackground(Color.white);
            txtDireccion.setBackground(Color.white);
        }else if(txtApellido.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombre.setBackground(Color.white);
            txtApellido.setBackground(Color.pink);
            txtTelefono.setBackground(Color.white);
            txtDireccion.setBackground(Color.white);
        }else if(txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombre.setBackground(Color.white);
            txtApellido.setBackground(Color.white);
            txtTelefono.setBackground(Color.pink);
            txtDireccion.setBackground(Color.white);
        }else if(txtDireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombre.setBackground(Color.white);
            txtApellido.setBackground(Color.white);
            txtTelefono.setBackground(Color.white);
            txtDireccion.setBackground(Color.pink);
        }else{
            int id = 0;
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            int telefono = Integer.parseInt(txtTelefono.getText());
            String direccion = txtDireccion.getText();

            if(controller.SolicitudGuardar(id, nombre, apellido, telefono, direccion)){
                JOptionPane.showMessageDialog(this, "Guardado con exito");
                limpiar();
                listar();
                listarClases();
                txtNombre.setBackground(Color.white);
                txtApellido.setBackground(Color.white);
                txtTelefono.setBackground(Color.white);
                txtDireccion.setBackground(Color.white);
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }        
        }        
        listarCategoria();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCategoriaMouseClicked
        if(txtNombreCategoria.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreCategoria.setBackground(Color.pink);
            txtValor.setBackground(Color.white);
        }else if(txtValor.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Por favor llene los campos vacios");
            txtNombreCategoria.setBackground(Color.white);
            txtValor.setBackground(Color.pink);
        }else{
            int id_categoria = 0;
            String nombre = txtNombreCategoria.getText();
            int valor = Integer.parseInt(txtValor.getText());

            if(controllerCategoria.SolicitudGuardar(id_categoria,nombre,valor)){
                JOptionPane.showMessageDialog(this, "Guardado con exito");
                txtNombreCategoria.setBackground(Color.white);
                txtValor.setBackground(Color.white);
                listar();
            }else{
                JOptionPane.showMessageDialog(this, "Error al guardar");
            }            
            limpiarCategoria();
            listarCategoria();
            listarSocios();
        }
    }//GEN-LAST:event_btnGuardarCategoriaMouseClicked
  
    private void btnAtrasCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasCategoriaMouseClicked
        for (Component component : panelCategoria2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelCategoria1.getComponents()) {
        component.setVisible(true); 
        }
        txtNombreCategoria.setBackground(Color.white);
        txtValor.setBackground(Color.white);
        limpiarCategoria();
        
    }//GEN-LAST:event_btnAtrasCategoriaMouseClicked

    private void btnModificarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarCategoriaMouseClicked
       int id = (int)tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0);
        String nombre = txtNombreCategoria.getText();
        int valor = Integer.parseInt(txtValor.getText());
        if(controllerCategoria.SolicitudModificar(id ,nombre, valor)){
            JOptionPane.showMessageDialog(this, "Modificado exitosamente");
            listarCategoria();
        }else{
            JOptionPane.showMessageDialog(this, "error al modificar");
        }
        for (Component component : panelCategoria2.getComponents()) {
            component.setVisible(false); 
            }
        for (Component component : panelCategoria1.getComponents()) {
            component.setVisible(true); 
        }
        listarSocios();
    }//GEN-LAST:event_btnModificarCategoriaMouseClicked

    private void btnEliminarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarCategoriaMouseClicked
        int id = Integer.parseInt(txtIdCategoria.getText());
        if(controllerCategoria.solicitudEliminar(id)){
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            listarCategoria();
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        for (Component component : panelCategoria2.getComponents()) {
            component.setVisible(false); 
            }
        for (Component component : panelCategoria1.getComponents()) {
            component.setVisible(true); 
        }
        listarSocios();
    }//GEN-LAST:event_btnEliminarCategoriaMouseClicked

    private void btnNuevoInstructoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoInstructoresMouseClicked
        for (Component component : panelInstructores2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelInstructores1.getComponents()) {
        component.setVisible(false); 
        }

        btnModificar.setVisible(false);
        btnEliminar.setVisible(false);
    }//GEN-LAST:event_btnNuevoInstructoresMouseClicked

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
        int id = (int)tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 0); 
        ClsUsuario usuario = controller.SolicitarBuscar(id);
        cargarInformacion(usuario);
       
        for (Component component : panelInstructores2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelInstructores1.getComponents()) {
        component.setVisible(false); 
        }
        btnGuardar.setVisible(false);
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void tblSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSocioMouseClicked
        int id = (int)tblSocio.getValueAt(tblSocio.getSelectedRow(), 0); 
        String nombreCategoria = (String)tblSocio.getValueAt(tblSocio.getSelectedRow(), 4); 
        
        ClsSocios usuario = controllerSocios.SolicitarBuscar(id,nombreCategoria);
        cargarInformacionSocios(usuario);
       
        for (Component component : panelSocios2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelSocios1.getComponents()) {
        component.setVisible(false); 
        }
        btnGuardarCategoria.setVisible(false);
    }//GEN-LAST:event_tblSocioMouseClicked

    private void btnNuevoSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoSociosMouseClicked
        for (Component component : panelSocios2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelSocios1.getComponents()) {
        component.setVisible(false); 
        }

        btnModificarSocio.setVisible(false);
        btnEliminarSocio.setVisible(false);
    }//GEN-LAST:event_btnNuevoSociosMouseClicked

    private void btnAtrasSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtrasSociosMouseClicked
        for (Component component : panelSocios2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelSocios1.getComponents()) {
        component.setVisible(true); 
        }
        txtNombreSocio.setBackground(Color.white);
        txtApellidoSocio.setBackground(Color.white);
        calendarSocio.setBackground(Color.white);
        comboSocios.setBackground(Color.white);
        txtTelefonoSocio.setBackground(Color.white);
        limpiarSocios();
    }//GEN-LAST:event_btnAtrasSociosMouseClicked

    private void btnModificarSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarSocioMouseClicked
        int id = (int)tblSocio.getValueAt(tblSocio.getSelectedRow(), 0);
        String nombre = txtNombreSocio.getText();
        String apellido = txtApellidoSocio.getText();
        Date fecha = calendarSocio.getDate();
        String categoria =  (String)comboSocios.getSelectedItem();
        int telefono =  Integer.parseInt(txtTelefonoSocio.getText());
        if(controllerSocios.SolicitudModificar(id, nombre, apellido, fecha, categoria, telefono)){
            JOptionPane.showMessageDialog(this, "Modificado exitosamente");
            listarSocios();
            limpiarSocios();
            txtNombreSocio.setBackground(Color.white);
                txtApellidoSocio.setBackground(Color.white);
                calendarSocio.setBackground(Color.white);
                comboSocios.setBackground(Color.white);
                txtTelefonoSocio.setBackground(Color.white);
        }else{
            JOptionPane.showMessageDialog(this, "error al modificar");
        }
        
        for (Component component : panelSocios2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelSocios1.getComponents()) {
        component.setVisible(true); 
        }
        limpiarSocios();
    }//GEN-LAST:event_btnModificarSocioMouseClicked

    private void btnEliminarSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarSocioMouseClicked
        int id = Integer.parseInt(txtIdSocios.getText());
        if(controllerSocios.solicitudEliminar(id)){
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            listarSocios();
            limpiarSocios();
            txtNombreSocio.setBackground(Color.white);
                txtApellidoSocio.setBackground(Color.white);
                calendarSocio.setBackground(Color.white);
                comboSocios.setBackground(Color.white);
                txtTelefonoSocio.setBackground(Color.white);
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        for (Component component : panelSocios2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelSocios1.getComponents()) {
        component.setVisible(true); 
        }
        listarClases();
    }//GEN-LAST:event_btnEliminarSocioMouseClicked

    private void txtNombreSocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreSocioKeyTyped
       if (Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreSocioKeyTyped

    private void txtTelefonoSocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoSocioKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoSocioKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        if (Character.isLetter(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtApellidoSocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoSocioKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoSocioKeyTyped

    private void txtNombreCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreCategoriaKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreCategoriaKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void btnNuevoClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoClasesMouseClicked
       for (Component component : panelClase2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelClase1.getComponents()) {
        component.setVisible(false); 
        }

        btnModificarClase.setVisible(false);
        btnEliminarClase.setVisible(false);
    }//GEN-LAST:event_btnNuevoClasesMouseClicked

    private void tblClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClasesMouseClicked
        int id = (int)tblClases.getValueAt(tblClases.getSelectedRow(), 0); 
        String nombreCategoria = (String)tblClases.getValueAt(tblClases.getSelectedRow(), 4); 
        
        ClsClases usuario = controllerClase.SolicitarBuscar(id,nombreCategoria);
        cargarInformacionClase(usuario);
        listarTBLclase();
       
        for (Component component : panelClase2.getComponents()) {
        component.setVisible(true); 
        }
        for (Component component : panelClase1.getComponents()) {
        component.setVisible(false); 
        }
        btnGuardarCategoria.setVisible(false);
    }//GEN-LAST:event_tblClasesMouseClicked

    private void btnModificarClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarClaseMouseClicked
        int id = (int)tblClases.getValueAt(tblClases.getSelectedRow(), 0);
        //int idClase = 0;
        String nombre = txtNombreClase.getText();
        java.sql.Time horaInici = new java.sql.Time(((Date)horaInicio.getValue()).getTime());
        java.sql.Time horafi = new java.sql.Time(((Date)horaFin.getValue()).getTime());
        String instructor =  (String)comboClase.getSelectedItem();
        
        if(controllerClase.SolicitudModificar(id, nombre, horaInici, horafi, instructor)){
            controllerDT.SolicitudModificar(sociosArr, idClase);
            JOptionPane.showMessageDialog(this, "Modificado exitosamente");
            listarClases();
        }else{
            JOptionPane.showMessageDialog(this, "error al modificar");
        }
        
        for (Component component : panelClase2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelClase1.getComponents()) {
        component.setVisible(true); 
        }
        limpiarClases();
    }//GEN-LAST:event_btnModificarClaseMouseClicked

    private void btnEliminarClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClaseMouseClicked
        int id = Integer.parseInt(txtIdClase.getText());
        //System.out.println(id);
        if(controllerClase.solicitudEliminar(id)){
            JOptionPane.showMessageDialog(this, "Eliminado exitosamente");
            listarClases();
        }else{
            JOptionPane.showMessageDialog(this, "Error al eliminar");
        }
        for (Component component : panelClase2.getComponents()) {
        component.setVisible(false); 
        }
        for (Component component : panelClase1.getComponents()) {
        component.setVisible(true); 
        }
        limpiarClases();
    }//GEN-LAST:event_btnEliminarClaseMouseClicked

    private void txtNombreClaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreClaseKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreClaseKeyTyped

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if(sociosArr.contains(comboClaseSocio.getSelectedItem().toString())){
	        JOptionPane.showMessageDialog(null, "El socio ya existe en la lista");
                
	}else if(comboClaseSocio.getSelectedIndex() != 0){
		sociosArr.add(comboClaseSocio.getSelectedItem().toString());
				
		DefaultTableModel modelTabla;
		String nombreColumnas[] = {"NOMBRE SOCIOS"};
		modelTabla = new DefaultTableModel(new Object[][] {}, nombreColumnas);
		for(String s: sociosArr) {
		modelTabla.addRow(new Object[] {
		    s
	});
	}tblClaseSocio.setModel(modelTabla);
	}
        
        comboClaseSocio.setSelectedIndex(0);
    }//GEN-LAST:event_btnAgregarMouseClicked
                                         
    private void btnQuitarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitarMouseClicked
    if(tblClaseSocio.getSelectedRow()>=0){
	sociosArr.remove(tblClaseSocio.getSelectedRow());
				
	DefaultTableModel modelTabla;
	String nombreColumnas[] = {"NOMBRE SOCIOS"};
	modelTabla = new DefaultTableModel(new Object[][] {}, nombreColumnas);
	for(String s: sociosArr) {
		modelTabla.addRow(new Object[] {
		s
	});
	}
				
	tblClaseSocio.setModel(modelTabla);
	//socios.setBackground(Color.WHITE);
	tblClaseSocio.setBackground(Color.WHITE);
	}else{
	    JOptionPane.showMessageDialog(null, "Seleccione un elemento válido");
	tblClaseSocio.setBackground(new Color(255, 188, 188));
	}
    }//GEN-LAST:event_btnQuitarMouseClicked

    private void comboClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboClaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboClaseActionPerformed
    
    public void limpiarCategoria(){
        txtNombreCategoria.setText("");
        txtValor.setText("");
    }
    
    public void limpiarClases(){
        txtNombreClase.setText("");
        JSpinner.DateEditor de = new JSpinner.DateEditor(horaInicio, "HH:mm:ss");
        JSpinner.DateEditor e = new JSpinner.DateEditor(horaFin, "HH:mm:ss");
        horaInicio.setEditor(de);
        horaFin.setEditor(e);
        comboClase.setSelectedIndex(0);
    }
   
    public void limpiar(){
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
    }
     
    public void limpiarSocios(){
        txtIdSocios.setText("");
        txtNombreSocio.setText("");
        txtApellidoSocio.setText("");
        calendarSocio.setCalendar(null);
        txtTelefonoSocio.setText("");
        comboSocios.setSelectedIndex(0);
    }
    
    public void cargarInformacion(ClsUsuario usuario){
        txtIdIntructores.setText(usuario.getId()+ "");
        txtNombre.setText(usuario.getNombre()+ "");
        txtApellido.setText(usuario.getApellido()+ "");
        txtTelefono.setText(usuario.getTelefono()+ "");        
        txtDireccion.setText(usuario.getDireccion()+ "");        
    }
    
    public void cargarInformacionCategoria(ClsCategoria usuario){
        txtIdCategoria.setText(usuario.getId_categoria()+ "");    
        txtNombreCategoria.setText(usuario.getNombreCategoria()+ "");
        txtValor.setText(usuario.getValorMensualidad()+ "");        
    }
    
    public void cargarInformacionSocios(ClsSocios usuario){
        txtIdSocios.setText(usuario.getId()+ "");    
        txtNombreSocio.setText(usuario.getNombreSocio()+ "");
        txtApellidoSocio.setText(usuario.getApellidoSocio()+ "");
        calendarSocio.setDate(usuario.getFechaNacimiento());
        comboSocios.setSelectedItem(usuario.getCategoria());
        txtTelefonoSocio.setText(usuario.getTelefono()+ "");
    }
    
    public void cargarInformacionClase(ClsClases usuario){
        txtIdClase.setText(usuario.getIdClase() + "");
        txtNombreClase.setText(usuario.getNombreClase());
        horaInicio.setValue(usuario.getHoraInicio());
        horaFin.setValue(usuario.getHoraFin());
        comboClase.setSelectedItem(usuario.getInstructor());
    }
    
    private void listarTBLclase(){
        //int n = 19;
//	tblClaseSocio.setModel(controllerDT.SolicitudListar(n));
//	sociosArr = controllerDT.SolicitudListarArrayList(n);
}
    
    
    private void listar(){
        tblUsuario.setModel(controller.solicitudListar());
    }
    
    private void listarClases(){
       tblClases.setModel(controllerClase.solicitudListar());
       comboClase.setModel(controllerClase.comboClase());
       comboClaseSocio.setModel(controllerSocios.comboClaseSocios());
//       tblClaseSocio.setModel(controllerClase.solicitudAgregar());
    }
    
    private void listarSocios(){
       tblSocio.setModel(controllerSocios.solicitudListar());
       comboSocios.setModel(controllerSocios.comboSocios());
    }
    
    private void listarCategoria(){
        tblCategoria.setModel(controllerCategoria.solicitudListar());
        tblCategoria.getColumnModel().getColumn(0).setResizable(false);
        tblCategoria.getColumnModel().getColumn(0).setMaxWidth(0);
    }
    
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
            java.util.logging.Logger.getLogger(JfrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtrasCategoria;
    private javax.swing.JButton btnAtrasClase;
    private javax.swing.JButton btnAtrasInstructoes;
    private javax.swing.JButton btnAtrasSocios;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminarCategoria;
    private javax.swing.JButton btnEliminarClase;
    private javax.swing.JButton btnEliminarSocio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarCategoria;
    private javax.swing.JButton btnGuardarClase;
    private javax.swing.JButton btnGuardarSocio;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarCategoria;
    private javax.swing.JButton btnModificarClase;
    private javax.swing.JButton btnModificarSocio;
    private javax.swing.JButton btnNuevoClases;
    private javax.swing.JButton btnNuevoInstructores;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btnNuevoSocios;
    private javax.swing.JButton btnQuitar;
    private com.toedter.calendar.JDateChooser calendarSocio;
    private javax.swing.JComboBox<String> comboClase;
    private javax.swing.JComboBox<String> comboClaseSocio;
    private javax.swing.JComboBox<String> comboSocios;
    private javax.swing.JSpinner horaFin;
    private javax.swing.JSpinner horaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel panelCategoria1;
    private javax.swing.JPanel panelCategoria2;
    private javax.swing.JPanel panelClase1;
    private javax.swing.JPanel panelClase2;
    private javax.swing.JTabbedPane panelGeneral;
    private javax.swing.JPanel panelInstructores1;
    private javax.swing.JPanel panelInstructores2;
    private javax.swing.JPanel panelSocios1;
    private javax.swing.JPanel panelSocios2;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTable tblClaseSocio;
    private javax.swing.JTable tblClases;
    private javax.swing.JTable tblSocio;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellidoSocio;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtIdClase;
    private javax.swing.JTextField txtIdIntructores;
    private javax.swing.JTextField txtIdSocios;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreCategoria;
    private javax.swing.JTextField txtNombreClase;
    private javax.swing.JTextField txtNombreSocio;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoSocio;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
