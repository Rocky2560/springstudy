package Projects.Innerbeans;

public class PaymentGateway {
    private Order order;

    public PaymentGateway(Order ord)
    {
        this.order = ord;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void processOrder()
    {
        System.out.println("processing order:"+order.getItem());
    }
}
