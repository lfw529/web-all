import com.lfw.bank.Spring6Config;
import com.lfw.bank.pojo.Account;
import com.lfw.bank.service.AccountService;
import com.lfw.bank.service.impl.IsolationService1;
import com.lfw.bank.service.impl.IsolationService2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {
    @Test
    public void testTransfer() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTransfer2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.save(new Account("act-003", 2000.0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testIsolation1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        Account act = new Account("act-004", 1000.0);
        i2.save(act);
    }

    @Test
    public void testIsolation2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService1 i1 = applicationContext.getBean("i1", IsolationService1.class);
        i1.getByActno("act-004");
    }

    @Test
    public void testNoXml() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
