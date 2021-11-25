public class Cylinder extends SolidOfRevolution {
    public double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    @Override
    public double getVolume(){
        return (Math.PI * Math.pow(getRadius(), 2) * height);
    }

}
