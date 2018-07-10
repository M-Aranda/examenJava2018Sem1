package org.marcelo.software.gui;

import com.jtattoo.plaf.luna.LunaLookAndFeel;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import excepciones.UsuarioInvalidoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Autor;
import model.Tecnica;
import model.Data;
import model.EncargadoDeSala;
import model.Genero;
import model.Obra;
import model.Sala;
import modelosDeTabla.TMModelObrasEnSalas;
import model.Tamanio;
import modelosDeTabla.TMModelAutores;

/**
 *
 * @author Marce
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    private String nombreDeLogin;
    private String claveDeLogin;
    private Data d;
    private TMModelObrasEnSalas modelObrasEnSalas;
    private TMModelAutores modelAutores;
    private List<Obra> obras;
    private List<Autor> autores;

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jfrSesion.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jfrAutores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btnCancelar.setVisible(false);
        btnEliminar.setEnabled(false);
        txtTamanio.setToolTipText("Coloque el ancho y luego el alto, "
                + "separado por una coma (no ponga espacios)");
        txtCodigoObra.setEnabled(false);
        btnActualizar.setVisible(false);
        chkModificarDatos.setVisible(false);
        try {
            d = new Data();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            inicializarComboBoxes();
            cargarTablaDatos();
            cargarTablaAutores();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jfrSesion = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        lblObra = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        lblCodigoObra = new javax.swing.JLabel();
        lblTecnica = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblAnioDeCreacion = new javax.swing.JLabel();
        lblNombreDePintura = new javax.swing.JLabel();
        lblTamanio = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        txtCodigoObra = new javax.swing.JTextField();
        txtAnioDeCreacion = new javax.swing.JTextField();
        txtNombreDeObra = new javax.swing.JTextField();
        txtTamanio = new javax.swing.JTextField();
        cboAutor = new javax.swing.JComboBox();
        cboTecnica = new javax.swing.JComboBox();
        cboGenero = new javax.swing.JComboBox();
        cboSala = new javax.swing.JComboBox();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblVerSala = new javax.swing.JLabel();
        cboSeleccionarSalaAVer = new javax.swing.JComboBox();
        btnVerObrasDeSalaSeleccionada = new javax.swing.JButton();
        btnVerObrasDeTodasLasSalas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnActualizar = new javax.swing.JButton();
        chkModificarDatos = new javax.swing.JCheckBox();
        mnbOpciones = new javax.swing.JMenuBar();
        jmBusqueda = new javax.swing.JMenu();
        jmnCrearAutor = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        jfrAutores = new javax.swing.JFrame();
        btnCrearAutor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAutores = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        txtApellidoAutor = new javax.swing.JTextField();
        txtRutAutor = new javax.swing.JTextField();
        txtNacionalidadAutor = new javax.swing.JTextField();
        lblNombreLogin = new javax.swing.JLabel();
        lblClaveLogin = new javax.swing.JLabel();
        txtNombreLogin = new javax.swing.JTextField();
        txtClaveLogin = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        lblObra.setText("Obra");

        lblAutor.setText("Autor");

        lblCodigoObra.setText("Codigo obra");

        lblTecnica.setText("Tecnica");

        lblGenero.setText("Genero");

        lblAnioDeCreacion.setText("Anio de creacion");

        lblNombreDePintura.setText("Nombre de la obra");

        lblTamanio.setText("Tamanio");

        lblSala.setText("Sala");

        txtNombreDeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDeObraActionPerformed(evt);
            }
        });

        cboAutor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboTecnica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblVerSala.setText("Filtrar por sala");

        cboSeleccionarSalaAVer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnVerObrasDeSalaSeleccionada.setText("Ver");
        btnVerObrasDeSalaSeleccionada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerObrasDeSalaSeleccionadaActionPerformed(evt);
            }
        });

        btnVerObrasDeTodasLasSalas.setText("Todas");
        btnVerObrasDeTodasLasSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerObrasDeTodasLasSalasActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        chkModificarDatos.setText("Deseo modificar datos");
        chkModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkModificarDatosActionPerformed(evt);
            }
        });

        jmBusqueda.setText("Opciones extra");

        jmnCrearAutor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jmnCrearAutor.setText("Crear autor");
        jmnCrearAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnCrearAutorActionPerformed(evt);
            }
        });
        jmBusqueda.add(jmnCrearAutor);

        mniSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jmBusqueda.add(mniSalir);

        mnbOpciones.add(jmBusqueda);

        jfrSesion.setJMenuBar(mnbOpciones);

        javax.swing.GroupLayout jfrSesionLayout = new javax.swing.GroupLayout(jfrSesion.getContentPane());
        jfrSesion.getContentPane().setLayout(jfrSesionLayout);
        jfrSesionLayout.setHorizontalGroup(
            jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrSesionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrSesionLayout.createSequentialGroup()
                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfrSesionLayout.createSequentialGroup()
                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jfrSesionLayout.createSequentialGroup()
                                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jfrSesionLayout.createSequentialGroup()
                                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblTamanio)
                                                    .addComponent(lblSala))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jfrSesionLayout.createSequentialGroup()
                                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblGenero)
                                                    .addComponent(lblTecnica)
                                                    .addComponent(lblCodigoObra))
                                                .addGap(40, 40, 40)
                                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cboGenero, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtCodigoObra, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(txtAnioDeCreacion, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cboTecnica, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfrSesionLayout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(txtNombreDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(cboAutor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGap(141, 141, 141)
                                        .addComponent(lblVerSala)
                                        .addGap(56, 56, 56))
                                    .addGroup(jfrSesionLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(btnCancelar)
                                        .addGap(48, 48, 48)
                                        .addComponent(btnRegistrar)
                                        .addGap(49, 49, 49)
                                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEliminar)
                                            .addGroup(jfrSesionLayout.createSequentialGroup()
                                                .addComponent(btnActualizar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(chkModificarDatos)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(btnVerObrasDeTodasLasSalas))
                            .addGroup(jfrSesionLayout.createSequentialGroup()
                                .addComponent(lblAutor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cboSeleccionarSalaAVer, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVerObrasDeSalaSeleccionada)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jfrSesionLayout.createSequentialGroup()
                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblObra)
                            .addComponent(lblAnioDeCreacion)
                            .addComponent(lblNombreDePintura))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jfrSesionLayout.setVerticalGroup(
            jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrSesionLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblObra)
                .addGap(18, 18, 18)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblVerSala))
                    .addComponent(lblCodigoObra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jfrSesionLayout.createSequentialGroup()
                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboSeleccionarSalaAVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerObrasDeSalaSeleccionada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerObrasDeTodasLasSalas))
                    .addGroup(jfrSesionLayout.createSequentialGroup()
                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfrSesionLayout.createSequentialGroup()
                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAutor))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTecnica))
                            .addComponent(cboTecnica, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfrSesionLayout.createSequentialGroup()
                                .addComponent(lblGenero)
                                .addGap(18, 18, 18)
                                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblAnioDeCreacion)
                                    .addComponent(txtAnioDeCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(cboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreDePintura)
                    .addComponent(txtNombreDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTamanio)
                    .addComponent(txtTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSala)
                    .addComponent(cboSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(chkModificarDatos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jfrSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar))
                .addGap(1, 1, 1))
        );

        btnCrearAutor.setText("Crear autor");
        btnCrearAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearAutorActionPerformed(evt);
            }
        });

        tblAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblAutores);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Rut");

        jLabel4.setText("Nacionalidad");

        javax.swing.GroupLayout jfrAutoresLayout = new javax.swing.GroupLayout(jfrAutores.getContentPane());
        jfrAutores.getContentPane().setLayout(jfrAutoresLayout);
        jfrAutoresLayout.setHorizontalGroup(
            jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrAutoresLayout.createSequentialGroup()
                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrAutoresLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfrAutoresLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(txtNombreAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                            .addGroup(jfrAutoresLayout.createSequentialGroup()
                                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRutAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidoAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jfrAutoresLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNacionalidadAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addGap(0, 333, Short.MAX_VALUE))
                    .addGroup(jfrAutoresLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnCrearAutor)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jfrAutoresLayout.setVerticalGroup(
            jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfrAutoresLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRutAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNacionalidadAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jfrAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfrAutoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jfrAutoresLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnCrearAutor)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreLogin.setText("Nombre:");

        lblClaveLogin.setText("Clave");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreLogin)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClaveLogin)
                        .addGap(32, 32, 32)
                        .addComponent(txtClaveLogin)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreLogin)
                    .addComponent(txtNombreLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClaveLogin)
                    .addComponent(txtClaveLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOk)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarComboBoxes() throws SQLException {
        iniciarComboBoxAutor();
        iniciarComboBoxTecnica();
        iniciarComboBoxGenero();
        iniciarComboBoxSalaAVer();
        iniciarComboBoxSalas();
    }

    private void iniciarComboBoxAutor() throws SQLException {
        cboAutor.removeAllItems();

        List<Autor> autores = new ArrayList();

        autores = d.getAutores();

        for (Autor a : autores) {
            cboAutor.addItem(a);
        }

    }

    private void iniciarComboBoxTecnica() throws SQLException {
        cboTecnica.removeAllItems();

        List<Tecnica> tecnicas = new ArrayList();

        tecnicas = d.getTecnicas();

        for (Tecnica t : tecnicas) {
            cboTecnica.addItem(t);
        }

        //La siguiente linea te permite rescatar el objeto que esta seleccionado
        //luego puedes usar los metodos del objeto rescatado, y por ende, ver sus atributos
        //Tecnica t = (Tecnica)cboTecnica.getSelectedItem();
    }

    private void iniciarComboBoxGenero() throws SQLException {
        cboGenero.removeAllItems();

        List<Genero> generos = new ArrayList();

        generos = d.getGeneros();

        for (Genero g : generos) {
            cboGenero.addItem(g);
        }

    }

    private void iniciarComboBoxSalaAVer() throws SQLException {
        cboSeleccionarSalaAVer.removeAllItems();

        List<Sala> salas = new ArrayList();

        salas = d.getSalas();

        for (Sala s : salas) {
            cboSeleccionarSalaAVer.addItem(s);

        }

    }

    private void iniciarComboBoxSalas() throws SQLException {
        cboSala.removeAllItems();

        List<Sala> salas = new ArrayList();

        salas = d.getSalas();

        for (Sala s : salas) {
            cboSala.addItem(s);

        }

    }

    private void cargarTablaDatos() throws SQLException {
        obras = d.getObras();
        modelObrasEnSalas = new TMModelObrasEnSalas((obras));
        tblDatos.setModel(modelObrasEnSalas);

    }

    private void cargarTablaAutores() throws SQLException {
        autores = d.getAutores();
        modelAutores = new TMModelAutores(autores);
        tblAutores.setModel(modelAutores);

    }


    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        try {
            verificarDatos();
        } catch (UsuarioInvalidoException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void txtNombreDeObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDeObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDeObraActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed

        jfrSesion.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));


    }//GEN-LAST:event_mniSalirActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();

            Obra obra = new Obra();
            Tamanio t = new Tamanio();

            int filaSeleccionada = tblDatos.getSelectedRow();
            String idComoString = String.valueOf(tblDatos.getValueAt(filaSeleccionada, 0));
            int idSeleccionado = Integer.parseInt(idComoString);
            try {
                obra = d.getObra(idSeleccionado);
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

            txtCodigoObra.setText(String.valueOf(obra.getId()));
            cboAutor.setSelectedIndex(obra.getAutor().getId() - 1);
            cboTecnica.setSelectedIndex(obra.getTecnica().getId() - 1);
            cboGenero.setSelectedIndex(obra.getGenero().getId() - 1);
            txtAnioDeCreacion.setText(String.valueOf(obra.getAnioDeCreacion()));
            txtNombreDeObra.setText(obra.getNombreDeObra());

            try {
                t = d.getTamanioPorId(obra.getId());
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

            String ancho = String.valueOf(t.getAncho());
            String alto = String.valueOf(t.getAlto());

            txtTamanio.setText(ancho + "," + alto);

            cboSala.setSelectedIndex(obra.getUbicacion().getId() - 1);

            deshabilitarComponentesDeIngresoDeDatosParaRegistrarObras();

        }
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarComponentesDeIngresoDeDatosParaRegistrarObras();
        btnActualizar.setVisible(false);
        chkModificarDatos.setVisible(false);
        chkModificarDatos.setSelected(false);
        btnEliminar.setEnabled(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int idObraAEliminar = Integer.parseInt(txtCodigoObra.getText());

        int opcion = JOptionPane.showOptionDialog(null,
                "Esta por eliminar una obra. Desea continuar?",
                "Aviso",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Si", "No"},
                "default");

        //int dialogo = JOptionPane.showConfirmDialog(null, "Esta por eliminar una obra. Desea continuar?");
        if (opcion == JOptionPane.YES_OPTION) {
            try {
                d.eliminarObra(idObraAEliminar);
                cargarTablaDatos();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
            habilitarComponentesDeIngresoDeDatosParaRegistrarObras();
            btnEliminar.setEnabled(false);
            chkModificarDatos.setVisible(false);
            JOptionPane.showMessageDialog(null, "Elminacion exitosa");

        } else if (opcion == JOptionPane.NO_OPTION) {
            btnCancelar.doClick();
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVerObrasDeSalaSeleccionadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerObrasDeSalaSeleccionadaActionPerformed
        int idSeleccionado = cboSeleccionarSalaAVer.getSelectedIndex() + 1;

        try {
            obras = d.getObrasPorSala(idSeleccionado);
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelObrasEnSalas = new TMModelObrasEnSalas((obras));
        tblDatos.setModel(modelObrasEnSalas);


    }//GEN-LAST:event_btnVerObrasDeSalaSeleccionadaActionPerformed

    private void btnVerObrasDeTodasLasSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerObrasDeTodasLasSalasActionPerformed
        try {
            cargarTablaDatos();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnVerObrasDeTodasLasSalasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        int opcion = JOptionPane.showOptionDialog(null,
                "Esta por registrar una obra. Desea continuar?",
                "Aviso",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Si", "No"},
                "default");

        if (opcion == JOptionPane.YES_OPTION) {
            try {
                Autor autor = (Autor) cboAutor.getSelectedItem();
                Tecnica tecnica = (Tecnica) cboTecnica.getSelectedItem();
                Genero genero = (Genero) cboGenero.getSelectedItem();

                int anioCreacion = Integer.parseInt(txtAnioDeCreacion.getText());

                String nombreObra = txtNombreDeObra.getText();

                String tamanio = txtTamanio.getText();
                tamanio = tamanio.trim();
                String[] partes = tamanio.split(",");
                String anchoComoString = partes[0];
                String altoComoString = partes[1];

                int ancho = Integer.parseInt(anchoComoString);
                int alto = Integer.parseInt(altoComoString);

                Sala sala = (Sala) cboSala.getSelectedItem();

                d.crearTamanio(ancho, alto);
                int idDeTamanio = d.obtenerIdTamanioMasReciente();
                Tamanio tam = d.getTamanioPorId(idDeTamanio);
                Obra obra = new Obra(1, autor, tecnica, genero, anioCreacion, nombreObra, tam, sala);
                System.out.println(obra);
                d.registrarObra(obra);
                cargarTablaDatos();
                JOptionPane.showMessageDialog(null, "Registro Exitoso");
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique que todos los campos tengan datos validos");
            } finally {
                resetearComponentesDeIngresoDeDatosParaRegistrarObras();
            }

        } else if (opcion == JOptionPane.NO_OPTION) {
            resetearComponentesDeIngresoDeDatosParaRegistrarObras();
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        int opcion = JOptionPane.showOptionDialog(null,
                "Esta por actualizar una obra. Desea continuar?",
                "Aviso",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Si", "No"},
                "default");

        if (opcion == JOptionPane.YES_OPTION) {
            try {
                int idDeLaObra = Integer.parseInt(txtCodigoObra.getText());
                Autor autor = (Autor) cboAutor.getSelectedItem();
                Tecnica tecnica = (Tecnica) cboTecnica.getSelectedItem();
                Genero genero = (Genero) cboGenero.getSelectedItem();

                int anioCreacion = Integer.parseInt(txtAnioDeCreacion.getText());

                String nombreObra = txtNombreDeObra.getText();

                String tamanio = txtTamanio.getText();
                tamanio = tamanio.trim();
                String[] partes = tamanio.split(",");
                String anchoComoString = partes[0];
                String altoComoString = partes[1];

                int ancho = Integer.parseInt(anchoComoString);
                int alto = Integer.parseInt(altoComoString);

                Sala sala = (Sala) cboSala.getSelectedItem();

                d.crearTamanio(ancho, alto);
                int idDeTamanio = d.obtenerIdTamanioMasReciente();
                Tamanio tam = d.getTamanioPorId(idDeTamanio);
                Obra obra = new Obra(idDeLaObra, autor, tecnica, genero, anioCreacion, nombreObra, tam, sala);
                d.actualizarObra(obra);
                cargarTablaDatos();
                JOptionPane.showMessageDialog(null, "Actualizacion exitosa");
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Verifique que todos los campos tengan datos validos");
            } finally {
                resetearComponentesDeIngresoDeDatosParaRegistrarObras();
                btnActualizar.setVisible(false);
                btnActualizar.setEnabled(false);
                chkModificarDatos.setSelected(false);
                chkModificarDatos.setVisible(false);
                btnEliminar.setEnabled(false);
                btnCancelar.setVisible(false);
            }

        } else if (opcion == JOptionPane.NO_OPTION) {
            resetearComponentesDeIngresoDeDatosParaRegistrarObras();
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void chkModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkModificarDatosActionPerformed
        if (chkModificarDatos.isSelected()) {
            btnActualizar.setEnabled(true);
            habilitarIngresoOSeleccionDeDatosParaActualizar();
        } else if (!chkModificarDatos.isSelected()) {
            btnActualizar.setEnabled(false);
            deshabilitarIngresoOSeleccionDeDatosParaActualizar();
        }
    }//GEN-LAST:event_chkModificarDatosActionPerformed

    private void jmnCrearAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnCrearAutorActionPerformed

        jfrAutores.setBounds(WIDTH, WIDTH, 600, 270);
        jfrAutores.setLocationRelativeTo(null);
        jfrAutores.setVisible(true);
        jfrAutores.setResizable(false);


    }//GEN-LAST:event_jmnCrearAutorActionPerformed

    private void btnCrearAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearAutorActionPerformed
        String nombreAutor=txtNombreAutor.getText();
        String apellidoAutor=txtApellidoAutor.getText();
        String rutAutor=txtRutAutor.getText();
        String nacionalidadAutor=txtNacionalidadAutor.getText();
        
        try {
            d.crearAutor(nombreAutor, apellidoAutor, rutAutor, nacionalidadAutor);
            JOptionPane.showMessageDialog(null, "Operacion exitosa");
            
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            txtNombreAutor.setText("");
            txtApellidoAutor.setText("");
            txtRutAutor.setText("");
            txtNacionalidadAutor.setText("");
            try {
                cargarTablaAutores();
                iniciarComboBoxAutor();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_btnCrearAutorActionPerformed

    private void habilitarIngresoOSeleccionDeDatosParaActualizar() {
        cboAutor.setEnabled(true);
        cboTecnica.setEnabled(true);
        cboGenero.setEnabled(true);
        txtAnioDeCreacion.setEnabled(true);
        txtNombreDeObra.setEnabled(true);
        txtTamanio.setEnabled(true);
        cboSala.setEnabled(true);
    }

    private void deshabilitarIngresoOSeleccionDeDatosParaActualizar() {
        cboAutor.setEnabled(false);
        cboTecnica.setEnabled(false);
        cboGenero.setEnabled(false);
        txtAnioDeCreacion.setEnabled(false);
        txtNombreDeObra.setEnabled(false);
        txtTamanio.setEnabled(false);
        cboSala.setEnabled(false);
    }

    private void deshabilitarComponentesDeIngresoDeDatosParaRegistrarObras() {

        cboAutor.setEnabled(false);
        cboTecnica.setEnabled(false);
        cboGenero.setEnabled(false);
        txtAnioDeCreacion.setEnabled(false);
        txtNombreDeObra.setEnabled(false);
        txtTamanio.setEnabled(false);
        cboSala.setEnabled(false);
        btnRegistrar.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnCancelar.setVisible(true);
        btnActualizar.setVisible(true);
        btnActualizar.setEnabled(false);
        chkModificarDatos.setVisible(true);

        btnVerObrasDeTodasLasSalas.setEnabled(false);
        btnVerObrasDeSalaSeleccionada.setEnabled(false);
        cboSeleccionarSalaAVer.setEnabled(false);

    }

    private void habilitarComponentesDeIngresoDeDatosParaRegistrarObras() {

        cboAutor.setEnabled(true);
        cboTecnica.setEnabled(true);
        cboGenero.setEnabled(true);
        txtAnioDeCreacion.setEnabled(true);
        txtNombreDeObra.setEnabled(true);
        txtTamanio.setEnabled(true);
        cboSala.setEnabled(true);
        btnRegistrar.setEnabled(false);
        btnCancelar.setVisible(false);
        btnActualizar.setVisible(false);
        btnRegistrar.setEnabled(true);

        btnVerObrasDeTodasLasSalas.setEnabled(true);
        btnVerObrasDeSalaSeleccionada.setEnabled(true);
        cboSeleccionarSalaAVer.setEnabled(true);

        resetearComponentesDeIngresoDeDatosParaRegistrarObras();
    }

    private void resetearComponentesDeIngresoDeDatosParaRegistrarObras() {
        txtCodigoObra.setText("");
        cboAutor.setSelectedIndex(0);
        cboTecnica.setSelectedIndex(0);
        cboGenero.setSelectedIndex(0);
        txtAnioDeCreacion.setText("");
        txtNombreDeObra.setText("");
        txtTamanio.setText("");
        cboSala.setSelectedIndex(0);
    }

    public void verificarDatos() throws UsuarioInvalidoException, IOException {

        String nombreIngresado = txtNombreLogin.getText();
        String claveIngresada = txtClaveLogin.getText();

        leerArchivoDeLogin();

        try {

            if (nombreIngresado.equals(nombreDeLogin) && claveIngresada.equals(claveDeLogin)) {
                jfrSesion.setBounds(WIDTH, WIDTH, 800, 540);
                jfrSesion.setLocationRelativeTo(null);
                jfrSesion.setVisible(true);
                jfrSesion.setResizable(false);
                this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                JOptionPane.showMessageDialog(null, "Bienvenido");

            } else if (!nombreIngresado.equals(nombreDeLogin) || !claveIngresada.equals(claveDeLogin)) {
                throw new UsuarioInvalidoException("Datos invalidos");
            }

        } catch (UsuarioInvalidoException ui) {
            JOptionPane.showMessageDialog(null, ui.getMessage());

        } finally {
            txtNombreLogin.setText("");
            txtClaveLogin.setText("");

        }

    }

    public void crearArchivoDeLogin() {
        Properties p = new Properties();
        p.put("Nombre", "admin");
        p.put("Clave", "admin");

        try {
            File archivo = new File("config.properties");
            FileWriter fw = new FileWriter(archivo);
            p.store(fw, "Datos admin");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivoDeLogin() throws FileNotFoundException, IOException {
        File config = new File("config.Properties");
        Properties p = new Properties();

        if (config.exists()) {
            FileReader fr = new FileReader(config);
            p.load(fr);
            nombreDeLogin = p.getProperty("Nombre");
            claveDeLogin = p.getProperty("Clave");
        } else if (!config.exists()) {
            crearArchivoDeLogin();

        }
    }

    public void errorUsuarioInvalido() throws UsuarioInvalidoException {
        String mensaje = "El nombre y/o clave ingresadas son invalidas";
        UsuarioInvalidoException ue = new UsuarioInvalidoException(mensaje);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new LunaLookAndFeel());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearAutor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerObrasDeSalaSeleccionada;
    private javax.swing.JButton btnVerObrasDeTodasLasSalas;
    private javax.swing.JComboBox cboAutor;
    private javax.swing.JComboBox cboGenero;
    private javax.swing.JComboBox cboSala;
    private javax.swing.JComboBox cboSeleccionarSalaAVer;
    private javax.swing.JComboBox cboTecnica;
    private javax.swing.JCheckBox chkModificarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFrame jfrAutores;
    private javax.swing.JFrame jfrSesion;
    private javax.swing.JMenu jmBusqueda;
    private javax.swing.JMenuItem jmnCrearAutor;
    private javax.swing.JLabel lblAnioDeCreacion;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblClaveLogin;
    private javax.swing.JLabel lblCodigoObra;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombreDePintura;
    private javax.swing.JLabel lblNombreLogin;
    private javax.swing.JLabel lblObra;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JLabel lblTecnica;
    private javax.swing.JLabel lblVerSala;
    private javax.swing.JMenuBar mnbOpciones;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JTable tblAutores;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtAnioDeCreacion;
    private javax.swing.JTextField txtApellidoAutor;
    private javax.swing.JTextField txtClaveLogin;
    private javax.swing.JTextField txtCodigoObra;
    private javax.swing.JTextField txtNacionalidadAutor;
    private javax.swing.JTextField txtNombreAutor;
    private javax.swing.JTextField txtNombreDeObra;
    private javax.swing.JTextField txtNombreLogin;
    private javax.swing.JTextField txtRutAutor;
    private javax.swing.JTextField txtTamanio;
    // End of variables declaration//GEN-END:variables
}
