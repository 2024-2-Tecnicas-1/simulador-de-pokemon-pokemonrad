
package simulador.pokemon;

public class mime extends Pokemon {
    public mime() {
        super("Mr. Mime", 40, 45, TipoPokemon.PSIQUICO);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Reflejo y recupera 5 puntos de salud.");
        recibirDano(-5); 
    }
}
