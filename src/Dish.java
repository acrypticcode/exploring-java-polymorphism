import java.util.Vector;

public class Dish implements IceCream {

    // RULES: Up to 2 scoops and no toppings.

    protected Vector<Confection> scoops;


    public Dish(){
        scoops = new Vector<>();
    }

    @Override
    public void add(Toppings t) {
        System.out.println("A Dish cannot have toppings. Perhaps you want a Sundae?");
    }

    @Override
    public void add(Confection c) {
        if (scoops.size()<2)
            scoops.add(c);
        else
            System.out.println("A Dish may only have 2 scoops maximum.");
    }

    @Override
    public String toString(){
        String s = "Dish with "+scoops.size()+" scoops: ";
        for (Confection scoop:scoops){
            s+=scoop+" ";
        }
        return s;
    }

}

