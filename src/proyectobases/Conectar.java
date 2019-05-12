
package proyectobases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conectar {
    
    private Connection conn = null;
    private String puerto;
    private String Basededatos;
    private String usuario;
    private String contrasena;

    public Conectar(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/bdvariedadesjys", usuario, contrasena);
            if(getConnection()!=null){
                System.out.println("conectado");
              }else{
                JOptionPane.showMessageDialog(null, "No conectado","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch (ClassNotFoundException ex) {
              
            System.out.println("No existe la clase");
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"La conexion no se pudo establecer");
        }
    }
    
    public Conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection)DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/bdvariedadesjys", "root", "usbw");
            if(getConnection()!=null){
                
                    }
        }catch (ClassNotFoundException ex) {
              
            System.out.println("No existe la clase");
        }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null,"La conexion no se pudo establecer");
        }
    }
    public Connection getConnection(){
        return conn;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getBasededatos() {
        return Basededatos;
    }

    public void setBasededatos(String Basededatos) {
        this.Basededatos = Basededatos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
