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

    @Override
    public String toString() {
        return "Developpeur{" +
                "specialite='" + specialite + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    public void afficher() {
        System.out.println("Le salaire du developpeur " + nom + " " + prenom + " est : " + calculerSalaire() +  " dh, sa spécialité : " + specialite);
    }
}
