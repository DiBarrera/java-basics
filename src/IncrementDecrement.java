public class IncrementDecrement {
    public static void main(String[] args) {

        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        // Postfija

        lives--; // Decremento
        System.out.println(lives); // 3

        lives++; // Incremento
        System.out.println(lives); // 4

        // Prefija
        // Gana un regalo por ganar una vida
        int gift = 100 + ++lives; // Prefijo
        System.out.println(gift);
        System.out.println(lives); // 5

    }
}
