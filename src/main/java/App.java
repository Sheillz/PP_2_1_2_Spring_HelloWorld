import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);
        System.out.println(bean1.getMessage() + " " + bean1.hashCode() + " " + bean2.getMessage() + " " + bean2.hashCode() + " " + (bean1 == bean2));
        Cat cat1 = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(cat1 + " " + cat1.hashCode() + " " + cat2 + " " + cat2.hashCode() + " " + (cat1 == cat2));
    }
}