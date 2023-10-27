package model;

public class Jogo {
    
    private Jogador jogador1;
    private Jogador jogador2;

    public Jogo() {
        
    }

    public void init(int tipo, int jogada) {
        switch (tipo) {
            case 1:
                jogador1 = new Jogador(false);
                jogador1.escolha(jogada);
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

    public Jogador getJogador1() {
        return jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }
    
    public boolean isMelhorDeTres(int modo){
        if(modo == 0){
            return true;
        }else{
            return false;
        }
    }

    public int resultado(Jogador j1, Jogador j2){

        int retorno;

        if(!j1.isMaquina()){
            if(j1.getCoisaEscolhida().ganha(j2.getCoisaEscolhida())) {

                retorno = 1; //Humano vence maquina
                //j1.addPonto();  

            } else if (j2.getCoisaEscolhida().ganha(j1.getCoisaEscolhida())) {

                retorno = 2; //Maquina vence humano
                //j2.addPonto();
                
                
            } else {

                retorno = 3; //Empate
     
            }
        }else{
            if(j1.getCoisaEscolhida().ganha(j2.getCoisaEscolhida())) {

                retorno = 4; //M1 vence M2
                //j1.addPonto();

            } else if (j2.getCoisaEscolhida().ganha(j1.getCoisaEscolhida())) {

                retorno = 5; //M2 vence M1
                //j2.addPonto();

            } else {

                retorno = 3;
                
            }
        }


        return retorno;
    }

    

    

    

}
