package stackjava.com.springaspectj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello1 = (Hello) context.getBean("hello");
        hello1.method1();
        System.out.println("\n");
        hello1.method2();
        System.out.println("\n");
        try {
            hello1.method3();
        } catch (Exception e){
            System.out.println("Error!");
        }
    }

}
