package formation.poo.zoo.insectes;

import formation.poo.zoo.Animal;

public class Insecte extends Animal {
    private boolean volant;

    public Insecte() {
    }

    public Insecte(double poids, double taille, boolean volant) {
        super(poids, taille);
        this.volant = volant;
    }

    public boolean isVolant() {
        return volant;
    }

    public void setVolant(boolean volant) {
        this.volant = volant;
    }
}
