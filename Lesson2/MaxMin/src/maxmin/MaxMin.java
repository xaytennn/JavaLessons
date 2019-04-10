package maxmin;
import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Input size: "); 
        Integer size = input.nextInt();
        Integer arr[] = new Integer[size];
        System.out.println(" Input elements: "); 
        for(int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        getMax(arr, size);
        getMin(arr, size);

    }
    private static void getMax(Integer[] arr, Integer size){
        Arrays.sort(arr);
        System.out.println(" Max element = " + arr[size-1]); 
        
    }  
    private static void getMin(Integer[] arr, Integer size){
        Arrays.sort(arr);
        System.out.println(" Min element = " + arr[0]);
    }  
}
