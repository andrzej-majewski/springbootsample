package hello;

import java.io.Closeable;
import java.util.Arrays;

import org.ikasan.flow.visitorPattern.VisitingInvokerFlow;
import org.ikasan.spec.flow.Flow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.transaction.TransactionManager;

@SpringBootApplication
@EnableAutoConfiguration

public class Application
{
    public static void main(String[] args) throws Exception
    {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames)
        {
            System.out.println(beanName);
        }
    }
}