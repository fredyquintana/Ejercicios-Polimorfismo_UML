public class Main {
    public static void main(String[] args) {
        //Use of polymorphism and area table:
        FiguraGeometrica[] figuras = new FiguraGeometrica[3];

        figuras[0] = new Circulo("Circle", 7.0);
        figuras[1] = new Rectangulo("Rectangle", 9.0, 5.0);
        figuras[2] = new Triangulo("Triangle", 7.0, 8.0);

        System.out.println("Table of areas of Geometric Figures:");
        System.out.println("--------------------------------------------------");
        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.nombre + ": " + figura.calcularArea());
        }
    }
}