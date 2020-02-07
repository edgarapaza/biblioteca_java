
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

public class BuscarLibro extends javax.swing.JDialog {
    DefaultTableModel m; 
    conexion con=new conexion();
        
    int fila;
   
    //conexion conn = new conexion();
    
    public BuscarLibro(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //this.setLocation(150,15 );
        this.btn_editar.setEnabled(false);
        bloquear();
        
        
        
    }

   
    public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono/libros.png"));
        return retValue; 
    }
    
    @SuppressWarnings("unchecked")
    
    
    void bloquear(){
    this.txt_autores.setEnabled(false);
    //this.txt_clasificacion.setEnabled(false);
    //this.txt_edicion.setEnabled(false);
    this.txt_editorial.setEnabled(false);
    this.txt_fec_ingreso.setEnabled(false);
    this.txt_fec_publi.setEnabled(false);
    //this.txt_num_pag.setEnabled(false);
    this.txt_procedencia.setEnabled(false);
    this.txt_tipo.setEnabled(false);
    this.txt_titulo.setEnabled(false);
    this.txt_num_reg.setEnabled(false);
    }
    public void limpiar(){
          this.txt_autores.setText("");
      //    this.txt_clasificacion.setText("");
          //this.txt_edicion.setText("");
          
          this.txt_editorial.setText("");
          this.txt_fec_ingreso.setText("");
          this.txt_fec_publi.setText("");
         //this.txt_num_pag.setText("");
          this.txt_num_reg.setText("");
          this.txt_procedencia.setText("");
          this.txt_tipo.setText("");
          this.txt_titulo.setText("");
    }
    
  
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
        rb_titulo = new javax.swing.JRadioButton();
        rb_autores = new javax.swing.JRadioButton();
        rb_editorial = new javax.swing.JRadioButton();
        rb_procedencia = new javax.swing.JRadioButton();
        rb_fec_publi = new javax.swing.JRadioButton();
        rb_tipo = new javax.swing.JRadioButton();
        rb_fec_ingreso = new javax.swing.JRadioButton();
        txt_num_reg = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_autores = new javax.swing.JTextField();
        txt_editorial = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        txt_fec_ingreso = new javax.swing.JTextField();
        txt_fec_publi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSQUEDA DE LIBROS");
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1355, 720));

        jPanel1.setBackground(new java.awt.Color(48, 179, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1355, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 730));

        jPanel2.setBackground(new java.awt.Color(0, 78, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ARCHIVO REGIONAL PEQUEÑO.png"))); // NOI18N

        btn_cerrar_sesion.setBackground(new java.awt.Color(27, 96, 206));
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirrr.png"))); // NOI18N
        btn_cerrar_sesion.setText("IR A MENÚ DE LIBROS");
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
        jLabel1.setText("BUSQUEDA DE LIBROS");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CRITERIO DE BÚSQUEDA:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        buttonGroup1.add(rb_todo);
        rb_todo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        buttonGroup1.add(rb_titulo);
        rb_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_titulo.setText("Por Título");
        rb_titulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_tituloMouseClicked(evt);
            }
        });
        rb_titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_tituloActionPerformed(evt);
            }
        });

        buttonGroup1.add(rb_autores);
        rb_autores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_autores.setText("Por Autores");
        rb_autores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_autoresMouseClicked(evt);
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

        buttonGroup1.add(rb_tipo);
        rb_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_tipo.setText("Por Costo");
        rb_tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_tipoMouseClicked(evt);
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

        txt_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_titulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tituloKeyTyped(evt);
            }
        });

        txt_autores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_autores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_autoresKeyTyped(evt);
            }
        });

        txt_editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_editorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_editorialKeyTyped(evt);
            }
        });

        txt_procedencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_procedencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_procedenciaKeyTyped(evt);
            }
        });

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_tipoKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_num_reg)
                        .addGap(18, 18, 18)
                        .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rb_todo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_editorial)
                        .addGap(94, 94, 94)
                        .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_titulo)
                        .addGap(108, 108, 108)
                        .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_autores)
                        .addGap(94, 94, 94)
                        .addComponent(txt_autores, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_fec_ingreso)
                            .addComponent(rb_tipo)
                            .addComponent(rb_procedencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_procedencia)
                                .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                            .addComponent(txt_tipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rb_fec_publi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                        .addComponent(txt_fec_publi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rb_todo)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_num_reg)
                    .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_procedencia)
                    .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_titulo)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_tipo)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_autores)
                    .addComponent(txt_autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_fec_ingreso)
                    .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_editorial)
                    .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_fec_publi)
                    .addComponent(txt_fec_publi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(601, 601, 601))))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1325, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea regresar al menú de libros?", "¡ALERTA!", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String num_reg,titulo,autores,editorial,procedencia,fec_publi,edicion,num_pag,clasificacion,tipo,fec_ingreso;

        String sql;

        num_reg=this.txt_num_reg.getText();
        titulo=this.txt_titulo.getText();
        autores=this.txt_autores.getText();
        editorial=this.txt_editorial.getText();
        procedencia=this.txt_procedencia.getText();
        fec_publi=this.txt_fec_publi.getText();
       // edicion=this.txt_edicion.getText();
        //num_pag=this.txt_num_pag.getText();
        //clasificacion=this.txt_clasificacion.getText();
        tipo=this.txt_tipo.getText();
        fec_ingreso=this.txt_fec_ingreso.getText();

        if(rb_num_reg.isSelected() == true){
            sql="SELECT * FROM libros WHERE num_reg='"+num_reg+"'";
            try {
                con.conectar();
                ResultSet res=con.consulta("SELECT * FROM libros WHERE num_reg='"+num_reg+"'");
                res.next();

                int n=res.getRow();
                if(n>0) {
                    //JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_num_reg();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }

        }

        if(rb_titulo.isSelected() == true){
            sql="SELECT * FROM libros WHERE titulo LIKE '%"+titulo+"%'ORDER BY num_reg asc";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                
                res.next();

                int n=res.getRow();
                if(n>0) {
                  //  JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_titulo();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_autores.isSelected() == true){
            sql="SELECT * FROM libros WHERE autores LIKE '%"+autores+"%'ORDER BY num_reg asc";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                
                res.next();

                int n=res.getRow();
                if(n>0) {
                   // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_autores();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_editorial.isSelected() == true){
            sql="SELECT * FROM libros WHERE editorial LIKE '%"+editorial+"%'ORDER BY num_reg asc";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                
                res.next();

                int n=res.getRow();
                if(n>0) {
                  //  JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_editorial();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_procedencia.isSelected() == true){
            sql="SELECT * FROM libros WHERE procedencia LIKE '%"+procedencia+"%'ORDER BY num_reg asc";
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
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
/**
        if(rb_edicion.isSelected() == true){
            sql="select * from libros where edicion LIKE '%"+edicion+"%'";
            try {
                PreparedStatement pst=reg.prepareStatement(sql);
                ResultSet res=pst.executeQuery(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_edicion();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_num_pag.isSelected() == true){
            sql="select * from libros where num_pag='"+edicion+"'";
            try {
                PreparedStatement pst=reg.prepareStatement(sql);
                ResultSet res=pst.executeQuery(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                    JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_num_pag();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_clasificacion.isSelected() == true){
            sql="select * from libros where clasificacion LIKE '%"+clasificacion+"%'";
            try {
                PreparedStatement pst=reg.prepareStatement(sql);
                ResultSet res=pst.executeQuery(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                   //JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_clasificacion();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
*/
        if(rb_tipo.isSelected() == true){
            sql="select * from libros where tipo LIKE '%"+tipo+"%'ORDER BY num_reg asc";
            try {
                con.conectar();
                ResultSet res = con.consulta(sql);
                res.next();

                int n=res.getRow();
                if(n>0) {
                   // JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_tipo();

                }
                else {
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(rb_fec_ingreso.isSelected() == true){
            sql="select * from libros where fec_ingreso LIKE '%"+fec_ingreso+"%'ORDER BY num_reg asc";
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
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(this.rb_fec_publi.isSelected() == true){
            sql="select * from libros where fec_publi LIKE '%"+fec_publi+"%'ORDER BY num_reg asc";
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
                    JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
                }

            } catch (SQLException ex){
                Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
            }
        }

        if(this.rb_todo.isSelected() == true){
            this.buscar_todo();
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        this.txt_codigo.setEditable(false);
        
        if( evt.getButton()==1){
            int fila=tabla.getSelectedRow();
            Statement s;
            try{
                String sql="select * from libros where num_reg="+tabla.getValueAt(fila,0);
                con.conectar();
                ResultSet res = con.consulta(sql);
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

    private void rb_fec_ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fec_ingresoMouseClicked
        bloquear();
        limpiar();
        this.txt_fec_ingreso.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_fec_ingresoMouseClicked

    private void rb_tipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_tipoMouseClicked
        bloquear();
        limpiar();
        this.txt_tipo.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_tipoMouseClicked

    private void rb_fec_publiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fec_publiMouseClicked
        bloquear();
        limpiar();
        this.txt_fec_publi.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_fec_publiMouseClicked

    private void rb_procedenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_procedenciaMouseClicked
        bloquear();
        limpiar();
        this.txt_procedencia.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_procedenciaMouseClicked

    private void rb_editorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_editorialMouseClicked
        bloquear();
        limpiar();
        this.txt_editorial.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_editorialMouseClicked

    private void rb_autoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_autoresMouseClicked
        bloquear();
        limpiar();
        this.txt_autores.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_autoresMouseClicked

    private void rb_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_tituloActionPerformed
       
    }//GEN-LAST:event_rb_tituloActionPerformed

    private void rb_tituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_tituloMouseClicked
        bloquear();
        limpiar();
        this.txt_titulo.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_tituloMouseClicked

    private void rb_num_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_num_regMouseClicked
        bloquear();
        limpiar();
        this.txt_num_reg.setEnabled(true);
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_num_regMouseClicked

    private void rb_todoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_todoMouseClicked
        bloquear();
        limpiar();
        this.btn_buscar.setEnabled(true);
        this.btn_editar.setEnabled(false);
    }//GEN-LAST:event_rb_todoMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
       
       
       edicion_directo edi=new edicion_directo(this,false, this.txt_codigo.getText());
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

    private void txt_num_regKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_regKeyPressed
       
      
    }//GEN-LAST:event_txt_num_regKeyPressed

    private void txt_num_regKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num_regKeyTyped
        char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_txt_num_regKeyTyped

    private void txt_tituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tituloKeyTyped
        char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_txt_tituloKeyTyped

    private void txt_autoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_autoresKeyTyped
        char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_txt_autoresKeyTyped

    private void txt_editorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_editorialKeyTyped
         char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_txt_editorialKeyTyped

    private void txt_procedenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_procedenciaKeyTyped
         char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_txt_procedenciaKeyTyped

    private void txt_tipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tipoKeyTyped
        char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_txt_tipoKeyTyped

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

    private void rb_todoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rb_todoKeyTyped
        char tecla=evt.getKeyChar();
       if(tecla==KeyEvent.VK_ENTER){
       this.btn_buscar.doClick();
       }
    }//GEN-LAST:event_rb_todoKeyTyped

    public void buscar_todo(){
    Statement s;
    try {
        
        con.conectar();
        ResultSet res = con.consulta("select * from libros ORDER BY num_reg ASC");
        res.next();
        
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
       // modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
public void buscar_num_reg(){
    Statement s;
    String num_reg;
    num_reg=this.txt_num_reg.getText();
    
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros WHERE num_reg='"+num_reg+"'");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        //modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_titulo(){
    Statement s;
    String titulo;
    titulo=this.txt_titulo.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros WHERE titulo LIKE '%"+titulo+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        //modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_autores(){
    Statement s;
    String autores;
    autores=this.txt_autores.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros where autores LIKE '%"+autores+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
       // modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_editorial(){
    Statement s;
    String editorial;
    editorial=this.txt_editorial.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros WHERE editorial LIKE '%"+editorial+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        //modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    
public void buscar_procedencia(){
    Statement s;
    String procedencia;
    procedencia=this.txt_procedencia.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros where procedencia LIKE '%"+procedencia+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
       // modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    
/**public void buscar_edicion(){
    Statement s;
    String edicion;
    edicion=this.txt_edicion.getText();
    try {
        s=con.conexion().createStatement();
        ResultSet res=s.executeQuery("select * from libros where edicion LIKE '%"+edicion+"%'");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("TIPO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_num_pag(){
    Statement s;
    String num_pag;
    num_pag=this.txt_num_pag.getText();
    try {
        s=con.conexion().createStatement();
        ResultSet res=s.executeQuery("select * from libros WHERE num_pag='"+num_pag+"'");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("TIPO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_clasificacion(){
    Statement s;
    String clasificacion;
    clasificacion=this.txt_clasificacion.getText();
    try {
        s=con.conexion().createStatement();
        ResultSet res=s.executeQuery("select * from libros where clasificacion LIKE '%"+clasificacion+"%'");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        //modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
*/
public void buscar_tipo(){
    Statement s;
    String tipo;
    tipo=this.txt_tipo.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros where tipo LIKE '%"+tipo+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
       // modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_fec_ingreso(){
    Statement s;
    String fec_ing;
    fec_ing=this.txt_fec_ingreso.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros where fec_ingreso LIKE '%"+fec_ing+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
        //modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_fec_publi(){
    Statement s;
    String fec_publi;
    fec_publi=this.txt_fec_publi.getText();
    try {
        con.conectar();
        ResultSet res=con.consulta("select * from libros where fec_publi LIKE '%"+fec_publi+"%'ORDER BY num_reg ASC");
        DefaultTableModel modelo=new DefaultTableModel();
        modelo.addColumn("NUM_REGISTRO");
        modelo.addColumn("TITULO");
        modelo.addColumn("AUTORES");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("PROCEDENCIA");
        modelo.addColumn("FECHA DE PUBLICACION");
        modelo.addColumn("EDICION");
        modelo.addColumn("NUM_PAGINAS");
        modelo.addColumn("CLASIFICACION");
        modelo.addColumn("COSTO");
        modelo.addColumn("FECHA INGRESO");
        modelo.addColumn("OBSERVACIONES");
      //  modelo.addColumn("FING_SIS");
        
       while (res.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=res.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BuscarLibro dialog = new BuscarLibro(new javax.swing.JDialog(), true);
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
    private javax.swing.JRadioButton rb_autores;
    private javax.swing.JRadioButton rb_editorial;
    private javax.swing.JRadioButton rb_fec_ingreso;
    private javax.swing.JRadioButton rb_fec_publi;
    private javax.swing.JRadioButton rb_num_reg;
    private javax.swing.JRadioButton rb_procedencia;
    private javax.swing.JRadioButton rb_tipo;
    private javax.swing.JRadioButton rb_titulo;
    private javax.swing.JRadioButton rb_todo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_autores;
    public static javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_fec_ingreso;
    private javax.swing.JTextField txt_fec_publi;
    private javax.swing.JTextField txt_num_reg;
    private javax.swing.JTextField txt_procedencia;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
