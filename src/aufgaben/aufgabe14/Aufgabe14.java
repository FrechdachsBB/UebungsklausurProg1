package aufgaben.aufgabe14;

public class Aufgabe14 {

    //Schnellste Lösung
    public static String aufgabe14(double zahl){
        return String.format("%.2f",zahl).replace(',','.');
    }

    //Alternative Lösung mit Hinweisen aus Aufgabenstellung
    public static String aufgabe14Alternative(double zahl){
        double ergebnis = ((int)(zahl*100))/100d;
        return Double.toString(ergebnis);
    }

    public static void main(String[] args) {
        System.out.println(aufgabe14(1.123456));
        System.out.println(aufgabe14Alternative(1.123456));
    }

}
