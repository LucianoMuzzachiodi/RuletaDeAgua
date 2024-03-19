
package ruletadeagua;

import java.util.ArrayList;
import java.util.Scanner;


public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public void llenarJuego() {
        Scanner scanner = new Scanner(System.in);
        jugadores = new ArrayList<>();

        System.out.print("Ingrese el número de jugadores (entre 1 y 6): ");
        int numJugadores = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (numJugadores < 1 || numJugadores > 6) {
            numJugadores = 6; // Por defecto 6 jugadores
        }

        for (int i = 1; i <= numJugadores; i++) {
            System.out.print("Ingrese el nombre del jugador " + i + ": ");
            String nombre = scanner.nextLine();
            jugadores.add(new Jugador(i, nombre));
        }

        revolver = new RevolverAgua();
        revolver.llenarRevolver();
    }

    public void ronda() {
        while (true) {
            for (int i = 0; i < jugadores.size(); i++) {
                Jugador jugadorActual = jugadores.get(i);
                System.out.println("Turno de: " + jugadorActual);
                if (jugadorActual.disparo(revolver)) {
                    System.out.println("¡El jugador " + jugadorActual + " se ha mojado!");
                    return;
                }
            }
        }
    }
}
