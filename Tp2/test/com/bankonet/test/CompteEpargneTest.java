package com.bankonet.test;

import com.bankonet.CompteEpargne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompteEpargneTest {

    @Test
    public void TesterNbComptesEpargne() {
        CompteEpargne epargne1 =  new CompteEpargne();
        CompteEpargne epargne2 =  new CompteEpargne();
        CompteEpargne epargne3 =  new CompteEpargne();

        int nbComptes = CompteEpargne.getNbComptesEpargne();
        assertEquals(3, nbComptes);
    }

    public double crediter(double montant, double solde)
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", solde, 0);
        double nouveauSolde = epargne1.ajouterArgent(montant);
        return nouveauSolde;
    }

    public double debiter(double montant, double solde)
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", solde, 0);
        double nouveauSolde = epargne1.retirerArgent(montant);
        return nouveauSolde;
    }

    @Test
    public void TesterInteret()
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", 100, 2);
        assertEquals(2, epargne1.calculerInteret(), 0.5);
    }

    @Test
    public void TesterToString()
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", 0, 2);
        String res = epargne1.toString();
        assertEquals("numeroCompte='0000', intitule='Dupont'}", res);
    }

    @Test
    public void isDebitAutorise()  {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", 0, 2);
        assertEquals(false,epargne1.isDebitAutorise(100) );
    }



}
