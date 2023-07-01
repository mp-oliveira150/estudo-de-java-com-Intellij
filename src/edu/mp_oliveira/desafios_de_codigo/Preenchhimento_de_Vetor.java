package edu.mp_oliveira.desafios_de_codigo;
import java.util.Scanner;

public class Preenchhimento_de_Vetor {
    public static void main(String[] args) {
      Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] n  = new int[1000];
        int count = 0;
        long startTime = System.currentTimeMillis();

        for(int i = 0 ; i < n.length; i++){
            for (int j = 0 ;j < t;j++){
                if (count < n.length){
                    n[count] = j;
                    System.out.println("N[" + count + "] = " + n[count]);
                    count++;
                }
            }

        }
        long endTime = System.currentTimeMillis();
        long tempoDeExecucao = endTime - startTime;




// Desafio otimizado com "whille" (Menor repefições que no "for")

 //Scanner leitor = new Scanner(System.in);
 //       int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
        int[] n1  = new int[1000];
        int count1 = 0;
        long startTime1 = System.currentTimeMillis();

        if(t > 0){
            while(count1 < n1.length){
                for (int j1 = 0 ;j1 < t;j1++){
                    if (count1 == n1.length) {break;
                    } else {n1[count1] = j1;
                        System.out.println("N1[" + count1 + "] = " + n1[count1]);
                        count1++;
                    }
                }
            }
        } else System.out.println("Digite um número maior que 0.");

        long endTime1 = System.currentTimeMillis();
        long tempoDeExecucao1 = endTime1 - startTime1;
        System.out.println("Tempo de Execução: "+ tempoDeExecucao);
        System.out.println("Tempo de Execução: "+ tempoDeExecucao1);

    }
}