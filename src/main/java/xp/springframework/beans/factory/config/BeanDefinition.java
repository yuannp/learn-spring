package xp.springframework.beans.factory.config;

/**
 * bean 定义信息 实体
 *
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:28
 */
@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
