package juego;

public class Mago extends Personaje {
	
	private int mana;
	
	public Mago(String nombre, int nivel, int puntosVida, Inventario inventario, int mana) {
		super(nombre, nivel, puntosVida, inventario);
		this.mana = mana;
	}
	public void lanzarHechizo (int costoMana){
		if(this.mana > costoMana) {
			this.mana = this.mana - costoMana;
			System.out.println("Has lanzado un echizo i as gastado " + costoMana + " de Mana");
		}
		else {
			System.out.println("No tienes suficente mana");
		}
	}
	
	public void recargarMana (int cantidad){
		this.mana = this.mana + cantidad;
		System.out.println("Has recuperado " + cantidad + " de Mana");
	}
	public String getMana() {
		return "Te queda: " + mana + " de Mana";
	}
}
