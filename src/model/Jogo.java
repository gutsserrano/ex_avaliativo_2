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
        if(!jogador1.isMaquina()){
            if(jogador1.getCoisaEscolhida().ganha(jogador2.getCoisaEscolhida())) {
                System.out.println("jogador jogou: "+ jogador1.getCoisaString());
                System.out.println("Máquina jogou: "+ jogador2.getCoisaString());
                System.out.println("Jogador ganhou.");
            } else if (jogador2.getCoisaEscolhida().ganha(jogador1.getCoisaEscolhida())) {
                System.out.println("jogador jogou: "+ jogador1.getCoisaString());
                System.out.println("Máquina jogou: "+ jogador2.getCoisaString());
                System.out.println("Máquina Ganhou."); 
            } else {
                System.out.println("Empate");
            }
        }else{
            if(jogador1.getCoisaEscolhida().ganha(jogador2.getCoisaEscolhida())) {
                System.out.println("Máquina 1 jogou: "+ jogador1.getCoisaString());
                System.out.println("Máquina 2 jogou: "+ jogador2.getCoisaString());
                System.out.println("Máquina 1 ganhou.");
            } else if (jogador2.getCoisaEscolhida().ganha(jogador1.getCoisaEscolhida())) {
                System.out.println("Máquina 1 jogou: "+ jogador1.getCoisaString());
                System.out.println("Máquina 2 jogou: "+ jogador2.getCoisaString());
                System.out.println("Máquina 2 Ganhou."); 
            } else {
                System.out.println("Empate");
            }
        }
    }

    public static int entrada(){
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

        /* int retorno;
        System.out.println("Digite 1 para JxM ou 2 para MxM:");
        Scanner input = new Scanner(System.in);
        int valor = input.nextInt();
        input.close();

        if(valor != 1 || valor != 2){
            retorno = 0;
        }else{
            retorno = valor;
        } */

        return retorno;
    }

    public static int input(){
        /*Scanner input = new Scanner(System.in);
        int retorno = input.nextInt();
        input.close();*/

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

}
