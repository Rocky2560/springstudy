package Projects.Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyAppConfig.class);
        MyJdbcService jdbc = (MyJdbcService) context.getBean("jdbcservice");
        jdbc.createJdbcConnection();
    }
}
