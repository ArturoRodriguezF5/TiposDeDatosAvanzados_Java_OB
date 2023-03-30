package tiposdatos.avanzados;

import java.util.Scanner;

public class GestionErrores {
    public static void main(String[] args) {

        // Gestionar errores mediante TryCatch
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita un número que se va a dividir con otro.");
        int a = sc.nextInt();
        System.out.println("Digita otro numero que se dividira.");
        int b = sc.nextInt();
        int resul;
        try {
            resul = a / b;
            System.out.println("El resultado de la división es: " + resul);
        } catch (ArithmeticException e) {
            System.out.println("Booom!, Excepción es: " + e);
        } finally {
            System.out.println("Se usa para cerrar el stack");
        }

    }
}
