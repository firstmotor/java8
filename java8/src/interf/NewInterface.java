package interf;

/**
 * Created by mada on 2020/4/10.
 */
public interface NewInterface {
    int sum(int a,int b);
    static int sub(int a,int b){
        System.out.println("NewInterface"+(a-b));
        return a-b;
    }
    default int mul(int a,int b){
        System.out.println("NewInterface"+a*b);
        return a*b;
    }

}
