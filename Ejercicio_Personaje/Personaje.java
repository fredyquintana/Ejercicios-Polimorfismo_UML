package Ejercicio_Personaje;

// Base class Character
class Personaje {
    protected String nombre;
    protected int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public void atacar() {
        System.out.println(nombre + " make an attack.");
    }
}

// Player Class derived from Character
class Jugador extends Personaje {
    private String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    public void usarHabilidadEspecial() {
        System.out.println(nombre + " use his special ability " + clase + ".");
    }
}

// Enemy class derived from Character
class Enemigo extends Personaje {
    private String tipo;

    public Enemigo(String nombre, int nivel, String tipo) {
        super(nombre, nivel);
        this.tipo = tipo;
    }

    public void gritar() {
        System.out.println(nombre + " emits a terrifying cry " + tipo + ".");
    }
}
