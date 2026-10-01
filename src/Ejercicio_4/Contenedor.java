package Ejercicio_4;
import Ejercicio_1.Par;
import java.util.ArrayList;

public class Contenedor<F , S> {
	private ArrayList<Par<F , S>> listPares;
	
	public Contenedor(){
		this.listPares = new ArrayList<>();
	}
	
	public void agregarPar(F primero, S segundo) {
		Par<F ,S> nuevoPar = new Par<F , S>(primero , segundo);
		
		listPares.add(nuevoPar);
	}
	
	public Par<F , S> obtenerPar(int index) {
		return listPares.get(index);
		
	}
	
	public ArrayList<Par<F , S>> obtenerTodosLosPares(){
		return listPares;
	}
	
	public void mostrarPares() {
		for( Par<F , S> l : listPares) {
			System.out.println("Elemento: " + l);
		}
	}
}
