package com.deuterium.Ex_diapo13;

public class Main {

    public static void main(String[] args) {
        Developpeur d1 = new Developpeur(1, "BenFoulen1", "Foulen2", "Developpeur1@domain.com",
                "+216 11 111 111", 10000, "C#");
        Developpeur d2 = new Developpeur(2, "SALIM", "Karim", "salim.Karim@domain.com",
                "+216 22 222 222", 10000, "PHP");

        Manager m1 = new Manager(3, "LACHGAR", "Mohamed", "lachgar.mohamed@domain.com",
                "+216 33 333 333", 30000, "Informatique");
        Manager m2 = new Manager(4, "BenFoulen3", "Foulen3", "Manager2@domain.com",
                "+216 44 4444 444", 3200, "Informatique");

        m1.afficher();
        d2.afficher();
    }
}
