package com.bankonet.test;

import com.bankonet.CompteEpargne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CompteEpargneTest {

    @Test
    public void TesterNbComptesEpargne() {
        new CompteEpargne();
        new CompteEpargne();
        new CompteEpargne();

        int nbComptes = CompteEpargne.getNbComptesEpargne();
        assertEquals(3, nbComptes);
    }

    public double crediter(double montant, double solde)
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", solde, 0);
        return epargne1.ajouterArgent(montant);
    }

    public double debiter(double montant, double solde)
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", solde, 0);
        return epargne1.retirerArgent(montant);
    }

    @Test
    public void TesterInteret()
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", 100, 2);
        assertEquals(102, epargne1.calculerInteret(), 0.5);
    }

    @Test
    public void TesterToString()
    {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", 0, 2);
        assertEquals("numeroCompte='0000', intitule='Dupont'}", epargne1.toString());
    }

    @Test
    public void isDebitAutorise()  {
        CompteEpargne epargne1 = new CompteEpargne("0000", "Dupont", 0, 2);
        assertFalse(epargne1.isDebitAutorise(100));
    }

}
