package com.bankonet;

public class CompteCourant extends Compte {
    //private String numeroCompte;
    //private String intitule ;
    //private double solde ;
    private double montantDecouvertAutorise ;
    private static int nbComptesCourants =0;

    public double getSolde() {
        return solde;
    }

    public static int getNbComptesCourants() {
        return nbComptesCourants;
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

    public double getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public void setMontantDecouvertAutorise(double montantDecouvertAutorise) {
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }



    public CompteCourant() {
        nbComptesCourants +=1;
    }

    public CompteCourant(String numeroCompte, String intitule, double solde, double montantDecouvertAutorise) {
        this.numeroCompte = numeroCompte;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    /*public double ModifierSoldeCompte(double montant)
    {
        double nouveauSolde = this.solde + montant;
        return nouveauSolde;
    }
     */

//    public double AjouterArgent(double montant)
//    {
//        double nouveauSolde = this.solde + montant;
//        return nouveauSolde;
//    }
//
//    public double RetirerArgent(double montant)
//    {
//        if(montant >0)
//        {
//            double nouveauSolde = this.solde - montant;
//            return nouveauSolde;
//        }
//        else
//        {
//            double nouveauSolde = this.solde + montant;
//            return nouveauSolde;
//        }
//    }

    public boolean VerifierDepassementDecouvert(double montant)
    {
        boolean depasse = false;
        double nouveauSolde = RetirerArgent(montant);
        if(nouveauSolde < this.montantDecouvertAutorise)
        {
            depasse = true;
        }
        return depasse;
    }


//    @Override
//    public String toString() {
//        return "CompteCourant{" +
//                "numeroCompte='" + numeroCompte + '\'' +
//                ", intitule='" + intitule + '\'' +
//                '}';
//    }


}
