package edu.mp_oliveira.aprendendo_sintaxe_java_DIO.estrutura_de_repeticao_e_arrays_em_java.arrays_em_java;

import java.util.Random;
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorio1 = new int[20];

        for (int i = 0; i < numAleatorio1.length ;i++){
            int numAleatorio2 = random.nextInt(100);
            numAleatorio1[i] = numAleatorio2;
        }

        System.out.println("Números Aleatórios e seus sucessores: ");
        for (int num : numAleatorio1) {
            System.out.println(num + " --> " + (num + 1));

        }

    }
}

/*      Numeros aleatórios adicionados manualmente.

        Scanner scan = new Scanner(System.in);

        int[] numAleatorios = new int[20];

        System.out.println("Digite um número entre 0 e 100: ");


        for(int i = 0 ;i < numAleatorios.length ;) {
            int entrada_num = scan.nextInt();
            if (entrada_num >= 0 && entrada_num <= 100) {
                numAleatorios[i] = entrada_num;
                i++;
            } else System.out.println("Número inválido. Digite um número entre 0 e 100: ");

        }
        for (int numAleatorioSaida : numAleatorios ) {
            System.out.println("Números Aleatórios");
            System.out.println(numAleatorioSaida + " --> " + (numAleatorioSaida + 1));

        } */


