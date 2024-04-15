package xp.springframework.beans.factory.support;

import xp.springframework.beans.BeansException;
import xp.springframework.beans.factory.BeanFactory;
import xp.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象 bean 工厂
 *
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:37
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    /**
     * 获取指定 bean 实例
     *
     * @param name 需要检索 bean 实例名称
     * @return 一个 bean 实例
     * @throws BeansException 如果无法创建 bean 抛出异常
     */
    @Override
    public Object getBean(String name) throws BeansException {
        Object singleton = getSingleton(name);
        if (singleton == null) {
            singleton = createBean(name, getBeanDefinition(name));
        }
        return singleton;
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}
