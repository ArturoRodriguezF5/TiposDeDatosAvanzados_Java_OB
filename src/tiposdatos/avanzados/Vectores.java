package tiposdatos.avanzados;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {

        //Vectores
        Vector<String> vector = new Vector<>(50);
        vector.add("Uno");
        vector.add("Dos");
        vector.add("Tres");

        for (String v : vector) {
            System.out.println(v);
        }

        Vector<String> vector2 =  new Vector<>();
        vector2.add("Uno");
        vector2.add("Dos");
        vector2.add("Tres");

        System.out.println(vector.equals(vector2));

        for (int i = 0; i <  vector2.size(); i++) {
            vector2.remove(i);
        }
        System.out.println(vector2);
    }
}
