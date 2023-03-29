package tiposdatos.avanzados;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayLista {
    public static void main(String[] args) {

        // ArraysList en Java
        List<String> champsLol = new ArrayList<>();
        champsLol.add("Seraphine");
        champsLol.add("Diana");
        champsLol.add("Katarina");
        champsLol.add("Akali");
        System.out.println(champsLol);
        System.out.println(champsLol.get(2));
        System.out.println(champsLol.contains("Diana"));

        // Convertir ArraList en Array
        String ar[] = new String[champsLol.size()];
        for (int i = 0; i < champsLol.size(); i++) {
            ar[i] = champsLol.get(i);
        }
        for (String item : ar) {
            System.out.println(item);
        }
        // Convertir ArraList en Vector
        Vector vec = new Vector<>(champsLol.size());
        for (int i = 0; i < champsLol.size(); i++) {
            vec.add(champsLol.get(i));
        }
        System.out.println(vec);
    }
}
