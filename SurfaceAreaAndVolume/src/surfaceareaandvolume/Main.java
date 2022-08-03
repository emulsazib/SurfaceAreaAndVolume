package midexam;

public class Main {
    public static void main(String[] args) {
        //Sphere obj
        Sphere p1=new Sphere("Red",5.6);

        //Cylinder obj
        Cylinder p2=new Cylinder("Yollow",3.4,4.8);

        //Print Obj
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        //SurfaceArea
        System.out.println("The SurfaceArea is-");
        System.out.println(p1.getSurfaceArea());
        System.out.println(p2.getSurfaceArea());

        //Volume
        System.out.println("The Volume is-");
        System.out.println(p1.getVolume());
        System.out.println(p2.getVolume());

        if(p1.getSurfaceArea()>p2.getSurfaceArea()){
            System.out.println("P1 is greater then P2 for SurfaceArea ");
        }else {
            System.out.println("P2 is greater the p1 for SurfaceArea");
        }
        if(p1.getVolume()>p2.getVolume()){
            System.out.println("P1 is greater then P2 for Volume ");
        }else {
            System.out.println("P2 is greater the p1 for Volume");
        }
    }
}
