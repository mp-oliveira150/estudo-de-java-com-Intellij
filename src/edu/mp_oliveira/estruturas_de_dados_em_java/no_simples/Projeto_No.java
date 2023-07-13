package edu.mp_oliveira.estruturas_de_dados_em_java.no_simples;

public class Projeto_No {

    private String conteudo;
    private Projeto_No proximo_no;

    public Projeto_No(String conteudo){
        this.proximo_no = null;
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Projeto_No getProximo_no() {
        return proximo_no;
    }

    public void setProximo_no(Projeto_No proximo_no) {
        this.proximo_no = proximo_no;
    }

    @Override
    public String toString() {
        return "Projeto_No{" +
                "conteudo='" + conteudo + '\'' + "}";
    }
}
