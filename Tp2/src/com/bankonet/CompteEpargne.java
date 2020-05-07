package com.bankonet;

public class CompteEpargne {
    public double getSolde() {
        return solde;
    }

      public String getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }
    public static int getNbComptesEpargne() {
        return nbComptesEpargne;
    }

    private String numeroCompte;
    private String intitule ;
    private double solde ;
    private double tauxInteret;
    private static int nbComptesEpargne =0;

    public CompteEpargne(String numeroCompte, String intitule, double solde, double tauxDInteret) {
        this.numeroCompte = numeroCompte;
        this.intitule = intitule;
        this.solde = solde;
        this.tauxInteret = tauxDInteret;
    }

    public CompteEpargne() {
        nbComptesEpargne +=1;
    }

    public double AjouterArgent(double montant)
    {
        double nouveauSolde = this.solde + montant;
        return nouveauSolde;
    }

    public double RetirerArgent(double montant)
    {
        if(montant >0)
        {
            double nouveauSolde = this.solde - montant;
            return nouveauSolde;
        }
        else
        {
            double nouveauSolde = this.solde + montant;
            return nouveauSolde;
        }
    }

    public boolean RetraitValide(double montant) throws Exception {

        if(RetirerArgent(montant)<0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", intitule='" + intitule + '\'' +
                '}';
    }

    public double CalculerInteret()
    {
        return this.solde * this.tauxInteret /100;
    }


}
