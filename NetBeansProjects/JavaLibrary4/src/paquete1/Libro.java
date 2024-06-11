package paquete1;

public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private String genero;
    private int numeroEdicion;
    
    public Libro(String titulo, String autor, int anoPublicacion, String genero, int numeroEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.genero = genero;
        this.numeroEdicion = numeroEdicion;
    }
    
    public int getNumeroEdicion(){
        return numeroEdicion;
    }
    
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anoPublicacion);
        System.out.println("Genero: " + genero);
        System.out.println("Numero de Edicion: " + numeroEdicion);
    }
}

