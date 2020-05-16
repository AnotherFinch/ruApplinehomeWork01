import java.util.ArrayList;

public interface GiftMethod {


    void showThePrice();
    void showTheGift();
    void showTheGiftWeight();
    void removeSweetness(int index);
    void addSweetness(Sweetness sweetness);
    void reduceWeight(double weight);
    void reducePrice(int price);

}