package Person.Order;

import java.util.Vector;

public class Broker {
    private Vector<Order>orderList = new Vector<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void launchOrders(){
        for(Order order : orderList){
            order.execute();
        }
    }
}
