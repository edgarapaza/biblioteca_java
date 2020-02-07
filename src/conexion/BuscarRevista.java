
package conexion;
import java.awt.event.KeyEvent;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class BuscarRevista extends javax.swing.JDialog {

    DefaultTableModel m; 
    conexion con = new conexion();
    
    
    int fila;
    public BuscarRevista(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.btn_editar.setEnabled(false);
        bloquear();
    }

    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono/libros.png"));
        return retValue; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        rb_todo = new javax.swing.JRadioButton();
        rb_num_reg = new javax.swing.JRadioButton();
        rb_nombre = new javax.swing.JRadioButton();
        rb_director = new javax.swing.JRadioButton();
        rb_editor = new javax.swing.JRadioButton();
        rb_procedencia = new javax.swing.JRadioButton();
        rb_fec_publi = new javax.swing.JRadioButton();
        rb_costo = new javax.swing.JRadioButton();
        rb_fec_ingreso = new javax.swing.JRadioButton();
        txt_num_reg = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_director = new javax.swing.JTextField();
        txt_editor = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        txt_costo = new javax.swing.JTextField();
        txt_fec_ingreso = new javax.swing.JTextField();
        txt_fec_publi = new javax.swing.JTextField();
        rb_editorial = new javax.swing.JRadioButton();
        txt_editorial = new javax.swing.JTextField();
        rb_contenido = new javax.swing.JRadioButton();
        txt_contenido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 179, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1355, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 730));

        jPanel2.setBackground(new java.awt.Color(0, 78, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ARCHIVO REGIONAL PEQUEÑO.png"))); // NOI18N

        btn_cerrar_sesion.setBackground(new java.awt.Color(27, 96, 206));
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirrr.png"))); // NOI18N
        btn_cerrar_sesion.setText("IR A MENÚ DE REVISTAS");
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BUSQUEDA DE REVISTAS");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRITERIO DE BÚSQUEDA:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        buttonGroup1.add(rb_todo);
        rb_todo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_todo.setSelected(true);
        rb_todo.setText("Buscar Todo");
        rb_todo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_todoMouseClicked(evt);
            }
        });
        rb_todo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rb_todoKeyTyped(evt);
            }
        });

        buttonGroup1.add(rb_num_reg);
        rb_num_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_num_reg.setText("Por Número de Registro");
        rb_num_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_num_regMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_nombre);
        rb_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_nombre.setText("Por Nombre");
        rb_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_nombreMouseClicked(evt);
            }
        });
        rb_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_director);
        rb_director.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_director.setText("Por Director");
        rb_director.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_directorMouseClicked(evt);
            }
        });
        rb_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_directorActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_editor);
        rb_editor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_editor.setText("Por Editor");
        rb_editor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_editorMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_procedencia);
        rb_procedencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_procedencia.setText("Por Procedencia");
        rb_procedencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_procedenciaMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_fec_publi);
        rb_fec_publi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_fec_publi.setText("Por Fecha de Publicación");
        rb_fec_publi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_fec_publiMouseClicked(evt);
            }
        });
        rb_fec_publi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_fec_publiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_costo);
        rb_costo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_costo.setText("Por Costo");
        rb_costo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_costoMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_fec_ingreso);
        rb_fec_ingreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_fec_ingreso.setText("Por Fecha de Ingreso");
        rb_fec_ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_fec_ingresoMouseClicked(evt);
            }
        });

        txt_num_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_num_reg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_num_regKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num_regKeyTyped(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_director.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_directorActionPerformed(evt);
            }
        });
        txt_director.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_directorKeyTyped(evt);
            }
        });

        txt_editor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_editor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_editorKeyTyped(evt);
            }
        });

        txt_procedencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_procedencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_procedenciaKeyTyped(evt);
            }
        });

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_costo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_costoKeyTyped(evt);
            }
        });

        txt_fec_ingreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fec_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fec_ingresoKeyTyped(evt);
            }
        });

        txt_fec_publi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fec_publi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fec_publiKeyTyped(evt);
            }
        });

        buttonGroup1.add(rb_editorial);
        rb_editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_editorial.setText("Por Editorial");
        rb_editorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_editorialMouseClicked(evt);
            }
        });
        rb_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_editorialActionPerformed(evt);
            }
        });

        txt_editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_editorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_editorialKeyTyped(evt);
            }
        });

        buttonGroup1.add(rb_contenido);
        rb_contenido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_contenido.setText("Por Contenido");
        rb_contenido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_contenidoMouseClicked(evt);
            }
        });
        rb_contenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_contenidoActionPerformed(evt);
            }
        });

        txt_contenido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_contenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contenidoActionPerformed(evt);
            }
        });
        txt_contenido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_contenidoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_num_reg)
                            .addComponent(rb_nombre)
                            .addComponent(rb_director)
                            .addComponent(rb_editor)
                            .addComponent(rb_editorial)
                            .addComponent(rb_contenido))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_director, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_fec_ingreso)
                    .addComponent(rb_costo)
                    .addComponent(rb_procedencia)
                    .addComponent(rb_fec_publi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_procedencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_costo)
                        .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_fec_publi))
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rb_todo)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(txt_fec_publi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_num_reg)
                            .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_procedencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_fec_publi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rb_nombre)
                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(rb_fec_ingreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rb_costo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_contenido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rb_contenido, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_director, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rb_director, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_editor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rb_editor))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_editorial)
                            .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RESULTADOS:");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES:"));

        btn_buscar.setBackground(new java.awt.Color(66, 117, 215));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        btn_editar.setBackground(new java.awt.Color(66, 117, 215));
        btn_editar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_editar.setText("EDITAR");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_codigo.setBackground(new java.awt.Color(73, 185, 221));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(601, 601, 601))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
void bloquear(){
    this.txt_director.setEnabled(false);
    //this.txt_clasificacion.setEnabled(false);
    //this.txt_edicion.setEnabled(false);
    this.txt_editorial.setEnabled(false);
    this.txt_fec_ingreso.setEnabled(false);
    this.txt_fec_publi.setEnabled(false);
    this.txt_editor.setEnabled(false);
    this.txt_procedencia.setEnabled(false);
    this.txt_costo.setEnabled(false);
    this.txt_nombre.setEnabled(false);
    this.txt_contenido.setEnabled(false);
    this.txt_num_reg.setEnabled(false);
    
    }
    public void limpiar(){
          this.txt_director.setText("");
      //    this.txt_clasificacion.setText("");
          //this.txt_edicion.setText("");
          this.txt_editorial.setText("");
          this.txt_fec_ingreso.setText("");
          this.txt_fec_publi.setText("");
          this.txt_editor.setText("");
          this.txt_num_reg.setText("");
          this.txt_procedencia.setText("");
          this.txt_costo.setText("");
          this.txt_nombre.setText("");
          this.txt_contenido.setText("");
    }
    
    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea regresar al menú de revistas?", "¡ALERTA!", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void rb_todoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_todoMouseClicked
        bloquear();
        limpiar();
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_todoMouseClicked

    private void rb_todoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_todoKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_rb_todoKeyTyped

    private void rb_num_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_num_regMouseClicked
        bloquear();
        limpiar();
        this.txt_num_reg.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_num_regMouseClicked

    private void rb_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_nombreMouseClicked
        bloquear();
        limpiar();
        this.txt_nombre.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_nombreMouseClicked

    private void rb_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nombreActionPerformed

    }//GEN-LAST:event_rb_nombreActionPerformed

    private void rb_directorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_directorMouseClicked
        bloquear();
        limpiar();
        this.txt_director.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_directorMouseClicked

    private void rb_editorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_editorMouseClicked
        bloquear();
        limpiar();
        this.txt_editor.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_editorMouseClicked

    private void rb_procedenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_procedenciaMouseClicked
        bloquear();
        limpiar();
        this.txt_procedencia.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_procedenciaMouseClicked

    private void rb_fec_publiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fec_publiMouseClicked
        bloquear();
        limpiar();
        this.txt_fec_publi.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_fec_publiMouseClicked

    private void rb_costoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_costoMouseClicked
        bloquear();
        limpiar();
        this.txt_costo.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_costoMouseClicked

    private void rb_fec_ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fec_ingresoMouseClicked
        bloquear();
        limpiar();
        this.txt_fec_ingreso.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_fec_ingresoMouseClicked

    private void txt_num_regKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_regKeyPressed

    }//GEN-LAST:event_txt_num_regKeyPressed

    private void txt_num_regKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_regKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_num_regKeyTyped

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_directorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_directorKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_directorKeyTyped

    private void txt_editorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_editorKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_editorKeyTyped

    private void txt_procedenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_procedenciaKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_procedenciaKeyTyped

    private void txt_costoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_costoKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_costoKeyTyped

    private void txt_fec_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fec_ingresoKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_fec_ingresoKeyTyped

    private void txt_fec_publiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fec_publiKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_fec_publiKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        this.txt_codigo.setEditable(false);

        if( evt.getButton()==1){
            int fila=tabla.getSelectedRow();
            Statement s;
            try{
                String sql="select * from revistas where num_reg="+tabla.getValueAt(fila,0);
                con.conectar();
                ResultSet res=con.consulta(sql);
                res.next();

                this.txt_codigo.setText(res.getString("num_reg"));
                int cod=Integer.parseInt(txt_codigo.getText());
                //txt_num_reg.setText(""+cod);
                this.btn_editar.setEnabled(true);
                this.btn_buscar.setEnabled(false);
            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String num_reg,nombre,contenido,director,editor,procedencia,fec_publi,editorial,costo,fec_ingreso;

        String sql;

        num_reg=this.txt_num_reg.getText();
        nombre=this.txt_nombre.getText();
        contenido=this.txt_contenido.getText();
        director=this.txt_director.getText();
        editor=this.txt_editor.getText();
        procedencia=this.txt_procedencia.getText();
        fec_publi=this.txt_fec_publi.getText();
        editorial=this.txt_editorial.getText();
        //num_pag=this.txt_num_pag.getText();
        //clasificacion=this.txt_clasificacion.getText();
        costo=this.txt_costo.getText();
        fec_ingreso=this.txt_fec_ingreso.getText();

        if(rb_num_reg.isSelected() == true){
            sql="select * from revistas where num_reg='"+num_reg+"'";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    //JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_num_reg();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }

        }

        if(rb_nombre.isSelected() == true){
            sql="select * from revistas where nombre LIKE '%"+nombre+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    //  JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_nombre();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        if(rb_contenido.isSelected() == true){
            sql="select * from revistas where contenido LIKE '%"+contenido+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    //  JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_contenido();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_director.isSelected() == true){
            sql="select * from revistas where director LIKE '%"+director+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_director();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_editor.isSelected() == true){
            sql="select * from revistas WHERE editor LIKE '%"+editor+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    //  JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_editor();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_procedencia.isSelected() == true){
            sql="select * from revistas where procedencia LIKE '%"+procedencia+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_procedencia();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_costo.isSelected() == true){
            sql="select * from revistas where costo LIKE '%"+costo+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_costo();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_fec_ingreso.isSelected() == true){
            sql="select * from revistas where fec_ingreso LIKE '%"+fec_ingreso+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    //  JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_fec_ingreso();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(this.rb_fec_publi.isSelected() == true){
            sql="select * from revistas where fec_publi LIKE '%"+fec_publi+"%'ORDER BY num_reg ASC";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_fec_publi();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
         if(this.rb_editorial.isSelected() == true){
            sql="select * from revistas where editorial LIKE '%"+editorial+"%'ORDER BY num_reg ASC";
            try {
               con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_editorial();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA REVISTA CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(this.rb_todo.isSelected() == true){
            this.buscar_todo();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
public void buscar_todo(){
     Statement s;
    try {
        con.conectar();
        ResultSet res=con.consulta("SELECT * FROM revistas ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
public void buscar_num_reg(){
    Statement s;
    String num_reg;
    num_reg=this.txt_num_reg.getText();
    
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas WHERE num_reg='"+num_reg+"'");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_nombre(){
    Statement s;
    String nombre;
    nombre=this.txt_nombre.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas WHERE nombre LIKE '%"+nombre+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
public void buscar_contenido(){
    Statement s;
    String contenido;
    contenido=this.txt_contenido.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas WHERE contenido LIKE '%"+contenido+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_director(){
    Statement s;
    String director;
    director=this.txt_director.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas where director LIKE '%"+director+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_editorial(){
    Statement s;
    String editorial;
    editorial=this.txt_editorial.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas WHERE editorial LIKE '%"+editorial+"%'ORDER BY num_reg ASC");
       DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    
public void buscar_procedencia(){
    Statement s;
    String procedencia;
    procedencia=this.txt_procedencia.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas where procedencia LIKE '%"+procedencia+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    
public void buscar_editor(){
    Statement s;
    String editor;
    editor=this.txt_editor.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas where editor LIKE '%"+editor+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
public void buscar_costo(){
    Statement s;
    String costo;
    costo=this.txt_costo.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas where costo LIKE '%"+costo+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_fec_ingreso(){
    Statement s;
    String fec_ing;
    fec_ing=this.txt_fec_ingreso.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas where fec_ingreso LIKE '%"+fec_ing+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_fec_publi(){
    Statement s;
    String fec_publi;
    fec_publi=this.txt_fec_publi.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from revistas where fec_publi LIKE '%"+fec_publi+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CONTENIDO");
        modelo.addColumn("DIRECTOR");
        modelo.addColumn("EDITOR");
        modelo.addColumn("TIPO");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("EDICION");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("PECHA DE INGRESO");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("COSTO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("OBSERVACIONES");
        
        
        while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        edicion_directo_rev edi=new edicion_directo_rev(this,false, this.txt_codigo.getText());
        edi.setVisible(true);

        /* int clik=tabla.getSelectedRow();
        try{

            // edicion_directo ventana=new edicion_directo (new javax.swing.JDialog(),false);
            String id=tabla.getValueAt(clik,0).toString();
            m=(DefaultTableModel)tabla.getModel();
            id=tabla.getValueAt(clik,0).toString();

            //edi.txt_num_reg.setText(""+id);
            //edi.num_fila.setText(""+id);
            fila=Integer.pareseInt(id);

        }
        catch (Exception ex){
            Logger.getLogger(ingreso_libro.class.getName()).log(Level.SEVERE,null,ex);
        }
        */
        //edicion_directo edicion=new edicion_directo(this,false);
        //  edi.setVisible(true);

    }//GEN-LAST:event_btn_editarActionPerformed

    private void rb_editorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_editorialMouseClicked
        bloquear();
        limpiar();
        this.txt_editorial.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_editorialMouseClicked

    private void txt_editorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_editorialKeyTyped
      char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
        this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_editorialKeyTyped

    private void rb_editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_editorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_editorialActionPerformed

    private void rb_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_directorActionPerformed

    private void rb_contenidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_contenidoMouseClicked
        bloquear();
        limpiar();
        this.txt_contenido.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_contenidoMouseClicked

    private void rb_contenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_contenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_contenidoActionPerformed

    private void txt_contenidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contenidoKeyTyped
        char tecla=evt.getKeyChar();
        if(tecla==KeyEvent.VK_ENTER){
            this.btn_buscar.doClick();
        }
    }//GEN-LAST:event_txt_contenidoKeyTyped

    private void txt_contenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contenidoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_directorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_directorActionPerformed

    private void rb_fec_publiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_fec_publiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_fec_publiActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarRevista dialog = new BuscarRevista(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_editar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rb_contenido;
    private javax.swing.JRadioButton rb_costo;
    private javax.swing.JRadioButton rb_director;
    private javax.swing.JRadioButton rb_editor;
    private javax.swing.JRadioButton rb_editorial;
    private javax.swing.JRadioButton rb_fec_ingreso;
    private javax.swing.JRadioButton rb_fec_publi;
    private javax.swing.JRadioButton rb_nombre;
    private javax.swing.JRadioButton rb_num_reg;
    private javax.swing.JRadioButton rb_procedencia;
    private javax.swing.JRadioButton rb_todo;
    private javax.swing.JTable tabla;
    public static javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_contenido;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_director;
    private javax.swing.JTextField txt_editor;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_fec_ingreso;
    private javax.swing.JTextField txt_fec_publi;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num_reg;
    private javax.swing.JTextField txt_procedencia;
    // End of variables declaration//GEN-END:variables
}
