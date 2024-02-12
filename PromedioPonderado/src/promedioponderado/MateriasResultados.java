
package promedioponderado;


public class MateriasResultados {
    
    String nombreMateria;
    int Credito;
    int Notas;

    public MateriasResultados(String nombreMateria,int Credito, int Notas) {
        this.nombreMateria = nombreMateria;
        this.Credito = Credito;
        this.Notas = Notas;
        
    }

    public String getNombreMateria() {
        return nombreMateria;
    }
    
    public int getCredito() {
        return Credito;
    }

    public int getNotas() {
        return Notas;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }


    public void setCredito(int Credito) {
        this.Credito = Credito;
    }
    
    public void setNotas(int Notas) {
        this.Notas = Notas;
    }
    
    
    
}
