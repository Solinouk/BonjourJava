package com.bankonet;

public abstract class Compte {

    protected String numeroCompte;
    protected String intitule ;
    protected double solde ;

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



    public  String toString() {
       return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", intitule='" + intitule + '\'' +
                '}';
    }

    public boolean RetraitValide(double montant)  {

        if(RetirerArgent(montant)<0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

}
