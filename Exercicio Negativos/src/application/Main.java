package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int i;

        System.out.print("Quantos números você vai digitar?");
        i = sc.nextInt();
        int[] lista = new int[i];

        if(i <= 10) {
            for(int j = 0; j < lista.length; j++) {
                System.out.print("Digite um numero: ");
                lista[j] = sc.nextInt();
            }
        } else {
            System.out.println("Nao pode digitar mais de 10 números");
            return;
        }

        System.out.println("Numeros negativos: ");
        for (double v : lista) {
            if (v < 0) {
                System.out.println(v);
            }
        }

        sc.close();
    }
}