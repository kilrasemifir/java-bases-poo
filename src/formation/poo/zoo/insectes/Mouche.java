package formation.poo.zoo.insectes;

public class Mouche extends Insecte {

    public Mouche() {
    }

    public Mouche(double poids, double taille, boolean volant) {
        super(poids, taille, volant);
    }

    public String isChiant(){
        return "oui";
    }
}
