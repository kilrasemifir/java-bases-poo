package formation.poo.zoo.mammiferes;

public class Chien extends Mammifere {

    public Chien() {
    }

    public Chien(double poids, double taille, String couleurPoil) {
        super(poids, taille, couleurPoil);
    }

    public void aboyer(){
        System.out.println("Wouaf");
    }


}
