package Metodos.Exercicio05;

public class ConversorDeMoeda {

    public static final double IOF = 0.06;
    public static double dollar;

    public static double conversor(double quantidade){
        return quantidade * (dollar + (dollar * IOF));
    }
    
}
