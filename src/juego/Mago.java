package juego;

public class Mago extends Personaje {
	
	private int mana;
	
	public Mago(String nombre, int nivel, int puntosVida, Inventario inventario, int mana) {
		super(nombre, nivel, puntosVida, inventario);
		this.mana = mana;
	}
	public void lanzarHechizo (int costoMana){
		this.mana = this.mana - costoMana;
	}
	public void recargarMana (int cantidad){
		this.mana = this.mana + cantidad;
	}
	public int getMana() {
		return mana;
	}
}
