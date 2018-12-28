
package VISTA;
import Animacion.Fade;
import MUNDO.*;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Angel Leonardo Vivas Andrade - codigo 1151646 Ing. de Sistemas UFPS
 * 
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Declaración de parámetros
     */
    static final int TAMANO_SUCURSALES = 10;
    static final String TITULO_FRAME = "GESTION DE SUCURSALES";
    static final String TITULO_PRINCIPAL = "BIENVENIDO";
    static final String ITEM_DEFECTO_SUCURSALES = "<SELECCIONAR SUCURSAL>";
    static final String ITEM_DEFECTO_PRODUCTOS = "<SELECCIONAR PRODUCTO>";
    
    Sucursal sucursales[];
    
    /**
     * Constructor de nueva Interfaz
     */
    public GUI() {
        initComponents();        
        sucursales = new Sucursal[TAMANO_SUCURSALES];
        eliminarSucursal.setEnabled(false);
        lanzarProducto.setEnabled(false);
        descontinuarProducto.setEnabled(false);
        antiguoProducto.setEnabled(false);
        eliminarXRangodePrecio.setEnabled(false);
        generarReporte.setEnabled(false);
    }
    /**
     * Método de inicialización de componentes.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogIngresar = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        etiquetaDialogCerrar1 = new javax.swing.JLabel();
        checkerIngresar = new javax.swing.JButton();
        frameAgregarSucursal = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        backAgregarSucursal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nombreSucursal = new javax.swing.JTextField();
        linea2 = new javax.swing.JLabel();
        direccionSucursal = new javax.swing.JTextField();
        linea3 = new javax.swing.JLabel();
        aceptarAgregarSucursal = new javax.swing.JButton();
        cancelarAgregarSucursal = new javax.swing.JButton();
        frameLanzar = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        backLanzar = new javax.swing.JButton();
        etiquetaLanzar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombreLanzar = new javax.swing.JTextField();
        linea4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigoLanzar = new javax.swing.JTextField();
        linea5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        descripcionLanzar = new javax.swing.JTextField();
        linea6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        java.text.NumberFormat format = java.text.NumberFormat.getInstance();
        javax.swing.text.NumberFormatter formatter = new javax.swing.text.NumberFormatter(format);

        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        precioLanzar = new javax.swing.JFormattedTextField(formatter);
        linea7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        fechaLanzar = new com.toedter.calendar.JCalendar();
        aceptarLanzar = new javax.swing.JButton();
        cancelarLanzar = new javax.swing.JButton();
        identificadorLanzar = new javax.swing.JLabel();
        frameDescontinuar = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        backDescontinuar = new javax.swing.JButton();
        etiquetaProductos = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        listaDescontinuar = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        nombreDescontinuar = new javax.swing.JTextField();
        linea13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        codigoDescontinuar = new javax.swing.JTextField();
        linea14 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        descripcionDescontinuar = new javax.swing.JTextField();
        linea15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        precioDescontinuar = new javax.swing.JFormattedTextField(formatter);
        linea16 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        fechaDescontinuar = new javax.swing.JTextField();
        linea17 = new javax.swing.JLabel();
        eliminarDescontinuar = new javax.swing.JButton();
        identificadorDescontinuar = new javax.swing.JLabel();
        frameAntiguo = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        backAntiguo = new javax.swing.JButton();
        etiquetaAntiguo = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nombreAntiguo = new javax.swing.JTextField();
        linea8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        codigoAntiguo = new javax.swing.JTextField();
        linea9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        descripcionAntiguo = new javax.swing.JTextField();
        linea10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        precioAntiguo = new javax.swing.JFormattedTextField(formatter);
        linea11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        fechaAntiguo = new javax.swing.JTextField();
        linea12 = new javax.swing.JLabel();
        identificadorAntiguo = new javax.swing.JLabel();
        frameRango = new javax.swing.JFrame();
        jPanel6 = new javax.swing.JPanel();
        backRango = new javax.swing.JButton();
        etiquetaRango = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        condicionRango = new javax.swing.JComboBox<>();
        precioRango1 = new javax.swing.JFormattedTextField(formatter);
        etiquetaCondicion = new javax.swing.JLabel();
        precioRango2 = new javax.swing.JFormattedTextField(formatter);
        eliminarRango = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaRango = new javax.swing.JTable();
        identificadorRango = new javax.swing.JLabel();
        frameReporte = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        backReporte = new javax.swing.JButton();
        nombreReporte = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaReporte = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        direccionReporte = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        exportarReporte = new javax.swing.JButton();
        directorioWindows = new javax.swing.JPanel();
        directorioElegir = new javax.swing.JFileChooser();
        dialogCerrarFrame = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        etiquetaDialogCerrar = new javax.swing.JLabel();
        checker = new javax.swing.JButton();
        unChecker = new javax.swing.JButton();
        PanelTodo = new javax.swing.JPanel();
        Barra = new javax.swing.JPanel();
        tituloFrame = new javax.swing.JLabel();
        cerrarFrame = new javax.swing.JButton();
        minimizarFrame = new javax.swing.JButton();
        Zona = new javax.swing.JPanel();
        Card = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        etiquetaLogin1 = new javax.swing.JLabel();
        etiquetaLogin2 = new javax.swing.JLabel();
        nombreLogin = new javax.swing.JTextField();
        linea = new javax.swing.JLabel();
        ingresarLogin = new javax.swing.JButton();
        noUsed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loader = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        principal = new javax.swing.JPanel();
        pantalla = new javax.swing.JPanel();
        nombreGrande = new javax.swing.JTextField();
        botonesLeft = new javax.swing.JPanel();
        agregarSucursal = new javax.swing.JButton();
        eliminarSucursal = new javax.swing.JButton();
        lanzarProducto = new javax.swing.JButton();
        descontinuarProducto = new javax.swing.JButton();
        antiguoProducto = new javax.swing.JButton();
        eliminarXRangodePrecio = new javax.swing.JButton();
        generarReporte = new javax.swing.JButton();
        mostrarEste = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDireccion = new javax.swing.JTextArea();
        listaSucursales = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        dialogIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialogIngresar.setUndecorated(true);
        dialogIngresar.setResizable(false);
        dialogIngresar.setSize(new java.awt.Dimension(230, 140));
        dialogIngresar.setLocationRelativeTo(null);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(230, 140));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaDialogCerrar1.setFont(new java.awt.Font("Century", 2, 22)); // NOI18N
        etiquetaDialogCerrar1.setForeground(new java.awt.Color(84, 173, 204));
        etiquetaDialogCerrar1.setText("Ingresa un nombre!");
        jPanel9.add(etiquetaDialogCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, 50));

        checkerIngresar.setBackground(new java.awt.Color(255, 255, 255));
        checkerIngresar.setForeground(new java.awt.Color(255, 255, 255));
        checkerIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/checkIngresarIcon.png"))); // NOI18N
        checkerIngresar.setBorder(null);
        checkerIngresar.setBorderPainted(false);
        checkerIngresar.setContentAreaFilled(false);
        checkerIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkerIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checkerIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/checkIngresarRolloverIcon.png"))); // NOI18N
        checkerIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkerIngresarActionPerformed(evt);
            }
        });
        jPanel9.add(checkerIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, 40));

        javax.swing.GroupLayout dialogIngresarLayout = new javax.swing.GroupLayout(dialogIngresar.getContentPane());
        dialogIngresar.getContentPane().setLayout(dialogIngresarLayout);
        dialogIngresarLayout.setHorizontalGroup(
            dialogIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogIngresarLayout.setVerticalGroup(
            dialogIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frameAgregarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameAgregarSucursal.setUndecorated(true);
        frameAgregarSucursal.setResizable(false);
        frameAgregarSucursal.setSize(new java.awt.Dimension(430, 270));
        frameAgregarSucursal.setLocationRelativeTo(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 270));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backAgregarSucursal.setText("Back");
        backAgregarSucursal.setToolTipText("");
        backAgregarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAgregarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(backAgregarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        jLabel5.setFont(new java.awt.Font("Century", 2, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 155, 219));
        jLabel5.setText("Registro de sucursales");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 200, -1));

        nombreSucursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreSucursal.setText("Nombre Sucursal");
        nombreSucursal.setBorder(null);
        nombreSucursal.setMargin(new java.awt.Insets(2, 2, 0, 2));
        nombreSucursal.setOpaque(false);
        nombreSucursal.setScrollOffset(1);
        nombreSucursal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreSucursalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreSucursalFocusLost(evt);
            }
        });
        nombreSucursal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreSucursalKeyTyped(evt);
            }
        });
        jPanel1.add(nombreSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 320, 30));

        linea2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea2.setForeground(new java.awt.Color(0, 155, 219));
        linea2.setText("__________________");
        jPanel1.add(linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 330, 30));

        direccionSucursal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        direccionSucursal.setText("Dirección Sucursal");
        direccionSucursal.setToolTipText("");
        direccionSucursal.setBorder(null);
        direccionSucursal.setOpaque(false);
        direccionSucursal.setPreferredSize(new java.awt.Dimension(115, 20));
        direccionSucursal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                direccionSucursalFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionSucursalFocusLost(evt);
            }
        });
        jPanel1.add(direccionSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 320, 30));

        linea3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea3.setForeground(new java.awt.Color(0, 155, 219));
        linea3.setText("__________________");
        jPanel1.add(linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 330, 30));

        aceptarAgregarSucursal.setText("ACEPTAR");
        aceptarAgregarSucursal.setToolTipText("");
        aceptarAgregarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarAgregarSucursal.setPreferredSize(new java.awt.Dimension(80, 25));
        aceptarAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarAgregarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(aceptarAgregarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, 40));

        cancelarAgregarSucursal.setText("CANCELAR");
        cancelarAgregarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarAgregarSucursal.setPreferredSize(new java.awt.Dimension(80, 25));
        cancelarAgregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAgregarSucursalActionPerformed(evt);
            }
        });
        jPanel1.add(cancelarAgregarSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 150, 40));

        javax.swing.GroupLayout frameAgregarSucursalLayout = new javax.swing.GroupLayout(frameAgregarSucursal.getContentPane());
        frameAgregarSucursal.getContentPane().setLayout(frameAgregarSucursalLayout);
        frameAgregarSucursalLayout.setHorizontalGroup(
            frameAgregarSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameAgregarSucursalLayout.setVerticalGroup(
            frameAgregarSucursalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        frameLanzar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameLanzar.setUndecorated(true);
        frameLanzar.setResizable(false);
        frameLanzar.setSize(new java.awt.Dimension(600, 460));
        frameLanzar.setLocationRelativeTo(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 460));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backLanzar.setText("Back");
        backLanzar.setToolTipText("");
        backLanzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLanzarActionPerformed(evt);
            }
        });
        jPanel2.add(backLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        etiquetaLanzar.setFont(new java.awt.Font("Century", 2, 18)); // NOI18N
        etiquetaLanzar.setForeground(new java.awt.Color(84, 173, 204));
        etiquetaLanzar.setText("Registro de productos");
        jPanel2.add(etiquetaLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 190, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/RegistrarProducto.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 80, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel3.setText("Nombre ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 55, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel2.setText("Línea del Producto");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 73, -1, -1));

        nombreLanzar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombreLanzar.setText("Nombre Línea");
        nombreLanzar.setBorder(null);
        nombreLanzar.setMargin(new java.awt.Insets(2, 2, 0, 2));
        nombreLanzar.setOpaque(false);
        nombreLanzar.setScrollOffset(1);
        nombreLanzar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreLanzarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreLanzarFocusLost(evt);
            }
        });
        nombreLanzar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreLanzarKeyTyped(evt);
            }
        });
        jPanel2.add(nombreLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 60, 390, 30));

        linea4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea4.setForeground(new java.awt.Color(0, 155, 219));
        linea4.setText("______________________");
        jPanel2.add(linea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 400, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel7.setText("Código del Producto");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 115, -1, -1));

        codigoLanzar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        codigoLanzar.setText("Código");
        codigoLanzar.setToolTipText("");
        codigoLanzar.setBorder(null);
        codigoLanzar.setOpaque(false);
        codigoLanzar.setPreferredSize(new java.awt.Dimension(115, 20));
        codigoLanzar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                codigoLanzarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoLanzarFocusLost(evt);
            }
        });
        codigoLanzar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoLanzarKeyTyped(evt);
            }
        });
        jPanel2.add(codigoLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 100, 200, 30));

        linea5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea5.setForeground(new java.awt.Color(0, 155, 219));
        linea5.setText("___________");
        jPanel2.add(linea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 200, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel9.setText("Descrip. del Producto");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 155, -1, -1));

        descripcionLanzar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descripcionLanzar.setText("Descripción");
        descripcionLanzar.setToolTipText("");
        descripcionLanzar.setBorder(null);
        descripcionLanzar.setOpaque(false);
        descripcionLanzar.setPreferredSize(new java.awt.Dimension(115, 20));
        descripcionLanzar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descripcionLanzarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descripcionLanzarFocusLost(evt);
            }
        });
        descripcionLanzar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionLanzarKeyTyped(evt);
            }
        });
        jPanel2.add(descripcionLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 140, 390, 30));

        linea6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea6.setForeground(new java.awt.Color(0, 155, 219));
        linea6.setText("______________________");
        jPanel2.add(linea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 400, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel10.setText("Precio x Unidad");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 195, -1, -1));

        precioLanzar.setValue(0);
        precioLanzar.setBorder(null);
        precioLanzar.setOpaque(false);
        precioLanzar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioLanzarKeyTyped(evt);
            }
        });
        jPanel2.add(precioLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 180, 140, 30));

        linea7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea7.setForeground(new java.awt.Color(0, 155, 219));
        linea7.setText("________");
        jPanel2.add(linea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel19.setText("Fecha de Creación");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 232, -1, -1));

        fechaLanzar.setBackground(new java.awt.Color(255, 255, 255));
        fechaLanzar.setForeground(new java.awt.Color(0, 114, 160));
        fechaLanzar.setDecorationBackgroundColor(new java.awt.Color(0, 158, 255));
        fechaLanzar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fechaLanzar.setSundayForeground(new java.awt.Color(255, 0, 51));
        fechaLanzar.setTodayButtonText("Ir Fecha Actual");
        fechaLanzar.setTodayButtonVisible(true);
        fechaLanzar.setWeekdayForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(fechaLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 360, 180));

        aceptarLanzar.setText("ACEPTAR");
        aceptarLanzar.setToolTipText("");
        aceptarLanzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptarLanzar.setPreferredSize(new java.awt.Dimension(80, 25));
        aceptarLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarLanzarActionPerformed(evt);
            }
        });
        jPanel2.add(aceptarLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 120, 40));

        cancelarLanzar.setText("CANCELAR");
        cancelarLanzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelarLanzar.setPreferredSize(new java.awt.Dimension(80, 25));
        cancelarLanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarLanzarActionPerformed(evt);
            }
        });
        jPanel2.add(cancelarLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 120, 40));

        identificadorLanzar.setBackground(new java.awt.Color(255, 255, 255));
        identificadorLanzar.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        identificadorLanzar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        identificadorLanzar.setText("SUCURSAL ACTUAL");
        jPanel2.add(identificadorLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 560, 20));

        javax.swing.GroupLayout frameLanzarLayout = new javax.swing.GroupLayout(frameLanzar.getContentPane());
        frameLanzar.getContentPane().setLayout(frameLanzarLayout);
        frameLanzarLayout.setHorizontalGroup(
            frameLanzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameLanzarLayout.setVerticalGroup(
            frameLanzarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameLanzarLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frameDescontinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameDescontinuar.setUndecorated(true);
        frameDescontinuar.setResizable(false);
        frameDescontinuar.setSize(new java.awt.Dimension(560, 330));
        frameDescontinuar.setLocationRelativeTo(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setMinimumSize(new java.awt.Dimension(600, 300));
        jPanel4.setPreferredSize(new java.awt.Dimension(560, 330));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backDescontinuar.setText("Back");
        backDescontinuar.setToolTipText("");
        backDescontinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backDescontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backDescontinuarActionPerformed(evt);
            }
        });
        jPanel4.add(backDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        etiquetaProductos.setFont(new java.awt.Font("Century", 2, 18)); // NOI18N
        etiquetaProductos.setForeground(new java.awt.Color(84, 173, 204));
        etiquetaProductos.setText("Descontinuar Productos");
        jPanel4.add(etiquetaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 210, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/RegistrarProducto.png"))); // NOI18N
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 80, 80));

        listaDescontinuar.setBackground(new java.awt.Color(84, 173, 204));
        listaDescontinuar.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        listaDescontinuar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECCIONAR PRODUCTO>" }));
        listaDescontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDescontinuarActionPerformed(evt);
            }
        });
        jPanel4.add(listaDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 330, 25));

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel22.setText("Nombre ");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel21.setText("Línea del Producto");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        nombreDescontinuar.setEditable(false);
        nombreDescontinuar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombreDescontinuar.setToolTipText("");
        nombreDescontinuar.setBorder(null);
        nombreDescontinuar.setMargin(new java.awt.Insets(2, 2, 0, 2));
        nombreDescontinuar.setOpaque(false);
        nombreDescontinuar.setScrollOffset(1);
        jPanel4.add(nombreDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 390, 30));

        linea13.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea13.setForeground(new java.awt.Color(0, 155, 219));
        linea13.setText("______________________");
        jPanel4.add(linea13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 400, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel23.setText("Código");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 175, -1, -1));

        codigoDescontinuar.setEditable(false);
        codigoDescontinuar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        codigoDescontinuar.setToolTipText("");
        codigoDescontinuar.setBorder(null);
        codigoDescontinuar.setOpaque(false);
        codigoDescontinuar.setPreferredSize(new java.awt.Dimension(115, 20));
        jPanel4.add(codigoDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 160, 200, 30));

        linea14.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea14.setForeground(new java.awt.Color(0, 155, 219));
        linea14.setText("___________");
        jPanel4.add(linea14, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 160, 200, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel24.setText("Descripción");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, -1, -1));

        descripcionDescontinuar.setEditable(false);
        descripcionDescontinuar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descripcionDescontinuar.setToolTipText("");
        descripcionDescontinuar.setBorder(null);
        descripcionDescontinuar.setOpaque(false);
        descripcionDescontinuar.setPreferredSize(new java.awt.Dimension(115, 20));
        jPanel4.add(descripcionDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 390, 30));

        linea15.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea15.setForeground(new java.awt.Color(0, 155, 219));
        linea15.setText("______________________");
        jPanel4.add(linea15, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 400, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel25.setText("Precio");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 255, -1, -1));

        precioDescontinuar.setEditable(false);
        precioDescontinuar.setBorder(null);
        precioDescontinuar.setOpaque(false);
        jPanel4.add(precioDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 140, 30));

        linea16.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea16.setForeground(new java.awt.Color(0, 155, 219));
        linea16.setText("________");
        jPanel4.add(linea16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 150, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel26.setText("Fecha");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 295, -1, -1));

        fechaDescontinuar.setEditable(false);
        fechaDescontinuar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaDescontinuar.setToolTipText("");
        fechaDescontinuar.setBorder(null);
        fechaDescontinuar.setOpaque(false);
        fechaDescontinuar.setPreferredSize(new java.awt.Dimension(115, 20));
        jPanel4.add(fechaDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 200, 30));

        linea17.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea17.setForeground(new java.awt.Color(0, 155, 219));
        linea17.setText("___________");
        jPanel4.add(linea17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 200, 30));

        eliminarDescontinuar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminarDescontinuar.setText("ELIMINAR");
        eliminarDescontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarDescontinuarActionPerformed(evt);
            }
        });
        jPanel4.add(eliminarDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 150, 40));

        identificadorDescontinuar.setBackground(new java.awt.Color(255, 255, 255));
        identificadorDescontinuar.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        identificadorDescontinuar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        identificadorDescontinuar.setText("SUCURSAL ACTUAL");
        jPanel4.add(identificadorDescontinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 530, 20));

        javax.swing.GroupLayout frameDescontinuarLayout = new javax.swing.GroupLayout(frameDescontinuar.getContentPane());
        frameDescontinuar.getContentPane().setLayout(frameDescontinuarLayout);
        frameDescontinuarLayout.setHorizontalGroup(
            frameDescontinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frameDescontinuarLayout.setVerticalGroup(
            frameDescontinuarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frameAntiguo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameAntiguo.setUndecorated(true);
        frameAntiguo.setResizable(false);
        frameAntiguo.setSize(new java.awt.Dimension(570, 310));
        frameAntiguo.setLocationRelativeTo(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(570, 310));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backAntiguo.setText("Back");
        backAntiguo.setToolTipText("");
        backAntiguo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backAntiguo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backAntiguoActionPerformed(evt);
            }
        });
        jPanel3.add(backAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        etiquetaAntiguo.setFont(new java.awt.Font("Century", 2, 24)); // NOI18N
        etiquetaAntiguo.setForeground(new java.awt.Color(84, 173, 204));
        etiquetaAntiguo.setText("Producto más Antiguo");
        jPanel3.add(etiquetaAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 260, 50));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/RegistrarProducto.png"))); // NOI18N
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 80, 80));

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel13.setText("Nombre ");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel12.setText("Línea del Producto");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, -1, -1));

        nombreAntiguo.setEditable(false);
        nombreAntiguo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nombreAntiguo.setToolTipText("");
        nombreAntiguo.setBorder(null);
        nombreAntiguo.setMargin(new java.awt.Insets(2, 2, 0, 2));
        nombreAntiguo.setOpaque(false);
        nombreAntiguo.setScrollOffset(1);
        jPanel3.add(nombreAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 390, 30));

        linea8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea8.setForeground(new java.awt.Color(0, 155, 219));
        linea8.setText("______________________");
        jPanel3.add(linea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 400, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel14.setText("Código del Producto");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 150, -1, -1));

        codigoAntiguo.setEditable(false);
        codigoAntiguo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        codigoAntiguo.setToolTipText("");
        codigoAntiguo.setBorder(null);
        codigoAntiguo.setOpaque(false);
        codigoAntiguo.setPreferredSize(new java.awt.Dimension(115, 20));
        jPanel3.add(codigoAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 200, 30));

        linea9.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea9.setForeground(new java.awt.Color(0, 155, 219));
        linea9.setText("___________");
        jPanel3.add(linea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 200, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel15.setText("Descrip. del Producto");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 190, -1, -1));

        descripcionAntiguo.setEditable(false);
        descripcionAntiguo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        descripcionAntiguo.setToolTipText("");
        descripcionAntiguo.setBorder(null);
        descripcionAntiguo.setOpaque(false);
        descripcionAntiguo.setPreferredSize(new java.awt.Dimension(115, 20));
        jPanel3.add(descripcionAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 390, 30));

        linea10.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea10.setForeground(new java.awt.Color(0, 155, 219));
        linea10.setText("______________________");
        jPanel3.add(linea10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 400, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel16.setText("Precio del Producto");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 230, -1, -1));

        precioAntiguo.setEditable(false);
        precioAntiguo.setBorder(null);
        precioAntiguo.setOpaque(false);
        jPanel3.add(precioAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 140, 30));

        linea11.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea11.setForeground(new java.awt.Color(0, 155, 219));
        linea11.setText("________");
        jPanel3.add(linea11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel18.setText("Fecha de Creación");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 270, -1, -1));

        fechaAntiguo.setEditable(false);
        fechaAntiguo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        fechaAntiguo.setToolTipText("");
        fechaAntiguo.setBorder(null);
        fechaAntiguo.setOpaque(false);
        fechaAntiguo.setPreferredSize(new java.awt.Dimension(115, 20));
        jPanel3.add(fechaAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 200, 30));

        linea12.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea12.setForeground(new java.awt.Color(0, 155, 219));
        linea12.setText("___________");
        jPanel3.add(linea12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 200, 30));
        linea12.getAccessibleContext().setAccessibleName("__________");

        identificadorAntiguo.setBackground(new java.awt.Color(255, 255, 255));
        identificadorAntiguo.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        identificadorAntiguo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        identificadorAntiguo.setText("SUCURSAL ACTUAL");
        jPanel3.add(identificadorAntiguo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 530, 20));

        javax.swing.GroupLayout frameAntiguoLayout = new javax.swing.GroupLayout(frameAntiguo.getContentPane());
        frameAntiguo.getContentPane().setLayout(frameAntiguoLayout);
        frameAntiguoLayout.setHorizontalGroup(
            frameAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAntiguoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frameAntiguoLayout.setVerticalGroup(
            frameAntiguoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAntiguoLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frameRango.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameRango.setUndecorated(true);
        frameRango.setResizable(false);
        frameRango.setSize(new java.awt.Dimension(570, 450));
        frameRango.setLocationRelativeTo(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setMinimumSize(new java.awt.Dimension(570, 450));
        jPanel6.setPreferredSize(new java.awt.Dimension(570, 450));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backRango.setText("Back");
        backRango.setToolTipText("");
        backRango.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backRangoActionPerformed(evt);
            }
        });
        jPanel6.add(backRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        etiquetaRango.setFont(new java.awt.Font("Century", 2, 18)); // NOI18N
        etiquetaRango.setForeground(new java.awt.Color(84, 173, 204));
        etiquetaRango.setText("Productos por Rango de Precio");
        jPanel6.add(etiquetaRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 260, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/RegistrarProducto.png"))); // NOI18N
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 80, 80));

        jLabel34.setFont(new java.awt.Font("Segoe UI Symbol", 1, 11)); // NOI18N
        jLabel34.setText("Elegir Condición de Búsqueda");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 95, -1, -1));

        condicionRango.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mayor de", "Menor de", "Entre" }));
        condicionRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionRangoActionPerformed(evt);
            }
        });
        jPanel6.add(condicionRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 80, -1));

        precioRango1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        precioRango1.setValue(0);
        precioRango1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precioRango1FocusGained(evt);
            }
        });
        precioRango1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioRango1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioRango1KeyReleased(evt);
            }
        });
        jPanel6.add(precioRango1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 100, 30));

        etiquetaCondicion.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        etiquetaCondicion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaCondicion.setText("< - >");
        etiquetaCondicion.setAlignmentX(0.1F);
        jPanel6.add(etiquetaCondicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 146, 60, -1));

        precioRango2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        precioRango2.setOpaque(false);
        precioRango2.setValue(0);
        precioRango2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precioRango2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                precioRango2KeyReleased(evt);
            }
        });
        jPanel6.add(precioRango2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 100, 30));

        eliminarRango.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eliminarRango.setText("Eliminar");
        eliminarRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarRangoActionPerformed(evt);
            }
        });
        jPanel6.add(eliminarRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 137, 170, 35));

        tablaRango = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaRango.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaRango.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Descripción", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaRango.setAutoscrolls(false);
        tablaRango.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tablaRango.setGridColor(new java.awt.Color(255, 255, 255));
        tablaRango.setOpaque(false);
        tablaRango.setSelectionBackground(new java.awt.Color(0, 158, 255));
        jScrollPane4.setViewportView(tablaRango);
        tablaRango.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaRango.getColumnModel().getColumnCount() > 0) {
            tablaRango.getColumnModel().getColumn(0).setResizable(false);
            tablaRango.getColumnModel().getColumn(0).setPreferredWidth(5);
            tablaRango.getColumnModel().getColumn(1).setResizable(false);
            tablaRango.getColumnModel().getColumn(1).setPreferredWidth(370);
            tablaRango.getColumnModel().getColumn(2).setResizable(false);
            tablaRango.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 480, 200));

        identificadorRango.setBackground(new java.awt.Color(255, 255, 255));
        identificadorRango.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        identificadorRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        identificadorRango.setText("SUCURSAL ACTUAL");
        jPanel6.add(identificadorRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 530, 20));

        javax.swing.GroupLayout frameRangoLayout = new javax.swing.GroupLayout(frameRango.getContentPane());
        frameRango.getContentPane().setLayout(frameRangoLayout);
        frameRangoLayout.setHorizontalGroup(
            frameRangoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRangoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        frameRangoLayout.setVerticalGroup(
            frameRangoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameRangoLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        frameReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        frameReporte.setUndecorated(true);
        frameReporte.setResizable(false);
        frameReporte.setSize(new java.awt.Dimension(560, 600));
        frameReporte.setLocationRelativeTo(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setMinimumSize(new java.awt.Dimension(560, 600));
        jPanel5.setPreferredSize(new java.awt.Dimension(560, 600));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backReporte.setText("Back");
        backReporte.setToolTipText("");
        backReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backReporteActionPerformed(evt);
            }
        });
        jPanel5.add(backReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 30));

        nombreReporte.setBackground(new java.awt.Color(255, 255, 255));
        nombreReporte.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        nombreReporte.setForeground(new java.awt.Color(84, 173, 204));
        nombreReporte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreReporte.setText("NOMBRE SUCURSAL");
        jPanel5.add(nombreReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 40, 470, 30));

        tablaReporte = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaReporte.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        tablaReporte.setAutoscrolls(false);
        tablaReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tablaReporte.setGridColor(new java.awt.Color(255, 255, 255));
        //tablaReporte.setEnabled(false);
        //tablaReporte.setShowVerticalLines(false);
        //tablaReporte.setSelectionBackground(Color.HSBtoRGB(84, 173, 204));
        tablaReporte.setOpaque(false);
        tablaReporte.setSelectionBackground(new java.awt.Color(0, 158, 255));
        jScrollPane2.setViewportView(tablaReporte);
        if (tablaReporte.getColumnModel().getColumnCount() > 0) {
            tablaReporte.getColumnModel().getColumn(0).setHeaderValue("Title 1");
        }

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 460, 470));

        jScrollPane3.setBorder(null);

        direccionReporte.setEditable(false);
        direccionReporte.setColumns(1);
        direccionReporte.setLineWrap(true);
        direccionReporte.setRows(2);
        direccionReporte.setTabSize(3);
        direccionReporte.setText("DIRECCION SUCURSAL");
        direccionReporte.setWrapStyleWord(true);
        direccionReporte.setAutoscrolls(false);
        direccionReporte.setBorder(null);
        direccionReporte.setMargin(new java.awt.Insets(50, 50, 50, 50));
        jScrollPane3.setViewportView(direccionReporte);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 400, 50));

        jLabel29.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("REPORTE");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, -1));

        exportarReporte.setText("Guardar");
        exportarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarReporteActionPerformed(evt);
            }
        });
        jPanel5.add(exportarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        javax.swing.GroupLayout frameReporteLayout = new javax.swing.GroupLayout(frameReporte.getContentPane());
        frameReporte.getContentPane().setLayout(frameReporteLayout);
        frameReporteLayout.setHorizontalGroup(
            frameReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        frameReporteLayout.setVerticalGroup(
            frameReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        directorioElegir.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        javax.swing.GroupLayout directorioWindowsLayout = new javax.swing.GroupLayout(directorioWindows);
        directorioWindows.setLayout(directorioWindowsLayout);
        directorioWindowsLayout.setHorizontalGroup(
            directorioWindowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(directorioWindowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(directorioWindowsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(directorioElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        directorioWindowsLayout.setVerticalGroup(
            directorioWindowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(directorioWindowsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(directorioWindowsLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(directorioElegir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        dialogCerrarFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dialogCerrarFrame.setUndecorated(true);
        dialogCerrarFrame.setResizable(false);
        dialogCerrarFrame.setSize(new java.awt.Dimension(230, 140));
        dialogCerrarFrame.setLocationRelativeTo(null);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setMinimumSize(new java.awt.Dimension(210, 140));
        jPanel7.setPreferredSize(new java.awt.Dimension(230, 140));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaDialogCerrar.setFont(new java.awt.Font("Century", 2, 24)); // NOI18N
        etiquetaDialogCerrar.setForeground(new java.awt.Color(84, 173, 204));
        etiquetaDialogCerrar.setText("Seguro salir ?");
        jPanel7.add(etiquetaDialogCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 50));

        checker.setBackground(new java.awt.Color(255, 255, 255));
        checker.setForeground(new java.awt.Color(255, 255, 255));
        checker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/CheckerCerrarIcon.png"))); // NOI18N
        checker.setBorder(null);
        checker.setBorderPainted(false);
        checker.setContentAreaFilled(false);
        checker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checker.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        checker.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/CheckerCerrarRolloverIcon.png"))); // NOI18N
        checker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkerActionPerformed(evt);
            }
        });
        jPanel7.add(checker, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 60));

        unChecker.setBackground(new java.awt.Color(255, 255, 255));
        unChecker.setForeground(new java.awt.Color(255, 255, 255));
        unChecker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/UnCheckerCerrarIcon.png"))); // NOI18N
        unChecker.setBorder(null);
        unChecker.setBorderPainted(false);
        unChecker.setContentAreaFilled(false);
        unChecker.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unChecker.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        unChecker.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/UnCheckerCerrarRolloverIcon.png"))); // NOI18N
        unChecker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unCheckerActionPerformed(evt);
            }
        });
        jPanel7.add(unChecker, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, 60));

        javax.swing.GroupLayout dialogCerrarFrameLayout = new javax.swing.GroupLayout(dialogCerrarFrame.getContentPane());
        dialogCerrarFrame.getContentPane().setLayout(dialogCerrarFrameLayout);
        dialogCerrarFrameLayout.setHorizontalGroup(
            dialogCerrarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogCerrarFrameLayout.setVerticalGroup(
            dialogCerrarFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        PanelTodo.setBackground(new java.awt.Color(255, 255, 255));
        PanelTodo.setMinimumSize(new java.awt.Dimension(520, 320));
        PanelTodo.setPreferredSize(new java.awt.Dimension(600, 450));
        PanelTodo.setLayout(new java.awt.BorderLayout());

        Barra.setBackground(new java.awt.Color(0, 158, 255));
        Barra.setPreferredSize(new java.awt.Dimension(600, 32));
        Barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tituloFrameMouseDragged(evt);
            }
        });
        tituloFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tituloFrameMousePressed(evt);
            }
        });
        Barra.add(tituloFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 520, 30));

        cerrarFrame.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        cerrarFrame.setForeground(new java.awt.Color(255, 255, 255));
        cerrarFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Cerrar_Icon.png"))); // NOI18N
        cerrarFrame.setBorder(null);
        cerrarFrame.setBorderPainted(false);
        cerrarFrame.setContentAreaFilled(false);
        cerrarFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrarFrame.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Cerrar_pressedIcon2.png"))); // NOI18N
        cerrarFrame.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Cerrar_rolloverIcon.png"))); // NOI18N
        cerrarFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarFrameActionPerformed(evt);
            }
        });
        Barra.add(cerrarFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 30, 30));

        minimizarFrame.setFont(new java.awt.Font("Segoe UI Semilight", 1, 24)); // NOI18N
        minimizarFrame.setForeground(new java.awt.Color(255, 255, 255));
        minimizarFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Minimizar_Icon.png"))); // NOI18N
        minimizarFrame.setBorder(null);
        minimizarFrame.setBorderPainted(false);
        minimizarFrame.setContentAreaFilled(false);
        minimizarFrame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        minimizarFrame.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Minimizar_pressedIcon.png"))); // NOI18N
        minimizarFrame.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Minimizar_rolloverIcon.png"))); // NOI18N
        minimizarFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarFrameActionPerformed(evt);
            }
        });
        Barra.add(minimizarFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 30, 30));

        PanelTodo.add(Barra, java.awt.BorderLayout.PAGE_START);

        Zona.setBackground(new java.awt.Color(255, 255, 255));
        Zona.setPreferredSize(new java.awt.Dimension(600, 418));

        Card.setBackground(new java.awt.Color(255, 255, 255));
        Card.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setToolTipText("");
        login.setPreferredSize(new java.awt.Dimension(600, 418));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaLogin1.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaLogin1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        etiquetaLogin1.setForeground(new java.awt.Color(51, 51, 51));
        etiquetaLogin1.setText("Login");
        login.add(etiquetaLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        etiquetaLogin2.setFont(new java.awt.Font("Century", 2, 14)); // NOI18N
        etiquetaLogin2.setForeground(new java.awt.Color(0, 155, 219));
        etiquetaLogin2.setText("Registra el nombre de la empresa");
        login.add(etiquetaLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        nombreLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreLogin.setText("Nombre Empresa");
        nombreLogin.setToolTipText("");
        nombreLogin.setBorder(null);
        nombreLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nombreLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreLoginFocusLost(evt);
            }
        });
        nombreLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreLoginKeyTyped(evt);
            }
        });
        login.add(nombreLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 320, 30));

        linea.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        linea.setForeground(new java.awt.Color(0, 155, 219));
        linea.setText("__________________");
        login.add(linea, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 330, 30));

        ingresarLogin.setBackground(new java.awt.Color(255, 255, 255));
        ingresarLogin.setForeground(new java.awt.Color(255, 255, 255));
        ingresarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Agregar_Icon.png"))); // NOI18N
        ingresarLogin.setBorder(null);
        ingresarLogin.setBorderPainted(false);
        ingresarLogin.setContentAreaFilled(false);
        ingresarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresarLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ingresarLogin.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Agregar_pressedIcon.png"))); // NOI18N
        ingresarLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/Agregar_rolloverIcon.png"))); // NOI18N
        ingresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarLoginActionPerformed(evt);
            }
        });
        login.add(ingresarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 200, 60));

        noUsed.setEditable(false);
        noUsed.setBackground(new java.awt.Color(255, 255, 255));
        noUsed.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        noUsed.setBorder(null);
        login.add(noUsed, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 10, 10));

        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        jLabel4.setText("Desarrollo: Angel Leonardo");
        jLabel4.setEnabled(false);
        login.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 385, -1, -1));

        jLabel8.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 10)); // NOI18N
        jLabel8.setText("1151646 - UFPS");
        jLabel8.setEnabled(false);
        login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        Card.add(login, "card4");

        loader.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/ajax-loading-gif-transparent-background-8.gif"))); // NOI18N

        javax.swing.GroupLayout loaderLayout = new javax.swing.GroupLayout(loader);
        loader.setLayout(loaderLayout);
        loaderLayout.setHorizontalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(219, 219, 219))
        );
        loaderLayout.setVerticalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125))
        );

        Card.add(loader, "card3");

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setPreferredSize(new java.awt.Dimension(600, 418));
        principal.setLayout(new java.awt.BorderLayout());

        pantalla.setBackground(new java.awt.Color(255, 255, 255));
        pantalla.setPreferredSize(new java.awt.Dimension(600, 70));

        nombreGrande.setEditable(false);
        nombreGrande.setBackground(new java.awt.Color(255, 255, 255));
        nombreGrande.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        nombreGrande.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreGrande.setText("BIENVENIDO");
        nombreGrande.setBorder(null);

        javax.swing.GroupLayout pantallaLayout = new javax.swing.GroupLayout(pantalla);
        pantalla.setLayout(pantallaLayout);
        pantallaLayout.setHorizontalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(nombreGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        pantallaLayout.setVerticalGroup(
            pantallaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pantallaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombreGrande, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        principal.add(pantalla, java.awt.BorderLayout.NORTH);

        botonesLeft.setBackground(new java.awt.Color(255, 255, 255));
        botonesLeft.setPreferredSize(new java.awt.Dimension(250, 308));

        agregarSucursal.setText("Agregar Sucursal");
        agregarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarSucursalActionPerformed(evt);
            }
        });

        eliminarSucursal.setText("Eliminar Sucursal");
        eliminarSucursal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSucursalActionPerformed(evt);
            }
        });

        lanzarProducto.setText("Lanzar Línea de Producto");
        lanzarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lanzarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarProductoActionPerformed(evt);
            }
        });

        descontinuarProducto.setText("Descontinuar Producto");
        descontinuarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        descontinuarProducto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        descontinuarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontinuarProductoActionPerformed(evt);
            }
        });

        antiguoProducto.setText("Producto más Antiguo");
        antiguoProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        antiguoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguoProductoActionPerformed(evt);
            }
        });

        eliminarXRangodePrecio.setText("Eliminar x Rango de Precio");
        eliminarXRangodePrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eliminarXRangodePrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarXRangodePrecioActionPerformed(evt);
            }
        });

        generarReporte.setText("Generar Reporte");
        generarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLeftLayout = new javax.swing.GroupLayout(botonesLeft);
        botonesLeft.setLayout(botonesLeftLayout);
        botonesLeftLayout.setHorizontalGroup(
            botonesLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLeftLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(botonesLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregarSucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarSucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lanzarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descontinuarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(antiguoProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarXRangodePrecio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generarReporte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        botonesLeftLayout.setVerticalGroup(
            botonesLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarSucursal)
                .addGap(18, 18, 18)
                .addComponent(eliminarSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lanzarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(descontinuarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(antiguoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminarXRangodePrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(generarReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        principal.add(botonesLeft, java.awt.BorderLayout.WEST);

        mostrarEste.setBackground(new java.awt.Color(255, 255, 255));
        mostrarEste.setPreferredSize(new java.awt.Dimension(350, 308));

        areaDireccion.setEditable(false);
        areaDireccion.setColumns(1);
        areaDireccion.setLineWrap(true);
        areaDireccion.setRows(2);
        areaDireccion.setTabSize(3);
        areaDireccion.setWrapStyleWord(true);
        areaDireccion.setAutoscrolls(false);
        areaDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 158, 255), 5, true));
        areaDireccion.setMargin(new java.awt.Insets(50, 50, 50, 50));
        jScrollPane1.setViewportView(areaDireccion);

        listaSucursales.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<SELECCIONAR SUCURSAL>" }));
        listaSucursales.setOpaque(false);
        listaSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaSucursalesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Sucursales");

        javax.swing.GroupLayout mostrarEsteLayout = new javax.swing.GroupLayout(mostrarEste);
        mostrarEste.setLayout(mostrarEsteLayout);
        mostrarEsteLayout.setHorizontalGroup(
            mostrarEsteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrarEsteLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(mostrarEsteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaSucursales, 0, 300, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );
        mostrarEsteLayout.setVerticalGroup(
            mostrarEsteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrarEsteLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        principal.add(mostrarEste, java.awt.BorderLayout.CENTER);

        Card.add(principal, "card2");

        javax.swing.GroupLayout ZonaLayout = new javax.swing.GroupLayout(Zona);
        Zona.setLayout(ZonaLayout);
        ZonaLayout.setHorizontalGroup(
            ZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ZonaLayout.setVerticalGroup(
            ZonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Card, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelTodo.add(Zona, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Método para mover la ventana con el mouse.
     */
    int x,y;
    private void tituloFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloFrameMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_tituloFrameMouseDragged
    
    private void tituloFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tituloFrameMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_tituloFrameMousePressed
    
    /**
     * Método abrir dialog y confirmar cerrar aplicación.
     */
    private void cerrarFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarFrameActionPerformed
        this.setOpacity(0.90f);
        this.setEnabled(false);
        dialogCerrarFrame.setVisible(true);        
    }//GEN-LAST:event_cerrarFrameActionPerformed
    
    /**
     * Método para salir de la aplicación.
     */
    private void checkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkerActionPerformed
        Fade.JFrameFadeOut(0.90f, 0f, 0.1f, 100, this,Fade.EXIT);
        Fade.JFrameFadeOut(1f, 0f, 0.1f, 1, dialogCerrarFrame,Fade.DO_NOTHING);
    }//GEN-LAST:event_checkerActionPerformed
    
    /**
     * Método para cancelar salir de la aplicación
     */
    private void unCheckerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unCheckerActionPerformed
        this.setOpacity(1f);
        this.setEnabled(true);
        dialogCerrarFrame.setVisible(false);
    }//GEN-LAST:event_unCheckerActionPerformed
    
    /**
     * Método para minimizar la ventana.
     */
    private void minimizarFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarFrameActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_minimizarFrameActionPerformed
    
    /**
     * Método para dejar vacío el campo nombre empresa, cuando se entre en este.
     */
    private void nombreLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreLoginFocusGained
        nombreLogin.setText("");
    }//GEN-LAST:event_nombreLoginFocusGained
    
    /**
     * Método para actualizar el texto por defecto del campo nombre empresa, al salir en este
     * sólo si no se ha ingresado un dato.
     */
    private void nombreLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreLoginFocusLost
        if(nombreLogin.getText().equals(""))
            nombreLogin.setText("Nombre Empresa");
    }//GEN-LAST:event_nombreLoginFocusLost
    
    /**
     * Método para forzar entrada de solo mayusculas en el campo nombre empresa.
     * Limita a 39 caracteres ingresados.
     */
    private void nombreLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreLoginKeyTyped
        if (Character.isLowerCase(evt.getKeyChar()))
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));

        if(nombreLogin.getText().length()>=39)
            evt.consume();
    }//GEN-LAST:event_nombreLoginKeyTyped
    
    /**
     * Método para ingresar a la aplicación.
     * Valida que se le haya dado entrada a un nombre de empresa válido.
     * Hace visible el panel loader. Se le asigna una duracion con clase Timer.
     * Hace visible el panel principal. y le asigna al titulo del frame el nombre de la empresa.
     */
    private void ingresarLoginActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(nombreLogin.getText().equals("")||nombreLogin.getText().equals("Nombre Empresa"))
            dialogIngresar.setVisible(true);
        else{        
            loader.setVisible(true);
            login.setVisible(false);
            Timer delay = new Timer(1000, new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(java.awt.event.ActionEvent e) {
                    principal.setVisible(true);
                    tituloFrame.setText(TITULO_FRAME+" - "+nombreLogin.getText());
                    loader.setVisible(false);
                }
            });       
            delay.setRepeats(false);
            delay.start();
        }
    }                                                 
    
    /**
     * Método para desaparecer el dialog si no se ha ingresado un nombre de empresa válido.
     */
    private void checkerIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkerIngresarActionPerformed
        dialogIngresar.dispose();
    }//GEN-LAST:event_checkerIngresarActionPerformed
    
    /**
     * Método para validaciones de elementos seleccionados en el combobox <seleccionar sucursales>.
     * Actualiza el campo superior con el nombre de la sucursal seleccionada. "Bienvenido" si no se ha seleccionado ninguna sucursla.
     * Actualiza el campo inferior con la direccion de la sucursal seleccionada. Vacío si no se ha seleccionado ninguna sucursal.
     * Valida deshabilitar botones eliminar sucursal, lanzar producto, descontinuar producto, producto antiguo, eliminar x rango y generar reporte,
     * si no se ha seleccionado ninguna sucursal.
     * Valida deshabilitar botoenes descontinuar producto, producto antiguo, eliminar x rango y generar reporte, si la sucursal seleccionada
     * no tiene ningun producto registrado.
     */
    private void listaSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaSucursalesActionPerformed
        if(!listaSucursales.getSelectedItem().equals(ITEM_DEFECTO_SUCURSALES)){
            nombreGrande.setText((String) listaSucursales.getSelectedItem());
            areaDireccion.setText(sucursales[listaSucursales.getSelectedIndex()-1].getDireccion());}
        else{
            nombreGrande.setText(TITULO_PRINCIPAL);
            areaDireccion.setText("");}
        
        if(nombreGrande.getText().equals(TITULO_PRINCIPAL)){
            eliminarSucursal.setEnabled(false);
            lanzarProducto.setEnabled(false);
            descontinuarProducto.setEnabled(false);
            antiguoProducto.setEnabled(false);
            eliminarXRangodePrecio.setEnabled(false);
            generarReporte.setEnabled(false);}
        else{
            eliminarSucursal.setEnabled(true);
            lanzarProducto.setEnabled(true);
            if(sucursales[indexSucActual()].productos[0]!=null){
                descontinuarProducto.setEnabled(true);
                antiguoProducto.setEnabled(true);
                eliminarXRangodePrecio.setEnabled(true);
                generarReporte.setEnabled(true);}
            else{
                descontinuarProducto.setEnabled(false);
                antiguoProducto.setEnabled(false);
                eliminarXRangodePrecio.setEnabled(false);
                generarReporte.setEnabled(false);}
        }
            
    }//GEN-LAST:event_listaSucursalesActionPerformed
    
        
    /**
     * Método para hacer visible ventada de agregacion de sucursales. Pone en opacidad de (0.90) la ventada principal y la deshabilita.
     */
    private void agregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarSucursalActionPerformed
        this.setOpacity(0.90f);
        this.setEnabled(false);
        frameAgregarSucursal.setVisible(true);
    }//GEN-LAST:event_agregarSucursalActionPerformed
    
    /**
     * Método para desaparecer la ventada de agregacion de sucursales. Habilita la ventana principal y opacidad (1).
     */
    private void backAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAgregarSucursalActionPerformed
        frameAgregarSucursal.setVisible(false);
        this.setOpacity(1f);
        this.setEnabled(true);
        this.setVisible(true);
    }//GEN-LAST:event_backAgregarSucursalActionPerformed
    
    /**
     * Método para forzar entrada de solo mayusculas en el campo nombre sucursal.
     * Limita a 40 caracteres ingresados.
     */
    private void nombreSucursalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreSucursalKeyTyped
        if (Character.isLowerCase(evt.getKeyChar()))
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));

        if(nombreSucursal.getText().length()>=40)
            evt.consume();
    }//GEN-LAST:event_nombreSucursalKeyTyped
    
    /**
     * Método para dejar vacío el campo nombre de sucursal, cuando se entre en este.
     */
    private void nombreSucursalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreSucursalFocusGained
        if(nombreSucursal.getText().equals("Nombre Sucursal"))
            nombreSucursal.setText("");
    }//GEN-LAST:event_nombreSucursalFocusGained
    
    /**
     * Método para actualizar el texto por defecto del campo nombre sucursal, al salir de este,
     * sólo si no se ha ingresado un dato.
     */
    private void nombreSucursalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreSucursalFocusLost
        if(nombreSucursal.getText().equals(""))
            nombreSucursal.setText("Nombre Sucursal");
    }//GEN-LAST:event_nombreSucursalFocusLost
    
    /**
     * Método para dejar vacío el campo dirección de sucursal, cuando se entre en este.
     */
    private void direccionSucursalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionSucursalFocusGained
        if(direccionSucursal.getText().equals("Dirección Sucursal"))
            direccionSucursal.setText("");            
    }//GEN-LAST:event_direccionSucursalFocusGained
    
    /**
     * Método para actualizar el texto por defecto del campo dirección sucursal, al salir de este,
     * sólo si no se ha ingresado un dato.
     */
    private void direccionSucursalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionSucursalFocusLost
        if(direccionSucursal.getText().equals(""))
            direccionSucursal.setText("Dirección Sucursal");
    }//GEN-LAST:event_direccionSucursalFocusLost
    
    /**
    * Ciclo que recorre el arreglo de sucursales dentro de la GUI.
    * Valida que no exista la sucursale que se intenta registrar.
    * Valida que no registre con datos invalidos.
    * Muestra error si la cantidad de sucursales supera el tamaño permitido.
    * Agrega sucursal nueva al arrleglo sucursales.
    */
    private void aceptarAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarAgregarSucursalActionPerformed
        Sucursal sucursal = new Sucursal(nombreSucursal.getText(),direccionSucursal.getText());
        
        for (int i = 0; i < sucursales.length; i++) {
            if(sucursales[i]!=null && sucursal.getNombre().equals(sucursales[i].getNombre())){
                JOptionPane.showMessageDialog(null,"Esta intentando agregar una sucursal ya existente","AVISO",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            
            if(sucursales[i]==null){
                if(nombreSucursal.getText().equals("") || direccionSucursal.getText().equals("")||
                nombreSucursal.getText().equals("Nombre Sucursal") || direccionSucursal.getText().equals("Dirección Sucursal")){
                    JOptionPane.showMessageDialog(null,"Faltan datos. Volver a intentar!","AVISO",JOptionPane.WARNING_MESSAGE);
                    break;}
                else{
                    int resp=JOptionPane.showConfirmDialog(null,"Confirmar Registro");
                    if (JOptionPane.OK_OPTION == resp){
                        sucursales[i]=sucursal;
                        JOptionPane.showMessageDialog(null,"Se ha registrado "+sucursales[i].getNombre()+" correctamente.","AVISO",JOptionPane.INFORMATION_MESSAGE);
                        nombreSucursal.setText("Nombre Sucursal");
                        direccionSucursal.setText("Dirección Sucursal");
                        break;
                    }
                    else
                        break;
                }
            }    
                 
            if(sucursales[sucursales.length-1]!=null){
                JOptionPane.showMessageDialog(null,"Contactar con el administrador. ERROR AL AGREGAR NUEVA SUCURSAL.","AVISO",JOptionPane.ERROR_MESSAGE);
                break;}
        }
        actualizarSucursales();
    }//GEN-LAST:event_aceptarAgregarSucursalActionPerformed
    
    /**
     * Método para actualizar el texto por defecto del campo nombre sucursal y dirección sucursal al presionar el boton cancelar.
     */
    private void cancelarAgregarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAgregarSucursalActionPerformed
        nombreSucursal.setText("Nombre Sucursal");
        direccionSucursal.setText("Dirección Sucursal");        
    }//GEN-LAST:event_cancelarAgregarSucursalActionPerformed
    
      
    /**
     * Método para eliminar sucursal.
     * Lanza un dialog de confirmación.
     * Busca en el arreglo la sucursal con parametro nombre que sea igual al campo nombre superior en la ventana principal.
     * Invoca al metodo actualizar sucursales.
     */
    private void eliminarSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSucursalActionPerformed
        
        int resp=JOptionPane.showConfirmDialog(null,"Confirma eliminar "+nombreGrande.getText()+" ?");
        if (JOptionPane.OK_OPTION == resp){

            Sucursal [] sucursalTmp;
            for(int i=0; i<sucursales.length; i++)
            {
                if(sucursales[i].getNombre().equals(nombreGrande.getText())){
                    sucursales[i]=null;
                    sucursalTmp = new Sucursal[sucursales.length - 1];
                    int k=0;
                    for(int j=0; j<sucursales.length; j++)
                    {
                        if(sucursales[j]!=null)
                        {
                            sucursalTmp[k]=sucursales[j];
                            k++;
                        }
                    }
                    this.sucursales=sucursalTmp;
                    break;
                }
            }
            actualizarSucursales();
        }
        
    }//GEN-LAST:event_eliminarSucursalActionPerformed
    
    
    /**
     * Método para hacer visible ventana de lanzar linea de productos.
     * Actualiza una etiqueta con el nombre de la sucursal en la parte inferior de la ventana.
     */
    private void lanzarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarProductoActionPerformed
        frameLanzar.setVisible(true);
        identificadorLanzar.setText("SUCURSAL "+nombreGrande.getText());
    }//GEN-LAST:event_lanzarProductoActionPerformed
    
    /**
     * Método para regresar a la ventana principal.
     * Valida que no hayan datos ingresados en los campos nombre sucursal y dirección sucursal.
     */
    private void backLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLanzarActionPerformed
        if(hayDatosLanzar()){
           int resp=JOptionPane.showConfirmDialog(null,"Confirmar Registro");
            if (JOptionPane.OK_OPTION == resp){
                frameLanzar.dispose();
                cancelarLanzarActionPerformed(evt);
            }
        }
        else{
            frameLanzar.dispose();
            cancelarLanzarActionPerformed(evt);
        }
    }//GEN-LAST:event_backLanzarActionPerformed
    
    /**
     * Método para dejar vacío el campo nombre producto, cuando se entre en este.
     */   
    private void nombreLanzarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreLanzarFocusGained
        if(nombreLanzar.getText().equals("Nombre Línea"))
            nombreLanzar.setText("");
    }//GEN-LAST:event_nombreLanzarFocusGained
    
    /**
     * Método para actualizar el texto por defecto del campo nombre producto, al salir de este,
     * sólo si no se ha ingresado un dato.
     */
    private void nombreLanzarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreLanzarFocusLost
        if(nombreLanzar.getText().equals(""))
            nombreLanzar.setText("Nombre Línea");
    }//GEN-LAST:event_nombreLanzarFocusLost

    /**
     * Método para forzar entrada de sólo mayúsculas en el campo nombre producto.
     * Limita a 52 caracteres ingresados.
     */
    private void nombreLanzarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreLanzarKeyTyped
        //Forza el string ingresado a MAYUSCULAS.
        if (Character.isLowerCase(evt.getKeyChar()))
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));

        //Limita la cantidad de caracteres en el TextField.
        if(nombreLanzar.getText().length()>=52)
            evt.consume();
    }//GEN-LAST:event_nombreLanzarKeyTyped
    
    /**
     * Método para dejar vacío el campo codigo producto, cuando se entre en este.
     */
    private void codigoLanzarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoLanzarFocusGained
        if(codigoLanzar.getText().equals("Código"))
            codigoLanzar.setText("");
    }//GEN-LAST:event_codigoLanzarFocusGained

    /**
     * Método para actualizar el texto por defecto del campo codigo producto, al salir de este,
     * sólo si no se ha ingresado un dato.
     */
    private void codigoLanzarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoLanzarFocusLost
        if(codigoLanzar.getText().equals(""))
            codigoLanzar.setText("Código");
    }//GEN-LAST:event_codigoLanzarFocusLost

    /**
     * Método para dejar vacío el campo descripción producto, cuando se entre en este.
     */
    private void descripcionLanzarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionLanzarFocusGained
        if(descripcionLanzar.getText().equals("Descripción"))
            descripcionLanzar.setText("");
    }//GEN-LAST:event_descripcionLanzarFocusGained

    /**
     * Método para actualizar el texto por defecto del campo descripción producto, al salir de este,
     * sólo si no se ha ingresado un dato.
     */
    private void descripcionLanzarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descripcionLanzarFocusLost
        if(descripcionLanzar.getText().equals(""))
            descripcionLanzar.setText("Descripción");
    }//GEN-LAST:event_descripcionLanzarFocusLost

    /**
     * Método para Limitar a 52 caracteres ingresados en el campo codigo producto.
     */
    private void codigoLanzarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoLanzarKeyTyped
        //Limita la cantidad de caracteres en el TextField.
        if(codigoLanzar.getText().length()>=30)
            evt.consume();
    }//GEN-LAST:event_codigoLanzarKeyTyped

    /**
     * Método para forzar entrada de solo mayúsculas en el campo descripción producto.
     * Limita a 52 caracteres ingresados.
     */
    private void descripcionLanzarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionLanzarKeyTyped
        if (Character.isLowerCase(evt.getKeyChar()))
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar()));
        
        if(descripcionLanzar.getText().length()>=52)
            evt.consume();
    }//GEN-LAST:event_descripcionLanzarKeyTyped

    /**
     * Método para Limitar a 14 caracteres ingresados en el campo precio producto.
     */
    private void precioLanzarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioLanzarKeyTyped
        if(precioLanzar.getText().length()>=14)
            evt.consume();
    }//GEN-LAST:event_precioLanzarKeyTyped
    
   
    /**
    *Metodo para agregar productos al arreglo de la sucursal actual.
    *Valida que se ingresen todos los datos.
    *Valida si existe el producto con codigo ya existente.
    */
    private void aceptarLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarLanzarActionPerformed
        Producto producto = new Producto(nombreLanzar.getText(),codigoLanzar.getText(),descripcionLanzar.getText(),(int) precioLanzar.getValue(),fechaLanzar.getDate());
         
        if(faltanDatosLanzar())
            JOptionPane.showMessageDialog(null,"Faltan datos. Volver a intentar!","AVISO",JOptionPane.WARNING_MESSAGE);            
        else{
            if(sucursales[indexSucActual()].existeProducto(producto))
                JOptionPane.showMessageDialog(null,"Está intentando agregar un producto de código ya existente ","AVISO",JOptionPane.INFORMATION_MESSAGE);
            else{
                int resp=JOptionPane.showConfirmDialog(null,"Confirmar Registro");
                if (JOptionPane.OK_OPTION == resp){
                    sucursales[indexSucActual()].agregarProductos(producto);
                    cancelarLanzarActionPerformed(evt);
                }
                listaSucursalesActionPerformed(evt);
            }                
        }
    }//GEN-LAST:event_aceptarLanzarActionPerformed
    
    /**
     * Método para actualizar los campos nombre producto, codigo producto, descripcion producto, precio producto y fecha producto
     * con su valor por defecto.
     */
    private void cancelarLanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarLanzarActionPerformed
        nombreLanzar.setText("Nombre Línea");
        codigoLanzar.setText("Código");
        descripcionLanzar.setText("Descripción");
        precioLanzar.setValue(0);
        fechaLanzar.setDate(new Date());        
    }//GEN-LAST:event_cancelarLanzarActionPerformed
    
    
    /**
     * Método para hacer visible ventana de descontinuar productos.
     * Actualiza la ventana principal como deshabilitada y opacidad (0.90).
     * Actualiza una etiqueta con el nombre de la sucursal en la parte inferior de la ventana.
     * Invoca al metodo actualizaProductos.
     */
    private void descontinuarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontinuarProductoActionPerformed
        this.setOpacity(0.90f);
        this.setEnabled(false);
        frameDescontinuar.setVisible(true);
        identificadorDescontinuar.setText("SUCURSAL "+nombreGrande.getText());
        actualizarProductos();        
    }//GEN-LAST:event_descontinuarProductoActionPerformed
    
    private void backDescontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backDescontinuarActionPerformed
        this.setEnabled(true);
        this.setVisible(true);
        this.setOpacity(1f);
        frameDescontinuar.dispose();
        listaSucursalesActionPerformed(evt);
    }//GEN-LAST:event_backDescontinuarActionPerformed

    private void listaDescontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDescontinuarActionPerformed
        //Extrae la información del producto seleccionado de la sucursal actual.
        if(listaDescontinuar.getSelectedIndex()==0)
            actualizarProductos();           
        else{
            Producto productActual = sucursales[indexSucActual()].productos[listaDescontinuar.getSelectedIndex()-1];
            Date date = productActual.getFecha();
            SimpleDateFormat formato =new SimpleDateFormat("EEEE, d/MMM/yyyy - hh:mm:ss a");
            nombreDescontinuar.setText(productActual.getNombre());
            codigoDescontinuar.setText(productActual.getCodigo());
            descripcionDescontinuar.setText(productActual.getDescripcion());
            precioDescontinuar.setValue(productActual.getPrecio());
            fechaDescontinuar.setText(formato.format(date));}    
    }//GEN-LAST:event_listaDescontinuarActionPerformed
    
    private void eliminarDescontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarDescontinuarActionPerformed
        if(listaDescontinuar.getSelectedIndex()==0)
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningún producto","AVISO",JOptionPane.WARNING_MESSAGE);
        else{
            Producto productoEliminar = sucursales[indexSucActual()].productos[listaDescontinuar.getSelectedIndex()-1];
            int resp=JOptionPane.showConfirmDialog(null,"Confirmar eliminar "+ productoEliminar.getDescripcion());
            if (JOptionPane.OK_OPTION == resp)
                sucursales[indexSucActual()].eliminarProducto(productoEliminar);
            actualizarProductos();
        }        
    }//GEN-LAST:event_eliminarDescontinuarActionPerformed
    
    
    /**
     * Método para hacer visible ventana de producto Antiguo.
     * Actualiza la ventana principal como deshabilitada y opacidad (0.90).
     * Busca el producto con la fecha mas antigua invocando al metodo indexProductoAntiguo de la clase Sucursal en MUNDO.
     * Actualiza los campos nombre, codigo, descripcion, precio y fecha con los datos del producto anterior encontrado.
     * Actualiza una etiqueta con el nombre de la sucursal en la parte inferior de la ventana.
     */
    private void antiguoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguoProductoActionPerformed
        this.setOpacity(0.90f);
        this.setEnabled(false);
        frameAntiguo.setVisible(true);            
        Producto productoAntiguo= sucursales[indexSucActual()].productos[sucursales[indexSucActual()].indexProductoAntiguo()];

        Date date = productoAntiguo.getFecha();
        SimpleDateFormat formato =new SimpleDateFormat("EEEE, d/MMM/yyyy - hh:mm:ss a");
        nombreAntiguo.setText(productoAntiguo.getNombre());
        codigoAntiguo.setText(productoAntiguo.getCodigo());
        descripcionAntiguo.setText(productoAntiguo.getDescripcion());
        precioAntiguo.setValue(productoAntiguo.getPrecio());
        fechaAntiguo.setText(formato.format(date));
        identificadorAntiguo.setText("SUCURSAL "+nombreGrande.getText());
    }//GEN-LAST:event_antiguoProductoActionPerformed
    
    /**
     * Método para desaparecer la ventada de producto Antiguo.
     * Actualiza la ventana principal como habilitada y opacidad (1).
     */
    private void backAntiguoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backAntiguoActionPerformed
        this.setEnabled(true);
        this.setVisible(true); 
        this.setOpacity(1f);
        frameAntiguo.dispose();
    }//GEN-LAST:event_backAntiguoActionPerformed
    
    
    /**
     * Método para hacer visible ventana de eliminar x Rango.
     * Actualiza la ventana principal como deshabilitada.
     * Actualiza una etiqueta con el nombre de la sucursal en la parte inferior de la ventana.
     */
    private void eliminarXRangodePrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarXRangodePrecioActionPerformed
        frameRango.setVisible(true);        
        condicionRango.setSelectedIndex(0);
        identificadorRango.setText("SUCURSAL "+nombreGrande.getText());
        this.setEnabled(false);
    }//GEN-LAST:event_eliminarXRangodePrecioActionPerformed
    
    /**
     * Método para desaparecer la ventada de eliminar x Rango.
     * Actualiza la ventana principal como habilitada.
     * Invoca al método listaSucursalesActionPerformed, para hacer evento (click) en la lista de sucursales de la ventana principal.
     */
    private void backRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backRangoActionPerformed
        this.setEnabled(true);
        frameRango.setVisible(false); 
        listaSucursalesActionPerformed(evt);
    }//GEN-LAST:event_backRangoActionPerformed
    
    /**
     * Método para actualizar comportamiento de los campos precios y etiqueta en la ventana eliminar x Rango 
     * dependiendo de la condición de rango seleccionada. (mayor de, menor de o entre).
     */
    private void condicionRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionRangoActionPerformed
        int indexCondicion = condicionRango.getSelectedIndex();            
        
        switch(indexCondicion){
            case 0:etiquetaCondicion.setText(condicionRango.getItemAt(indexCondicion));
                   precioRango1.setEnabled(false);
                   precioRango1.setBackground(new Color(223, 223, 223));
                   break;                   
            case 1:etiquetaCondicion.setText(condicionRango.getItemAt(indexCondicion));
                   precioRango1.setEnabled(false);
                   precioRango1.setBackground(new Color(223, 223, 223));                   
                   break;
            case 2:etiquetaCondicion.setText(" Y ");
                    precioRango1.setEnabled(true);
                    precioRango1.setBackground(new Color(255, 255, 255));
            default: break;        
        }
        actualizarTablaRango();
    }//GEN-LAST:event_condicionRangoActionPerformed
    
    /**
     * Método para eliminar x Rango, los productos mostrados en la tabla.
     * Confirma eliminar.
     * Hace una busqueda con un ciclo del tamaño de las filas mostradas.
     * Elimina si encuentra el producto con el parametro descripción en el arreglo, utilizando el método eliminarProducto
     * de la clase Sucursal en MUNDO.
     * Hace un ciclo para vaciar la tabla.
     */
    private void eliminarRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarRangoActionPerformed
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tablaRango.getModel();
        
        int countRows = model.getRowCount();
        int resp=0;
        if(countRows==1)
            resp=JOptionPane.showConfirmDialog(null,"Desea Eliminar < "+countRows+" > Producto?");
        else
            resp=JOptionPane.showConfirmDialog(null,"Desea Eliminar < "+countRows+" > Productos?");
        
        if (JOptionPane.OK_OPTION == resp){

            for (int i = 0; i < countRows; i++) {
                for (Producto product : sucursales[indexSucActual()].productos) {
                    if(product.getDescripcion().equals((String) model.getValueAt(i, 1))){
                        sucursales[indexSucActual()].eliminarProducto(product);
                        break;
                    }
                }
            }
            for (int i = 0; i < countRows; i++) model.removeRow(0);            
        }         
    }//GEN-LAST:event_eliminarRangoActionPerformed

    /**
     * Método para actualizar las filas a la tabla de los productos encontrados,
     * dependiendo de la condicion seleccionada a medida que se digita el valor del precio.
     */
    private void precioRango2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioRango2KeyPressed
        actualizarTablaRango();
    }//GEN-LAST:event_precioRango2KeyPressed

    /**
     * Invoca al método precioRango2KeyPressed para actualizar la tabla.
     */
    private void precioRango2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioRango2KeyReleased
        actualizarTablaRango();
    }//GEN-LAST:event_precioRango2KeyReleased

    /**
     * Invoca al método precioRango2KeyPressed para actualizar la tabla.
     */
    private void precioRango1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioRango1KeyPressed
        actualizarTablaRango();
    }//GEN-LAST:event_precioRango1KeyPressed

    /**
     * Invoca al método precioRango2KeyPressed para actualizar la tabla.
     */
    private void precioRango1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioRango1KeyReleased
        actualizarTablaRango();
    }//GEN-LAST:event_precioRango1KeyReleased
    
    
    /**
     * Método para hacer visible ventana de generar reporte sucursal.
     * Actualiza la ventana principal como deshabilitada y opacidad (0.90).
     * Actualiza encabezado del reporte con nombre y direccion de la sucursal.
     * Actualiza una tabla con la informacion detallada de cada línea de producto.
     */
    private void generarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarReporteActionPerformed
        frameReporte.setVisible(true);
        this.setOpacity(0.90f);
        this.setEnabled(false);
        nombreReporte.setText("SUCURSAL "+nombreGrande.getText());
        direccionReporte.setText(areaDireccion.getText());
        
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
        String  titulo[]= new String[]{"LINEAS DE PRODUCTOS"};
                
        SimpleDateFormat formato =new SimpleDateFormat("EEEE, d/MMM/yyyy ");
        
        for (Producto product : sucursales[indexSucActual()].productos) {         
            model.setColumnIdentifiers(titulo);
            model.addRow(new Object[]{
                " Nombre: "+product.getNombre()});
            model.addRow(new Object[]{
                " Código: "+product.getCodigo()});
            model.addRow(new Object[]{
                " Descripción: "+product.getDescripcion()});
            model.addRow(new Object[]{
                " Precio: "+product.getPrecio()});            
            Date date = product.getFecha();
            model.addRow(new Object[]{
                " Fecha: "+formato.format(date)});            
            model.addRow(new Object[]{
                ""});
        }                
        tablaReporte.setModel(model);
    }//GEN-LAST:event_generarReporteActionPerformed
    
    /**
     * Método para desaparecer ventada de reporte de sucursal.
     * Actualiza la ventana principal como habilitada y opacidad (1).
     */
    private void backReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backReporteActionPerformed
        this.setEnabled(true);
        this.setVisible(true);
        this.setOpacity(1f);
        frameReporte.dispose();
    }//GEN-LAST:event_backReporteActionPerformed

    /**
     * Método para generar archivo .txt o .doc con la informacion del reporte generado.
     * Abre JChooser para seleccionar el destino del archivo.
     * Por defecto se guarda con el nombre "ReporteSucursal.doc".
     * Utiliza Clase BufferedWrite de Java para la escritura del archivo.
     */
    private void exportarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarReporteActionPerformed
        int seleccion = directorioElegir.showOpenDialog(directorioWindows);        
        File fichero = directorioElegir.getSelectedFile();        
        String destino;
        
        if(seleccion==directorioElegir.APPROVE_OPTION){
        
        destino = fichero.getAbsolutePath();
        try {

            BufferedWriter bfw = new BufferedWriter(new FileWriter(destino+"/ReporteSucursal.doc" ));
            bfw.write("        ******Reporte General de Líneas de Productos******"); 
            bfw.newLine(); bfw.write("");
            bfw.newLine();
            bfw.write(" Empresa: "+(String) nombreLogin.getText()); 
            bfw.newLine(); 
            bfw.write(" Sucursal: "+(String) nombreGrande.getText());
            bfw.newLine();             
            bfw.write(" Dirección: "+(String) areaDireccion.getText());
            bfw.newLine(); bfw.write("");
            bfw.newLine();
            bfw.write("                       ******Productos******");
            bfw.newLine(); bfw.write("");
            bfw.newLine();
            
            for (int i = 0 ; i < tablaReporte.getRowCount(); i++){
                for(int j = 0 ; j < tablaReporte.getColumnCount();j++){
                    bfw.write((String)(tablaReporte.getValueAt(i,j)));
                    if (j < tablaReporte.getColumnCount() -1) {
                        bfw.write(",");
                    }
                }
                bfw.newLine();
            }
            bfw.newLine();
            bfw.newLine();
            bfw.newLine();
            bfw.write("</> Desarrollado por: Angel Leonardo Vivas Andrade.");  
            
            bfw.close();
            System.out.println("El archivo fue guardado correctamente!");
        } catch (IOException e) {
            System.out.println("ERROR: Ocurrio un problema al guardar el archivo!" + e.getMessage());
        }
    }    
    }//GEN-LAST:event_exportarReporteActionPerformed

    private void precioRango1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precioRango1FocusGained
        actualizarTablaRango();
    }//GEN-LAST:event_precioRango1FocusGained

    
    /**
     * Método que retorna falso o verdadero si existen datos escritos en los campos de la ventana Lanzar producto.
     */
    public boolean hayDatosLanzar(){
        boolean hayDatos=false;
        if(!nombreLanzar.getText().equals("") && !nombreLanzar.getText().equals("Nombre Línea") ||
           !codigoLanzar.getText().equals("") && !codigoLanzar.getText().equals("Código") || 
           !precioLanzar.getValue().equals("") && !precioLanzar.getValue().equals(0) ||
           !descripcionLanzar.getText().equals("") && !descripcionLanzar.getText().equals("Descripción"))
        {hayDatos=true;}
        return hayDatos;
    }
    
    /**
     * Método que retorna falso o verdadero si faltan datos en los campos de la ventana Lanzar producto.
     */
    public boolean faltanDatosLanzar(){
        boolean faltanDatos=false;
        if(nombreLanzar.getText().equals("") || nombreLanzar.getText().equals("Nombre Línea") ||
           codigoLanzar.getText().equals("") || codigoLanzar.getText().equals("Código") || 
           precioLanzar.getValue().equals("") || precioLanzar.getValue().equals(0) ||
           descripcionLanzar.getText().equals("") || descripcionLanzar.getText().equals("Descripción"))
        {faltanDatos=true;}
        return faltanDatos;    
    }
    
    /**
     * Método que retorna el índice de la sucursal actual en el arreglo sucursales en la clase GUI de VISTA.
     */
    public int indexSucActual(){
        int index=0;
        for (int i=0; i<sucursales.length;i++) {
            if(sucursales[i].getNombre().equals(nombreGrande.getText())){
                index=i;
                break;}
        }        
        return index;
    }
    
    /**
     * Método que actualiza la lista de sucursales con las sucursales registradas en el arreglo sucursales.
     * Utiliza el parametro nombre de la sucursal como identificativo.
     */
    public void actualizarSucursales(){
        //Se crea un combomodel como temporal para asignarle los nuevos elementos - nombres del array. y luego asignarlo al combobox.
        javax.swing.DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel();
        
        model.addElement(ITEM_DEFECTO_SUCURSALES);
        for(Sucursal sucu : sucursales){
            if (sucu!=null)
                model.addElement(sucu.getNombre());
        }
        listaSucursales.setModel(model);
        listaSucursales.setSelectedIndex(0);
    }
    
    /**
     * Método que actualiza la lista de productos y campos datos en la ventada descontinuar productos.
     * Actualiza la lista con los productos registradas en el arreglo productos de la sucursal actual.
     * Utiliza el parametro descripción de lo producto como identificativo.
     * Actualiza los campos nombre, codigo, descripción, precio y fecha del producto seleccionado.
     */
    public void actualizarProductos(){
        javax.swing.DefaultComboBoxModel model = new javax.swing.DefaultComboBoxModel();
        
        if(sucursales[indexSucActual()].productos!=null){
            model.addElement(ITEM_DEFECTO_PRODUCTOS);        
            for(Producto product : sucursales[indexSucActual()].productos){
                if (product!=null)
                    model.addElement(product.getDescripcion());
            }
            listaDescontinuar.setModel(model);
            nombreDescontinuar.setText("");
            codigoDescontinuar.setText("");
            descripcionDescontinuar.setText("");
            precioDescontinuar.setValue(0);
            fechaDescontinuar.setText("");
        }
    }
    
    /**
     * Método que actualiza la tabla de productos buscados por rango de precio.
     */
    public void actualizarTablaRango(){
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tablaRango.getModel();
        int countRows = model.getRowCount();

        for (int i = 0; i < countRows; i++) model.removeRow(0);        
        
        for (Producto product : sucursales[indexSucActual()].productos) {
            if( product!=null){
                if(condicionRango.getSelectedIndex()==0 && product.getPrecio()>=(int)precioRango2.getValue()){                
                    model.addRow(new Object[]{
                        model.getRowCount()+1,product.getDescripcion(),product.getPrecio()});
                }
                if(condicionRango.getSelectedIndex()==1 && product.getPrecio()<=(int)precioRango2.getValue()){              
                    model.addRow(new Object[]{
                        model.getRowCount()+1,product.getDescripcion(),product.getPrecio()});
                }
                if(condicionRango.getSelectedIndex()==2 && (product.getPrecio()>=(int)precioRango1.getValue() && product.getPrecio()<=(int)precioRango2.getValue())){
                    model.addRow(new Object[]{
                        model.getRowCount()+1,product.getDescripcion(),product.getPrecio()});
                }
            }
        }                
        tablaRango.setModel(model);      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Barra;
    private javax.swing.JPanel Card;
    private javax.swing.JPanel PanelTodo;
    private javax.swing.JPanel Zona;
    private javax.swing.JButton aceptarAgregarSucursal;
    private javax.swing.JButton aceptarLanzar;
    private javax.swing.JButton agregarSucursal;
    private javax.swing.JButton antiguoProducto;
    private javax.swing.JTextArea areaDireccion;
    private javax.swing.JButton backAgregarSucursal;
    private javax.swing.JButton backAntiguo;
    private javax.swing.JButton backDescontinuar;
    private javax.swing.JButton backLanzar;
    private javax.swing.JButton backRango;
    private javax.swing.JButton backReporte;
    private javax.swing.JPanel botonesLeft;
    private javax.swing.JButton cancelarAgregarSucursal;
    private javax.swing.JButton cancelarLanzar;
    private javax.swing.JButton cerrarFrame;
    private javax.swing.JButton checker;
    private javax.swing.JButton checkerIngresar;
    private javax.swing.JTextField codigoAntiguo;
    private javax.swing.JTextField codigoDescontinuar;
    private javax.swing.JTextField codigoLanzar;
    private javax.swing.JComboBox<String> condicionRango;
    private javax.swing.JButton descontinuarProducto;
    private javax.swing.JTextField descripcionAntiguo;
    private javax.swing.JTextField descripcionDescontinuar;
    private javax.swing.JTextField descripcionLanzar;
    private javax.swing.JFrame dialogCerrarFrame;
    private javax.swing.JFrame dialogIngresar;
    private javax.swing.JTextArea direccionReporte;
    private javax.swing.JTextField direccionSucursal;
    private javax.swing.JFileChooser directorioElegir;
    private javax.swing.JPanel directorioWindows;
    private javax.swing.JButton eliminarDescontinuar;
    private javax.swing.JButton eliminarRango;
    private javax.swing.JButton eliminarSucursal;
    private javax.swing.JButton eliminarXRangodePrecio;
    private javax.swing.JLabel etiquetaAntiguo;
    private javax.swing.JLabel etiquetaCondicion;
    private javax.swing.JLabel etiquetaDialogCerrar;
    private javax.swing.JLabel etiquetaDialogCerrar1;
    private javax.swing.JLabel etiquetaLanzar;
    private javax.swing.JLabel etiquetaLogin1;
    private javax.swing.JLabel etiquetaLogin2;
    private javax.swing.JLabel etiquetaProductos;
    private javax.swing.JLabel etiquetaRango;
    private javax.swing.JButton exportarReporte;
    private javax.swing.JTextField fechaAntiguo;
    private javax.swing.JTextField fechaDescontinuar;
    private com.toedter.calendar.JCalendar fechaLanzar;
    private javax.swing.JFrame frameAgregarSucursal;
    private javax.swing.JFrame frameAntiguo;
    private javax.swing.JFrame frameDescontinuar;
    private javax.swing.JFrame frameLanzar;
    private javax.swing.JFrame frameRango;
    private javax.swing.JFrame frameReporte;
    private javax.swing.JButton generarReporte;
    private javax.swing.JLabel identificadorAntiguo;
    private javax.swing.JLabel identificadorDescontinuar;
    private javax.swing.JLabel identificadorLanzar;
    private javax.swing.JLabel identificadorRango;
    private javax.swing.JButton ingresarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton lanzarProducto;
    private javax.swing.JLabel linea;
    private javax.swing.JLabel linea10;
    private javax.swing.JLabel linea11;
    private javax.swing.JLabel linea12;
    private javax.swing.JLabel linea13;
    private javax.swing.JLabel linea14;
    private javax.swing.JLabel linea15;
    private javax.swing.JLabel linea16;
    private javax.swing.JLabel linea17;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel linea3;
    private javax.swing.JLabel linea4;
    private javax.swing.JLabel linea5;
    private javax.swing.JLabel linea6;
    private javax.swing.JLabel linea7;
    private javax.swing.JLabel linea8;
    private javax.swing.JLabel linea9;
    private javax.swing.JComboBox<String> listaDescontinuar;
    private javax.swing.JComboBox<String> listaSucursales;
    private javax.swing.JPanel loader;
    private javax.swing.JPanel login;
    private javax.swing.JButton minimizarFrame;
    private javax.swing.JPanel mostrarEste;
    private javax.swing.JTextField noUsed;
    private javax.swing.JTextField nombreAntiguo;
    private javax.swing.JTextField nombreDescontinuar;
    private javax.swing.JTextField nombreGrande;
    private javax.swing.JTextField nombreLanzar;
    private javax.swing.JTextField nombreLogin;
    private javax.swing.JLabel nombreReporte;
    private javax.swing.JTextField nombreSucursal;
    private javax.swing.JPanel pantalla;
    private javax.swing.JFormattedTextField precioAntiguo;
    private javax.swing.JFormattedTextField precioDescontinuar;
    private javax.swing.JFormattedTextField precioLanzar;
    private javax.swing.JFormattedTextField precioRango1;
    private javax.swing.JFormattedTextField precioRango2;
    private javax.swing.JPanel principal;
    private javax.swing.JTable tablaRango;
    private javax.swing.JTable tablaReporte;
    private javax.swing.JLabel tituloFrame;
    private javax.swing.JButton unChecker;
    // End of variables declaration//GEN-END:variables
}
