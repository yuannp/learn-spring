package xp.springframework;

import org.junit.Test;
import xp.springframework.bean.UserService;
import xp.springframework.beans.factory.config.BeanDefinition;
import xp.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author xp
 * @version 1.0
 * @since 2024/4/15 10:30
 */
public class ApiTest {


    @Test
    public void test_BeanFactory() {
        // 1、创建 bean 工厂
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2、注册 bean 定义信息
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3、获取 bean 实例
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();

        // 4、缓存获取 bean 单例
        UserService userServiceSingleton = (UserService) beanFactory.getSingleton("userService");
        userServiceSingleton.queryUserInfo();
    }
}
