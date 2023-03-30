package tiposdatos.avanzados;

public class Strings {
    public static void main(String[] args) {

        String palabra = "Tamarindo";
        StringBuilder reverse = new StringBuilder();
        char c;

    //   for (int i = 0; i < palabra.length(); i++) {
    //      System.out.println(palabra.charAt(i));
    //    }

        for (int i = 0; i < palabra.length(); i++) {
            c = palabra.charAt(i);
            reverse.insert(0, c);
        }
        System.out.println(reverse);
    }
}
