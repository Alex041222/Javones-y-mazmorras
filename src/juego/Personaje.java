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
    
	public int getpuntosVida() {
        return this.puntosVida;
    }
    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;	
    }
    public int getnNivel() {
        return this.nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;	
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;	
    }
			
    
    public void mostrarInfo () {
    	System.out.println("Nombre: " + nombre + " Nivel: " + nivel +" Puntos de vida: "+ puntosVida);
    }
    public void bajarVida(int vida) {
    	this.puntosVida = this.puntosVida - vida;
    	System.out.println(nombre + "ha sido atacado y le quedan " + this.puntosVida + " puntos de vida");
    	
    }
    public Inventario getInventario() {
        return inventario;
    }
    public  void agregarEquipamiento(Equipamiento equipamiento) {
    	
    }
    @Override
    public String toString() {
        return this.nombre;
    }
}
