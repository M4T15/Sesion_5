package Actividad_2;

public class main {
	public static void main(String[] args) {
        Pila<String> pila = new Pila<>(3);
        pila.push("Java");
        pila.push("Python");
        pila.push("C++");
        System.out.println("¿La pila contiene Python? " + pila.contains("Python"));       
        System.out.println("¿La pila contiene JavaScript? " + pila.contains("JavaScript"));
        System.out.println("¿La pila contiene null? " + pila.contains(null));
        try {
            System.out.println("Intentando meter cobol");
            pila.push("cobol");
        } catch (ExcepcionPilaLlena e) {
            System.out.println("Error capturado con éxito: " + e.getMessage());
        }
        System.out.println("Elemento sacado: " + pila.pop()); 
        System.out.println("Elemento sacado: " + pila.pop()); 
        System.out.println("Elemento sacado: " + pila.pop()); 
        try {
            System.out.println("Intentando sacar otro elemento");
            pila.pop();
        } catch (ExcepcionPilaVacia e) {
            System.out.println("Error capturado con éxito: " + e.getMessage());
        }
    }
}
