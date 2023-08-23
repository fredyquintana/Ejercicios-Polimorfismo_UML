package Ejercicio_Paleteria;

public class Main {
    public static void main(String[] args) {
        PaletaAgua paletaAgua = new PaletaAgua("Strawberry", 10.0, true);
        paletaAgua.mostrarInformacion();
        paletaAgua.mostrarBaseAgua();
        paletaAgua.cambiarPrecio(2.0); // Change of price
        paletaAgua.mostrarInformacion();
        
        System.out.println();
        
        PaletaCrema paletaCrema = new PaletaCrema("Vainilla", 20.0, true);
        paletaCrema.mostrarInformacion();
        paletaCrema.mostrarTexturaCremosa();
        paletaCrema.cambiarPrecio(6.0); // Change of price
        paletaCrema.mostrarInformacion();
    }
}