package packageProizvodi;

public class Product {
    private String nazivProizvoda;
    private int bar_code;
    double osnovna_cena;
    public static final double POREZ = 1.2;

    public Product(String nazivProizvoda, int bar_code, double osnovna_cena) {
        this.nazivProizvoda = nazivProizvoda;
        this.bar_code = bar_code;
        this.osnovna_cena = osnovna_cena;
    }

    double CenaSaPorezom(){
        double result = osnovna_cena * POREZ;
        return result;
    }

    public String getInfo() {
        return "Naziv proizvoda: " + this.nazivProizvoda + "\n" +
                "Bar kod: " + this.bar_code + "\n" +
                "Cena sa PDV-om: " + CenaSaPorezom();
    }
}
