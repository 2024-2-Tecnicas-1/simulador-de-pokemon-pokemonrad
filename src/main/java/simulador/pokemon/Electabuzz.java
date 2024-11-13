package simulador.pokemon;

public class Electabuzz extends Pokemon {
    public Electabuzz() {
        super("Electabuzz", 65, 83, TipoPokemon.ELECTRICO);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Impactrueno y aumenta su ataque en 15 puntos!");
        setAtaque(getAtaque() + 15);
    }
}
