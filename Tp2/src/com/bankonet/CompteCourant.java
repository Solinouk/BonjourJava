package com.bankonet;

public class CompteCourant extends Compte {
    private static int nbComptesCourants = 0;
    private double montantDecouvertAutorise;

    public static int getNbComptesCourants() {
        return nbComptesCourants;
    }

    public CompteCourant() {
        super();
        nbComptesCourants += 1;
    }

    public CompteCourant(String numeroCompte, String intitule, double solde, double montantDecouvertAutorise) {
        super(numeroCompte, intitule, solde);
        this.numeroCompte = numeroCompte;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    @Override // vérifie que le retrait ne dépasse pas le montant de découvert autorisé
    public boolean isDebitAutorise(double montant) {
        return retirerArgent(montant) >= this.montantDecouvertAutorise;
    }

    public String getNumeroCompte() {
        return numeroCompte;
    }
}
