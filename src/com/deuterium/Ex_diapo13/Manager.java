package com.deuterium.Ex_diapo13;

public class Manager extends Personne {
    private String service;

    public Manager(int id, String nom, String prenom, String mail, String telephone, double salaire, String service) {
        super(id, nom, prenom, mail, telephone, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    @Override
    public double calculerSalaire() {
        double salaireBase = getSalaire();
        double augmentation = salaireBase * 35 / 100;
        double salaireManager= salaireBase + augmentation;
        return salaireManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "service='" + service + '\'' +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", mail='" + mail + '\'' +
                ", telephone='" + telephone + '\'' +
                ", salaire=" + salaire +
                '}';
    }
}
