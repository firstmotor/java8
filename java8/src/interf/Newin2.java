package interf;

public interface Newin2 {
    default int mul(int a,int b){
        System.out.println("NewInterface"+a*b);
        return a*b;
    }
}
