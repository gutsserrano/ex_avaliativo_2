package model;

public class Pedra extends Coisa {

    @Override
    public boolean ganha(Coisa coisa) {
       return coisa instanceof Tesoura;
    }
    
}
