package Projects.Propertyfilejavaconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/db.properties")
public class MyApplicationConfig {

    @Autowired
    Environment env;

    @Bean(name = "dbConfig")
    public MyDbConfig getDbConfig()
    {
        MyDbConfig dbConfig = new MyDbConfig();
        dbConfig.setDbHost(env.getProperty("db.host.url"));
        dbConfig.setDbPort(env.getProperty("db.port.number"));
        dbConfig.setDbService(env.getProperty("db.service.name"));
//        dbConfig.setDbUser(env.getProperty("db.user"));
        dbConfig.setDbPassword(env.getProperty("db.password"));
        return dbConfig;
    }

}
