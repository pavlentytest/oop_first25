public class Main {
    public static void main(String[] args) {


        /*
        1) Выбрать предметную область
        2) 4-5 сущностей (4-5 классов)
        3) Сделать опписания этих классов
        4) Сделать getter, setter
        5) Сделать 2 доп. методов - перегрузить и переопределить
        6) Реализовать наследования
        7) Сделать набор экземляров класса (объектов)
         */



        String test = "123123";
        Car car = new Car("Red",200,"Default");
        System.out.println(car.getPower()); // 200
        car.setPower(400);
        car.setPower(500);

        car.doMove();

        Car bmw = new Car("Black",220,"325");
        Car toyota = new Car("White",150,"Corolla");

        ECar tesla = new ECar("Red",1000,"Model X");
        ECar zeekr = new ECar("Black",1000,"001",500);
        zeekr.doMove();
        zeekr.doMove("Buu!");
        zeekr.setPower(1500);

    }
}
