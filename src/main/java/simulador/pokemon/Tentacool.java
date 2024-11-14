
package simulador.pokemon;

public class Tentacool extends Pokemon {
    public Tentacool() {
        super("Tentacool", 40, 40, TipoPokemon.AGUA);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Burbuja y recupera 10 puntos de salud.");
        recibirDano(-10); 
    }
}
