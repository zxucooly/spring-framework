package zxu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zxu.pojo.Dog;

/**
 * bean生命周期
 *
 * @author zxucooly
 */
public class BeanLifeCycleLearn {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:app.xml");
		Dog dog = context.getBean(Dog.class);
		System.out.println("dog = " + dog);
	}
}
