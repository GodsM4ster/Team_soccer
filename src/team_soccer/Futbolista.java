
package team_soccer;

public class Futbolista {
    String nombre;
    String apellido;
    String dni;
    String posicion;
    double valor;

    public Futbolista(String nombre, String apellido, String dni, String posicion, double valor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.posicion = posicion;
        this.valor = valor;
    }

   
    //si vamos a source luego insert code, despues a getter nos mostrara los metodos get de nuestra clase
    public String getNombre(){
        return nombre;
    }    

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getValor() {
        return valor;
    }
    
    //de misma manera podemos llamar los modificadores de nuestra clase en source
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double multip_dos(){
        return valor * 2;
    }
}
