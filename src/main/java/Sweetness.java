public abstract class Sweetness {
    protected String name;
    protected double weight;
    protected int price;

    public Sweetness(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString(){
        return name + ":" + " " + weight + " " + price;
    }
}