public class ShapesDemo {

    public static void main(String[] args) {
        double h = 15;
        double s = 5;
        double radius = 3;
        double height = 2;
        double boxValume = 100;

        Shape ball = new Ball(radius);
        Shape piramid = new Piramid(s,h);
        Shape Cylindr = new Cylinder(height, radius);

        Box box = new Box (boxValume);
        boolean addB = box.add(ball);
        System.out.println(addB); // Shape has volume - 113,1 , but free volume is 100,0 false

        boolean addP = box.add(piramid);
        System.out.println(addP); // free volume is 75,0 true

        boolean addC = box.add(Cylindr);
        System.out.println(addC); // free volume is 37,3 true




    }
}
