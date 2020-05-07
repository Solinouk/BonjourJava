package com.bankonet;

public class Client {

    private String identifiant;
    private String nom ;
    private String prenom;
    CompteEpargne compteEpargne;
    CompteCourant compteCourant;

    public String getIdentifiant() {
        return identifiant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    private static int nbClients;

    public Client(String identifiant, String nom, String prenom, CompteEpargne compteEpargne, CompteCourant compteCourant) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteEpargne = compteEpargne;
        this.compteCourant = compteCourant;
    }

    public CompteEpargne getCompteEpargne() {
        return compteEpargne;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public static int getNbClients() {
        return nbClients;
    }

    @Override
    public String toString() {
        return "Client{" +
                "identifiant='" + identifiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public double CalculAvoirGlobal()
    {
        return this.compteCourant.solde + this.compteEpargne.solde;
    }

}
