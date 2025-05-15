public class Ssak extends Zwierze {

    protected double dlugoscOgona;


    Ssak(String nazwa, int wiek, double dlugoscOgona) {
        super(nazwa, wiek);
        this.dlugoscOgona = dlugoscOgona;
    }

    public void wyswietlDlugoscOgona() {
        if (dlugoscOgona == 0) {
            System.out.print("Brak ogona");
        } else
            System.out.println("dlugoscOgona = " + dlugoscOgona);
    }


    @Override
    String WydajDzwiek() {
        return "Muuu";
    }

    @Override
    String poruszajSie() {
        return "Galopem";
    }
}
