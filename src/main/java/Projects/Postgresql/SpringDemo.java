package Projects.Postgresql;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;

public class SpringDemo {
    public static void main(String[] args) {
        String conFile = "applicationContext.xml";
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(conFile);
        testdao testdao  = (Projects.Postgresql.testdao) context.getBean("testdao");
        test t = testdao.findbyid(2);
//        System.out.println("hello");
        System.out.println(t.getName());
        testdao.display();

//        testdao.insert();
    }
}
