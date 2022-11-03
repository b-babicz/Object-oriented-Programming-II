import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Studenci extends Student {

    static ArrayList studenci = new ArrayList<Student>();


    public static void addStudent(String imie, String nazwisko, long numerAlbumu) {
        if (numerAlbumu == getNumerAlbumu())
            throw new RuntimeException("Wystąpił konfilkt danych! Istnieje student o wprowadzonym numerze albumu. Operacja nie może zostać wykonana!");
        else studenci.add(new Student(imie, nazwisko, numerAlbumu));
    }

    public static void removeStudent(Long numerAlbumu) {
        if (!Objects.equals(numerAlbumu, Student.getNumerAlbumu()))
            throw new RuntimeException("Nie istnieje student o podanym numerze indeksu! Sprawdź dane i wprowadź numer jeszcze raz!");
        else {
            for (Student student: studenci) {
                if (student.getNumerAlbumu().equals(numerAlbumu)) {
                    studenci.remove(student);
                    break;
                }
        }
    }

            public static void showStudentInfo() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Wprowadź numer albumu");
                ;
                long numerAlbumu = sc.nextLong();
                for (int index = 0; index < studenci.size(); index++) {
                    if (Student.getNumerAlbumu().equals(numerAlbumu)) {
                        System.out.println(sc.toString());
                        break;
                    }
                }
            }



}
