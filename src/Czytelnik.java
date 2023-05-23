/**

 <Klasa Czytelnik dziedziczy po klasie Osoby czytelnik posiada takze liste ksiazek ktore przeczytal>

 <pole> : <typ>, <opis pola>
 <listaKsiazek> : <ArrayList>, lista przechowywujaca ksiazki ktore czytelnik przeczytal
 <wypiszKsiazki> : <String()> metoda wypisujaca ksiazki z listy
 @author: <Szymon> <Szymanski>

 **/
import java.util.ArrayList;

public class Czytelnik extends Osoba
{
    private ArrayList<Ksiazka> listaKsiazek;
    public Czytelnik(String imie, String nazwisko, int wiek, ArrayList listaKsiazek) {
        super(imie, nazwisko, wiek);
        this.setListaKsiazek(listaKsiazek);
    }

    public void setListaKsiazek(ArrayList<Ksiazka> listaKsiazek) {
        this.listaKsiazek = listaKsiazek;
    }

    private String wypiszKsiazki()
    {
        for(Ksiazka ksiazka: listaKsiazek)
        {
            return ksiazka.toString();
        }
        return "brak ksiazek";
    }

    @Override
    public String toString() {
        return "Czytelnik{" +
                "listaKsiazek=" + listaKsiazek +
                "} " + super.toString();
    }
}
