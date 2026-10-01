package Actividad_2;

class Pila< E > {
	private final int tSamanio; 
	private int superior; 
	private E[] elementos; 
	public Pila(){
		this( 10 ); 
	} 
	public Pila( int s ) {
		tSamanio = s > 0 ? s : 10; 
		superior = -1; 
		elementos = ( E[] ) new Object[ tSamanio ];
	}
	public void push( E valorAMeter ) {
		if ( superior == tSamanio - 1 ) { 
			throw new ExcepcionPilaLlena( String.format("La Pila esta llena, no se puede meter %s", valorAMeter));
			}
		elementos[ ++superior ] = valorAMeter;
		} 
	public E pop(){
		if ( superior == -1 ) 
			throw new ExcepcionPilaVacia( "Pila vacia, no se puede sacar");
		return elementos[ superior-- ]; 
	} 
	public boolean contains(E elemento) {
		for (int i=superior;i>= 0;i--) {
            if(elemento==null) {
                if(elementos[i] == null) {
                    return true;
                }
            } else {
                if(elemento.equals(elementos[i])) {
                    return true;
                }
            }
        }
        return false;
	}
}
