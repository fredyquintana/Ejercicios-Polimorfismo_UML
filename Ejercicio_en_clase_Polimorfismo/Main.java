package Ejercicio_en_clase_Polimorfismo;

import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
      ArrayList<Trabajador> trabajadores = new ArrayList<>();
      
      trabajadores.add(new Obrero("Obrero 1: Juan Cruz Rivas", 1000));
      trabajadores.add(new Obrero("Obrero 2: Pedro Cruz Cruz", 1100));
      trabajadores.add(new Obrero("Obrero 3: Pablo Antonio Cruz", 1200));
      
      trabajadores.add(new Supervisor("Supervisor 1: Joel Cruz Cruz ", 4500));
      trabajadores.add(new Supervisor("Supervisor 2: Daniel Roche Vega", 4600));
      trabajadores.add(new Supervisor("Supervisor 3: Marcos Zabala Paz", 4700));
      
      trabajadores.add(new Gerente("Gerente 1: Juan Fernando Pérez", 5000));
      trabajadores.add(new Gerente("Gerente 2: Óscar de la Renta", 5400));
      trabajadores.add(new Gerente("Gerente 3: Efraín Mejía Cruz", 5800));
      System.out.println("------------------------------------------------------------------------");
      System.out.println("Nombre\t\t\t\t\t\t\t\tSalario");
      System.out.println("------------------------------------------------------------------------");
      for (Trabajador trabajador : trabajadores) {
          System.out.println(trabajador.getNombre() + "\t\t\t\t\t" + trabajador.calcularSueldo());
        }
    }
}