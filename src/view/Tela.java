package view;

import javax.swing.JOptionPane;

import model.Jogador;
import model.Jogo;

public class Tela{
    

    public int entrada(){
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
    
    public void mostra(int resultado, Jogador jgd1, Jogador jgd2){

        String title = "Pedra Papel Tesoura";
        

        switch (resultado) {
            case 1:
                JOptionPane.showMessageDialog(null, 
                "Jogador jogou: "+ jgd1.getCoisaString() + "\nMáquina jogou: "+ jgd2.getCoisaString() + "\nJogador ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);    
                break;

            case 2:
                JOptionPane.showMessageDialog(null,
                "Jogador jogou: "+ jgd1.getCoisaString() + "\nMáquina jogou: "+ jgd2.getCoisaString() + "\nMáquina ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);    
                break;

            case 3:
                JOptionPane.showMessageDialog(null,
                "Jogador jogou: "+ jgd1.getCoisaString() + "\nMáquina jogou: "+ jgd2.getCoisaString() + "\nEmpate!",
                title,
                JOptionPane.PLAIN_MESSAGE);    
                break;

            case 4:
                JOptionPane.showMessageDialog(null,
                "Máquina 1 jogou: "+ jgd1.getCoisaString() + "\nMáquina 2 jogou: "+ jgd2.getCoisaString() + "\nMáquina 1 ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);    
                break;

            case 5:
                JOptionPane.showMessageDialog(null,
                "Máquina 1 jogou: "+ jgd1.getCoisaString() + "\nMáquina 2 jogou: "+ jgd2.getCoisaString() + "\nMáquina 2 ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE);    
                break;
            default:
                break;
        }

        System.out.println(jgd1.getPonto());
        System.out.println(jgd2.getPonto());

    }

    public int tipoJogo(){
        int answer;
        String msg = "Escolha o tipo de jogo";
        String title = "Pedra Papel Tesoura";

        Object opcoes[] = {"Melhor de 3", "Uma partida"};
        
        answer = JOptionPane.showOptionDialog(null,
        msg,
        title,
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        opcoes,
        opcoes[1]
        );

        return answer;

    }

    public int input(){

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
