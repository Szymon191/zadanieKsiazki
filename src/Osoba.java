/**

 <Klasa Osoba tworzy uzytwkonika >

 <pole> : <typ>, <opis pola>
 <imie> <nazwisko> : <String>, pola przechowuje imie i nazwisko uzytkownika
 <wiek> : <int> pole przechowuje wiek uzytkownika
 @author: <Szymon> <Szymanski>

 **/
import java.util.Objects;


public class Osoba {

    private String imie,nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie) && Objects.equals(nazwisko, osoba.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
    }
}
