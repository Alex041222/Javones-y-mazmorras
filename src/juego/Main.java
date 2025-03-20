package juego;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Inventario inventario1 = new Inventario();
		 Inventario inventario2 = new Inventario();
		 Inventario inventario3 = new Inventario();
		 
		 
		 
		 inventario1.agregarEquipamiento("Espada", "Arma");
		 inventario2.agregarEquipamiento("Barita", "Arma");
		 inventario3.agregarEquipamiento("Daga", "Arma");
		
		 
		 
		Guerrero Guerrero1 = new Guerrero("Manolo",5,25,inventario1);
		Mago Mago1 = new Mago("Pepito",3,16,inventario2,100);
		Ladron Ladron1 = new Ladron("Javier",6,20,inventario3);
		Guerrero1.mostrarInfo();
        Mago1.mostrarInfo();
	    Ladron1.mostrarInfo(); 
        
        Guerrero1.proteger(Mago1);
        Mago1.lanzarHechizo(15);
        Mago1.lanzarHechizo(100);
        
        Ladron1.estaInvisible();
        
        Ladron1.hacerseInvisible();
        Ladron1.robar();
        
       
        
        Ladron1.dejarDeSerInvisible();
        Ladron1.robar();
        
        Guerrero1.bajarVida(10);
        Mago1.bajarVida(5);
        Ladron1.bajarVida(6);
        
        Guerrero1.dejarDeProteger();
        Guerrero1.bajarVida(5);
        
        
        Mago1.recargarMana(10);
        Mago1.getMana();
        
        
        
        
        inventario1.agregarEquipamiento("Escudo", "Defensa");
        
        Guerrero1.getInventario().mostrarInventario();
        Mago1.getInventario().mostrarInventario();
        Ladron1.getInventario().mostrarInventario();
	}

}
