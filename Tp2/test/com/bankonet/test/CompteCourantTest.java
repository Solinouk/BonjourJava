package com.bankonet.test;

import com.bankonet.CompteCourant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompteCourantTest {
    @Test
    public void testernbcomptescourants() {
        CompteCourant compte1 = new CompteCourant();
        CompteCourant compte2 = new CompteCourant();
        CompteCourant compte3 = new CompteCourant();
        int nbComptes = CompteCourant.getNbComptesCourants();
        assertEquals(3, nbComptes);
    }

    public double crediter(double montant, double solde)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde, 0);
        double nouveauSolde = compte1.ajouterArgent(montant);
        return nouveauSolde;
    }

    public double debiter(double montant, double solde)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde,0);
        double nouveauSolde = compte1.retirerArgent(montant);
        return nouveauSolde;
    }

    @Test
    public void crediterSoldePositif() {
        assertEquals(200, crediter(100,  100));
    }

    @Test
    public void crediterSoldeNegatif() {
        double nouveausolde = crediter(100,  -100);
        assertEquals(0, nouveausolde);
    }

    @Test
    public void crediterSoldeNul() {
        double nouveauSolde = crediter(100,  0);
        assertEquals(100, nouveauSolde);
    }

    @Test
    public void debiterSoldePositif() {
        double nouveauSolde = debiter(-100, 100);
        assertEquals(0, nouveauSolde);
    }

    @Test
    public void debiterSoldeNegatif() {
        double nouveauSolde = debiter(-100, -100);
        assertEquals(-200, nouveauSolde);
    }
    @Test
    public void debiterSoldeNul() {
        double nouveauSolde = debiter(-100, 0);
        assertEquals(-100, nouveauSolde);
    }

    @Test
    public void testerDecouvert()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -200);
        double nouveauSolde = compte1.retirerArgent(-300);
        boolean depasse = compte1.isDebitAutorise(-300);
        assertEquals(true, depasse);
    }


    @Test
    public void testerToString()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -100);
        String res = compte1.toString();
        assertEquals("numeroCompte='0000', intitule='Dupont'}", res);

    }


}
