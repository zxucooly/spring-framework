package zxu.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor：
 * 允许自定义对ApplicationContext的 bean definitions 进行修饰，扩展功能。
 *
 * 1、实现BeanFactoryPostProcessor 接口，会被Application contexts自动发现
 *
 * 2、BeanFactoryPostProcessor 仅仅对 bean definitions 发生关系，不能对bean instances 交互，
 * 对bean instances 的交互，由BeanPostProcessor的实现来处理
 *
 * 3、PropertyResourceConfigurer 是一个典型的实现 (PropertyResourceConfigurer 是BeanFactoryPostProcessor的一个实现）
 */
@Component
public class MyFilePlaceHolderBeanFactoryPostProcessor
        extends PropertySourcesPlaceholderConfigurer implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        List<Properties> list = new ArrayList<Properties>();
        Properties p = PropertiesLoaderUtils.loadAllProperties("config.properties");
        list.add(p);
        //这里是关键，这就设置了我们远程取得的List<Properties>列表  
        setPropertiesArray(list.toArray(new Properties[0]));
    }

}