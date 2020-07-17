package interf;

/**
 * Created by mada on 2020/4/10.
 */
public class NewInterfaceImpl implements NewInterface {
    @Override
    public int sum(int a, int b) {
        return 0;
    }

    //@Override
    static int sub(int a,int b){
        System.out.println("NewInterfaceImpl"+(a-b));
        return a-b;
    }

    @Override
    public int mul(int a, int b){
        System.out.println("NewInterfaceImpl"+a*b);
        return a*b;
    }
}
