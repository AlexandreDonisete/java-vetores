package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        Pessoa[]  pessoas;
        
        System.out.print("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        pessoas = new Pessoa[n];
        double somaAltura = 0;
        int menorIdade = 0;
        
        for(int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);

            somaAltura += pessoas[i].getAltura() ;

            if(pessoas[i].getIdade() < 16) {
                menorIdade++;
            }
        }

        double mediaAltura = somaAltura / pessoas.length;
        System.out.print("Altura Média: " + String.format("\n%.2f" ,mediaAltura));

        System.out.println();

        double menorPorcentagem = (double) menorIdade / pessoas.length * 100;
        System.out.print("Pessoas com menos de 16 anos: " + menorPorcentagem + "%");

        System.out.println();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
        sc.close();
    }
}