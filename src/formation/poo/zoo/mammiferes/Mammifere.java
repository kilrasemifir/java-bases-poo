package formation.poo.zoo.mammiferes;

import formation.poo.zoo.Animal;

public class Mammifere extends Animal {
    protected String couleurPoil;

    public Mammifere(){
        super();
    }

    public Mammifere(double poids, double taille, String couleurPoil) {
        super(poids, taille);
        this.couleurPoil = couleurPoil;
    }

    public String getCouleurPoil() {
        return couleurPoil;
    }

    public void setCouleurPoil(String couleurPoil) {
        this.couleurPoil = couleurPoil;
    }

    @Override
    public String toString() {
        return "Mammifere{" +
                "couleurPoil='" + couleurPoil + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }
}
