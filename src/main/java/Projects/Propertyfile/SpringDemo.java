package Projects.Propertyfile;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        String confFile = "applicationContext.xml";
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(confFile);
        MyDbConfig dbConfig = (MyDbConfig) context.getBean("dbConfig");
        System.out.println(dbConfig.toString());
        context.close();
        }
}
