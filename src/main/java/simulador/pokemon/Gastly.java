
package simulador.pokemon;

    
    public class Gastly extends Pokemon {
    public Gastly() {
        super("Gastly", 30, 35, TipoPokemon.VENENO);
    }
 
    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Llamado de las Sombras y recupera 10 puntos de salud.");
        recibirDano(-10);
    }
}

