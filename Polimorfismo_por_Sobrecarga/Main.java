public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Sum of integers: " + 
        calculadora.sumar(5, 10));
        System.out.println("Sum of three integers: " + 
        calculadora.sumar(5, 10, 15));
        System.out.println("Addition of floating point numbers:" 
        +  calculadora.sumar(3.5, 2.7));
    }
}