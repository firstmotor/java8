package lambda;

import interf.NewInterface;
import interf.NewInterfaceImpl;

/**
 * Created by mada on 2020/4/10.
 */
public class TestMain {
    public static void main(String[] args) {

//        LambdaInterface l1=new LambdaInterface() {
//            @Override
//            public int sum(int a, int b) {
//                return a+b;
//            }
//        };
//        System.out.println(l1.sum(1,1));

//        LambdaInterface l2= (a,b) -> a+b;
//
//        System.out.println(l2.sum(1,1));

        //LambdaInterface l5 = money -> new Car(money);
//        LambdaInterface l3=Car::new;
//        System.out.println(l3.newCar(1));
//
//        LambdaInterface l4=Car::show;
//        System.out.println(l4.show());
        Car c=new Car(1);
        LambdaInterface l6=c::setMoney;
        l6.laSetMoney(1);
    }
}
