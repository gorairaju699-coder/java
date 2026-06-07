import java.util.*;
public class ArrayOddEvenCount {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        int even=0;
        int odd=0;
        for (int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
           if(number[i]%2==0){
            even++;
        }
        else{
            odd++;    
        }   
       
        }
       System.out.println(even);
        System.out.println(odd);
    }
}
