package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    //Se crea un objeto Connection del paquete SQL
    private static Connection conexion = null;

    /*
    Se crea un metodo para realizar la conexion de la base de datos 
    con nuestro programa
     */
    public static Connection getConexion() {
        //madamos a llamar a la base de datos
        String url = "jdbc:sqlserver://DESKTOP-2TF89UP:1433;databaseName=EmpresaRonald;user=sa;password=10";

        //mandamos a llamar el driver de conexion de SQL SERVER
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion..revisar el Driver\n Error: "
                    + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }

        try {
            conexion = DriverManager.getConnection(url);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),
                    "Error de Conexion", JOptionPane.ERROR_MESSAGE);
        }

        return conexion;

    }

    /*
    Este metodo es el que nos permitira realizar las consultas 
    a la Base de datos
     */
    public static ResultSet consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;

        try {

            declara = con.createStatement();
            ResultSet resultado = declara.executeQuery(consulta);
            return resultado;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),
                    "Error de consulta", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }
}
