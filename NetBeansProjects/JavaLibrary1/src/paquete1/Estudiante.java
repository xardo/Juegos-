package paquete1;

public class Estudiante extends Persona{
    public int codigoestudiante;
    public float notaFinal;
    
   public Estudiante(int codigoestudiante, float notaFinal, String nombre,String apellido, int edad){
       super(nombre, apellido, edad);
       
       this.codigoestudiante = codigoestudiante;
       this.notaFinal = notaFinal;
   }
   public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + "\nApellido: " + getApellido() + "\nEdad: " + getEdad () +
       "\nCodigo del estudiante: " + codigoestudiante + "\nNota final: " + notaFinal);
    }
}
