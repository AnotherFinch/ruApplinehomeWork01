import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Gift implements GiftMethod {

    private List<Sweetness> sweetness;
    private ArrayList<Double> list;
    private ArrayList<Integer> list1;

    public Gift() {
        sweetness = new ArrayList<Sweetness>();
    }

    @Override
    public void showThePrice() {
        double giftPrice = 0;
        for (Sweetness sweetness : sweetness) {
            giftPrice = giftPrice + sweetness.price;
        }
        System.out.println("Стоимость подарка составляет - " + giftPrice);
    }

    @Override
    public void showTheGift() {
        System.out.println("В подарке лежит:");
        for (Sweetness c : sweetness) {
            System.out.println(c);
        }
    }


    @Override
    public void showTheGiftWeight() {
        double giftWeight = 0;
        for (Sweetness sweetness : sweetness) {
            giftWeight = giftWeight + sweetness.weight;
        }
        System.out.println("Общий вес подарка составляет - " + giftWeight);
    }

    @Override
    public void removeSweetness(int index) {
        sweetness.remove(index);

    }

    @Override
    public void addSweetness(Sweetness sweet) {
        sweetness.add(sweet);


    }

    @Override
    public void reduceWeight(double weight) {
        while (true) {
            double total = 0;
            for (Sweetness c : sweetness) {
                total = total + c.weight;
            }
            if (total > weight) {
                removeMinWeightSweetness();
            } else break;
        }
    }

    private void removeMinWeightSweetness() {
        list = new ArrayList<Double>();
        double minWeightSweetness;
        for (Sweetness c : sweetness) {
            list.add(c.weight);
        }
        minWeightSweetness = Collections.min(list);
        Iterator<Sweetness> iterator = sweetness.iterator();
        while (iterator.hasNext()) {
            Sweetness sweetness = iterator.next();
            if (sweetness.weight == minWeightSweetness) {
                iterator.remove();
                break;
            }
        }
    }


    @Override
    public void reducePrice(int price) {
        while (true) {
            int total = 0;
            for (Sweetness c : sweetness) {
                total = total + c.price;
            }
            if (total > price) {
                removeMinPriceSweetness();
            } else break;
        }
    }


    private void removeMinPriceSweetness() {
        list1 = new ArrayList<Integer>();
        int minPriceSweetness;
        for (Sweetness c : sweetness) {
            list1.add(c.price);
        }
        minPriceSweetness = Collections.min(list1);
        Iterator<Sweetness> iterator = sweetness.iterator();
        while (iterator.hasNext()) {
            Sweetness sweetness = iterator.next();
            if (sweetness.price == minPriceSweetness) {
                iterator.remove();
                break;
            }
        }
    }
}
