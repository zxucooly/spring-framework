package zxu;

import zxu.config.BeanConfig;
import zxu.pojo.Dog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * bean生命周期
 *
 * @author zxucooly
 */
public class BeanLifeCycleLearn {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("classpath:app.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Dog dog = context.getBean(Dog.class);
		System.out.println("dog = " + dog);
	}
}
