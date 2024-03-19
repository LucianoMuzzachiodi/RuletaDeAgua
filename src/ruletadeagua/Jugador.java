
package ruletadeagua;


public class Jugador {
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = false;
    }

    public boolean disparo(RevolverAgua r) {
        if (!mojado) {
            if (r.mojar()) {
                mojado = true;
            }
            r.siguienteChorro();
            return mojado;
        }
        return false; // Si ya está mojado, no dispara
    }

    @Override
    public String toString() {
        return nombre + " - Mojado: " + mojado;
    }
}
