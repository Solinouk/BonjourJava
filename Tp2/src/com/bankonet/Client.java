package com.bankonet;

public class Client {

    private String identifiant;
    private String nom ;
    private String prenom;
    CompteEpargne compteEpargne;
    CompteCourant compteCourant;



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

    public void setCompteEpargne(CompteEpargne compteEpargne) {
        this.compteEpargne = compteEpargne;
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
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


}
