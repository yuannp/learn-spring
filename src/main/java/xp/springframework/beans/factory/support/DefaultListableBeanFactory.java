package xp.springframework.beans.factory.support;

import xp.springframework.beans.BeansException;
import xp.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:39
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    /**
     * 注册 bean 定义信息
     *
     * @param beanName       指定 bean 名称
     * @param beanDefinition bean 定义信息
     */
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 获取指定 bean 定义信息
     *
     * @param beanName 待检索 bean 名称
     * @return 指定的 bean 定义信息
     * @throws BeansException 无法匹配异常
     */
    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) throw new BeansException("No bean named " + beanName + " is defined.");
        return beanDefinition;
    }

}
