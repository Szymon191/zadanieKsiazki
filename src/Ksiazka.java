/**

 <klasa Ksiazka tworzy ksiazki >

 <pole> : <typ>, <opis pola>
 <tytul> : <String>, zmienna przechowywujaca tytul ksiazki
 <autor> : <Osoba>, zmienna przechowywuje autora na podstawie klasy Osoba
 <dataWydania> : <LocalDate> zmienna przechowywujaca date wydania ksiazki
 @author: <Szymon> <Szymanski>

 **/
import java.time.LocalDate;
import java.util.Date;

public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private LocalDate dataWydania;

    public Ksiazka(String tytul, Osoba autor, LocalDate dataWydania) {
        this.tytul = tytul;
        this.autor = autor;
        this.dataWydania = dataWydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", dataWydania=" + dataWydania +
                '}';
    }
}
