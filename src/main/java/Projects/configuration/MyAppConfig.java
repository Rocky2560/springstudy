package Projects.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import Projects.configuration.MyColor;
import Projects.configuration.Redcolor;

@Configuration
public class MyAppConfig {
        @Bean(name = "mycolorBean")
        public MyColor getMyColors()
        {
            return  new Redcolor();
        }
}
