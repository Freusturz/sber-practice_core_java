package OOP;

public class PizzaDemo {
    public static void main(String[] args) {
        PizzaOrder pizzaOrder = new PizzaOrder("Пепперони", "Ягодная 10", PizzaSize.BIG, true);
        System.out.println(pizzaOrder);

        System.out.println();

        pizzaOrder.setSauce(true);
        pizzaOrder.setSize(PizzaSize.BIG);

        System.out.println();

        pizzaOrder.order();
        System.out.println(pizzaOrder);

        System.out.println();

        pizzaOrder.cancel();
        pizzaOrder.cancel();
        System.out.println(pizzaOrder);

        System.out.println();

        pizzaOrder.setAddress("Окружное шоссе 12");
        pizzaOrder.order();
        pizzaOrder.order();
        System.out.println(pizzaOrder);
    }
}
