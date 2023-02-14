package formation.poo.zoo.reptiles;

import formation.poo.zoo.Animal;

public class Reptile extends Animal {
    protected double tempCorps;

    public Reptile(){
        super();
        System.out.println("Création d'un reptile");
    }

    public Reptile(double poids, double taille, double tempCorps){
        super(poids, taille);
        this.tempCorps = tempCorps;
    }

    public double getTempCorps() {
        return tempCorps;
    }

    public void setTempCorps(double tempCorps) {
        this.tempCorps = tempCorps;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "tempCorps=" + tempCorps +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
