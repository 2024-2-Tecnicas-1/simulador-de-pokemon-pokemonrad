
package simulador.pokemon;

public class Magmar extends Pokemon {
    public Magmar() {
        super("Magmar", 65, 95, TipoPokemon.FUEGO);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Llamarada y aumenta su ataque en 10 puntos!");
        setAtaque(getAtaque() + 10);
    }
}
