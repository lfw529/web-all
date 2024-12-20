package com.lfw.service;

import io.minio.MinioClient;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * 在Spring框架中，@Resource 和 @Autowired 都是用于依赖注入的注解，但它们有一些关键的区别：
 * 来源：
 *
 * @Autowired 是Spring框架自己的注解，用于实现自动注入依赖。
 * @Resource 是Java标准的一部分（Java EE 5），由JSR-250规范定义，Spring框架支持这个注解，但它不是Spring特有的。
 * 注入方式：
 * @Autowired 默认是通过类型（byType）进行注入，如果存在多个相同类型的Bean，需要通过@Qualifier注解指定具体注入哪一个。
 * @Resource 默认是通过名称（byName）进行注入，可以通过name属性指定要注入的Bean的名称。如果没有指定name属性，当存在多个同类型的Bean时，@Resource将无法自动注入，因为它不知道选择哪一个。从Java EE 6开始，@Resource也可以通过类型进行注入，如果指定了name属性，则优先使用名称注入。
 * 限定符：
 * @Autowired 可以使用required属性来指定是否必须注入，如果设置为false，则当没有找到对应的Bean时，不会抛出异常。
 * @Resource 也有一个mappedName属性，但通常不用于注入，而是用于JNDI查找。
 * 位置：
 * @Autowired 可以用在字段、构造函数、设置方法和普通方法上。
 * @Resource 可以用在字段和设置方法上，但不能用于普通方法。
 * 作用域：
 * @Autowired 可以处理原型（prototype）作用域的Bean，可以应用在方法上进行懒加载。
 * @Resource 注入的Bean默认是单例的，不支持原型作用域。
 * 兼容性：
 * @Autowired 是Spring特有的，如果你的项目只使用Spring，那么使用@Autowired可能更合适。
 * @Resource 是Java EE的标准，如果你的项目需要兼容Java EE容器，那么使用@Resource可能更合适。
 * 优先级：
 * <p>
 * 在同一个字段或方法上同时使用@Autowired和@Resource时，@Autowired的优先级更高。
 */

@Service
public class MinIOService {

    @Resource
    private MinioClient minioClient;

    public void testMinIOClient() {
        System.out.println(minioClient);
    }
}