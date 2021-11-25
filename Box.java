public class Box extends Shape {

    public double volume;

    public Box(double volume) {
        this.volume = volume;
    }

    public Box() {

    }

    @Override
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public boolean add(Shape shape) {
        double boxValue = getVolume();
        if (shape.getVolume() < boxValue) {
            boxValue = boxValue - shape.getVolume();
            setVolume(boxValue);
            System.out.printf("free volume is %.1f " ,boxValue);
            return true;
        } else {
            System.out.printf("Shape has volume - %.1f , but free volume is %.1f ", shape.getVolume(), boxValue);
            return false;

        }
    }
}
