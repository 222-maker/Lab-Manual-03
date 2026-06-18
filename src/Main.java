public class Main {
    public static void main(String[] args) {
        Order order = new Order(1001);

        OrderObserver priceObserver = new PriceObserver();
        OrderObserver quantityObserver = new QuantityObserver();

        order.attach(priceObserver);
        order.attach(quantityObserver);

        order.addItem(50);
        order.addItem(60);
        order.addItem(40);
        order.addItem(30);
        order.addItem(25);
        order.addItem(20);

        System.out.println(order);
    }
}