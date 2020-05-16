import java.util.ArrayList;

public class Main {

    private static final double MAX_WEIGHT = 30.0;
    private static final int MAX_PRICE = 50;

        public static void main(String[] args) {

            Gift gift = new Gift();
            gift.addSweetness(new Apple("Яблоко из Италии", 7.2, 10, "red"));
            gift.addSweetness(new Cookie("Orio", 20.50, 20, "chocolate"));
            gift.addSweetness(new ChocolateBar("AlpineGold", 5.5 , 25, "square"));
            gift.showThePrice();
            gift.showTheGiftWeight();
            gift.removeSweetness(1);
            gift.showTheGift();
            gift.addSweetness(new Cookie("Orio", 20.50, 20, "chocolate"));
            gift.reduceWeight(MAX_WEIGHT);
            gift.showTheGift();

            gift.addSweetness(new Cookie("Orio", 20.50, 20, "chocolate"));
            gift.addSweetness(new ChocolateBar("AlpineGold", 5.5 , 25, "square"));
            gift.showTheGift();

            gift.reducePrice(MAX_PRICE);
            gift.showTheGift();
        }
    }
