package xp.springframework.beans.factory;

import xp.springframework.beans.BeansException;

/**
 * 定义 bean 工厂接口获取 bean 实例
 *
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:40
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
