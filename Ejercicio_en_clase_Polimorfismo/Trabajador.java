package Ejercicio_en_clase_Polimorfismo;

public class Trabajador {
    private String nombre;
    private double salarioBase;
    public Trabajador(String nombre, double salarioBase) {
      this.nombre = nombre;
      this.salarioBase = salarioBase;
    }
    public double calcularSueldo() {
      return salarioBase;
    }
    
    public String getNombre() {
      return nombre;
    }
}

class Obrero extends Trabajador {
    public Obrero(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
   
    
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() * 1.1;
    }
}

class Supervisor extends Trabajador {
    public Supervisor(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() * 1.2;
    }
}

class Gerente extends Trabajador {
    public Gerente(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() * 1.3;
    }
}
