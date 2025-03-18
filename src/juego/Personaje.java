package juego;

public class Personaje {
	
	private String nombre;
    private int nivel;
    private int puntosVida;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosVida,Inventario inventario) {
		this.nombre = nombre;
		this.nivel = nivel;
		this.puntosVida = puntosVida;
		this.inventario = inventario;
    }
    public void mostrarInfo () {
    	System.out.println("Nombre: " + nombre + "Nivel: " + nivel +"Puntos de vida: "+ puntosVida);
    }
}
