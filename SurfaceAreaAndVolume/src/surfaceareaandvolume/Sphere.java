package midexam;

public class Sphere extends ThreeDimensionalObject{
    private double radius;

    public Sphere(){
        this.radius=0;
    }

    public Sphere(double radius) {
        this.radius = radius;
    }

    public Sphere(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getSurfaceArea(){
        return 4*Math.PI*Math.pow(this.radius,2);
    }
    public double getVolume(){
        return (4/3)*Math.PI*Math.pow(this.radius,3);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                " Color= "+getColor()+
                "radius=" + radius +
                '}';
    }
}
