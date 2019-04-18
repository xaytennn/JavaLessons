package countuser;
import java.util.Scanner;
/**
 *
 * @author Влад
 */
public class CountUser {

    public static void main(String[] args) {
        User tmp1 = new User();
        User tmp2 = new User();
        User tmp3 = new User();
      Student vlad = new Student("Vladislav", "Sviridov", 3);
      System.out.println(vlad.name +" " + vlad.secondName + " Course = " + 
              vlad.course + " Index = " + vlad.getId());
      Student roman = new Student("Roman", "Timofeev", 3);
      System.out.println(roman.name +" " + roman.secondName + " Course = " + 
              roman.course + " Index = " + roman.getId());
      System.out.println("tmp3 index = " + tmp3.getId());
      Teacher boris = new Teacher("Boris", "Bochkarev", "Vladislav");
      boris.sayMeASecret();
      System.out.println(boris.name + " " + boris.secondName 
              + " Index = " + boris.getId());
    }
    
}
