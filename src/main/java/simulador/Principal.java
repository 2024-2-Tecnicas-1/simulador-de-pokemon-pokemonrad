package simulador;

import java.util.Scanner;
import simulador.pokemon.*;
import simulador.entrenador.Entrenador;
import simulador.batalla.Batalla;


public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Entrenador entrenador1 = new Entrenador("Entrenador 1");
        Entrenador entrenador2 = new Entrenador("Entrenador 2");

        
        Pokemon[] pokemons = {
            new Magmar(),
            new Tentacool(),
            new Tangela(),
            new Electabuzz(),
            new mime(),
            new Sandshrew(),
            new Jynx(),
            new Aerodactyl(),
            new Gastly(),
            new Seel()
        };

        int opcion;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    gestionarEntrenadores(scanner, entrenador1, entrenador2, pokemons);
                    break;
                case 2:
                    mostrarPokemons(pokemons);
                    break;
                case 3:
                    iniciarBatalla(scanner, entrenador1, entrenador2);
                    break;
                case 0:
                    System.out.println("Saliendo del simulador.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    private static void gestionarEntrenadores(Scanner scanner, Entrenador entrenador1, Entrenador entrenador2, Pokemon[] pokemons) {
        System.out.println("\n--- Gestionar Entrenadores ---");
        System.out.println("Seleccione un entrenador:");
        System.out.println("1. " + entrenador1.getNombre());
        System.out.println("2. " + entrenador2.getNombre());
        int opcion = scanner.nextInt();

        Entrenador entrenadorSeleccionado = (opcion == 1) ? entrenador1 : entrenador2;

        System.out.println("\nOpciones:");
        System.out.println("1. Agregar Pokémon al equipo");
        System.out.println("2. Entrenar Pokémon (aumenta HP)");
        System.out.print("Seleccione una opción: ");
        int opcionEntrenador = scanner.nextInt();

        switch (opcionEntrenador) {
            case 1:
                mostrarPokemons(pokemons);
                System.out.print("Seleccione el Pokémon que desea agregar (1-10): ");
                int indicePokemon = scanner.nextInt();
                entrenadorSeleccionado.agregarPokemon(pokemons[indicePokemon - 1]);
                break;
            case 2:
                mostrarEquipo(entrenadorSeleccionado);
                System.out.print("Seleccione el Pokémon que desea entrenar: ");
                int indiceEntrenar = scanner.nextInt();
                entrenadorSeleccionado.entrenarPokemon(indiceEntrenar - 1);
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }

    private static void mostrarPokemons(Pokemon[] pokemons) {
        System.out.println("\n--- Lista de Pokémon ---");
        for (int i = 0; i < pokemons.length; i++) {
            System.out.println((i + 1) + ". " + pokemons[i].getNombre() + 
                               " (Tipo: " + pokemons[i].getTipo() + 
                               ", HP: " + pokemons[i].getSalud() + 
                               ", ATK: " + pokemons[i].getAtaque() + ")");
        }
    }

    private static void mostrarEquipo(Entrenador entrenador) {
        System.out.println("\nEquipo de " + entrenador.getNombre() + ":");
        for (int i = 0; i < entrenador.getEquipo().size(); i++) {
            Pokemon p = entrenador.getEquipo().get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " (HP: " + p.getSalud() + ", ATK: " + p.getAtaque() + ")");
        }
    }

    private static Pokemon seleccionarPokemon(Scanner scanner, Entrenador entrenador) {
        System.out.println(entrenador.getNombre() + ", selecciona tu Pokémon:");
        mostrarEquipo(entrenador);
        System.out.print("Elige un Pokémon (1-" + entrenador.getEquipo().size() + "): ");
        int indice = scanner.nextInt() - 1;  
        if (indice < 0 || indice >= entrenador.getEquipo().size()) {
            System.out.println("Selección inválida.");
            return null;
        }

        Pokemon pokemonSeleccionado = entrenador.getEquipo().get(indice);
        if (pokemonSeleccionado.isSeleccionadoParaBatalla()) {
            System.out.println(pokemonSeleccionado.getNombre() + " ya ha sido seleccionado para la batalla.");
            return null;  
        }

        return pokemonSeleccionado;
    }

    private static void iniciarBatalla(Scanner scanner, Entrenador entrenador1, Entrenador entrenador2) {
        System.out.println("\n--- Iniciar Batalla ---");

        
        Pokemon pokemonEntrenador1 = seleccionarPokemon(scanner, entrenador1);
        if (pokemonEntrenador1 == null) {
            System.out.println("Selección de Pokémon inválida. Batalla cancelada.");
            return;  
        }

        
        Pokemon pokemonEntrenador2 = seleccionarPokemon(scanner, entrenador2);
        if (pokemonEntrenador2 == null) {
            System.out.println("Selección de Pokémon inválida. Batalla cancelada.");
            return;  
        }

        
        pokemonEntrenador1.setSeleccionadoParaBatalla(true);
        pokemonEntrenador2.setSeleccionadoParaBatalla(true);

        
        Batalla.iniciarBatalla(pokemonEntrenador1, pokemonEntrenador2);

        
        System.out.println("\nLa batalla ha terminado. Regresando al menú...");
    }
}
