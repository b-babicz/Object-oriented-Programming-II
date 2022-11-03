import java.util.Date;

public class Student {

    private String imie;
    private String nazwisko;
    private static Long numerAlbumu;
    private Date dataUtworzenia;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public static Long getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(Long numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public Student() {
    }

    public Student(String imie, String nazwisko, Long numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
        this.dataUtworzenia= new Date();
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numerAlbumu=" + numerAlbumu +
                ", dataUtworzenia=" + dataUtworzenia +
                '}';
    }
}
