package midexam;

public class Cylinder extends ThreeDimensionalObject {
    private double radius;
    private double height;

    public Cylinder(){
        this.radius=0;
        this.height=0;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder(String color, double radius, double height) {
        super(color);
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
    public double getSurfaceArea(){
        return ((2*Math.PI*Math.pow(this.radius,2))+(2*Math.PI*this.radius*this.height)) ;
    }
    public double getVolume(){
        return Math.PI*Math.pow(this.radius,2)*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " Color= "+getColor()+
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
