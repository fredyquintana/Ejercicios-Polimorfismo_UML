package Ejercicio_Personaje;

public class Main {
    public static void main(String[] args) {
        // Create Player and Enemy instances
        Jugador jugador1 = new Jugador("Aragorn", 10, "Guerrero");
        Enemigo enemigo1 = new Enemigo("Gorgo", 8, "Orco");

        // Call the methods as appropriate
        jugador1.atacar();
        jugador1.usarHabilidadEspecial();

        enemigo1.atacar();
        enemigo1.gritar();
    }
}
