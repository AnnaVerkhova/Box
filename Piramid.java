public class Piramid  extends Shape {
    private double h;
    private double s;

    public Piramid(double s, double h) {
        this.h = h;
        this.s = s;
    }

    public double getH() {
        return h;
    }
    public double getS(){
        return s;
    }
    public void setH(double h){
        this.h = h;
    }
    public void setS(double s){
        this.s = s;
    }
    @Override
    public double getVolume(){
        return (s * h)/ 3;
    }
}
