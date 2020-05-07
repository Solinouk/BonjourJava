package com.bankonet;

public class CompteCourant {
    private String numeroCompte;
    private String intitule ;
    private double solde ;
    private double montantDecouvertAutorise ;
    public static int nbComptesCourants =0;

    public CompteCourant() {
        nbComptesCourants +=1;
    }

    public CompteCourant(String numeroCompte, String intitule, double solde, double montantDecouvertAutorise) {
        this.numeroCompte = numeroCompte;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public double ModifierSoldeCompte(double montant)
    {
        double nouveauSolde = this.solde + montant;
        return nouveauSolde;
    }

    public boolean VerifierDepassementDecouvert(double montant)
    {
        boolean depasse = false;
        double nouveauSolde = ModifierSoldeCompte(montant);
        if(nouveauSolde < this.montantDecouvertAutorise)
        {
            depasse = true;
        }
        return depasse;
    }
}
