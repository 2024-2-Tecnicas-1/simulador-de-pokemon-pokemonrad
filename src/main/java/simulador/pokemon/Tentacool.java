/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
