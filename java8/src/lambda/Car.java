package lambda;

/**
 * Created by mada on 2020/4/10.
 */
public class Car {
    private int money;

    public static int show(){
        return 10;
    }
    public Car(int money){
        //System.out.println("Car");
        this.money=money;
    }
    public void setMoney(int money){
        System.out.println("Car  setMoney");
        this.money=money;
    }

    public int getMoney() {
        return money;
    }
}
