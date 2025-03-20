package juego;

public class Ladron extends Personaje{
	
	private boolean invisible;

	public Ladron(String nombre, int nivel, int puntosVida, Inventario inventario,boolean invisible) {
		super(nombre, nivel, puntosVida, inventario);
		this.invisible = false;
	}
	
	public void robar() {
		if (invisible = true) {
			System.out.println("Has conseguido robar");
		}
		else {
			System.out.println("No puede robar no eres invisible");
		}
	}
	public void hacerseInvisible() {
		this.invisible = true;
	}
	public void dejarDeSerInvisible() {
		this.invisible = false;
	}
	public String estaInvisible() {
		if(invisible = true) {
			return "Eres invisible";
		}
		else {
			return "No eres invisible";
		}
	}
}
