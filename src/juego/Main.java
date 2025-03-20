package juego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Inventario inventario1 = new Inventario();
		 Inventario inventario2 = new Inventario();
		 
		 inventario1.agregarEquipamiento("Espada", "Arma");
		 inventario2.agregarEquipamiento("Barita", "Arma");
		 
		Guerrero Guerrero1 = new Guerrero("Manolo",5,20,inventario1);
		Mago Mago1 = new Mago("Pepito",5,20,inventario2,100);
		
		Guerrero1.mostrarInfo();
	        Mago1.mostrarInfo();
	        
        Guerrero1.proteger(Mago1);
        
        Guerrero1.bajarVida(10);
        
        Guerrero1.dejarDeProteger();
        
        Guerrero1.getInventario();
	}

}
