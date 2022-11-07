import packageProizvodi.Chocolate;
import packageProizvodi.Product;
import packageProizvodi.Wine;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Telefon", 1245, 15000);
        System.out.println(product.getInfo());

        Chocolate milka = new Chocolate("Milka", 243423, 200, 100);
        System.out.println(milka.getInfo());

        Wine vino = new Wine("Rubin", 234542, 40, 1.5);
        System.out.println(vino.getInfo());

        String str = "myString";
        str.trim();
        System.out.println(str);
    }
}