package paquete1;

public class Periodico extends Material {
    private String fecha;
    
    public Periodico(String titulo, String autor, int anoPublicacion, String fecha) {
        super(titulo, autor, anoPublicacion);
        this.fecha = fecha;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void mostrarInformacion() { // Corregido el nombre del método mostrarInformacion
        super.mostrarInformacion();
        System.out.println("Fecha: " + fecha); // Corregido el método println (había un error de escritura)
    }
}
