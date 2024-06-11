package paquete1;

public class Material {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    
    public Material(String titulo, String autor, int anoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getAnoPublicacion(){ // Corregido el tipo de retorno a int
        return anoPublicacion;
    }
    
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anoPublicacion);
    }
}

