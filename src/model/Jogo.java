package model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Jogo {
    
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo() {
        /* jogador1 = new Jogador(false);
        jogador1.escolha(opcao);

        jogador2 = new Jogador(true); */

        switch (entrada()) {
            case 1:
                jogador1 = new Jogador(false);
                jogador1.escolha(input());

                jogador2 = new Jogador(true);
                break;

            case 2:
                jogador1 = new Jogador(true);
                jogador2 = new Jogador(true);
                break;
        
            default:
                break;
        }
    }

    public void confronto() {

        mostra(jogador1, jogador2);
        
    }

    private static int entrada(){
        String answer;
        String msg = "Tipo de Jogo";
        String title = "Pedra Papel Tesoura";
        int retorno;

        Object opcoes[] = {"Humano X Máquina", "Máquina X Máquina"};
        
        answer = (String) JOptionPane.showInputDialog(null,
        msg,
        title,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes);

        switch (answer) {
            case "Humano X Máquina":
                retorno = 1;
                break;

            case "Máquina X Máquina":
                retorno = 2;
                break;
        
            default:
            retorno = 0;
                break;
        } 

        return retorno;
    }

    private static int input(){

        String answer;
        String msg = "Escolha:";
        String title = "Pedra Papel Tesoura";
        int retorno;

        Object opcoes[] = {"Pedra", "Papel", "Tesoura"};
        
        answer = (String) JOptionPane.showInputDialog(null,
        msg,
        title,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes);

        switch (answer) {
            case "Pedra":
                retorno = 1;
                break;

            case "Papel":
                retorno = 2;
                break;

            case "Tesoura":
                retorno = 3;
                break;
        
            default:
            retorno = 0;
                break;
        } 

        return retorno;
    }

    private static void mostra(Jogador j1, Jogador j2){

        String title = "Pedra Papel Tesoura";

        if(!j1.isMaquina()){
            if(j1.getCoisaEscolhida().ganha(j2.getCoisaEscolhida())) {
                /* System.out.println("jogador jogou: "+ j1.getCoisaString());
                System.out.println("Máquina jogou: "+ j2.getCoisaString());
                System.out.println("Jogador ganhou."); */

                JOptionPane.showMessageDialog(null, 
                "Jogador jogou: "+ j1.getCoisaString() + "\nMáquina jogou: "+ j2.getCoisaString() + "\nJogador ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);

            } else if (j2.getCoisaEscolhida().ganha(j1.getCoisaEscolhida())) {
                /* System.out.println("jogador jogou: "+ j1.getCoisaString());
                System.out.println("Máquina jogou: "+ j2.getCoisaString());
                System.out.println("Máquina Ganhou."); */
                
                JOptionPane.showMessageDialog(null, 
                "Jogador jogou: "+ j1.getCoisaString() + "\nMáquina jogou: "+ j2.getCoisaString() + "\nMáquina ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);

            } else {
                //System.out.println("Empate");

                JOptionPane.showMessageDialog(null, 
                "Empate!",
                title,
                JOptionPane.PLAIN_MESSAGE);
            }
        }else{
            if(j1.getCoisaEscolhida().ganha(j2.getCoisaEscolhida())) {
                /* System.out.println("Máquina 1 jogou: "+ j1.getCoisaString());
                System.out.println("Máquina 2 jogou: "+ j2.getCoisaString());
                System.out.println("Máquina 1 ganhou."); */

                JOptionPane.showMessageDialog(null, 
                "Máquina 1 jogou: "+ j1.getCoisaString() + "\nMáquina 2 jogou: "+ j2.getCoisaString() + "\nMáquina 1 ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);

            } else if (j2.getCoisaEscolhida().ganha(j1.getCoisaEscolhida())) {
                /* System.out.println("Máquina 1 jogou: "+ j1.getCoisaString());
                System.out.println("Máquina 2 jogou: "+ j2.getCoisaString());
                System.out.println("Máquina 2 Ganhou.");  */

                JOptionPane.showMessageDialog(null, 
                "Máquina 1 jogou: "+ j1.getCoisaString() + "\nMáquina 2 jogou: "+ j2.getCoisaString() + "\nMáquina 2 ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);

            } else {
                System.out.println("Empate");

                JOptionPane.showMessageDialog(null, 
                "Jogador jogou: "+ j1.getCoisaString() + "\nMáquina jogou: "+ j2.getCoisaString() + "\nEmpate",
                title,
                JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

}
