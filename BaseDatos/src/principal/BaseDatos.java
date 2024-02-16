package principal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDatos {
    Persona listaPersonas[];
    Connection conexion;
    Statement manipularDB;
    public BaseDatos(){
        
         

        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "app_java";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;

        
        try {
            
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("conexion exitosa pa");
        } catch (SQLException ex) {
            
            System.out.println("Mensaje de error: " + ex.getMessage());
	    conexion = null;
	    manipularDB = null;
            
        }
        
        
       
        
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM personas";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
                
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("nombres"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}
    }
    
    public Persona[] extraerPersonas(){
         
            
        
            
        try {
            Persona arreglo [] = new Persona[100];
            String consulta = "SELECT * FROM personas" ;
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            if(registros.getRow()==1){
                int i = 0;
                
                do{
                    
                    String documento = registros.getString("cedula");
                    String nombres = registros.getString("nombres");
                    String apellidos = registros.getString("apellidos");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("email");
                    
                    arreglo[i] = new Persona(documento, nombres, apellidos, telefono, correo);
                    
                    i++;
                }while(registros.next());
                
                return arreglo;
            }else{
            
                return arreglo;
                
            }
        }catch (SQLException ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
            
        }
    }
    
    public boolean insertarPersona(String cedula, String nombres, String apellidos, String telefono,String direccion, String correo){
    
    
    boolean respuesta = false;
    try {
        String cedular = cedula;
        String nombresr = nombres;
        String apellidosr = apellidos;
        String direccionr = direccion;
        String telefonor = telefono;
        String emailr = correo;
        
        String consulta = "INSERT INTO personas (cedula, nombres, apellidos, direccion, telefono, email) VALUES ('"+cedular+"','"+nombresr+"','"+apellidosr+"','"+direccionr+"','"+telefonor+"','"+emailr+"')";
        int resp_consulta = manipularDB.executeUpdate(consulta);
        if (resp_consulta==1) {
            
            respuesta = true;
        }
    } catch (SQLException ex) {
        System.out.println("--> Error Insert: " + ex.getMessage());
    }
    if (respuesta){
        System.out.println("Insertado con exito");
    }else{
        System.out.println("No se pudo insertar");
    }
        
    return respuesta;
    
    }
}