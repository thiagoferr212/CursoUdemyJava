package Vetores;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar ? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i=0; i<n; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        int par = 0;
        int cont = 0;

        System.out.println("\nNUMEROS PARES: ");
        for(int i=0; i<n; i++){
            par = vect[i] % 2;
            if(par == 0){
                System.out.printf("%d ",vect[i]);
                cont++;
            }
        }
        System.out.print("\nQUANTIDADE DE PARES: " + cont);

        sc.close();
    }
    
}
