
package conexion;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarLibro extends javax.swing.JDialog {

    conectar con=new conectar();
    Connection reg=con.conexion();
    //conexion conn = new conexion();
    
    public BuscarLibro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(150,15 );
        bloquear();
    }

    
    @SuppressWarnings("unchecked")
    
    
    void bloquear(){
    this.txt_autores.setEnabled(false);
    this.txt_clasificacion.setEnabled(false);
    this.txt_edicion.setEnabled(false);
    this.txt_editorial.setEnabled(false);
    this.txt_fec_ingreso.setEnabled(false);
    this.txt_fec_publi.setEnabled(false);
    this.txt_num_pag.setEnabled(false);
    this.txt_procedencia.setEnabled(false);
    this.txt_tipo.setEnabled(false);
    this.txt_titulo.setEnabled(false);
    this.txt_num_reg.setEnabled(false);
    }
    public void limpiar(){
          this.txt_autores.setText("");
          this.txt_clasificacion.setText("");
          this.txt_edicion.setText("");
          
          this.txt_editorial.setText("");
          this.txt_fec_ingreso.setText("");
          this.txt_fec_publi.setText("");
          this.txt_num_pag.setText("");
          this.txt_num_reg.setText("");
          this.txt_procedencia.setText("");
          this.txt_tipo.setText("");
          this.txt_titulo.setText("");
    }
    
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        rb_todo = new javax.swing.JRadioButton();
        rb_num_reg = new javax.swing.JRadioButton();
        rb_titulo = new javax.swing.JRadioButton();
        rb_autores = new javax.swing.JRadioButton();
        rb_editorial = new javax.swing.JRadioButton();
        rb_procedencia = new javax.swing.JRadioButton();
        rb_fec_publi = new javax.swing.JRadioButton();
        rb_tipo = new javax.swing.JRadioButton();
        rb_edicion = new javax.swing.JRadioButton();
        rb_num_pag = new javax.swing.JRadioButton();
        rb_clasificacion = new javax.swing.JRadioButton();
        rb_fec_ingreso = new javax.swing.JRadioButton();
        txt_num_reg = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_autores = new javax.swing.JTextField();
        txt_editorial = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_num_pag = new javax.swing.JTextField();
        txt_clasificacion = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        txt_fec_ingreso = new javax.swing.JTextField();
        txt_fec_publi = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 100, 194));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ARCHIVO REGIONAL PEQUEÑO.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(42, 183, 215));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("BUSQUEDA DE LIBROS");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_actualizar)
            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

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
        rb_tipo.setText("Por Tipo");
        rb_tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_tipoMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_edicion);
        rb_edicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_edicion.setText("Por Edicion");
        rb_edicion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_edicionMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_num_pag);
        rb_num_pag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_num_pag.setText("Por Número de Páginas");
        rb_num_pag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_num_pagMouseClicked(evt);
            }
        });

        buttonGroup1.add(rb_clasificacion);
        rb_clasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_clasificacion.setText("Por Clasifacación");
        rb_clasificacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rb_clasificacionMouseClicked(evt);
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

        txt_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_autores.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_procedencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_edicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_num_pag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_clasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_fec_ingreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_fec_publi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                        .addComponent(rb_procedencia)
                        .addGap(66, 66, 66)
                        .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(rb_edicion)
                        .addGap(90, 90, 90)
                        .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_fec_publi)
                            .addComponent(rb_fec_ingreso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fec_ingreso)
                            .addComponent(txt_fec_publi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_num_pag)
                            .addComponent(rb_clasificacion)
                            .addComponent(rb_tipo))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_tipo)
                                .addComponent(txt_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_num_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_todo)
                    .addComponent(rb_edicion)
                    .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_num_reg)
                            .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_titulo)
                            .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_autores)
                            .addComponent(txt_autores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_editorial)
                            .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_procedencia)
                            .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_num_pag)
                            .addComponent(txt_num_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_clasificacion)
                            .addComponent(txt_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_tipo)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_fec_ingreso)
                            .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb_fec_publi)
                            .addComponent(txt_fec_publi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_buscar.setBackground(new java.awt.Color(66, 117, 215));
        btn_buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RESULTADOS:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_cerrar_sesion.setBackground(new java.awt.Color(27, 96, 206));
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirrr.png"))); // NOI18N
        btn_cerrar_sesion.setText("IR A MENÚ PRINCIPAL");
        btn_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrar_sesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1052, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void buscar_todo(){
    Statement s;
    try {
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros WHERE num_reg='"+num_reg+"'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros WHERE titulo LIKE '%"+titulo+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros where autores LIKE '%"+autores+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros WHERE editorial LIKE '%"+editorial+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros where procedencia LIKE '%"+procedencia+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    
public void buscar_edicion(){
    Statement s;
    String edicion;
    edicion=this.txt_edicion.getText();
    try {
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros where edicion LIKE '%"+edicion+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        ResultSet rs=s.executeQuery("select * from libros WHERE num_pag='"+num_pag+"'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        ResultSet rs=s.executeQuery("select * from libros where clasificacion LIKE '%"+clasificacion+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}

public void buscar_tipo(){
    Statement s;
    String tipo;
    tipo=this.txt_tipo.getText();
    try {
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros where tipo LIKE '%"+tipo+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros where fec_ingreso LIKE '%"+fec_ing+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("select * from libros where fec_publi LIKE '%"+fec_publi+"%'");
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
        
       while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        

    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        

    }//GEN-LAST:event_tablaMouseClicked

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Està seguro que desea salir?", "¡ALERTA!", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void rb_todoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_todoMouseClicked
        bloquear();
        limpiar();
    }//GEN-LAST:event_rb_todoMouseClicked

    private void rb_num_regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_num_regMouseClicked
        bloquear();
        limpiar();
        this.txt_num_reg.setEnabled(true);
    }//GEN-LAST:event_rb_num_regMouseClicked

    private void rb_tituloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_tituloMouseClicked
        bloquear();
        limpiar();
        this.txt_titulo.setEnabled(true);
    }//GEN-LAST:event_rb_tituloMouseClicked

    private void rb_autoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_autoresMouseClicked
        bloquear();
        limpiar();
        this.txt_autores.setEnabled(true);
    }//GEN-LAST:event_rb_autoresMouseClicked

    private void rb_editorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_editorialMouseClicked
        bloquear();
        limpiar();
        this.txt_editorial.setEnabled(true);
    }//GEN-LAST:event_rb_editorialMouseClicked

    private void rb_procedenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_procedenciaMouseClicked
        bloquear();
        limpiar();
        this.txt_procedencia.setEnabled(true);
    }//GEN-LAST:event_rb_procedenciaMouseClicked

    private void rb_edicionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_edicionMouseClicked
        bloquear();
        limpiar();
        this.txt_edicion.setEnabled(true);
    }//GEN-LAST:event_rb_edicionMouseClicked

    private void rb_num_pagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_num_pagMouseClicked
        bloquear();
        limpiar();
        this.txt_num_pag.setEnabled(true);
    }//GEN-LAST:event_rb_num_pagMouseClicked

    private void rb_clasificacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_clasificacionMouseClicked
        bloquear();
        limpiar();
        this.txt_clasificacion.setEnabled(true);
    }//GEN-LAST:event_rb_clasificacionMouseClicked

    private void rb_tipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_tipoMouseClicked
        bloquear();
        limpiar();
        this.txt_tipo.setEnabled(true);
    }//GEN-LAST:event_rb_tipoMouseClicked

    private void rb_fec_ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fec_ingresoMouseClicked
        bloquear();
        limpiar();
        this.txt_fec_ingreso.setEnabled(true);
    }//GEN-LAST:event_rb_fec_ingresoMouseClicked

    private void rb_fec_publiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rb_fec_publiMouseClicked
        bloquear();
        limpiar();
        this.txt_fec_publi.setEnabled(true);
    }//GEN-LAST:event_rb_fec_publiMouseClicked

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String num_reg,titulo,autores,editorial,procedencia,fec_publi,edicion,num_pag,clasificacion,tipo,fec_ingreso;
        
        String sql;
        
        num_reg=this.txt_num_reg.getText();
        titulo=this.txt_titulo.getText();
        autores=this.txt_autores.getText();
        editorial=this.txt_editorial.getText();
        procedencia=this.txt_procedencia.getText();
        fec_publi=this.txt_fec_publi.getText();
        edicion=this.txt_edicion.getText();
        num_pag=this.txt_num_pag.getText();
        clasificacion=this.txt_clasificacion.getText();
        tipo=this.txt_tipo.getText();
        fec_ingreso=this.txt_fec_ingreso.getText();
        
        
       if(rb_num_reg.isSelected() == true){
            sql="select * from libros where num_reg='"+num_reg+"'";
            try {
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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
            sql="select * from libros where titulo LIKE '%"+titulo+"%'";
            try {
            PreparedStatement pst=reg.prepareStatement(sql);
            ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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
           sql="select * from libros where autores LIKE '%"+autores+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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
           sql="select * from libros WHERE editorial LIKE '%"+editorial+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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
           sql="select * from libros where procedencia LIKE '%"+procedencia+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_procedencia();        
                
            }
            else {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
            }
            
        } catch (SQLException ex){
           Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
        }
       }  
          
      if(rb_edicion.isSelected() == true){
           sql="select * from libros where edicion LIKE '%"+edicion+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
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
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
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
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
                    this.buscar_clasificacion();        
                
            }
            else {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO UN LIBRO CON ESAS CARACTERISTICAS");
            }
            
        } catch (SQLException ex){
           Logger.getLogger(BuscarLibro.class.getName()).log(Level.SEVERE,null,ex);
        }
       }  
      
      if(rb_tipo.isSelected() == true){
           sql="select * from libros where tipo LIKE '%"+tipo+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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
           sql="select * from libros where fec_ingreso LIKE '%"+fec_ingreso+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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
           sql="select * from libros where fec_publi LIKE '%"+fec_publi+"%'";
         try {
           PreparedStatement pst=reg.prepareStatement(sql);
           ResultSet rs=pst.executeQuery(sql);
            rs.next();
            
            int n=rs.getRow();
            if(n>0) {
                 JOptionPane.showMessageDialog(null,"LIBRO(S) ENCONTRADO(S)");
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

    private void rb_tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_tituloActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_rb_tituloActionPerformed

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
                BuscarLibro dialog = new BuscarLibro(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cerrar_sesion;
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
    private javax.swing.JRadioButton rb_clasificacion;
    private javax.swing.JRadioButton rb_edicion;
    private javax.swing.JRadioButton rb_editorial;
    private javax.swing.JRadioButton rb_fec_ingreso;
    private javax.swing.JRadioButton rb_fec_publi;
    private javax.swing.JRadioButton rb_num_pag;
    private javax.swing.JRadioButton rb_num_reg;
    private javax.swing.JRadioButton rb_procedencia;
    private javax.swing.JRadioButton rb_tipo;
    private javax.swing.JRadioButton rb_titulo;
    private javax.swing.JRadioButton rb_todo;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_autores;
    private javax.swing.JTextField txt_clasificacion;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_fec_ingreso;
    private javax.swing.JTextField txt_fec_publi;
    private javax.swing.JTextField txt_num_pag;
    private javax.swing.JTextField txt_num_reg;
    private javax.swing.JTextField txt_procedencia;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
