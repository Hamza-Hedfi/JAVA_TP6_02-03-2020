package com.deuterium.Ex_diapo13;

public class Developpeur extends Personne {
    private String specialite;

    public Developpeur(int id, String nom, String prenom, String mail, String telephone, double salaire, String specialite) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = getSalaire();
        double augmentation = salaireBase * 20 / 100;
        double salaireDeveloppeur = salaireBase + augmentation;
        return  salaireDeveloppeur;
    }
}
