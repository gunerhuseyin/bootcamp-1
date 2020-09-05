package org.kodluyoruz.trendyol.d.openclosed.good3;

public class CouchbaseDao implements OrderRepository {

    @Override
    public Order findOrder(Long orderId) {
        return new Order();
    }
}
