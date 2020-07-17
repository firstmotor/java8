package optional;

import lambda.Car;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;
import java.util.function.Consumer;

public class testMain {


    public static void main(String[] args) {
        CarFactory f1=null;
        CarFactory f2=new CarFactory();

        /**
         * empty、of、ofNullable
         */
//        Optional.empty();
//        Optional<CarFactory> carFactory1=Optional.of(f1);
//        Optional<CarFactory> carFactory2=Optional.ofNullable(f1);
//        System.out.println(carFactory2.get());
        /**
         * isPresent 判断值是否为空
         */
        Optional<CarFactory> carFactory3=Optional.ofNullable(f1);
        Optional<CarFactory> carFactory4=Optional.ofNullable(f2);
//        System.out.println("carFactory3:"+carFactory3.isPresent());
//        System.out.println("carFactory4:"+carFactory4.isPresent());

        /**
         * ifPresent
         */
        Optional<CarFactory> carFactory5=Optional.ofNullable(f1);
        Optional<CarFactory> carFactory6=Optional.ofNullable(f2);
        carFactory5.ifPresent( f -> f.setCount(100));
        carFactory6.ifPresent( f -> f.setCount(100));
//        System.out.println(f1);
//        System.out.println(f2.getCount());

        /**
         * orElse、orElseGet、orElseThrow
         */
//        CarFactory carF=Optional.ofNullable(f1).orElse(f2);
        //System.out.println(carF);

        //CarFactory carF1=Optional.ofNullable(f2).orElse(new CarFactory());
//        CarFactory carF2=Optional.ofNullable(f2).orElseGet(() ->new CarFactory());
//        CarFactory carF3=Optional.ofNullable(f2).orElseThrow(() -> new RuntimeException());

        /**
         * map、flatMap、filter
         */
        System.out.println(Optional.ofNullable(f2).map(f->f.getCount()).orElse(100));


//        CarFactory f3=new CarFactory();
//        Car car=new Car(10);
//        f3.setCar(car);
//        System.out.println(getCarMoney(f3));
    }
    public static Integer getCarMoney(CarFactory factory){
//        if(factory!=null){
//            Car car=factory.getCar();
//            if(car!=null){
//                return car.getMoney();
//            }
//        }
//        return 0;
        return Optional.ofNullable(factory).map(f->f.getCar()).map(c -> c.getMoney()).orElse(0);
    }
}
