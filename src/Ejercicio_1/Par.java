package Ejercicio_1;

public class Par<F , S> {
	private F primero;
	private S segundo;
	
	public Par(F primero, S segundo) {
		this.setPrimero(primero);
		this.setSegundo(segundo);
	}

	public S getSegundo() {
		return segundo;
	}

	public void setSegundo(S segundo) {
		this.segundo = segundo;
	}

	public F getPrimero() {
		return primero;
	}

	public void setPrimero(F primero) {
		this.primero = primero;
	}
	
	@Override
	public String toString() {
		return "(Dato 1:" + primero + " Dato2: " + segundo +")";
	}
	
	public boolean esIgual(Par <F , S> parComparar) {
		return primero.equals(parComparar.getPrimero()) && segundo.equals(parComparar.getSegundo()); 

	}
}
