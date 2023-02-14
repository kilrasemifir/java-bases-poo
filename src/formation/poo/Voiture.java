package formation.poo;

public class Voiture {
    private String marque ="";
    private String modele ="";
    private int nbKm = 0;

    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public int getNbKm() {
        return nbKm;
    }

    public void setNbKm(int nbKm) {
        this.nbKm = nbKm;
    }

    /**
     * Fait rouler la voiture un certain nombre de km.
     * Cela incrémente son nombre de km.
     * @param km nombre de km parcouru
     */
    public void rouler(int km){
        this.nbKm += km;
    }

    /**
     * Affiche les caractéristiques de la voiture.
     */
    void afficher(){
        System.out.println("Je suis une "+ this.marque
                + " " + this.modele
                + " et j'ai parcouru " + this.nbKm + " km");
    }
}
