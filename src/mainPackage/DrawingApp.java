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



    }



}
