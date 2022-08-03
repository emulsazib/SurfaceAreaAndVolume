package midexam;

public class ThreeDimensionalObject {
    private String color;

    public ThreeDimensionalObject(){
        this.color=null;
    }

    public ThreeDimensionalObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ThreeDimensionalObject{" +
                "color='" + color + '\'' +
                '}';
    }
}
