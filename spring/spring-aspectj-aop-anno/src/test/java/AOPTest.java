import com.lfw.service.Spring6Configuration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void testAOP() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation.xml");
        com.lfw.service.OrderService orderService = applicationContext.getBean("orderService", com.lfw.service.OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAOP2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation2.xml");
        com.lfw.service2.OrderService orderService = applicationContext.getBean("orderService", com.lfw.service2.OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAOP3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation3.xml");
        com.lfw.service3.OrderService orderService = applicationContext.getBean("orderService", com.lfw.service3.OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAOP4() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspectj-aop-annotation4.xml");
        com.lfw.service4.OrderService orderService = applicationContext.getBean("orderService", com.lfw.service4.OrderService.class);
        orderService.generate();
    }

    @Test
    public void testAOPWithAllAnnotation() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        com.lfw.service.OrderService orderService = applicationContext.getBean("orderService", com.lfw.service.OrderService.class);
        orderService.generate();
    }
}
