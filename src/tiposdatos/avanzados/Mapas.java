package tiposdatos.avanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {

        // Crear mapa en Java
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");

        for (Map.Entry<Integer, String> pair : mapa.entrySet()) {
            System.out.println("Key: " + pair.getKey() + " Valor: " + pair.getValue());
        }
    }
}
