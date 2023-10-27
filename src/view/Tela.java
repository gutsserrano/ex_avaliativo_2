package view;

import javax.swing.JOptionPane;

import model.Jogador;
import model.Jogo;

public class Tela{
    

    public void init(){
        Jogo jogo;
        jogo = new Jogo();

        int entrada = entrada();
        int input = 0;
        int contJ1 = 0;
        int contJ2 = 0;
        boolean melhorDeTres;

        melhorDeTres = jogo.isMelhorDeTres(tipoJogo());
        do{
            if(entrada == 1){
                input = input();
            }
            jogo.init(entrada, input);
            mostra(jogo.resultado(jogo.getJogador1(), jogo.getJogador2()), jogo.getJogador1(), jogo.getJogador2());
            contJ1 += jogo.getJogador1().getPonto();
            contJ2 += jogo.getJogador2().getPonto();

            System.out.println(contJ1);
            System.out.println(contJ2);
        }while(contJ1 < 2 && contJ2 < 2 && melhorDeTres);

        telaFinal(contJ1, contJ2, entrada);
    }

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
                jgd1.addPonto();  
                break;

            case 2:
                JOptionPane.showMessageDialog(null,
                "Jogador jogou: "+ jgd1.getCoisaString() + "\nMáquina jogou: "+ jgd2.getCoisaString() + "\nMáquina ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE); 
                jgd2.addPonto();   
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
                jgd1.addPonto();   
                break;

            case 5:
                JOptionPane.showMessageDialog(null,
                "Máquina 1 jogou: "+ jgd1.getCoisaString() + "\nMáquina 2 jogou: "+ jgd2.getCoisaString() + "\nMáquina 2 ganhou!",
                title,
                JOptionPane.PLAIN_MESSAGE); 
                jgd2.addPonto();   
                break;
            default:
                break;
        }

        /* System.out.println(jgd1.getPonto());
        System.out.println(jgd2.getPonto()); */

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
        opcoes[0]
        );

        return answer;

    }

    public void telaFinal(int pt1, int pt2, int entrada){
        int answer;
        String msg = "";

        if(entrada == 1){
            if(pt1 > pt2){
                msg = "O jogador ";
            }else{
                msg = "A máquina ";
            }
        }else{
            if(pt1 > pt2){
                msg = "A máquina 1 ";
            }else{
                msg = "A máquina 2 ";
            }
        }

        msg += "venceu a partida!";
        String title = "Pedra Papel Tesoura";

        Object opcoes[] = {"Jogar novamente", "Finalizar"};
        
        answer = JOptionPane.showOptionDialog(null,
        msg,
        title,
        JOptionPane.YES_NO_OPTION,
        JOptionPane.INFORMATION_MESSAGE,
        null,
        opcoes,
        opcoes[0]
        );

        if(answer == 0){
            init();
        }
    }

}
