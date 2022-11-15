package aufgaben.aufgabe5;

public class Aufgabe5 {
    public static void main(String[] args) {
        double y = 3.14;
        int x = (int)y;
        System.out.println (x);
        //(…weitere Prioriätsregeln, Konvertierungsfunktionen…)
        Rational r = new Rational (1, 2);
        Rational s = r;
        r.num++;
        System.out.println (r.num);
        System.out.println (s.num);

    }




}
