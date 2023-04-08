package Seminar6HW;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1 = CarBuilder.getInstance().setBrand("LiXiang").setModel("Model 1").setType("SUV").setPrice(8000000).build();
        Car car2 = new Car();
        car2 = CarBuilder.getInstance().setBrand("JAC").setType("SUV").setPowerOutPut(170).build();
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}
