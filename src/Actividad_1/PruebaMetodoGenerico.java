package Actividad_1;

class InvalidSubscriptException extends Exception {
    public InvalidSubscriptException(String mensaje) {
        super(mensaje);
    }
}

public class PruebaMetodoGenerico {

    public static <E> void imprimirArreglo(E[] arregloEntrada) {
        for (E elemento : arregloEntrada) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    public static <E> int imprimirArreglo(E[] arregloEntrada, int subindiceInferior, int subindiceSuperior) 
            throws InvalidSubscriptException {
        
        if (subindiceInferior < 0 || subindiceSuperior >= arregloEntrada.length || subindiceSuperior <= subindiceInferior) {
            throw new InvalidSubscriptException("ERROR:ESTAS FUERA DEL RANGO ");
        }

        int elementosImpresos = 0;

        for (int i = subindiceInferior; i <= subindiceSuperior; i++) {
            System.out.printf("%s ", arregloEntrada[i]);
            elementosImpresos++;
        }
        System.out.println();

        return elementosImpresos;
    }

    public static void main(String[] args) {
        Integer[] arregloInteger = {0,5,4,4,7,8};
        Double[] arregloDouble = {1.2,0.1,7.9};
        Character[] arregloCharacter = {'j','i','m'};

        System.out.println("Prueba 1");
        System.out.println("El arreglo arregloInteger tiene:");
        imprimirArreglo(arregloInteger);

        System.out.println("El arreglo arregloDouble tiene:");
        imprimirArreglo(arregloDouble);

        System.out.println("El arreglo arregloCharacter tiene:");
        imprimirArreglo(arregloCharacter);

        System.out.println("\nPrueba metodo sobrecargado ");
        try {
            System.out.println("arreglo del 1 al 4");
            int cantidad = imprimirArreglo(arregloInteger, 1, 4);
            System.out.println("cantidad en el arreglo: " + cantidad);

            System.out.println("\nprobando la excepcion");
            imprimirArreglo(arregloInteger, 5, 2);

        } catch (InvalidSubscriptException e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }
    }

}