package org.example;

public class Sabana extends Habitat{
    private Deposito<Animales> leon;

    public Sabana(int n) throws SaturacionException {
        leon = new Deposito<>();
        agregaAnimal(n);
    }

    public void agregaAnimal(int n) throws SaturacionException{
        if(n > 5){
            throw new SaturacionException("Área saturada");
        }
        /*else if (n<=0) {
            throw new SaturacionException("Área saturada");
        }*/
        else{
            for(int i=0;i<n;i++){
                Animales a = new Leon(i);
                leon.addCosas(a);
            }
        }
    }
}
