package xp.springframework.beans.factory.support;

import xp.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition bean定义信息注册
 *
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:39
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
