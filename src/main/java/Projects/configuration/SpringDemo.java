package Projects.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Projects.configuration.MyAppConfig;
import Projects.configuration.MyColor;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext  context= new AnnotationConfigApplicationContext(MyAppConfig.class);
        MyColor color = (MyColor) context.getBean("mycolorBean");
        color.printcolor();
    }
}
