import java.util.Scanner;

public class Square extends  Shape{
    private int a;
    private int b;

    public Square(String name, int a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }



    @Override
    public double getPerimeter() {
       int p = a * b;
        System.out.println("Square perimeter: " + p);
        return p;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
