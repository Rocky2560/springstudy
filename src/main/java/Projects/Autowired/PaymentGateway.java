package Projects.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentGateway {
    public Order getOrder() {
        return order;
    }

    @Autowired
    private Order order;

  @Override
    public String toString(){
    return "ordering "+this.order.getItem()+" | price: "+this.order.getPrice();
    }
    }
