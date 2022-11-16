public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;


    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        int p = a + b + c;
        System.out.println("Tangle perimeter: "+ p);
        return p;
    }

    @Override
    public String toString() {
        return "Trangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
