package calc;
import java.util.Scanner;

public class Calc {

    public static final void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Double [] arr = new Double[15]; 
        String [] value = str.split("[+-/*]");
        for(int i = 0; i < 2;i++){
            arr[i] =  Double.parseDouble(value[i]);
        }
        if(str.indexOf("+") != -1) {
            Double result =  arr[0]+arr[1];
            System.out.println("Сумма равна = " +result);   
        }
        if(str.indexOf("-") != -1) {
            Double result =  arr[0]-arr[1];
            System.out.println("Разность равна = " +result);   
        }
        if(str.indexOf("/") != -1) {
            Double result =  arr[0]/arr[1];
            System.out.println("Частное равно = " +result);   
        }
        if(str.indexOf("*") != -1) {
            Double result  =  arr[0]*arr[1];
            System.out.println("Произведение равно = " +result);   
        } 
    }    
}
