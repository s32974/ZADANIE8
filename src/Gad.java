public class Gad extends Zwierze {

    protected boolean czyMaOgon = false;

    Gad(String nazwa, int wiek, boolean czyMaOgon) {
        super(nazwa, wiek);
        this.czyMaOgon = czyMaOgon;
    }

    public void wyswietlCzyMaOgon() {
        System.out.println("CzyMaOgon: " + czyMaOgon);
    }


    @Override
    String WydajDzwiek() {
        return "Ssss";
    }

    @Override
    String poruszajSie() {
        return "Wenrzykiem";
    }


}
