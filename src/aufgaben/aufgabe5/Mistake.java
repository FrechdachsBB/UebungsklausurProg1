/*package aufgaben.aufgabe5;

public class Mistake {

     // Mögliche Korrekturen:
     // public void Constructor(){}
     // oder
     // public Mistake() {}
     // oder
     // Zeile streichen, da Java sowieso den Default-Constructor stellt

    public Constructor ( ) {
    }

    //Kein Syntaxfehler, aber das Leerzeichen zwischen eckigen Klammer ist nicht notwendig
    public static void main (String [ ] args ) {
        String a , b ;
        a = "Resultat ist ";
        b == ":"; //Hier darf nur ein "=" genutzt werden
        int x = 5.0; //Zuweisung eines doubles zu einem int. Korrektur: int x = 5;
        double y = 3;
        int z;
        int res = add (x, z); //z wurde noch nicht intialisiert und kann daher noch nicht verwendet werden
                              //Korrektur: In Zeile darüber: int z = 0;
        try {
            String s = "15.0";
            int number = Integer.parseInt(s);
        } catch (Exception e) {
            printStackTrace(); //Korrektur: e.printStackTrace();
        } catch (NumberFormatException e) { //Die catch-Clause hat an dieser Stelle keine Wirkung
                                            //da bereits alle Fehler durch catch(Exception e) abgefangen wurden.
                                            //Korrektur: Die beiden catch-Blöcke tauschen
                                            //Alternative: Den zweiten Catch-Block weglassen, da er sowieso leer ist
        }
    }
    private static int add (int a, double c) { //Korrektur private static int add(int a, int c) {
        double res = x + y; //Korrekur: int res = a + c
        return res;

        res = res + 5;      //Unerreichbarer Code, da zuvor bereits ein return-Statement aufgerufen wird.
                            //Korrektur: Entweder über das return packen oder streichen
    }
}*/