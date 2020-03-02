package com.deuterium.Ex_diapo20;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public  String getType() {
        if (name != null)
        {
            return "Je suis un animal de nom " + name + ".";
        } else {
            return "Je suis un animal.";
        }
    }
}
