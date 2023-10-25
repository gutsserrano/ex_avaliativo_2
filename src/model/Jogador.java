package model;

import java.util.Random;

public class Jogador {
    private boolean maquina;
    private Coisa coisaEscolhida;
    private int ponto;

    public Jogador(boolean maquina) {
        this.maquina = maquina;
        if (maquina) {
            aleatorio();
        }
        ponto = 0;
    }


    public void escolha(int opcao) {
        switch (opcao) {
            case 1:
                coisaEscolhida = new Pedra();
                break;
            case 2:
                coisaEscolhida = new Papel();
                break;
            case 3:
                coisaEscolhida = new Tesoura();
                break;
            default:
                break;
        }
    }

    private void aleatorio() {
        Random gerador = new Random();

        if (maquina) {
            // Escolhe de 1 a 3
            escolha(gerador.nextInt(3) + 1);
        }

    }

    public Coisa getCoisaEscolhida() {
        return coisaEscolhida;
    }


    public boolean isMaquina() {
        return maquina;
    }


    public String getCoisaString() {
        Coisa jogada = getCoisaEscolhida();
        String retorno;

        if(jogada instanceof Pedra){
            retorno = "Pedra";
        }else if(jogada instanceof Papel) {
            retorno = "Papel";
        }else{
            retorno = "Tesoura";
        }

        return retorno;
    }


    public int getPonto() {
        return ponto;
    }

    public void addPonto() {
        ponto += 1;
    }
  

    

}
