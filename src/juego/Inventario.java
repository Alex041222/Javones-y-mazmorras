package juego;

import java.util.ArrayList;

public class Inventario {
	
	ArrayList<Equipamiento> equipamiento = new ArrayList<Equipamiento>();
	
	public void agregarEquipamiento(String nombre, String tipo) {
		equipamiento.add(new Equipamiento(nombre, tipo));
	}
	
	public void mostrarInventario() {
		for (Equipamiento e : equipamiento) {
			System.out.println("Nombre: " + e.getNombre() + ", Tipo: " + e.getTipo());
		}
	}
		
}	
