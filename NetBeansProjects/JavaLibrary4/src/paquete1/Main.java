package paquete1;

public class Main {
    public static void main(String[] args) { 
        Libro libro = new Libro("1984", "George Orwell", 1949, "Distopia", 1); 
        Revista revista = new Revista("National Geographic", "Varios autores", 2021, 1); 
        Periodico periodico = new Periodico("The New York Times", "Varios autores", 2023, "28 de mayo"); 
    
        System.out.println("Información del Libro"); 
        libro.mostrarInformacion();
        
        System.out.println("\nInformación del Revista"); 
        revista.mostrarInformacion();
        
        System.out.println("\nInformación del Periódico"); 
        periodico.mostrarInformacion();
    }
}
