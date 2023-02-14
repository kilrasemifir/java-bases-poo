package formation.poo.vehicule;

public class Camion extends Vehicule{
    private double tailleRemorque;

    public Camion() {
    }

    public Camion(String marque, String model, int nbKm, double tailleRemorque){
        super(marque, model, nbKm);
        this.tailleRemorque = tailleRemorque;
    }

    public double getTailleRemorque() {
        return tailleRemorque;
    }

    public void setTailleRemorque(double tailleRemorque) {
        this.tailleRemorque = tailleRemorque;
    }
}
