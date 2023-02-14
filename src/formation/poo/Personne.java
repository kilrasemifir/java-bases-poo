package formation.poo;

import lombok.Data;

/**
 * Classe représentant une personne. Une personne possède un nom,
 * un prénom et une taille.
 */
public class Personne {
    // attributs ou variables d'instance
    private String nom;
    private String prenom;
    private double taille;

    /**
     * Constructeur de la classe personne.
     */
    public Personne(){}

    /**
     * Constructeur de la classe personne.
     * @param nom de la personne
     * @param prenom de la personne
     * @param taille de la personne
     */
    public Personne(String nom, String prenom, double taille){
        this.nom = nom;
        this.prenom = prenom;
        this.taille = taille;
    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom.toLowerCase();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getUsername(){
        return this.prenom +"."+this.nom;
    }

    // Methods
    public void afficher(){
        System.out.println("Je suis "+ this.prenom
                + " " + this.nom);
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", taille=" + taille +
                '}';
    }


}
