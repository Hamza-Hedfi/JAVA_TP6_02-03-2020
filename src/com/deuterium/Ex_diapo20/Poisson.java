package com.deuterium.Ex_diapo20;

public class Poisson extends Animal {
    public Poisson(String name) {
        super(name);
    }

    public Poisson() {
    }

    @Override
    public  String getType() {
        if (name != null)
        {
            return "Je suis un poisson de nom " + name + ".";
        } else {
            return "Je suis un poisson.";
        }
    }
}
