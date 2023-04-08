package Seminar6HW;

public class CarBuilder {
    private static CarBuilder instance = null;
    Car obj;
    public static CarBuilder getInstance(){
        if (instance == null)
            instance = new CarBuilder();
        instance.obj = new Car();
        return instance;
    }
    public CarBuilder setType (String type){
        obj.setType(type);
        return this;
    }
    public CarBuilder setBrand (String brand){
        obj.setBrand(brand);
        return this;
    }
    public CarBuilder setModel (String model){
        obj.setModel(model);
        return this;
    }
    public CarBuilder setPowerOutPut (Integer powerOutPut){
        obj.setPowerOutPut(powerOutPut);
        return this;
    }
    public CarBuilder setMaxSpeed (Integer maxSpeed){
        obj.setMaxSpeed(maxSpeed);
        return this;
    }
    public CarBuilder setPrice (Integer price){
        obj.setPrice(price);
        return this;
    }
    public Car build(){return obj;}

    @Override
    public String toString() {
        return "CarBuilder{" +
                "obj=" + obj +
                '}';
    }
}
