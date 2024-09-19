package variables;

import java.util.ArrayList;

public class ArrayListEjemplo {
    // un ArrayList es similar a un Array pero con más dinamismo (tamaño variable), los elementos son accedidos por
    // medio de su índice (get(indix)), y proporciona una variedad de métodos para trabajar sobre él


    public void arrayListEjemplos() {
        // sintaxis

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Pablo"); // inserta a la ArrayList el valor de "Pablo"
        lista.add("Pedro");
        lista.add("Pepe");

        lista.remove("Pablo"); // elimina el elemento "Pablo"

        String elemento = lista.get(0); // guardo el elemento que está en la posición 0 en la variable elemento

        lista.set(1, "Fransisco"); // modifica el elemento en la posición 1 y coloca "Fransisco"

        int cantidad = lista.size(); // proporciona el número de elementos

        boolean existe = lista.contains("Pepe"); // devuelve un true si en la ArrayList contiene el elemento "Pepe"

        lista.clear(); // vacía al ArrayList

        boolean vacia = lista.isEmpty(); // devuelve true si la lista está vacía

    }

}
