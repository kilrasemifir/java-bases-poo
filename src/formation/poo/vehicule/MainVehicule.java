package formation.poo.vehicule;

public class MainVehicule {
    public static void main(String[] args) {
        Voiture v = new Voiture();
        v.setMarque("Peugeot");
        v.setModele("308");
        v.setNbKm(10000);
        v.setNbPlace(5);
        System.out.println(v);
    }
}
