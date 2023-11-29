package Vetores;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        int pessoa = 0;

        for(int i=0; i<n; i++){
            pessoa ++;
            System.out.printf("Dados da %da pessoa: %n",pessoa);
            System.out.printf("Nome: ");
            nome[i] = sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            System.out.printf("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double som = 0.0;
        double alturamed = 0.0;

        for(int i=0; i<n; i++){
            som += altura[i];
        }

        alturamed = som / n;

        System.out.printf("%nAltura média: %.2f%n",alturamed);

        double contidade = 0.0;

        int somaidade = 0;

        for(int i=0; i<n; i++){
            somaidade ++;
            if(idade[i]<16){
                contidade ++;
            }
        }

        double percent = (contidade / somaidade) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n",percent);
        for(int i=0; i<n; i++){
            som += altura[i];
            if(idade[i]<16){

                System.out.printf("%s%n",nome[i]);
            }
        }
        sc.close();
    }
}
