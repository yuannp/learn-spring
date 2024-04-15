package xp.springframework.beans.factory.support;

import xp.springframework.beans.BeansException;
import xp.springframework.beans.factory.config.BeanDefinition;

/**
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:29
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    /**
     * 根据 bean 定义创建实例，并将实例放入缓存中
     *
     * @param beanName       指定 bean 名称
     * @param beanDefinition bean 定义信息
     * @return 返回创建实例
     * @throws BeansException 实例创建失败
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("failed to create instance. ", e);
        }
        addSingleton(beanName, bean);
        return bean;
    }

}
