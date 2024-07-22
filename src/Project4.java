import java.util.Vector;

public class Project4 {

    public static int rand(int i) {
        return (int)(Math.random() * i);
    }

    public static void main(String[] args) {

        // Take note of the Vector type!
        Vector<IceCream> order = new Vector<>();
        // This is just like Coins and PaperCurrency
        ConfectionType[] types = ConfectionType.values();
        Flavor[] flavors = Flavor.values();
        Toppings[] toppings = Toppings.values();
        int x;

        // Code to test the Cone Class
        Cone cone = new Cone(ConeType.Waffle);
        for (x = 0; x < 2 ; x++)
            cone.add(new Confection(types[rand(types.length)], flavors[rand(flavors.length)]));
        cone.add(Toppings.ChocolateSprinkles);
        order.add(cone);

        // Code to test the Dish Class
        Dish dish = new Dish();
        for (x = 0; x < 3 ; x++)
            dish.add(new Confection(types[rand(types.length)], flavors[rand(flavors.length)]));
        dish.add(Toppings.MarshmallowCreme);
        order.add(dish);

        // Code to test the Sundae Class
        Sundae sundae = new Sundae();
        for (x = 0; x < 6 ; x++)
            sundae.add(new Confection(types[rand(types.length)], flavors[rand(flavors.length)]));
        for (x = 0; x < 4 ; x++)
            sundae.add(toppings[rand(toppings.length)]);
        order.add(sundae);

        /*
        Print the contents - each object has its own toString().
        This includes the objects filled with other objects.
         */
        System.out.println("\nThe order contains:");
        for (IceCream i : order)
            System.out.println(i);
    }
}

