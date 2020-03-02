package com.deuterium.Ex_diapo20;

public class Chien extends Mammifere {
    public Chien(String name) {
        super(name);
    }

    public Chien() {
    }

    @Override
    public  String getType() {
        if (name != null)
        {
            return "Je suis un animal de nom " + name + ". Je suis un mammifère. Je suis un chien.";
        } else {
            return "Je suis un animal. Je suis un mammifère. Je suis un chien.";
        }
    }

}

