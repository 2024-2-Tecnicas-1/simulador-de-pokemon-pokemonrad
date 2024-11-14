
package simulador.pokemon;

    public class Jynx extends Pokemon {
    public Jynx() {
        super("Jynx", 65, 50, TipoPokemon.HIELO);
    }
 
    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Beso Frío y reduce el ataque del enemigo en 5 puntos.");
        
    }
}
    

