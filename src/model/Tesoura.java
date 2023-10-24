package model;

public class Tesoura extends Coisa{
    @Override
    public boolean ganha(Coisa coisa) {
       return coisa instanceof Papel;
    }
}