package com.bankonet.test;

import com.bankonet.CompteCourant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompteCourantTest {
    @Test
    public void TesterNbComptesCourants() {
        CompteCourant compte1 = new CompteCourant();
        CompteCourant compte2 = new CompteCourant();
        CompteCourant compte3 = new CompteCourant();
        int nbComptes = CompteCourant.getNbComptesCourants();
        assertEquals(3, nbComptes);
    }
/*
    public double ModifierSolde(double montant, double solde, double decouvert)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde, decouvert);
        double nouveauSolde = compte1.ModifierSoldeCompte(montant);
        return nouveauSolde;
    }
    */
    public double AjouterArgent(double montant, double solde)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde, 0);
        double nouveauSolde = compte1.AjouterArgent(montant);
        return nouveauSolde;
    }

    public double RetirerArgent(double montant, double solde)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde,0);
        double nouveauSolde = compte1.RetirerArgent(montant);
        return nouveauSolde;
    }

    @Test
    public void TesterAjouterArgentSoldePositif() {
        double nouveauSolde = AjouterArgent(100,  100);
        assertEquals(200, nouveauSolde);
    }

    @Test
    public void TesterAjouterArgentSoldeNegatif() {
        double nouveauSolde = AjouterArgent(100,  -100);
        assertEquals(0, nouveauSolde);
    }

    @Test
    public void TesterAjouterArgentSoldeNul() {
        double nouveauSolde = AjouterArgent(100,  0);
        assertEquals(100, nouveauSolde);
    }

    @Test
    public void TesterRetirerArgentSoldePositif() {
        double nouveauSolde = RetirerArgent(-100, 100);
        assertEquals(0, nouveauSolde);
    }

    @Test
    public void TesterRetirerArgentSoldeNegatif() {
        double nouveauSolde = RetirerArgent(-100, -100);
        assertEquals(-200, nouveauSolde);
    }
    @Test
    public void TesterRetirerArgentSoldeNul() {
        double nouveauSolde = RetirerArgent(-100, 0);
        assertEquals(-100, nouveauSolde);
    }



    /*
    @Test
    public void TesterRetraitSoldeNegatif()
    {
        double nouveauSolde = ModifierSolde(-100,-100, -200);
        assertEquals(-200, nouveauSolde);
    }

    @Test
    public void TesterDepotSoldeNegatif()
    {
        double nouveauSolde = ModifierSolde(100, -100, -200);
        assertEquals(0, nouveauSolde);
    }
*/
    @Test
    public void TesterDecouvert()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -200);
        double nouveauSolde = compte1.RetirerArgent(-300);
        boolean depasse = compte1.VerifierDepassementDecouvert(-300);
        assertEquals(true, depasse);
    }


    @Test
    public void TesterToString()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -100);
        String res = compte1.toString();
        assertEquals("CompteCourant{numeroCompte='0000', intitule='Dupont'}", res);

    }

    /*@Test
    public void TesterAjouterArgent() {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 100.00, 200.00);
        double nouveauSolde = compte1.ModifierSoldeCompte(100.00);
        assertEquals(200, nouveauSolde);
    }

    @Test
    public void TesterRetirerArgent() {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 100.00, 200.00);
        double nouveauSolde = compte1.ModifierSoldeCompte(-100.00);
        assertEquals(0, nouveauSolde);
    }*/

}
