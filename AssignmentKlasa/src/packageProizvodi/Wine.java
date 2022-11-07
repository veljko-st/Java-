package packageProizvodi;

public class Wine extends Product{
    private double zapremina;
    private static final double ALC_POREZ = 1.12;

    public Wine(String nazivProizvoda, int bar_code, double osnovna_cena, double zapremina) {
        super(nazivProizvoda, bar_code, osnovna_cena);
        this.zapremina=zapremina;
    }

    /*@Override
    int CenaSaPorezom() {
        int result = (osnovna_cena * (POREZ + 100 + ALC_POREZ))/100;
        return result;
    }*/

    @Override
    double CenaSaPorezom() {
        return super.CenaSaPorezom() * ALC_POREZ;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Zapremina: " + this.zapremina + " l";
    }
}
