package formation.poo.compte;

public class Compte {

    public double solde = 0.0;

    public void transfert(double somme){
        if (this.solde - somme < 0){
            System.out.println("Vous n'avez pas assez d'argent. Vous etes pauvre!");
        }
        else {
            this.solde += somme;
        }
    }
}
