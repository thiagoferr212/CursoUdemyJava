package Metodos.Exercicio05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço do Dollar?");
        ConversorDeMoeda.dollar = sc.nextDouble();
        System.out.println("Quantos dollares você vai comprar?");
        double conversor = ConversorDeMoeda.conversor(sc.nextDouble());
        System.out.printf("Valor a ser pago em reais: %.2f %n", conversor);

        sc.close();
    }
    
}