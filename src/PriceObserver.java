public class PriceObserver implements OrderObserver {

    @Override
    public void update(Order order) {
        if (order.getItemCost() > 200) {
            order.setDiscount(20.0);
        } else {
            order.setDiscount(0.0);
        }
    }
}