package formation.poo;

import formation.poo.compte.Compte;
import formation.poo.zoo.Animal;
import formation.poo.zoo.mammiferes.Chat;
import formation.poo.zoo.mammiferes.Chien;
import formation.poo.zoo.mammiferes.Mammifere;
import formation.poo.zoo.reptiles.Serpent;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Personne p = new Personne("Truc", "Jean", 1.75);
//        p.afficher();
//        System.out.println(p.getNom());
//        Personne p2 = new Personne("Machin","Michelle", 1.9);
//        p2.afficher();
//        Voiture v = new Voiture("Audi", "A1");
//        v.rouler(250);
//        v.afficher();
//        Compte c = new Compte();
//        c.transfert(1000);
//        c.transfert(-100000);
//        c.solde += 100000000;
//        Temperature temp = new Temperature();
//        temp.setCelsius(20);
//        Temperature temp2 = new Temperature();
//        temp2.setCelsius(20);
//        System.out.println(temp);
//        System.out.println(temp.toString());
//        System.out.println("message = "+ temp);
//        System.out.println(new Personne("Truc", "Jean", 1.75));
//        Produit bananes = new Produit("Bananes", 0.75, 5);
//        Produit pommes = new Produit("Pommes", 0.8, 10);
//        Produit poires = new Produit("Poires", 1.20, 4);
//        System.out.println(bananes);
//        Commande commande = new Commande();
//        commande.addProduit(bananes);
//        commande.addProduit(pommes);
//        commande.addProduit(poires);
//        System.out.println(commande);
//        Produit pommes = new Produit("Pommes", 0.7, 3);
//        Produit poires = new Produit("Poires", 0.8, 2);
//        Produit ecran4K = new Produit("Ecran 4K", 500, 1);
//        Commande c = new Commande();
//        c.getProduits().add(bananes);
//        c.getProduits().add(pommes);
//        c.getProduits().add(poires);
//        c.getProduits().add(ecran4K);
//        c.getProduits().add(new Produit("Carottes", 0.5, 10));
//        System.out.println(c);
        List<Animal> animaux = new ArrayList<>();
        animaux.add(new Chat());
        animaux.add(new Chien());
        animaux.add(new Serpent());
        List<Object> objets = new ArrayList<>();
        objets.add(new Chat());
        objets.add(23);
        objets.add("Hello");
        objets.add(new ArrayList<>());


    }

    public static void afficher(Animal a){
        a.manger();
        System.out.println("Voici un animal "+a);
    }
}
