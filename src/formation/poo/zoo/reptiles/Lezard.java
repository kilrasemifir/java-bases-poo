package formation.poo.zoo.reptiles;

public class Lezard extends Reptile {

    private boolean regenere;

    public Lezard() {
    }

    public Lezard(double poids, double taille, double tempCorps) {
        super(poids, taille, tempCorps);
    }

    public boolean isRegenere() {
        return regenere;
    }

    public void setRegenere(boolean regenere) {
        this.regenere = regenere;
    }
}
