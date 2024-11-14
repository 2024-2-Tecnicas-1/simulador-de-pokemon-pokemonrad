
package simulador.pokemon;

public class Seel extends Pokemon {
    public Seel() {
        super("Seel", 65, 45, TipoPokemon.AGUA);
    }
 
    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Hidropulso y aumenta su ataque en 5 puntos.");
        setAtaque(getAtaque() + 5);
    }
}