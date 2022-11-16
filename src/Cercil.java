public class Cercil extends Shape{
    private int radius;

    public Cercil(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Cercil(String name) {
        super(name);
    }

    @Override
    public double getPerimeter() {
        int p = (int) (2 * Math.PI * radius);
        System.out.println("Cersil perimater: "+ p);
        return p ;
    }

    @Override
    public String toString() {
        return "Cercil{" +
                "radius=" + radius +
                '}';
    }
}
