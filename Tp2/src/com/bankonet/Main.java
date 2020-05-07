package com.bankonet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CompteCourant courant1 = new CompteCourant("0000", "courant1", 1000.05, -700);
        CompteCourant courant2 = new CompteCourant("0001", "courant2", -200.50, -300);
        CompteEpargne epargne1 = new CompteEpargne("AAAA", "epargne2", 15000.00, 2);
        CompteEpargne epargne2 = new CompteEpargne("BBBB", "epargne2", 1000.00, 1);

        Client durand = new Client("Du1","Durand", "Jean-Pierre", epargne1, courant1);
        Client bon = new Client("Bo1", "Bon", "Jean", epargne2, courant2);

        List<Client> listeClients = new ArrayList<>();
        listeClients.add(durand);
        listeClients.add(bon);

        for (Client c : listeClients) {
             double avoir = c.CalculAvoirGlobal();
             System.out.println("le client " + c.getNom() + " possède " + avoir + " euros");

        }


    }
}
