/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

