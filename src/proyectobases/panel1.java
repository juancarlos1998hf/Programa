
package proyectobases;


import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class panel1 extends javax.swing.JFrame {

    DateFormat df = DateFormat.getDateInstance();
    
    public panel1() {
        setPreferredSize(new Dimension(600,600));
        initComponents();
        
       Date FechaActual = new Date();
       fecha.setText(df.format(FechaActual));
                
       opciones.addItem("Dulceria");
       opciones.addItem("Productos de aseo");
       opciones.addItem("Viveres");
       opciones.addItem("Papeleria");
       opciones.addItem("Bebidas");
       opciones.addItem("Galletería");
       PanelPedidos.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        fecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        PanelPedidos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        valor8 = new javax.swing.JTextField();
        valor9 = new javax.swing.JTextField();
        valor7 = new javax.swing.JTextField();
        valor10 = new javax.swing.JTextField();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        valor4 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        valor3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        valor5 = new javax.swing.JTextField();
        valor1 = new javax.swing.JTextField();
        valor6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        opciones = new javax.swing.JComboBox<>();
        empresa = new javax.swing.JLabel();
        bempresa = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jEditorPane1);

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        fecha.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel1.setText("Fecha:");

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton1.setText("Pedidos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton2.setText("Inventario");

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton3.setText("¿Qué falta?");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Pedidos");

        valor8.setText("0");
        valor8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor8ActionPerformed(evt);
            }
        });

        valor9.setText("0");
        valor9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor9ActionPerformed(evt);
            }
        });

        valor7.setText("0");
        valor7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor7ActionPerformed(evt);
            }
        });

        valor10.setText("0");
        valor10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor10ActionPerformed(evt);
            }
        });

        total.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        total.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                totalKeyPressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Total");

        jButton4.setText("Sumar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });

        jLabel3.setText("Cant.");

        jLabel4.setText("Producto");

        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });

        jTextField23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField23ActionPerformed(evt);
            }
        });

        jTextField25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField25ActionPerformed(evt);
            }
        });

        valor2.setText("0");
        valor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor2ActionPerformed(evt);
            }
        });

        valor4.setText("0");
        valor4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor4ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        valor3.setText("0");
        valor3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio Unitario");

        valor5.setText("0");
        valor5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor5ActionPerformed(evt);
            }
        });

        valor1.setText("0");
        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });

        valor6.setText("0");
        valor6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Tipo de Producto");

        opciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger" }));
        opciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionesActionPerformed(evt);
            }
        });

        empresa.setText("Empresa");

        bempresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoger" }));
        bempresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bempresaMouseClicked(evt);
            }
        });
        bempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bempresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPedidosLayout = new javax.swing.GroupLayout(PanelPedidos);
        PanelPedidos.setLayout(PanelPedidosLayout);
        PanelPedidosLayout.setHorizontalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPedidosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2))
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(empresa))
                        .addGap(35, 35, 35)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor9, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor8, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPedidosLayout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(46, 46, 46)))
                                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(valor10)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 23, Short.MAX_VALUE))))
        );
        PanelPedidosLayout.setVerticalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(opciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(empresa))
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))))
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jButton5.setFont(new java.awt.Font("Arial Narrow", 1, 16)); // NOI18N
        jButton5.setText("Venta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)
                        .addGap(27, 27, 27)
                        .addComponent(jButton3)
                        .addGap(28, 28, 28)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valor8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor8ActionPerformed

    private void valor9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor9ActionPerformed

    private void valor7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor7ActionPerformed

    private void valor10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor10ActionPerformed

    private void totalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_totalKeyPressed

    }//GEN-LAST:event_totalKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:

        String resultadoo, va1,va2,va3,va4,va5,va;
        int resultado=0;
        int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;

        v1 = Integer.parseInt(valor1.getText());
        v2 = Integer.parseInt(valor2.getText());
        v3 = Integer.parseInt(valor3.getText());
        v4 = Integer.parseInt(valor4.getText());
        v5 = Integer.parseInt(valor5.getText());
        v6 = Integer.parseInt(valor6.getText());
        v7 = Integer.parseInt(valor7.getText());
        v8 = Integer.parseInt(valor8.getText());
        v9 = Integer.parseInt(valor9.getText());
        v10 = Integer.parseInt(valor10.getText());
        resultado = v1+v2+v3+v4+v5+v6+v7+v8+v9+v10;

        resultadoo = Integer.toString(resultado);
        total.setText(resultadoo);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField23ActionPerformed

    private void jTextField25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField25ActionPerformed

    private void valor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor2ActionPerformed

    private void valor4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor4ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void valor3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor3ActionPerformed

    private void valor5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor5ActionPerformed

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1ActionPerformed

    private void valor6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor6ActionPerformed

    private void opcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionesActionPerformed
        String seleccion;
        seleccion=(String) opciones.getSelectedItem();
        if (seleccion.equals("Dulceria")) {
            bempresa.removeAllItems();
            bempresa.addItem("Intenciva");
            bempresa.addItem("Dialecom");
        }else if (seleccion.equals("Productos de aseo")) {
            bempresa.removeAllItems();
            bempresa.addItem("Intenciva");
            bempresa.addItem("Lummy");
            bempresa.addItem("Unilever");
            bempresa.addItem("La bodeguita");
        }else if(seleccion.equals("Viveres")){
            bempresa.removeAllItems();
            bempresa.addItem("La bodeguita");
            bempresa.addItem("Supermercados MiMarket");
            bempresa.addItem("Makro");

        }else if(seleccion.equals("Papeleria")){
            bempresa.removeAllItems();
            bempresa.addItem("Papeleria LYSCAM");
        }else if(seleccion.equals("Bebidas")){
            bempresa.removeAllItems();
            bempresa.addItem("Postobón");
            bempresa.addItem("Cocacola");
            bempresa.addItem("Cervecería Babaria");
        }else if(seleccion.equals("Galletería")){
            bempresa.removeAllItems();
            bempresa.addItem("Colombina");
            bempresa.addItem("Nacional de Chocolates");
            bempresa.addItem("Nestle");
        }
        /*opciones.addItem("Papeleria");
        opciones.addItem("Bebidas");
        opciones.addItem("Galleteria");*/

    }//GEN-LAST:event_opcionesActionPerformed

    private void bempresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bempresaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bempresaMouseClicked

    private void bempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bempresaActionPerformed

    }//GEN-LAST:event_bempresaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelPedidos.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
   
    
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
            java.util.logging.Logger.getLogger(panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPedidos;
    private javax.swing.JComboBox<String> bempresa;
    private javax.swing.JLabel empresa;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> opciones;
    private javax.swing.JLabel total;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor10;
    private javax.swing.JTextField valor2;
    private javax.swing.JTextField valor3;
    private javax.swing.JTextField valor4;
    private javax.swing.JTextField valor5;
    private javax.swing.JTextField valor6;
    private javax.swing.JTextField valor7;
    private javax.swing.JTextField valor8;
    private javax.swing.JTextField valor9;
    // End of variables declaration//GEN-END:variables
}
