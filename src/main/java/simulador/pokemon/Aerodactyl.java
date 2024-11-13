/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador.pokemon;

    public class Aerodactyl extends Pokemon {
    public Aerodactyl() {
        super("Aerodactyl", 80, 105, TipoPokemon.ROCA);
    }
 
    @Override
    public void habilidadEspecial() {
        System.out.println(getNombre() + " usa Roca Afilada y aumenta su ataque en 10 puntos!");
        setAtaque(getAtaque() + 10);
    }
}

