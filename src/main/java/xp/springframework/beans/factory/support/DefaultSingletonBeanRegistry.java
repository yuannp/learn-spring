package xp.springframework.beans.factory.support;

import xp.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认单例注册实现类
 *
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:39
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    /* 成品单例缓冲区 - 一级缓存 */
    private final Map<String, Object> singletonObjects = new HashMap<>();

    /**
     * 返回以给定名称注册的（原始）单例对象
     *
     * @param beanName 需要检索的 bean 名称
     * @return 注册的单例对象，如果没有找到则为 {@code null}
     */
    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 将给定的单例对象添加到该工厂的单例缓存中
     *
     * @param beanName        bean的名称
     * @param singletonObject 单例对象
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
