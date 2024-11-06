public class ECar extends Car {
    int batteryCapacity;

    public ECar(String color, int power, String model) {
        super(color, power, model);
    }

    public ECar(String color, int power, String model, int batteryCapacity) {
        super(color, power, model);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void doMove() {
        int maxSpeed1 = this.maxSpeed;
        System.out.println("ECar is moving!");
    }
    // перегрузка - overload
    public void doMove(String sound) {
        System.out.println("ECar make sound: " + sound);
    }
}
