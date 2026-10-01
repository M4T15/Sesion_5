package Ejercicio_4;

public class Inventario {

	public static void main(String[] args) {
		
	    Contenedor<String, Integer> miInventario = new Contenedor<>();

	   
	    miInventario.agregarPar("Soporte ajustable para laptop", 1);
	    miInventario.agregarPar("Brazo articulado para doble monitor", 1);
	    miInventario.agregarPar("Hub USB de 8 puertos", 2);
	    miInventario.agregarPar("Mouse inalámbrico", 1);

	    
	    System.out.println("--- Mostrando todo el inventario ---");
	    miInventario.mostrarPares();

	    
	    System.out.println("\n--- Obteniendo el artículo en el índice 1 ---");
	    
	    System.out.println(miInventario.obtenerPar(1));

	}

}
