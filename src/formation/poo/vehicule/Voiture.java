package formation.poo.vehicule;

public class Voiture extends Vehicule{
    private int nbPlace;

    public Voiture(){}

    public Voiture(String marque, String modele, int nbKm, int nbPlace) {
        super(marque, modele, nbKm);
        this.nbPlace = nbPlace;
    }

    public int getNbPlace() {
        return nbPlace;
    }

    public void setNbPlace(int nbPlace) {
        this.nbPlace = nbPlace;
    }

    @Override
    public String toString() {
        return super.toString()+",nbPlace:"+this.nbPlace;
    }
}
