import java.util.ArrayList;
import java.util.Collections;

public class Exer2Arraylist {
    public static void main(String[] args) {

        // criar uma arrailist de string

        ArrayList<String> lista = new ArrayList<>();

        // adicionar 5 elementos na lista

        lista.add("Primeiro ");
        lista.add("segundo");
        lista.add("terceira");
        lista.add("quarta");
        lista.add("quinta");

        // mostra a lista antes de inverter
        System.out.println("\nlista antes de inverte");
        System.out.println(lista);

        // inverte a ordem dos elementos da lista
        Collections.reverse(lista);

        // mostra a lista depois de inverte
        System.out.println("lista depois de inverte ");
        System.out.println(lista);
    }

}
