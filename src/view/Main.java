package view;

import model.Jogo;

public class Main {
    
    public static void main(String[] args) {

        Tela tela = new Tela();
        Jogo jogo;

        int entrada = tela.entrada();
        int input = 0;

        if(entrada == 1){
            input = tela.input();
        }

        jogo = new Jogo(entrada);
        jogo.escolher(input);

        tela.mostra(jogo.resultado(jogo.getJogador1(), jogo.getJogador2()), jogo.getJogador1(), jogo.getJogador2());

    }

}
