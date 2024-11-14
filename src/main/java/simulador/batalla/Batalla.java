package simulador.batalla;

import java.util.Random;
import simulador.pokemon.Pokemon;

public class Batalla {
 public static void iniciarBatalla(Pokemon p1, Pokemon p2) {
        System.out.println("¡Comienza la batalla entre " + p1.getNombre() + " y " + p2.getNombre() + "!");

        Random random = new Random();
        boolean turnoP1 = random.nextBoolean(); 

        while (p1.getSalud() > 0 && p2.getSalud() > 0) {
            if (turnoP1) {
                System.out.println("\nTurno de " + p1.getNombre() + ":");
                p1.habilidadEspecial();
                p1.atacar(p2);
                
                if (p2.getSalud() <= 0) {
                    System.out.println(p2.getNombre() + " ha sido derrotado.");
                    System.out.println(p1.getNombre() + " es el ganador!");
                    break;
                }
            } else {
                System.out.println("\nTurno de " + p2.getNombre() + ":");
                p2.habilidadEspecial();
                p2.atacar(p1);

                if (p1.getSalud() <= 0) {
                    System.out.println(p1.getNombre() + " ha sido derrotado.");
                    System.out.println(p2.getNombre() + " es el ganador!");
                    break;
                }
            }

            turnoP1 = !turnoP1;
        }
 }
    }

