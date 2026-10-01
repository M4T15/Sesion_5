package Ejercicio_2;

import Ejercicio_1.Par;

public class PreubaPar {

	public static void main(String[] args) {
		
		Par<String , Integer> articulo1 = new Par<String , Integer>("Hub USB" , 5);
		Par<String , Integer> articulo2 = new Par<String , Integer>("Hub USB" , 5);
			
		System.out.println("Datos del articulo: " + articulo1);
		System.out.println("¿Son Iguales?: " + articulo1.esIgual(articulo2));
	}

}
