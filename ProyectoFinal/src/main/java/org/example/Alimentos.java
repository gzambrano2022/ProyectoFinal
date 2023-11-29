package org.example;

abstract public class Alimentos {
    private Animales animal;
    public Alimentos(Animales animal) {
        this.animal = animal;
    }
    public abstract String sonido();
}
