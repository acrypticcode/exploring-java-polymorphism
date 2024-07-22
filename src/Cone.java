public class Cone implements IceCream {

    // RULES: only one scoop and no toppings

    private ConeType type;
    private Confection content = null;

    public Cone(ConeType ct){
        type = ct;

    }
    public void add(Confection c){
        if (content == null){
            content = c;
        }
        else
            System.out.println("Cone already has "+content+" (1 scoop only.)");
    }

    public void add(Toppings t){
        System.out.println("A Cone may not have toppings.");
    }


    @Override
    public String toString(){
        return type+" with "+content;
    }
}

