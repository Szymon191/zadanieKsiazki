/**

 <Klasa Recezent dziedziczy po klasie Osoby Recezent posiada takze liste ksiazek ktore przeczytal i ich ocene >

 <pole> : <typ>, <opis pola>
 <listaKsiazek> : <ArrayList>, lista przechowywujaca ksiazki ktore recezent przeczytal
 <wypiszKsiazki> : <String()> metoda wypisujaca ksiazki z listy oraz ich ocene
 @author: <Szymon> <Szymanski>

 **/
import java.util.ArrayList;
import java.util.Random;

public class Recenzent extends Czytelnik {

    ArrayList<Ksiazka> listaKsiazek;
    public Recenzent(String imie, String nazwisko, int wiek, ArrayList listaKsiazek) {
        super(imie, nazwisko, wiek, listaKsiazek);
        this.listaKsiazek = listaKsiazek;
    }

    private String wypiszKsiazki()
    {
        Random ran = new Random();
        for(Ksiazka ksiazka: listaKsiazek)
        {
            return ksiazka.toString() + "ocena:" + ran.nextInt();
        }
        return "brak ksiazek";
    }

}

