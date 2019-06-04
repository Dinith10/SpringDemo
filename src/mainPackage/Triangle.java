package mainPackage;

public class Triangle {



    private String type;
    private int height;



    public Triangle() {
    }

    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getType() {

        return type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public  void draw(){

        System.out.println("Triangle drawn");
        System.out.println("Type = "+getType());
        System.out.println("Height = "+ getHeight());



    }






}
