package aufgaben.aufgabe9;

public class Kreis {

    private int centerX;
    private int centerY;
    private int radius;

    public Kreis(int centerX, int centerY, int radius){
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
    }

    public double getSurfaceArea(){
        return Math.PI * Math.pow(radius,2); // Fläche = Pi*radius²
    }

    public static void main(String[] args) {
        Kreis kreis = new Kreis(4,2,7);
        System.out.println(kreis.getSurfaceArea());
    }

}
