package function;
import java.util.*;
public class factorial{
    public static int fact(int x){
        int fact=1;
        for(int i=1; i<=x; i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
       int result=fact(x);
        System.out.println(result);
    }
}
