package com.deuterium.Ex_diapo20;

public class Main {
    public static void main(String[] args) {
        Animal[] animaux = new Animal[5];
        animaux[0] = new Animal("Truc");
        animaux[1] = new Animal();
        animaux[2] = new Chien("Médor");
        animaux[3] = new Chat();
        animaux[4] = new Chat("Robert");

        for (var animal :
                animaux) {
            System.out.println(animal.getType());
        }
    }
}
