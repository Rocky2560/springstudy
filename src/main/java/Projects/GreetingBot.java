package Projects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingBot {
final private GreetingService service;

@Autowired
public GreetingBot(GreetingService service)
{
    this.service = service;
}

public void print()
{
    System.out.println(this.service.greet());
}

}
