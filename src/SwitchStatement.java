public class SwitchStatement {
    public static void main(String[] args) {

        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Light mode selected");
                break;
            case "Night": // ambar tone
                System.out.println("Night mode selected");
                break;
            case "Blue Dark":
                System.out.println("Blue Dark mode selected");
            case "Dark":
                System.out.println("Dark mode selected");
            default:
                System.out.println("Select any mode available");
        }
    }
}
