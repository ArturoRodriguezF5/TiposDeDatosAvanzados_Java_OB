package tiposdatos.avanzados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLista {
    public static void main(String[] args) {

        /*//Declarar lista enlazada
        List<String> lLista =  new LinkedList<>();

        //Agregar elementos a la lista
        lLista.add("Uno");
        lLista.add("Dos");
        lLista.add("Tres");
        lLista.add("Cuatro");
        lLista.add("Cinco");
        for (String ele : lLista) {
            System.out.println(ele);
        }
        System.out.println(lLista.size());
        System.out.println(lLista.contains("Cinco"));
        lLista.remove("Dos");
        System.out.println(lLista);
        lLista.clear();
        System.out.println(lLista.isEmpty());*/
        List<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        System.out.println("Elementos en lista: " + lista);
        // Creamos listaEnlazda
        LinkedList<String> listaEnlazada = new LinkedList<>(lista);
        System.out.println("Elementos en linkedList: " + listaEnlazada);
    }
}
