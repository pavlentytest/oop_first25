public class Car {
    private String model;
    private int power;
    private String color;
    //private package
    protected int maxSpeed;

    public void setPower(int power) {
        if (power > 0) {
            this.power = power;
        }
    }

    public int getPower() {
        return power;
    }

    public Car(String color, int power, String model) {
        this.color = color;
        this.power = power;
        this.model = model;
    }

    public void doMove() {
        System.out.println("Car is moving!"); //ECar is moving!
    }
}

