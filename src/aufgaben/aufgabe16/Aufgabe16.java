package aufgaben.aufgabe16;

public class Aufgabe16 {
    public static void main(String[] args) {
        String zeichenkette = "keine Zahl";

        try{
            Integer.parseInt(zeichenkette);
        }catch (NumberFormatException e){
            System.out.println("Fehler");
        }

    }

    public static int getValue(String s){
        if(s==null)throw new NullPointerException();
        return 0;
    }

    /*
     * c)
     * Es handelt sich um eine checked Exception.
     * Behandlung: Entweder mit try/catch umgeben oder
     * übert "throws MyOwnException" in der Methodensignatur an
     * aufrufende Methode übergeben.
     * Beispiele in Klasse Aufgabe16c
     */
}
