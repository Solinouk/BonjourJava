package com.bankonet.test;

import com.bankonet.Client;
import com.bankonet.CompteCourant;

import com.bankonet.CompteEpargne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ClientTest {
    @Test
    public void testerCreaClientSansCompte()
    {
        Client client1 = new Client("Dup1","Dupont", "Maurice", null, null);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertNull(client1.getCompteCourant());
        assertNull(client1.getCompteEpargne());
    }

     @Test
    public void testerCreaClientCompteEpargne()
    {
        CompteEpargne  epargne1 = new CompteEpargne("12345", "dudu", 100,2);
        Client client1 = new Client("Dup1","Dupont", "Maurice", epargne1, null);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertNull(client1.getCompteCourant());
        assertEquals("dudu", client1.getCompteEpargne().getIntitule());
    }

     @Test
    public void testerCreaClientCourantEpargne()
    {
        CompteCourant courant1 = new CompteCourant("12345", "Dudu", 200, 200);
        Client client1 = new Client("Dup1","Dupont", "Maurice", null, courant1);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertEquals("12345", client1.getCompteCourant().getNumeroCompte());
        assertNull(client1.getCompteEpargne());
    }

    @Test
    public void testerCreaClientDeuxComptes()
    {
        CompteEpargne  epargne1 = new CompteEpargne("12345", "dudu", 100,2);
        CompteCourant courant1 = new CompteCourant("12345", "Dudu", 200, 200);
        Client client1 = new Client("Dup1","Dupont", "Maurice", epargne1, courant1);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertEquals("12345", client1.getCompteCourant().getNumeroCompte());
        assertEquals("dudu", client1.getCompteEpargne().getIntitule());
    }

    @Test
    public void testerCalculAvoirGlobal()
    {
        CompteEpargne  epargne1 = new CompteEpargne("12345", "dudu", 100,2);
        CompteCourant courant1 = new CompteCourant("12345", "Dudu", 200, 200);
        Client client1 = new Client("Dup1","Dupont", "Maurice", epargne1, courant1);
        assertEquals(300, client1.calculAvoirGlobal());
    }

}
