package juego;

public class Ladron extends Personaje{
	
	private boolean invisible;

	public Ladron(String nombre, int nivel, int puntosVida, Inventario inventario) {
		super(nombre, nivel, puntosVida, inventario);
		this.invisible = false;
	}
	
	public void robar() {
		if (invisible == true) {
			System.out.println("Has conseguido robar");
		}
		else {
			System.out.println("No puede robar no eres invisible");
		}
	}
	public void hacerseInvisible() {
		if(invisible == false) {
			this.invisible = true;
			System.out.println("Te as fet invisible");
		}
		else {
			System.out.println("Ya ets invisible");
		}
	}
	
	public void dejarDeSerInvisible() {
		if(invisible == false) {
			System.out.println("No estaves invisible ");
		}
		else {
			System.out.println("Ya no ets invisible ");
			this.invisible = false;
		}
		
	}
	public void estaInvisible() {
		if(invisible == true) {
			System.out.println("Ets Invisible ");
		}
		else {
			System.out.println("No ets invisble ");
		}
	}
}
