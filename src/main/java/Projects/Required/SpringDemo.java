package Projects.Required;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        PaymentGateway myEmp = (PaymentGateway) context.getBean("paymentGateway");
        System.out.println(myEmp.toString());
    }
}
