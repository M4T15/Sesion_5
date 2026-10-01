package Actividad_2;
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

