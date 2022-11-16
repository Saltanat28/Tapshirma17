public class RightTriangle extends Shape{
    private int a;
    private int b;
    private int c;

    public RightTriangle(String name, int a, int b, int c) {
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
        System.out.println("right trangle: "+ p);
        return p;
    }

    @Override
    public String toString() {
        return "RightTrangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
