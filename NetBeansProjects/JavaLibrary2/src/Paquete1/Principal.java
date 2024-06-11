package Paquete1;

public class Principal {
    public static void main(String[]args){
        Persona persona = new Persona();
        Perro perro = new Perro();
        Vaca vaca = new Vaca();
        
        persona.comer();
        perro.comer();
        vaca.comer();
    }
}
