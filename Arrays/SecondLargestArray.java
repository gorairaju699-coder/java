import java.util.*;
public class SecondLargestArray {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];

        
        for (int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int largest=number[0];
        int SecondLargest=number[0];
        for(int i=0;i<size;i++){            
            if(number[i]>largest){
                SecondLargest=largest;
                largest=number[i];
            }
            else if
                (number[i]>SecondLargest){
                    SecondLargest=number[i];
                }
            
        }
        System.out.println("largest element="+SecondLargest);

    
}
}
