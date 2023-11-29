package org.example;

public class Sabana extends Habitat{
    private Deposito<Leon> l;

    public Sabana() {
        l = new Deposito<>();
    }

    public void agregaAnimal(int n) throws SaturacionException{
        if(n > 5){
            throw new SaturacionException("Área saturada de leones");
        }
    }
}
