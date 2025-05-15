public class Ptak extends Zwierze {


    protected double rozpientoscSkrzydel;


    Ptak(String nazwa, int wiek, double  rozpientoscSkrzydel) {
        super(nazwa, wiek);
    }

    public void wyswietlRozpientoscSkrzydel() {
        System.out.println("rozpientoscSkrzydel: " + rozpientoscSkrzydel);
    }

    @Override
    String WydajDzwiek() {
        return "Kraaa";
    }

    @Override
    String poruszajSie() {
        return "Lotem Koszacym";
    }
}
