package mainPackage;

import java.util.List;

public class Circle {

    private List<Point> points ;


    private List <Integer> intvalues;


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points)  {
        this.points = points;
    }


    public List<Integer> getIntvalues() {
        return intvalues;
    }

    public void setIntvalues(List<Integer> intvalues) {
        this.intvalues = intvalues;
    }

    public void draw(){


        for ( Point p : points ){

            System.out.println("Circle drawn : ("+ p.getX() + ", " + p.getY() + ")");


        }




    }



}
