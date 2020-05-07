package com.bankonet;

public class Client {
    private final String  identifiant;
    private final String nom ;
    private final String prenom;
    CompteEpargne compteEpargne;
    CompteCourant compteCourant;

    public String getIdentifiant() {
        return identifiant;
    }
    public String getNom() {
        return nom;
    }
    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }
    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public Client(String identifiant, String nom, String prenom, CompteEpargne compteEpargne, CompteCourant compteCourant) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteEpargne = compteEpargne;
        this.compteCourant = compteCourant;
    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public double calculAvoirGlobal()
    {
        return this.compteCourant.solde + this.compteEpargne.solde;
    }

}
