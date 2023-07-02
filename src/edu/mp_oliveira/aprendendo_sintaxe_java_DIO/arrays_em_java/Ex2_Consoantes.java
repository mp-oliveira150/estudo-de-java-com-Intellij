package edu.mp_oliveira.aprendendo_sintaxe_java_DIO.arrays_em_java;

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] vetor_de_consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do {
            System.out.print("Digite uma letra e aperte o botão enter: \n");
            String letra = scan.next();
            if (    !(letra.equalsIgnoreCase("a")|
                     letra.equalsIgnoreCase("e")|
                     letra.equalsIgnoreCase("i")|
                     letra.equalsIgnoreCase("o")|
                     letra.equalsIgnoreCase("u"))) {
                vetor_de_consoantes [count] = letra;
                quantConsoantes ++;}

            count ++;

        }while (count < vetor_de_consoantes.length);

        System.out.println("Há " + quantConsoantes + " Consoantes no vetor.");

        System.out.println("Consoantes: ");
        for (String consoantes: vetor_de_consoantes) {
            if (consoantes != null){
            System.out.print(consoantes + ", ");
            }
        }

    }
}
