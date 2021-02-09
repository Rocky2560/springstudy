package Projects.Propertyfilejavaconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyApplicationConfig.class);
        MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
        System.out.println(dbConfig.toString());
        }
}
