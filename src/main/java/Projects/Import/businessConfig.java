package Projects.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class businessConfig {
    @Bean(name="busService")
        public MyBusinessService getBusinessService()
    {
        return new MyBusinessService();
    }

}
