package com.bankonet;

public abstract class Compte {

     protected String numeroCompte;
    protected String intitule ;
    protected double solde ;

    public Compte(String numeroCompte, String intitule, double solde) {
        this.numeroCompte = numeroCompte;
        this.intitule = intitule;
        this.solde = solde;
    }

    public Compte() {

    }

    public double ajouterArgent(double montant)
    {
        double nouveauSolde = this.solde + montant;
        return nouveauSolde;
    }

    public double retirerArgent(double montant)
    {
        if(montant >0)
        {
            this.solde = this.solde - montant;
            return this.solde;
        }
        else
        {
            this.solde = this.solde + montant;
            return this.solde;
        }
    }

    public abstract boolean isDebitAutorise(double montant);

    public  String toString() {
       return "numeroCompte='" + numeroCompte + '\'' +
                ", intitule='" + intitule + '\'' +
                '}';
    }



}
