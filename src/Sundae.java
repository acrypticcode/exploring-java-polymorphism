import java.util.Vector;

public class Sundae extends Dish{

    // RULES: Up to 5 scoops and up to 3 toppings.

    public Sundae(){
        super();
        toppings = new Vector<>();
    }

    private Vector<Toppings> toppings;

    @Override
    public void add(Toppings t){
        if (toppings.size()<3)
            toppings.add(t);
        else
            System.out.println("A Sundae may only have 3 toppings maximum.");
    }

    @Override
    public void add(Confection c){
        if (scoops.size()<5)
            scoops.add(c);
        else
            System.out.println("A Sundae may only have 5 scoops maximum.");
    }

    public String toString(){
        String s = super.toString();
        s += "and "+toppings.size()+" toppings: ";
        for (Toppings topping: toppings){
            s += topping+" ";
        }
        return s;

    }
}

