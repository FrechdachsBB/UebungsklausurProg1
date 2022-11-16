package aufgaben.aufgabe18;

public class Aufgabe18 {

    private String[] aktien = {};

    public double getKurs(String aktie){
        for(String s : aktien){ //for Loop um zu prüfen ob die Aktie überhaupt Teil des Arrays aktien[] ist
            if(s.equals(aktie)){
                return Math.random()*500+1; //wenn die Aktie gefunden wurde, wird eine Zufallszahl zwischen 1 und 500 erzeugt und zurückgegeben
            }
        }
        return 0; //Falls die Aktie nicht gefunden wurde, wird 0 zurückgegeben
    }

    public void aktieKaufen(String aktie){
        String[] neuesAktienDepot = new String[aktien.length+1]; //neues Array erstellen, das 1 größer ist als bisheriges Array
        System.arraycopy(aktien,0,neuesAktienDepot,0,aktien.length); //altes Array in das neue Array kopieren
        neuesAktienDepot[neuesAktienDepot.length-1]=aktie; //An die letzte Stelle die neue Atkie einfügen
        aktien = neuesAktienDepot; //altes Array mit neuem Array überschreiben
    }

    public boolean aktieVerkaufen(String aktie){
        boolean found = false;
        String[] neuesAktienDepot = new String[aktien.length-1]; //neues Array erstellen, das 1 kleiner ist als das bisherige Array

        for(int i=0; i< aktien.length && !found; i++){
            if(aktien[i].equals(aktie)){
                found=true;
                System.arraycopy(aktien,0,neuesAktienDepot,0,i); //kopiert alle Werte von 0 bis i-1 in das neue Array
                System.arraycopy(aktien, i+1, neuesAktienDepot, i, aktien.length-i-1); //kopiert alle Werte von i+1 bis Ende in das neue Array
                aktien = neuesAktienDepot; //altes Array mit neuem Array überschreiben
            }
        }
       return found; //Rückgabe, ob die Aktie erfolgreich verkauft wurde (optional)
    }

    public void ausgabe(){
        StringBuilder sb = new StringBuilder();
        for(String s: aktien){
            sb.append(s+ " ");
        }
        System.out.println(sb.toString());
    }

    //Beispielhafte main-Methode, um Code zu testen (nicht Teil der Aufgabenstellung)
    public static void main(String[] args) {
        Aufgabe18 meinDepot = new Aufgabe18();
        meinDepot.aktieKaufen("Google");
        meinDepot.aktieKaufen("SAP");
        meinDepot.aktieKaufen("Microsoft");
        meinDepot.aktieKaufen("IBM");
        meinDepot.ausgabe();

        System.out.println(meinDepot.getKurs("Google"));
        System.out.println(meinDepot.getKurs("Aktie, die ich nicht besitze"));

        meinDepot.aktieVerkaufen("SAP");
        meinDepot.ausgabe();

        meinDepot.aktieVerkaufen("Microsoft");
        meinDepot.ausgabe();

    }

}
