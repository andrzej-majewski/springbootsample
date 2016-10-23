package hello;

import java.io.Closeable;
import java.util.Arrays;

import org.ikasan.flow.visitorPattern.VisitingInvokerFlow;
import org.ikasan.spec.flow.Flow;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

        Flow sourceFlow = context.getBean(Flow.class);

        sourceFlow.start();

      //  AccountService accountService = context.getBean(AccountService.class);
      //  accountService.createAccountAndNotify("josh");
//           System.out.println("Count is " + sourceFlow.getModuleName());
//        try {
//            // Using username "error" will cause service to throw SampleRuntimeException
//            service.createAccountAndNotify("error");
//        }
//        catch (SampleRuntimeException ex) {
//            // Log message to let test case know that exception was thrown
//            System.out.println(ex.getMessage());
//        }
//        System.out.println("Count is " + repository.count());
//        ((Closeable) context).close();

    }

}