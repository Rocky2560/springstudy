package Projects.Autowired;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        String conffile = "applicationContext.xml";
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(conffile);
        PaymentGateway paymentGateway = (PaymentGateway) context.getBean("payment");
        System.out.println(paymentGateway.toString());
    }
}
