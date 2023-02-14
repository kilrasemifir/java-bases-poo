package formation.poo.zoo.insectes;

public class Fourmie extends Insecte {

    private boolean piqureDouloureuse;

    public Fourmie() {
    }

    public Fourmie(double poids, double taille, boolean volant) {
        super(poids, taille, volant);
    }

    public boolean isPiqureDouloureuse() {
        return piqureDouloureuse;
    }

    public void setPiqureDouloureuse(boolean piqureDouloureuse) {
        this.piqureDouloureuse = piqureDouloureuse;
    }
}
