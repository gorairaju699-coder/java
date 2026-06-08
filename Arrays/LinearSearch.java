import java.util.*;
public class LinearSearch{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        for (int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<size;i++){ 
            if(key==number[i]){
                System.out.println("element founda index" +i);
                return;
            }
            }
            System.out.println("Element not found");
    
}
}

    

