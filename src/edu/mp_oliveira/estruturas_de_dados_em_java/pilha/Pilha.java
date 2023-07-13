package edu.mp_oliveira.estruturas_de_dados_em_java.pilha;

public class Pilha {
    private No refNoEntradaPilha;
    public Pilha(){
        this.refNoEntradaPilha = null;
    }

    public void push(No newNo){ // Adiciona mais um dado a pilha.
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = newNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop(){ //Exclui o ultimo elemento colocado na pilha
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }return null;
    }

    public No top(){ //Retorna o último adicionado sem excluir.
        return refNoEntradaPilha;
    }
    public boolean isEmpty(){
//        if(refNoEntradaPilha == null) {
//            return true;
//        } return false;
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString(){
        String stringRetorno = "--------------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "--------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if (noAuxiliar != null){
                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "]}\n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{break;}
        }
        stringRetorno += "====================";
        return stringRetorno;
    }
}
