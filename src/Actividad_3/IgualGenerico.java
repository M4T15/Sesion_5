package Actividad_3;
public class IgualGenerico {
    public static <T> boolean esIgualA(T arg1, T arg2) {
        if (arg1 == null) {
            return arg2 == null;
        }
        return arg1.equals(arg2);
    }
    public static void main(String[] args) {

        System.out.println("Tipos integrados (int, 5 y 5): " + esIgualA(5, 5));
        System.out.println("Tipos integrados (double, 3.14 y 3.15): " + esIgualA(3.14, 3.15));
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Object (el mismo objeto): " + esIgualA(obj1, obj1));
        System.out.println("Object (objetos distintos): " + esIgualA(obj1, obj2));
        Integer int1 = Integer.valueOf(100);
        Integer int2 = Integer.valueOf(100);
        System.out.println("Integer (mismo valor, 100): " + esIgualA(int1, int2));
        String str1 = "Hola";
        String str2 = "Hola";
        System.out.println("String (mismo texto, 'Hola'): " + esIgualA(str1, str2));
        System.out.println("null vs null: " + esIgualA(null, null));
        System.out.println("null vs String: " + esIgualA(null, "Texto"));
        System.out.println("String vs null: " + esIgualA("Texto", null));
    }
}
