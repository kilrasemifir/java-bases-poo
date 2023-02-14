package formation.poo.vehicule;

public class Vehicule {
    protected String marque;
    protected String modele;
    protected int nbKm;

    public Vehicule(){}

    public Vehicule(String marque, String modele, int nbKm) {
        this.marque = marque;
        this.modele = modele;
        this.nbKm = nbKm;
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

    @Override
    public String toString() {
        return "marque:"+this.marque
                +",model"+this.modele
                +",nbKm"+this.nbKm;
    }
}
