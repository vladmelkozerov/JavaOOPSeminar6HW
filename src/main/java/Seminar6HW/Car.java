package Seminar6HW;

public class Car {
    private String type;
    private String Brand;
    private String model;
    private Integer powerOutPut;
    private Integer maxSpeed;
    private Integer price;

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPowerOutPut(Integer powerOutPut) {
        this.powerOutPut = powerOutPut;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", Brand='" + Brand + '\'' +
                ", model='" + model + '\'' +
                ", powerOutPut=" + powerOutPut +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
