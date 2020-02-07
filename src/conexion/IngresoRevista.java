package conexion;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class IngresoRevista extends javax.swing.JDialog {
    
 conectar con=new conectar();
    Connection reg=con.conexion();
    conexion conn = new conexion();
   
    public IngresoRevista(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.refresh();
         bloquear();
         contador();
        
    }

     void desbloquear(){
        this.txt_director.setEnabled(true);
        this.txt_fec_pub.setEnabled(true);
        this.txt_edicion.setEnabled(true);
        this.txt_fec_ing.setEnabled(true);
        this.txt_cantidad.setEnabled(true);
        this.txt_editor.setEnabled(true);
        this.txt_contenido.setEnabled(true);
        this.txt_tipo.setEnabled(true);
        this.txt_editorial.setEnabled(true);
        this.txt_num_reg.setEnabled(true);
        this.txt_observacion.setEnabled(true);
        this.txt_procedencia.setEnabled(true);
        this.txt_costo.setEnabled(true);
        this.txt_nombre.setEnabled(true);
        this.txt_num_pag.setEnabled(true);

        this.btn_guardar.setEnabled(true);
        btn_nuevo.setEnabled(false);
        btn_cancelar.setEnabled(true);
        
    }
void bloquear(){
    this.txt_director.setEnabled(false);
    this.txt_fec_pub.setEnabled(false);
    this.txt_edicion.setEnabled(false);
    this.txt_fec_ing.setEnabled(false);
    this.txt_cantidad.setEnabled(false);
    this.txt_editor.setEnabled(false);
    this.txt_contenido.setEnabled(false);
    this.txt_tipo.setEnabled(false);
    this.txt_editorial.setEnabled(false);
    this.txt_num_reg.setEnabled(false);
    this.txt_observacion.setEnabled(false);
    this.txt_procedencia.setEnabled(false);
    this.txt_costo.setEnabled(false);
    this.txt_nombre.setEnabled(false);
    this.txt_num_pag.setEnabled(false);
    
    
    this.btn_guardar.setEnabled(false);
    this.btn_cancelar.setEnabled(false);
    
    
    
}
public void limpiar(){
          this.txt_director.setText("");
          this.txt_fec_pub.setText("");
          this.txt_edicion.setText("");
          this.txt_contenido.setText("");
          this.txt_tipo.setText("");
          this.txt_fec_ing.setText("");
          this.txt_cantidad.setText("");
          this.txt_editor.setText("");
          
          this.txt_editorial.setText("");
          this.txt_num_reg.setText("");
          this.txt_observacion.setText("");
          this.txt_procedencia.setText("");
          this.txt_costo.setText("");
          this.txt_nombre.setText("");
          this.txt_num_pag.setText("");
          
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
        s=con.conexion().createStatement();
        ResultSet rs=s.executeQuery("SELECT * FROM revistas ORDER BY num_reg ASC");
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
        
        
        
        while (rs.next()){
            Object[] fila=new Object[13];
            for(int i=0;i<13;i++)
                fila[i]=rs.getObject(i+1);
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }catch (SQLException ex){
        Logger.getLogger(IngresoRevista.class.getName()).log(Level.SEVERE,null,ex);
    }
}
public void contador(){
    String  sql = "SELECT count(num_reg) FROM revistas";
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
            Logger.getLogger(IngresoRevista.class.getName()).log(Level.SEVERE,null,e);
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
        txt_nombre = new javax.swing.JTextField();
        txt_director = new javax.swing.JTextField();
        txt_editor = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_editorial = new javax.swing.JTextField();
        txt_observacion = new javax.swing.JTextField();
        txt_fec_pub = new javax.swing.JTextField();
        txt_fec_ing = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        txt_costo = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_num_pag = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_contenido = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lbl_cantidad = new javax.swing.JLabel();
        btn_cerrar_sesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(48, 179, 201));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMaximumSize(new java.awt.Dimension(1355, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 730));

        jPanel2.setBackground(new java.awt.Color(0, 78, 208));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ARCHIVO REGIONAL PEQUEÑO.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INGRESO DE NUEVA REVISTA");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DETALES DE LA REVISTA:"));
        jPanel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Número de Registro:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Director:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha de Ingreso:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Procedencia:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Editor:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Edicion:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Editorial");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Fecha de Publicación:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Costo:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cantidad:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Observaciones:");

        txt_num_reg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_num_reg.setAutoscrolls(false);

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.setAutoscrolls(false);

        txt_director.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_director.setAutoscrolls(false);

        txt_editor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_editor.setAutoscrolls(false);

        txt_edicion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_edicion.setAutoscrolls(false);

        txt_editorial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_editorial.setAutoscrolls(false);

        txt_observacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_observacion.setAutoscrolls(false);

        txt_fec_pub.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fec_pub.setAutoscrolls(false);

        txt_fec_ing.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_fec_ing.setAutoscrolls(false);

        txt_procedencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_procedencia.setAutoscrolls(false);

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_costo.setAutoscrolls(false);

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cantidad.setAutoscrolls(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Numero de Páginas:");

        txt_num_pag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_num_pag.setAutoscrolls(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Contenido");

        txt_contenido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_contenido.setAutoscrolls(false);
        txt_contenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contenidoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Tipo:");

        txt_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tipo.setAutoscrolls(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel16))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_director, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel17))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_editor, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_fec_ing, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_fec_pub, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(82, 82, 82)
                                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txt_num_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(55, 55, 55)
                        .addComponent(txt_observacion)))
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_num_reg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_editor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(txt_num_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_fec_pub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_fec_ing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_procedencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("OPCIONES:"));

        btn_nuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_nuevo.setText("NUEVO");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "CANTIDAD TOTAL DE REVISTAS"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(lbl_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_cantidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        btn_cerrar_sesion.setBackground(new java.awt.Color(27, 96, 206));
        btn_cerrar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salirrr.png"))); // NOI18N
        btn_cerrar_sesion.setText("IR A MENÚ DE REVISTAS");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(387, 387, 387)
                                .addComponent(jLabel1)))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cerrar_sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1363, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btn_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrar_sesionActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea regresar al menú de revistas?", "¡ALERTA!", JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            dispose();
        }
    }//GEN-LAST:event_btn_cerrar_sesionActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiar();
        //habilitar();
        desbloquear();
        
        
        
        String  sql1 = "SELECT count(num_reg) FROM revistas";
        try {
            conn.conectar();
            ResultSet rs = conn.consulta(sql1);
            rs.next();
            int cant = rs.getInt(1);
            //int new_number = num_reg +1;
            //this.lbl_cantidad.setText(""+cant);
            
            if(cant==0){
                this.txt_num_reg.setText("1"); 
                this.txt_nombre.requestFocus();
                this.txt_num_reg.setEditable(true);
            } else {
                 String  sql = "SELECT num_reg FROM revistas ORDER BY num_reg DESC LIMIT 1";
                try {                        
                             ResultSet re = conn.consulta(sql);
                             re.next();
                             int num_reg = re.getInt(1);
                             int new_number = num_reg +1;
                             this.txt_num_reg.setText(""+new_number);
                             this.txt_nombre.requestFocus();
                             this.txt_num_reg.setEditable(true);

                    } catch (Exception e){
                        Logger.getLogger(IngresoRevista.class.getName()).log(Level.SEVERE,null,e);
                    }
                
               
            }

        } catch (Exception e) {
           Logger.getLogger(IngresoRevista.class.getName()).log(Level.SEVERE,null,e);
        }
        
       
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        this.bloquear();

        this.btn_nuevo.setEnabled(true);

        String num_reg,nombre,contenido,director,editor,tipo,editorial,edicion,fec_publi,fec_ingr,procedencia,num_pag,costo,cantidad,obser;
        String sql;

        num_reg=this.txt_num_reg.getText();
        nombre=this.txt_nombre.getText().toUpperCase();
        contenido=this.txt_contenido.getText().toUpperCase();
        director=this.txt_director.getText().toUpperCase();
        editor=this.txt_editor.getText().toUpperCase();
        tipo=this.txt_tipo.getText().toUpperCase();
        editorial=this.txt_editorial.getText().toUpperCase();
        fec_publi=this.txt_fec_pub.getText().toUpperCase();
        fec_ingr=this.txt_fec_ing.getText();
        procedencia=this.txt_procedencia.getText().toUpperCase();
        num_pag=this.txt_num_pag.getText().toUpperCase();
        costo=this.txt_costo.getText().toUpperCase();
        cantidad=this.txt_cantidad.getText().toUpperCase();
        obser=this.txt_observacion.getText().toUpperCase();
        edicion=this.txt_edicion.getText().toUpperCase();
        sql="INSERT INTO revistas (num_reg,nombre,contenido,director,editor,tipo,editorial,edicion,fec_publi,fec_ingreso,"
        + "procedencia,num_pag,costo,cantidad,observaciones,fing_sis) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now())";
        try {
            PreparedStatement pst=reg.prepareStatement(sql);

            pst.setString(1,num_reg);
            pst.setString(2,nombre);
            pst.setString(3,contenido);
            pst.setString(4,director);
            pst.setString(5,editor);
            pst.setString(6,tipo);
            pst.setString(7,editorial);
            pst.setString(8,edicion);
            pst.setString(9,fec_publi);
            pst.setString(10,fec_ingr);
            pst.setString(11,procedencia);
            pst.setString(12,num_pag);
            pst.setString(13,costo);
            pst.setString(14,cantidad);
            pst.setString(15,obser);
            

            int n=pst.executeUpdate();
            if (n>0) {
                JOptionPane.showMessageDialog(null,"REGISTRADO CON EXITO");
                refresh();
                limpiar();
                contador();
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngresoRevista.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        bloquear();
        this.limpiar();
        this.btn_nuevo.setEnabled(true);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void txt_contenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contenidoActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoRevista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IngresoRevista dialog = new IngresoRevista(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_cerrar_sesion;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel lbl_cantidad;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_contenido;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_director;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editor;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_fec_ing;
    private javax.swing.JTextField txt_fec_pub;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_num_pag;
    private javax.swing.JTextField txt_num_reg;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_procedencia;
    private javax.swing.JTextField txt_tipo;
    // End of variables declaration//GEN-END:variables
}
