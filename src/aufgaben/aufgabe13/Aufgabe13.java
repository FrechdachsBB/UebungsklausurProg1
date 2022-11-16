package aufgaben.aufgabe13;

public class Aufgabe13 {
    private int[] vierzehnTage;

    public Aufgabe13(){
        vierzehnTage = new int[]{12,14,9,12,15,16,15,15,11,8,13,13,15,12}; //in der Klausur genügt es, die ersten drei Zahlen
                                                                           //zu schreiben (siehe Aufgabenstellung)
    }

    public double durchschnittstemperatur(){
        double sum = 0;
        for(int i:vierzehnTage){
            sum+=i;
        }
        return sum/vierzehnTage.length;
    }

    public int maximalTemperatur(){
        int ergebnis = vierzehnTage[0];
        for(int i:vierzehnTage){
            if(ergebnis<i)ergebnis=i;
        }
        return ergebnis;
    }

    public int groessterUmschwung(){
        int ergebnis = 0;
        for(int i=1; i<vierzehnTage.length;i++){
            int umschwung = Math.abs(vierzehnTage[i-1]-vierzehnTage[i]);
            if(umschwung>ergebnis)ergebnis=umschwung;
        }
        return ergebnis;
    }

    //Folgende main-Methode ist nicht Teil der Aufgabenstellung und soll nur die Funktionsweise testen
    public static void main(String[] args) {
        Aufgabe13 aufgabe13 = new Aufgabe13();
        System.out.println("Maximale Temperatur: " + aufgabe13.maximalTemperatur());
        System.out.println("Durchschnitt: " + aufgabe13.durchschnittstemperatur());
        System.out.println("Groesster Umschwung: " + aufgabe13.groessterUmschwung());

        /*
         * Maximale Temperatur: 16
         * Durchschnitt: 12.857142857142858
         * Groesster Umschwung: 5
         */
    }


}
