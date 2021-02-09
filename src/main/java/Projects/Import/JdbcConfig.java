package Projects.Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfig {
@Bean(name = "jdbcservice")
    public MyJdbcService getJdbcService()
{
    return new MyJdbcService();
}
}
