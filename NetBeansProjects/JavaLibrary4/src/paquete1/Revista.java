package paquete1;

public class Revista extends Material {
    private int numeroEdicion;
    
    public Revista(String titulo, String autor, int anoPublicacion, int numeroEdicion) {
        super(titulo, autor, anoPublicacion);
        this.numeroEdicion = numeroEdicion;
    }
    
    public int getNumeroEdicion() {
        return numeroEdicion;
    }
    
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de Edición: " + numeroEdicion); // Se agregó un punto y coma al final
    }
}
