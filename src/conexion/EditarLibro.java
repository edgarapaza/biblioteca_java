
package conexion;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarLibro extends javax.swing.JDialog {

    conexion conn = new conexion();
    
    public EditarLibro(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
         //this.setLocation(150,15 );
         this.refresh();
         bloquear();
         contador();
      
        
    }
    public void contador(){
    String  sql = "SELECT count(num_reg) FROM libros";
        try {
            conn.conectar();
            ResultSet rs = conn.consulta(sql);
            rs.next();
            int num_reg = rs.getInt(1);
            //int new_number = num_reg +1;
            this.lbl_cantidad.setText(""+num_reg);
            //this.txt_titulo.requestFocus();
            //this.txt_num_reg.setEditable(false);

        } catch (Exception e) {
            Logger.getLogger(IngresoLibro.class.getName()).log(Level.SEVERE,null,e);
        }
}
 void desbloquear(){
        this.txt_autor.setEnabled(true);
        this.txt_clasificacion.setEnabled(true);
        this.txt_edicion.setEnabled(true);
        this.txt_editorial.setEnabled(true);
        this.txt_fec_ingreso.setEnabled(true);
        this.txt_fec_pub.setEnabled(true);
        
        this.txt_num_pag.setEnabled(true);
        this.txt_num_reg.setEnabled(true);
        this.txt_observacion.setEnabled(true);
        this.txt_procedencia.setEnabled(true);
        this.txt_tipo.setEnabled(true);
        this.txt_titulo.setEnabled(true);

        
        btn_actualizar.setEnabled(true);
        btn_cancelar.setEnabled(true);
        
    }
void bloquear(){
    this.txt_autor.setEnabled(false);
    this.txt_clasificacion.setEnabled(false);
    this.txt_edicion.setEnabled(false);
    this.txt_editorial.setEnabled(false);
    this.txt_fec_ingreso.setEnabled(false);
    this.txt_fec_pub.setEnabled(false);
    
    this.txt_num_pag.setEnabled(false);
    this.txt_num_reg.setEnabled(false);
    this.txt_observacion.setEnabled(false);
    this.txt_procedencia.setEnabled(false);
    this.txt_tipo.setEnabled(false);
    this.txt_titulo.setEnabled(false);
    
    this.btn_actualizar.setEnabled(false);
    this.btn_cancelar.setEnabled(false);
    
    
    
}
public void limpiar(){
          this.txt_autor.setText("");
          this.txt_clasificacion.setText("");
          this.txt_edicion.setText("");
          
          this.txt_editorial.setText("");
          this.txt_fec_ingreso.setText("");
          this.txt_fec_pub.setText("");
          
          this.txt_num_pag.setText("");
          this.txt_num_reg.setText("");
          this.txt_observacion.setText("");
          this.txt_procedencia.setText("");
          this.txt_tipo.setText("");
          this.txt_titulo.setText("");
          
      }
     // public void habilitar(){
       //   txt_nombre.setEditable(true);
         // txt_serie.setEditable(true);
          //txt_precio.setEditable(true);
          //cb_categoria.setEditable(true);
          
     // }

      public void refresh(){
    Statement s;
    try {
        conn.conectar();
        ResultSet rs=conn.consulta("select * from libros ORDER BY num_reg asc");
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
        
        
        while (rs.next()){
            Object[] fila=new Object[12];
            for(int i=0;i<12;i++)
                fila[i]=rs.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(EditarLibro.class.getName()).log(Level.SEVERE,null,ex);
    }
}
   public Image getIconImage(){
        Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("icono/libros.png"));
        return retValue; 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_num_reg = new javax.swing.JTextField();
        txt_titulo = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_fec_pub = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_num_pag = new javax.swing.JTextField();
        txt_observacion = new javax.swing.JTextField();
        txt_clasificacion = new javax.swing.JTextField();
        txt_editorial = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        txt_fec_ingreso = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        lbl_cantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACTUALIZAR LIBROS");
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(48, 179, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1355, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 720));

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
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ACTUALIZAR LIBRO");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DETALES DEL LIBRO:"));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Número de Registro:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Título:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Autores:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Editorial:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Procedencia:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fecha de Publicación:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Edicion:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Número de Páginas:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Clasificación:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Costo:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Fecha de Ingreso:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Observaciones:");

        txt_num_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_num_reg.setAutoscrolls(false);

        txt_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_titulo.setAutoscrolls(false);

        txt_autor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_autor.setAutoscrolls(false);

        txt_fec_pub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fec_pub.setAutoscrolls(false);

        txt_edicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_edicion.setAutoscrolls(false);

        txt_num_pag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_num_pag.setAutoscrolls(false);

        txt_observacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_observacion.setAutoscrolls(false);

        txt_clasificacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_clasificacion.setAutoscrolls(false);

        txt_editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_editorial.setAutoscrolls(false);

        txt_procedencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_procedencia.setAutoscrolls(false);

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tipo.setAutoscrolls(false);

        txt_fec_ingreso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fec_ingreso.setAutoscrolls(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_edicion, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(txt_fec_pub)
                            .addComponent(txt_num_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_observacion))))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(23, 23, 23)
                        .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(87, 87, 87)
                        .addComponent(txt_editorial, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(57, 57, 57)
                        .addComponent(txt_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_procedencia, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txt_tipo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_clasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addComponent(txt_procedencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fec_pub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(txt_edicion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_fec_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_num_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(txt_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES:"));

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CANTIDAD TOTAL DE LIBROS"));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1331, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea regresar al menú de libros?", "¡ALERTA!", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        bloquear();
        this.limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        try{
            /*
            String sql="UPDATE libros SET titulo=?,autores=?,editorial=?,procedencia=?,fec_publi=?,edicion=?,"
            + "num_pag=?,clasificacion=?,tipo=?,fec_ingreso=?,observaciones=?,fing_sis=now() WHERE num_reg=? limit 1";

            int fila=tabla.getSelectedRow();
            int dao=(int)tabla.getValueAt(fila,0);
            
            PreparedStatement ps = conn.conectar().prepareStatement(sql);
            res.next();
            esc=Integer.parseInt(res.getString(1));

            //ps.setString(1, this.txt_num_reg.getText());
            ps.setString(1, this.txt_titulo.getText());
            ps.setString(2, this.txt_autor.getText());
            ps.setString(3, this.txt_editorial.getText());
            ps.setString(4, this.txt_procedencia.getText());
            ps.setString(5, this.txt_fec_pub.getText());
            ps.setString(6, this.txt_edicion.getText());
            ps.setString(7, this.txt_num_pag.getText());
            ps.setString(8, this.txt_clasificacion.getText());
            ps.setString(9, this.txt_tipo.getText());
            ps.setString(10, this.txt_fec_ingreso.getText());
            ps.setString(11, this.txt_observacion.getText());

            ps.setInt(12, dao);
            int n=ps.executeUpdate();
            if(n>0){
                limpiar();
                refresh();
                JOptionPane.showMessageDialog(null, "LIBRO ACTUALIZADO !!");
            }
            */
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR: "+e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        desbloquear();
        //this.btn_actualizar.setEnabled(true);
        this.txt_num_reg.setEditable(false);
        if( evt.getButton()==1){
            int fila=tabla.getSelectedRow();
            Statement s;
            try{
                String sql="select * from libros where num_reg="+tabla.getValueAt(fila,0);
                conn.conectar();
                ResultSet rs=conn.consulta(sql);
                rs.next();
                this.txt_autor.setText(rs.getString("autores"));
                this.txt_clasificacion.setText(rs.getString("clasificacion"));
                this.txt_edicion.setText(rs.getString("edicion"));
                this.txt_editorial.setText(rs.getString("editorial"));

                this.txt_fec_ingreso.setText(rs.getString("fec_ingreso"));
                this.txt_fec_pub.setText(rs.getString("fec_publi"));

                this.txt_num_pag.setText(rs.getString("num_pag"));
                this.txt_num_reg.setText(rs.getString("num_reg"));
                this.txt_observacion.setText(rs.getString("observaciones"));
                this.txt_procedencia.setText(rs.getString("procedencia"));
                this.txt_tipo.setText(rs.getString("tipo"));
                this.txt_titulo.setText(rs.getString("titulo"));

            }catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

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
            java.util.logging.Logger.getLogger(EditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarLibro dialog = new EditarLibro(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_clasificacion;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_fec_ingreso;
    private javax.swing.JTextField txt_fec_pub;
    private javax.swing.JTextField txt_num_pag;
    private javax.swing.JTextField txt_num_reg;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_procedencia;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
