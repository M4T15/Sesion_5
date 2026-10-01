package Actividad_4;
class ExcepcionPilaLlena extends RuntimeException {
    public ExcepcionPilaLlena() {
        super("La pila esta llena");
    }
    public ExcepcionPilaLlena(String mensaje) {
        super(mensaje);
    }
}
class ExcepcionPilaVacia extends RuntimeException {
    public ExcepcionPilaVacia() {
        super("La pila esta vacia");
    }
    public ExcepcionPilaVacia(String mensaje) {
        super(mensaje);
    }
}
class Pila<E> {
    private final int tamanio; 
    private int superior; 
    private E[] elementos; 
    public Pila() {
        this(10); 
    } 

    @SuppressWarnings("unchecked")
    public Pila(int s) {
        tamanio = s > 0 ? s : 10; 
        superior = -1; 
        elementos = (E[]) new Object[tamanio];
    }

    public void push(E valorAMeter) {
        if (superior == tamanio - 1) { 
            throw new ExcepcionPilaLlena(String.format("La Pila esta llena, no se puede meter %s", valorAMeter));
        }
        elementos[++superior] = valorAMeter;
    } 

    public E pop() {
        if (superior == -1) 
            throw new ExcepcionPilaVacia("Pila vacia, no se puede sacar");
        return elementos[superior--]; 
    } 

    public boolean contains(E elemento) {
        for (int i = superior; i >= 0; i--) {
            if (elemento == null) {
                if (elementos[i] == null) {
                    return true;
                }
            } else {
                if (elemento.equals(elementos[i])) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean esIgual(Pila<E> otraPila) {
        if (this == otraPila) {
            return true;
        }
        if (otraPila == null) {
            return false;
        }
        if (this.superior != otraPila.superior) {
            return false;
        }
        for (int i = 0; i <= this.superior; i++) {
            E miElemento = this.elementos[i];
            E otroElemento = otraPila.elementos[i];
            if (miElemento == null) {
                if (otroElemento != null) {
                    return false;
                }
            } else {
                if (!miElemento.equals(otroElemento)) {
                    return false;
                }
            }
        }
        return true;
    }
}
public class main {
	public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>(5);
        Pila<Integer> pila2 = new Pila<>(5);
        pila1.push(10);
        pila1.push(20);
        pila1.push(30);
        pila2.push(10);
        pila2.push(20);
        pila2.push(30);
        System.out.println("Prueba 1 (Pilas idénticas): " + pila1.esIgual(pila2)); 
        Pila<Integer> pila3 = new Pila<>(5);
        pila3.push(10);
        pila3.push(30);
        pila3.push(20);
        System.out.println("Prueba 2 (Diferente orden): " + pila1.esIgual(pila3));
        Pila<Integer> pila4 = new Pila<>(5);
        pila4.push(10);
        pila4.push(20);
        System.out.println("Prueba 3 (Diferente cantidad de elementos): " + pila1.esIgual(pila4)); 
        Pila<String> pilaStrings1 = new Pila<>(5);
        Pila<String> pilaStrings2 = new Pila<>(5);
        pilaStrings1.push("Java");
        pilaStrings1.push(null);
        pilaStrings1.push("Pilas");
        pilaStrings2.push("Java");
        pilaStrings2.push(null);
        pilaStrings2.push("Pilas");
        System.out.println("Prueba 4 (Pilas de Strings con nulos idénticas): " + pilaStrings1.esIgual(pilaStrings2)); 
        System.out.println("\nComprobando integridad de las pila");
        System.out.println("Sacando tope de pila1 (debería ser 30): " + pila1.pop());
        System.out.println("Sacando tope de pila2 (debería ser 30): " + pila2.pop());
    }
}
