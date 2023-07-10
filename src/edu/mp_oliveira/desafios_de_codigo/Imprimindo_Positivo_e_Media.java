package edu.mp_oliveira.desafios_de_codigo;

import java.util.Scanner;

public class Imprimindo_Positivo_e_Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double soma = 0;
        double media;
        double x;

        //TOD0: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++ ) {
            x = leitor.nextDouble();
            if(x > 0){
                soma = soma + x;
                cont++;}


        }

        media = soma / cont;
        System.out.println(cont + " valores positivos");
        System.out.printf("%.1f%n", media);
    }
}
