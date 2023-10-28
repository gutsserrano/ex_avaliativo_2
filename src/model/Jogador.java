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

    // Instancia uma pedra, papel ou tesoura
    public void escolha(int opcao) { //setCoisa();
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

    // Escolhe aleatoriamente de 1 a 3
    private void aleatorio() {
        Random gerador = new Random();

        if (maquina) {
            escolha(gerador.nextInt(3) + 1);
        }

    }

    public Coisa getCoisaEscolhida() {
        return coisaEscolhida;
    }


    public boolean isMaquina() {
        return maquina;
    }


    // Transforma a coisa pra String
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
