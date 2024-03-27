package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vector = new Product[n];

        for(int i = 0; i < vector.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vector[i] = new Product(name, price);
        }

        double soma = 0.0;

        for(int i = 0; i < n; i++) {
            soma += vector[i].getPrice();
        }

        double avg = soma / n;

        System.out.printf("MEDIA = %.2f%n", avg);


        sc.close();
    }
}