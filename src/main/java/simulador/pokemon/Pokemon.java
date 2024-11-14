package simulador.pokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int ataque;
    private TipoPokemon tipo;
    private boolean seleccionadoParaBatalla;  

    public Pokemon(String nombre, int salud, int ataque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
        this.tipo = tipo;
        this.seleccionadoParaBatalla = false; 
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    
    public void atacar(Pokemon enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.getNombre() + " causando " + ataque + " puntos de daño.");
        enemigo.recibirDano(ataque);
    }

    public void recibirDano(int dano) {
        salud -= dano;
        if (salud < 0) {
            salud = 0;
        }
        System.out.println(nombre + " ahora tiene " + salud + " puntos de salud.");
    }

    
    public abstract void habilidadEspecial();

    
    public boolean isSeleccionadoParaBatalla() {
        return seleccionadoParaBatalla;
    }

    
    public void setSeleccionadoParaBatalla(boolean seleccionadoParaBatalla) {
        this.seleccionadoParaBatalla = seleccionadoParaBatalla;
    }

    
}
