public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send file
            fileSended++;
            System.out.println("Archivo Enviado");
        } else {
            System.out.println("Porfavor enciende tu Blutetooth");
        }

        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);
    }
}
