package juego;

public class Guerrero extends Personaje {
	
	private boolean protegiendo;
	private Personaje compañeroProtegido;

	public Guerrero(String nombre, int nivel, int puntosVida, Inventario inventario) {
		super(nombre, nivel, puntosVida, inventario);
		this.protegiendo = false;
		this.compañeroProtegido = compañeroProtegido;
	}
	
	 public void proteger(Personaje compañero) {
		
		 if(protegiendo = false) {
			 System.out.println("Ya estas proteegiendo a alguien no puedes proteger a otra persona hasta que dejes de protejer a la persona que estas proteguiendo ahora");
		 }
		 else {
			 this.compañeroProtegido = this.compañeroProtegido = compañero;
			 this.protegiendo = true;
			 System.out.println("Ahora estas protegiendo a : " + this.compañeroProtegido);
		 }
		
	 }
		 
	 public void dejarDeProteger() {
		 if (protegiendo = true) {
			 this.protegiendo = false;
			 System.out.println("ya no proteges a: " +this.compañeroProtegido);
		 }
		 else {
			 System.out.println("No estbas protegiendo a nadie");
		 }
	 }
	@Override
	 public void bajarVida(int vida){
		if(protegiendo ) {
			setPuntosVida(getpuntosVida()- (vida/2));
			System.out.println(getNombre()+" ha sido atacado y le quedan " + getpuntosVida() + " puntos de vida");
		}
		else {
			setPuntosVida(getpuntosVida()- vida);	
			System.out.println(getNombre()+" ha sido atacado y le quedan " + getpuntosVida() + " puntos de vida");
		}
	}
	 
	 public String estaProtegiendo() {
		 if(protegiendo = true) {
			return "Estas protegiendo a: " + this.compañeroProtegido; 
		 }
		 else {
			 return null;
		 }
	 }
}
