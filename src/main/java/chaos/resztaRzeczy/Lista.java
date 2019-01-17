package chaos.resztaRzeczy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        lista3();
        listaImion();
        liczbyZmiennoprzecinkowe();
        imionaUzytkownik();
        kolejkaPriorytetowa();
        listaZBledem();
    }

    public static void lista3() {
        ArrayList<Integer> listaLiczb = new ArrayList<Integer>();
        listaLiczb.add(3);
        listaLiczb.add(11);
        listaLiczb.add(25);
        System.out.println(listaLiczb.get(0));
        System.out.println(listaLiczb.get((listaLiczb.size()) - 1));

    }

    public static void liczbyZmiennoprzecinkowe() {
        ArrayList<Double> listaLiczb = new ArrayList<Double>();
        listaLiczb.add(3.19);
        listaLiczb.add(6.39);
        listaLiczb.add(18.99);
        listaLiczb.add(128.59);
        listaLiczb.add(1.39);
        listaLiczb.add(8.19);
        listaLiczb.add(3.19);
        listaLiczb.add(4.19);
        listaLiczb.add(12.19);
        listaLiczb.add(41.79);
        System.out.print("Suma ");
        System.out.println(listaLiczb.get(0) + listaLiczb.get((listaLiczb.size()) - 1));
        System.out.print("Iloczyn ");
        System.out.println(listaLiczb.get(0) * listaLiczb.get((listaLiczb.size()) - 1));
        System.out.print("Iloraz ");
        System.out.println(listaLiczb.get(1) / listaLiczb.get((listaLiczb.size()) - 2));


    }

    public static void listaImion() {
        ArrayList<String> listaImion = new ArrayList<String>();
        listaImion.add("Staszek");
        listaImion.add("Łukasz");
        listaImion.add("Eustahy");
        listaImion.add("Marcel");
        listaImion.add("Eugeniusz");
        for (int i = 0; i < listaImion.size(); i++) {
            System.out.print(listaImion.get(i) + " ");
        }
        for (int i = listaImion.size() - 1; i >= 0; i--) {
            System.out.print(listaImion.get(i) + " ");
        }
    }

    public static void imionaUzytkownik() {
        ArrayList<String> listaImion = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Podaj imię");
            listaImion.add(scanner.nextLine());
        }
        int i = 0;
        while (i < listaImion.size()) {
            System.out.print(listaImion.get(i) + " ");
            i++;
        }
    }

    public static void kolejkaPriorytetowa() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb losować?");
        int liczbaLiczb = Integer.parseInt(scanner.nextLine());
        Random random = new Random();
        for (int i = 0; i < liczbaLiczb; i++) {
            priorityQueue.add(random.nextInt(100) + 1);
        }
        for (int i = 0; i < liczbaLiczb; i++) {
            System.out.print(priorityQueue.poll() + " ");
        }

    }

    public static void listaZBledem() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(2);
        lista.add(35);
        lista.add(912);
        lista.add(7);
        try {
            lista.get(5);
        } catch (IndexOutOfBoundsException a) {
            System.out.print("chaos.resztaRzeczy.Lista nie posiada takiej ilosci elementow");
        }
    }

}
