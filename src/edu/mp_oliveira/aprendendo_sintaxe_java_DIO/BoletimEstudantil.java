package edu.mp_oliveira.aprendendo_sintaxe_java_DIO;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal<6)
            System.out.println("REPROVADO");
        else if (mediaFinal==6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");
    }
}
