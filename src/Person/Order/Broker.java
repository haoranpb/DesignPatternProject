package Person.Order;

import java.util.Vector;

public class Broker {
    private Vector<Order>orderList = new Vector<>();

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void launchOrders(){
        System.out.println("\n\n------------Command test in Person------------");
        System.out.println("We will execute the orders one by one");
        for(Order order : orderList){
            order.execute();
        }
    }
}
