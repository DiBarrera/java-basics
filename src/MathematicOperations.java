import javax.xml.transform.stream.StreamSource;

public class MathematicOperations {
    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        // Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        // Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));

        // Devuelve un número elevado a otro
        System.out.println(Math.pow(x, y));

        // Devuelve el numero mayo
        System.out.println(Math.max(x, y));

        // Devuelve la raíz cuadrada
        System.out.println(Math.sqrt(y));

        // Area de un circulo
        // PI * r2
        System.out.println(Math.PI * Math.pow(y, 2));

        // Area de una esfera
        // 4 * PI * r2
        System.out.println(4 * Math.PI * Math.pow(y, 2));

        // Volumen de una esfera
        // (4 / 3) * PI * r3
        System.out.println((3/4) * Math.PI * Math.pow(y, 3));
    }
}
