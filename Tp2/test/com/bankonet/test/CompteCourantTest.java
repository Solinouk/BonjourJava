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
        int nbComptes = CompteCourant.nbComptesCourants;
        assertEquals(3, nbComptes);
    }

    @Test
    public void TesterModifierSolde() {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 100.00, 200.00);
        double nouveausolde = compte1.ModifierSoldeCompte(100.00);
        assertEquals(200, nouveausolde);
    }

}
