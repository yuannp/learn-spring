package xp.springframework.beans.factory.config;

/**
 * 单例注册表
 *
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:29
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}
