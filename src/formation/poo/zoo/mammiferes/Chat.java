package formation.poo.zoo.mammiferes;

public class Chat extends Mammifere{

    public Chat(){

    }

    public Chat(double poids, double taille, String couleurPoil){
        super(poids, taille, couleurPoil);
    }

    public void Miaou(){
        System.out.println("Miaou");
    }

    @Override
    public String toString() {
        return "Chat{" +
                "couleurPoil='" + couleurPoil + '\'' +
                ", poids=" + poids +
                ", taille=" + taille +
                '}';
    }

}
