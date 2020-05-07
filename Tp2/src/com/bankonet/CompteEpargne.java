package com.bankonet;

public class CompteEpargne extends Compte{
    private double tauxInteret;
    private static int nbComptesEpargne =0;

    public CompteEpargne(String numeroCompte, String intitule, double solde, double tauxDInteret) {
        super(numeroCompte, intitule, solde);
        this.numeroCompte = numeroCompte;
        this.intitule = intitule;
        this.solde = solde;
        this.tauxInteret = tauxDInteret;
    }

    public double calculerInteret()
    {
        return this.solde * this.tauxInteret /100;
    }

    @Override //vérifie que le retrait ne dépasse pas le solde disponible
    public boolean isDebitAutorise(double montant) {
        if(retirerArgent(montant)<0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

//    public double getSolde() {return solde;}

    public String getIntitule() {
        return intitule;
    }

    public CompteEpargne() {
        nbComptesEpargne +=1;
    }

    public static int getNbComptesEpargne() {
        return nbComptesEpargne;
    }

}
