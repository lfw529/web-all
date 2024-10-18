import com.lfw.biz.AccountService;
import com.lfw.biz.OrderService;
import com.lfw.service.ProductService;
import com.lfw.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    @Test
    public void testTransaction() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        // 生成订单
        orderService.generate();
        // 取消订单
        orderService.cancel();
        // 转账
        accountService.transfer();
        // 取款
        accountService.withdraw();
    }

    @Test
    public void testSecurity() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        ProductService productService = applicationContext.getBean("productService", ProductService.class);
        userService.getUser();
        userService.saveUser();
        userService.deleteUser();
        userService.modifyUser();
        productService.getProduct();
        productService.saveProduct();
        productService.deleteProduct();
        productService.modifyProduct();
    }
}
