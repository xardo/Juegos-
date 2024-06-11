package paquete1;

public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(123, 3.5f, "Andres", "Ruiz", 29);
        
        estudiante.mostrarDatos();
        System.out.println("");
    }
}