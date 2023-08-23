package Ejercicio_Paleteria;

public class Paleta {
    private String sabor;
    private double precio;

    public Paleta(String sabor, double precio) {
        this.sabor = sabor;
        this.precio = precio;
    }

    public String getSabor() {
        return sabor;
    }

    public double getPrecio() {
        return precio;
    }

    public void cambiarPrecio(double cantidad) {
        precio += cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Sabor: " + sabor);
        System.out.println("Precio: $" + precio);
    }
}

// Subclass PaletteWater
class PaletaAgua extends Paleta {
    private boolean baseAgua;

    public PaletaAgua(String sabor, double precio, boolean baseAgua) {
        super(sabor, precio);
        this.baseAgua = baseAgua;
    }

    public void mostrarBaseAgua() {
        System.out.println("Water base: " + (baseAgua ? "Yes" : "Not"));
    }
}

// Subclass PaletteCream
class PaletaCrema extends Paleta {
    private boolean cremosa;

    public PaletaCrema(String sabor, double precio, boolean cremosa) {
        super(sabor, precio);
        this.cremosa = cremosa;
    }

    public void mostrarTexturaCremosa() {
        System.out.println("Creamy texture: " + (cremosa ? "Yes" : "Not"));
    }
}
