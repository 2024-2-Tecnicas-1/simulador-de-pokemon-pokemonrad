
package simulador.pokemon;

    public class Tangela extends Pokemon {
    public Tangela() {
        super("Tangela", 65, 55, TipoPokemon.PLANTA);
    }

    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Enredadera y reduce el ataque del enemigo en 5 puntos.");
        
    }
}