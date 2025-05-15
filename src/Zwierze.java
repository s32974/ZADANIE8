abstract class Zwierze {

    protected String nazwa;
    protected int wiek;

    Zwierze(String nazwa, int wiek) {
    }


    abstract String WydajDzwiek();

    abstract String poruszajSie();

    public void wyswietlInformacje() {
        System.out.println("nazwa-" + nazwa + " wiek-" + wiek);
    }


    //get set
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
