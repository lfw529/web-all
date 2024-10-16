import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

public class MySpringTest {
    @Test
    public void testMySpring() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
        Object userBean = applicationContext.getBean("userBean");
        Object addressBean = applicationContext.getBean("addrBean");
        System.out.println(userBean);
        System.out.println(addressBean);
    }
}
