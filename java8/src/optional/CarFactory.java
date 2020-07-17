package optional;

import lambda.Car;

import java.util.Optional;

public class CarFactory {
    private Car car;
    private Integer count;


    //    public CarFactory(){
//        System.out.println("create CarFactory");
//    }
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


}
