package interf;

/**
 * Created by mada on 2020/4/10.
 */
public class TestMain {
    public static void main(String[] args) {
        NewInterface myInterface=new NewInterfaceImpl();
        myInterface.mul(1,1);
        NewInterface.sub(1,1);
    }
}
