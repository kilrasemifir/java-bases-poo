package formation.poo;

public class Temperature {
    private double kelvin;

    public Temperature() {
    }

    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public double getCelsius(){
        return this.kelvin - 273.15;
    }

    public void setCelsius(double celsius){
        this.kelvin = celsius + 273.15;
    }

    public double getFahrenheit(){
        return this.getCelsius() * 9/5 + 32;
    }

    public void setFahrenheit(double fahrenheit){
        this.setCelsius((fahrenheit - 32) * 5/9);
    }

    public String toString(){
        return "Temperature: " + this.getCelsius() + "°C";
    }
}
