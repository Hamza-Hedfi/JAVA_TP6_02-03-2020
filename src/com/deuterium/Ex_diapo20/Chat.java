package com.deuterium.Ex_diapo20;

public class Chat extends Mammifere {
    public Chat(String name) {
        super(name);
    }

    public Chat() {
    }

    @Override
    public  String getType() {
        if (name != null)
        {
            return "Je suis un animal de nom " + name + ". Je suis un mammifère. Je suis un chat.";
        } else {
            return "Je suis un animal. Je suis un mammifère. Je suis un chat.";
        }
    }
}
