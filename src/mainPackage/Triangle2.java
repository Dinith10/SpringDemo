package mainPackage;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle2 implements ApplicationContextAware, BeanNameAware {

    private Point pointA ;
    private Point pointB ;
    private Point pointC ;


    private ApplicationContext context;


    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw(){

        System.out.println( "Triangle2 Point A = ( " + getPointA().getX() + ", " + getPointA().getY() + " )");
        System.out.println( "Triangle2 Point B = ( " + getPointB().getX() + ", " + getPointB().getY() + " )");
        System.out.println( "Triangle2 Point C = ( " + getPointC().getX() + ", " + getPointC().getY() + " )");




    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.context = applicationContext;


    }


    @Override
    public void setBeanName(String beanName) {

        System.out.println("Bean Name is : "+ beanName);

    }


}
