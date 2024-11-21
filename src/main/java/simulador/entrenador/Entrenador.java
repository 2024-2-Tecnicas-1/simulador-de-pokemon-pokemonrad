package simulador.entrenador;
 
import simulador.pokemon.Pokemon;
import java.util.ArrayList;
import java.util.List;
 
public class Entrenador {
    private String nombre;
    private List<Pokemon> equipo;
 
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public List<Pokemon> getEquipo() {
        return equipo;
    }
 
    public void agregarPokemon(Pokemon pokemon) {
        if (equipo.size() < 6) {
            equipo.add(pokemon);
            System.out.println(pokemon.getNombre() + " ha sido añadido al equipo de " + nombre + "!");
        } else {
            System.out.println("El equipo ya esta completo. No se puede añadir más Pokemon.");
        }
    }
 
    public void entrenarPokemon(int indice) {
        if (indice >= 0 && indice < equipo.size()) {
            Pokemon pokemon = equipo.get(indice);
            System.out.println(nombre + " entrena a " + pokemon.getNombre() + "!");
            int aumentoSalud = (int) (pokemon.getSalud() * 0.20); 
            pokemon.setSalud(pokemon.getSalud() + aumentoSalud);   
            System.out.println(pokemon.getNombre() + " ahora tiene " + pokemon.getSalud() + " puntos de salud.");
        } else {
            System.out.println("Indice de Pokemon inválido.");
        }
    }
 
    public Pokemon elegirPokemon(int indice) {
        if (indice >= 0 && indice < equipo.size()) {
            return equipo.get(indice);
        }
        return null;
    }
}