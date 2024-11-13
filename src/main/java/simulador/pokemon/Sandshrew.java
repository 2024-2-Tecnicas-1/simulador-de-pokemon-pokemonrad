
package simulador.pokemon;
public class Sandshrew extends Pokemon {
    public Sandshrew() {
        super("Sandshrew", 50, 75, TipoPokemon.TIERRA);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Terratemblor y aumenta su ataque en 5 puntos!");
        setAtaque(getAtaque() + 5);
    }
}
