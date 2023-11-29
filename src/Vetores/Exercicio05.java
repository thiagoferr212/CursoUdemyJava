package Vetores;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        double maior = vect[0];
        int posicao = 0;
        for(int i=0; i<n; i++){
            if(vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }
        }
        System.out.printf("MAior Valor: %.1f%n", maior);
        System.out.print("Posição do Maior Valor: " + posicao);

        sc.close();
    }
    
}
