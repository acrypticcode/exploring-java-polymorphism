public class Confection {

    private ConfectionType type;
    private Flavor flavor;

    public Confection(ConfectionType t, Flavor f){
        type = t;
        flavor = f;
    }

    @Override
    public String toString() {
        return type + "(" + flavor + ")";
    }
}

