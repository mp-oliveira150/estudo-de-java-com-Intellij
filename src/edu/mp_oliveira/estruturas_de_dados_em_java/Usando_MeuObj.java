package edu.mp_oliveira.estruturas_de_dados_em_java;

public class Usando_MeuObj {

    public static void main(String[] args) {

        //O tipo primitivo copia o valor do outro tipo primitivo para um seundo lugar na memória.

        int primitivo1 = 2;
        int primitivo2 = primitivo1;

        System.out.println("Primitivo1 = " + primitivo1 + " | " + "Primitivo2 = " + primitivo2 + "\n");
        primitivo1 = 5; //Altera apenas o primitivo1, pois está em um endereço de memória diferente do primitivo2;
        System.out.println("Primitivo1 = " + primitivo1 + " | " + "Primitivo2 = " + primitivo2 +"\n");


        //Usando a classe MeuObj:
        // Construtor do MeuObj;


        //O Objeto(Classe) copia o endereço de memória e não o valor em si.

        MeuObj objA = new MeuObj(2);
        MeuObj objB = objA;

        System.out.println("objA = " + objA + " | " + "objB = " + objB + "\n");
        objA.setNum(5); //Também altera o objB, pois está no mesmo endereço de memória que o objA;
        System.out.println("objA = " + objA + " | " + "objB = " + objB +"\n");

    }
}
