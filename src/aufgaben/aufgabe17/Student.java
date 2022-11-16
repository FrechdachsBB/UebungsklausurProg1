package aufgaben.aufgabe17;

import java.util.Scanner;

public class Student {

    private String name;
    private int semester;
    private int matrikelnummer;
    private static int studentenZaehler = 0;

    public Student(String name, int semester, int matrikelnummer){
        setName(name);
        setSemester(semester);
        setMatrikelnummer(matrikelnummer); //Prüfung der Matrikelnummer findet im Setter statt
        studentenZaehler++;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        if(matrikelnummer>99999 || matrikelnummer<=0)throw new IllegalArgumentException("Matrikelnummer zu lang");
        this.matrikelnummer = matrikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester=semester;
    }

    @Override
    public String toString(){
        return String.format("Student Name: %s, Semester: %d, Matrikelnummer: %d",name,semester,matrikelnummer);
    }

    public boolean equals(Student student){
        return this.getMatrikelnummer() == student.getMatrikelnummer();
    }

    public static Student newStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Namen einegeben: ");
        String name = scanner.next();
        System.out.print("Bitte Matrikelnummer eingeben: ");
        int matrikelnummer = Integer.parseInt(scanner.next());
        return new Student(name, 1, matrikelnummer);
    }


    public static void main(String[] args) {
        System.out.println(newStudent());
    }
}
