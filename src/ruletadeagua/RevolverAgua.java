
package ruletadeagua;

import java.util.Random;


public class RevolverAgua {
    private int posicionActual;
    private int posicionAgua;

    public void llenarRevolver() {
        Random random = new Random();
        posicionActual = random.nextInt(6); // Suponiendo 6 posiciones en el tambor
        posicionAgua = random.nextInt(6);
    }

    public boolean mojar() {
        return posicionActual == posicionAgua;
    }

    public void siguienteChorro() {
        posicionActual = (posicionActual + 1) % 6; // Suponiendo 6 posiciones en el tambor
    }

    @Override
    public String toString() {
        return "Revolver de Agua [Posición actual: " + posicionActual + ", Posición del agua: " + posicionAgua + "]";
    }
}
