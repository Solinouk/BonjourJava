package com.bankonet.test;

import com.bankonet.CompteCourant;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteCourantTest {
    @Test
    public void testernbcomptescourants() {
        new CompteCourant();
        new CompteCourant();
        new CompteCourant();
        int nbComptes = CompteCourant.getNbComptesCourants();
        assertEquals(3, nbComptes);
    }

    public double crediter(double montant, double solde)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde, 0);
        return compte1.ajouterArgent(montant);
    }

    public double debiter(double montant, double solde)
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", solde,0);
        return compte1.retirerArgent(montant);
    }

    @Test
    public void crediterSoldePositif() {
        assertEquals(200, crediter(100,  100));
    }

    @Test
    public void crediterSoldeNegatif() {
        assertEquals(0, crediter(100,  -100), 0.50);
    }

    @Test
    public void crediterSoldeNul() {
        assertEquals(100, crediter(100,  0), 0.50);
    }

    @Test
    public void debiterSoldePositif() {
        assertEquals(0, debiter(-100, 100), 0.50);
    }

    @Test
    public void debiterSoldeNegatif() {
        assertEquals(-200, debiter(-100, -100), 0.50);
    }

    @Test
    public void debiterSoldeNul() {
        assertEquals(-100, debiter(-100, 0), 0.50);
    }

    @Test
    public void testerDepassementDecouvert()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -200);
        assertFalse(compte1.isDebitAutorise(-300));
    }

    @Test
    public void testerNonDepassementDecouvert()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -200);
        assertTrue(compte1.isDebitAutorise(-200));
    }

    @Test
    public void testerToString()
    {
        CompteCourant compte1 = new CompteCourant("0000", "Dupont", 0, -100);
        assertEquals("numeroCompte='0000', intitule='Dupont'}", compte1.toString());
    }

}
