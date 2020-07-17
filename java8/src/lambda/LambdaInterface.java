package lambda;

/**
 * Created by mada on 2020/4/10.
 */
@FunctionalInterface
public interface LambdaInterface {
    //int sum(int a,int b);
    //int dec(int a,int b);
    //String toString();
    //Car newCar(int money);
    //int show();
    void laSetMoney(int m);
    static int sub(int a,int b){
        System.out.println("NewInterface"+(a-b));
        return a-b;
    }
    default int mul(int a,int b){
        System.out.println("NewInterface"+a*b);
        return a*b;
    }

}
