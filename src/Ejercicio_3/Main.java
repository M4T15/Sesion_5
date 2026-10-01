package Ejercicio_3;

import Ejercicio_1.Par;

public class Main {

	public static void main(String[] args) {
		
		Par<String , Integer> parPrueba = new Par<String , Integer>("Hub USB" , 5);
		imprimirPar(parPrueba);
		
		Par<String , Integer> par1 = new Par<String, Integer>("Sistemas" , 20);
		imprimirPar(par1);
		
		Par<Double , Boolean> par2 = new Par<Double , Boolean>(1.3 , true);
		imprimirPar(par2);
		
		Par<Persona , Integer>par3 = new Par<Persona , Integer>(new Persona ("Ariel" ,19), 8);
		imprimirPar(par3);
	}
	
	public static <F , S> void imprimirPar(Par<F , S> elemtoImprimir) {
		System.out.println(elemtoImprimir);
	}

}
