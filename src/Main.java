import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("tytul1",new Osoba("szymon","szymanski",18), LocalDate.of(2015,9,17));
        Ksiazka ksiazka2 = new Ksiazka("tytul2",new Osoba("adam","mickiewicz",49), LocalDate.of(1999,4,21));
        Ksiazka ksiazka3 = new Ksiazka("tytul3",new Osoba("ali","hatabi",18), LocalDate.of(2021,1,1));
        ArrayList<Ksiazka> ksiazkas = new ArrayList<>();
        ksiazkas.add(ksiazka1);
        ksiazkas.add(ksiazka2);
        ksiazkas.add(ksiazka3);


        ArrayList<Osoba> users = new ArrayList<>();
        users.add(new Czytelnik("adam","Karczewski",27,ksiazkas));
        users.add(new Recenzent("szymon","szymanski",18,ksiazkas));


    }

}