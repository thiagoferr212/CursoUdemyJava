package Vetores;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i=0; i<n; i++){
            vect[i] = sc.nextDouble();
        }

        double som = 0.0;
        double med = 0.0;

        System.out.printf("VALORES = ");
        for(int i=0; i<n; i++){
            som += vect[i];
            med = som/n; 
            System.out.printf("%.1f ",vect[i]);
        }
        
        System.out.printf("%nSOMA = %.2f%n", som);
        System.out.printf("MEDIA = %.2f%n", med);

        sc.close();
    }
    
}
