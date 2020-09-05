package org.kodluyoruz.trendyol.d.openclosed.good3;

public class PostgreDao implements OrderRepository {

    @Override
    public Order findOrder(Long orderId) {
        return new Order();
    }
}
