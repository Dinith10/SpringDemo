package mainPackage;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

    public static void main(String[] args) {

    //  Triangle triangle = new Triangle();  triangle.draw();

      //  BeanFactory factory = new XmlBeanFactory(new FileSystemResource("C:\\Users\\Harshani Himali\\Desktop\\Spring Boot Work Space\\SpringDemo\\src\\spring.xml"));

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");


       Triangle triangle = (Triangle) context.getBean("triangle6");
       triangle.draw();



       ApplicationContext context2 = new ClassPathXmlApplicationContext("spring2.xml");

        Squre squre = (Squre) context2.getBean("squre2");
        squre.draw();


        ApplicationContext context3 = new ClassPathXmlApplicationContext("spring3.xml");

            Circle circle = (Circle) context3.getBean("circle");
            circle.draw();


        ApplicationContext context4 = new ClassPathXmlApplicationContext("spring4");

            TriangleAutowiring triangleAutowiring = (TriangleAutowiring) context4.getBean("autowiredTriangle");
            triangleAutowiring.draw();


        ApplicationContext context5 = new ClassPathXmlApplicationContext("spring4");

        TriangleAutowiring overridedAutowiredObject = (TriangleAutowiring) context4.getBean("OverrideAutowiredObject");
        overridedAutowiredObject.draw();




        ApplicationContext context7 = new ClassPathXmlApplicationContext("spring5.xml");

        Triangle2 applicationContext = (Triangle2) context7.getBean("triangle");
        applicationContext.draw();



        ApplicationContext context8 = new ClassPathXmlApplicationContext("spring7.xml");

        Triangle2 beanDefinitionInheritance = (Triangle2) context8.getBean("triangle7");


    }



}
