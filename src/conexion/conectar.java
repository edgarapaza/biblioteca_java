package conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class conectar {
 Connection con=null;
    public  Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/biblioteca","root","admin");
            System.out.println("conexion establecida");
            //JOptionPane.showMessageDialog(null,"conexion establecida");
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("error de conexion");
            JOptionPane.showMessageDialog(null,"error de conexion "+e);
        }
       return con;
    }        
}
