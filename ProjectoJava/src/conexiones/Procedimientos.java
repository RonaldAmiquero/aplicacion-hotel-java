
package conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    public static void entradaProveedores(String nombreProv, int telefono,String direccion, String correoProv) throws SQLException{
        CallableStatement entrada= Conexion.getConexion().prepareCall("{call EntradaProveedores(?,?,?,?)}");//llama al procedimiento almacenado
        entrada.setString(1, nombreProv);
        entrada.setInt(2, telefono);
        entrada.setString(3, direccion);
        entrada.setString(4, correoProv);
        entrada.execute();
                
    }
    public static void eliminarProveedor(int id) throws SQLException{
        CallableStatement entrada= Conexion.getConexion().prepareCall("{call EliminarProveedor(?)}");//llama al procedimiento almacenado
        entrada.setInt(1, id);
        entrada.execute();
    }
    public static void actualizarProveedor(int idProv,String nombreProv, int telefono,String direccion, String correoProv)throws SQLException{
        CallableStatement entrada= Conexion.getConexion().prepareCall("{call ActualizarProveedor(?,?,?,?,?)}");//llama al procedimiento almacenado
        entrada.setInt(1, idProv);
        entrada.setString(2, nombreProv);
        entrada.setInt(3, telefono);
        entrada.setString(4, direccion);
        entrada.setString(5, correoProv);
        entrada.execute();
    }
    public static void buscarTodo(String idProv,String nombreProv, String telefono,String direccion, String correoProv)throws SQLException{
        CallableStatement entrada= Conexion.getConexion().prepareCall("{call BuscarTodo(?,?,?,?,?)}");//llama al procedimiento almacenado
        entrada.setString(1, idProv);
        entrada.setString(2, nombreProv);
        entrada.setString(3, telefono);
        entrada.setString(4, direccion);
        entrada.setString(5, correoProv);
        entrada.execute();
    }

}
