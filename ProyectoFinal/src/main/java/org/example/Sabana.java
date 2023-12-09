package org.example;

import java.security.DrbgParameters;

public class Sabana extends Habitat{

    private static final int CAPACIDAD_MAXIMA = 5;
    private Deposito<Animales> leones;

    public Sabana(){
        super(CAPACIDAD_MAXIMA);
        leones = new Deposito<>();
    }

    public void agregaLeon(Leon leon) throws SaturacionException{
        if(leones.sizeCosas()>= CAPACIDAD_MAXIMA){
            throw new SaturacionException("Área saturada");
        }
        /*else if (n<=0) {
            throw new SaturacionException("Área saturada");
        }*/
        else{
            leones.addCosas(leon);
        }
        leones.addCosas(leon);
    }

    public Leon quitaLeon(){
return null;
    }
}
