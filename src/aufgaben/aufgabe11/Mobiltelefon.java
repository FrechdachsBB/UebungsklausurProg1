package aufgaben.aufgabe11;


import java.util.LinkedList;
import java.util.List;

public class Mobiltelefon {

    private int batLadung;
    private LinkedList<Integer> abgehendeNummern = new LinkedList<>(); //LinkedList eignet sich hier besser als Array, da die Größe dynamisch ist
    private LinkedList<Integer> ankommendeNummern = new LinkedList<>();//Erklärvideos zu Listen: https://www.youtube.com/watch?v=NbYgm0r7u6o https://www.youtube.com/watch?v=5dscMs2hnDI

    public Mobiltelefon(){
        aufladen();
    }

    public void aufladen(){
        batLadung=100;
    }

    public int getAnkommendeNummern(int index) {
        if(index > ankommendeNummern.size()-1 || index < 0)throw new IndexOutOfBoundsException();

        //Da Index 0 immer dem neusten Anruf entsprechen soll, wird hier "von hinten" auf die Liste zugegriffen.
        //0 gibt also das letzte (=neuste) Element der Liste zurück, 4 gibt das älteste zurück
        return ankommendeNummern.get(index);
    }

    public void anrufEmpfangen(int nummer){
        if(batLadung<=0)return;
        batLadung-=5;
        ankommendeNummern.addFirst(nummer);
        if(ankommendeNummern.size()>5)ankommendeNummern.removeLast();
    }

    public static void main(String[] args) {
        Mobiltelefon mobiltelefon = new Mobiltelefon();
        mobiltelefon.anrufEmpfangen(123456);
        mobiltelefon.anrufEmpfangen(789456);
        System.out.println(mobiltelefon.getAnkommendeNummern(0));
        System.out.println(mobiltelefon.getAnkommendeNummern(1));
    }
}
