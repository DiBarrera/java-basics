public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        // Operaciones anteriores
        double area = circleArea(y);
        System.out.println(area);

        double area1 = circleArea(y);
        System.out.println(circleArea(y));

        // Area de un circulo
        // PI * r2
        circleArea(y);
        System.out.println(circleArea(y));

        // Area de una esfera
        // 4 * PI * r2
        sphereArea(y);
        System.out.println(sphereArea(y));

        // Volumen de una esfera
        // (4 / 3) * PI * r3
        sphereVolume(y);
        System.out.println(sphereVolume(y));

        double quantity;
        String currency;
        System.out.println("PESOS MEX A DOLARES: " + convertToDolar(quantity = 300, currency = "MXN"));
        System.out.println("PESOS COP A DOLARES: " + convertToDolar(quantity = 600, currency = "COP"));
    }

    public static double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double sphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public static double sphereVolume(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    public static double convertToDolar(double quantity, String currency) {
        // MXN COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }
}
