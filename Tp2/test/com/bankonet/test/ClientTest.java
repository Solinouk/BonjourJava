package com.bankonet.test;

import com.bankonet.Client;
import com.bankonet.CompteCourant;
import com.bankonet.CompteEpargne;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {
    @Test
    public void TesterCreaClientSansCompte()
    {

        Client client1 = new Client("Dup1","Dupont", "Maurice", null, null);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertEquals(null, client1.getCompteCourant());
        assertEquals(null, client1.getCompteEpargne());
    }

     @Test
    public void TesterCreaClientCompteEpargne()
    {
        CompteEpargne  epargne1 = new CompteEpargne("12345", "dudu", 100,2);
        Client client1 = new Client("Dup1","Dupont", "Maurice", epargne1, null);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertEquals(null, client1.getCompteCourant());
        assertEquals("dudu", client1.getCompteEpargne().getIntitule());
    }

     @Test
    public void TesterCreaClientCourantEpargne()
    {
        CompteCourant courant1 = new CompteCourant("12345", "Dudu", 200, 200);
        Client client1 = new Client("Dup1","Dupont", "Maurice", null, courant1);
        assertEquals("Dupont", client1.getNom());
        assertEquals("Dup1", client1.getIdentifiant());
        assertEquals("12345", client1.getCompteCourant().getNumeroCompte());
        assertEquals(null, client1.getCompteEpargne());
    }
}
