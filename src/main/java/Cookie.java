public class Cookie extends Sweetness {
    String filling;

    public Cookie(String name, double weight, int price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }
}