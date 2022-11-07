package packageProizvodi;

public class Chocolate extends Product{
    private int tezina;

    public Chocolate(String nazivProizvoda, int bar_code, double osnovna_cena, int tezina) {
        super(nazivProizvoda, bar_code, osnovna_cena);
        this.tezina=tezina;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Tezina: " + this.tezina + " gr.";
    }
}
