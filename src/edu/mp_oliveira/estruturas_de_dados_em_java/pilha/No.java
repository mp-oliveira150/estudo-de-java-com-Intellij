package edu.mp_oliveira.estruturas_de_dados_em_java.pilha;

public class No {
    private int dado;
    private No refNo = null;


    public No(int dado) { // Construtor do dado.
        this.dado = dado;
    }
    public No() { // Construtor padrão.
    }
    // Getter and Setter
    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() { // Método para ler o dado na memória.
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
