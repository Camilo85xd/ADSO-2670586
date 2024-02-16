package principal;

public class Principal {
    public static void main(String[] args) {
        
        
        BaseDatos basedatos = new BaseDatos();
        Persona listado[] = basedatos.extraerPersonas();
        
        for(int i = 0; i<listado.length &&  listado[i]!=null; i++){
        
            System.out.println("->" + listado[i].getNombres()+ " " + listado[i].getApellidos() + " " + listado[i].getCorreo());
            
        }
        
        
        String cedula = "654656";
        String nombres = "Paco";
        String apellidos = "Rabanexd";
        String telefono = "51463546";
        String direccion = "Enrique Segoviano";
        String correo = "chespirito@gmail.com";
              
        
        boolean respuesta = basedatos.insertarPersona(cedula, nombres, apellidos, telefono, direccion, correo);
        System.out.println(respuesta);
        
    }    
}
