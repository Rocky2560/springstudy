package Projects.Import;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JdbcConfig.class,businessConfig.class})
public class MyAppConfig {
}
