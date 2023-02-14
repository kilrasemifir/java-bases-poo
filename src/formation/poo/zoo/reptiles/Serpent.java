package formation.poo.zoo.reptiles;

public class Serpent extends Reptile {

    private boolean venimeux;

    public Serpent() {
        System.out.println("Création d'un serpent");
    }

    public Serpent(double poids, double taille, double tempCorps) {
        super(poids, taille, tempCorps);
    }

    public boolean isVenimeux() {
        return this.venimeux;
    }

    public void setVenimeux(boolean venimeux) {
        this.venimeux = venimeux;
    }
}
