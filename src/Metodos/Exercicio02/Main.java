package Metodos.Exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo ret = new Retangulo();
     
        System.out.println("Entre com a largura e a altura: ");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();
        System.out.println("AREA = " + ret.Area());
        System.out.println("PERIMETRO = " + ret.Perimetro());
        System.out.println("DIAGONAL = " + ret.Diagonal());

        sc.close();
    }
    
}
