package model;

public class Papel extends Coisa{

    @Override
    public boolean ganha(Coisa coisaEscolhidaMaquina) {
       return coisaEscolhidaMaquina instanceof Pedra;
    }
}

