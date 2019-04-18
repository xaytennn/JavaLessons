package countuser;

/**
 *  class CountUser
 *  @author Vladislav Sviridov <vladsviridov2203@gmail.com>
 *  @version 1.2
 */
public class CountUser {

    public static void main(String[] args) {
        User tmp1 = new User();
        User tmp2 = new User();
        User tmp3 = new User();
        Student vlad = new Student("Vladislav", "Sviridov", 3);
        User.logMessages(vlad.name +" " + vlad.secondName + " Course = " +
                vlad.course + " Index = " + vlad.getId());//Test log

        Student roman = new Student("Roman", "Timofeev", 3);
        User.logMessages(roman.name +" " + roman.secondName + " Course = " +
                roman.course + " Index = " + roman.getId());
        User.logMessages("tmp3 index = " + tmp3.getId());
        Teacher boris = new Teacher("Boris", "Bochkarev", "Vladislav");
        boris.sayMeASecret();
        User.logMessages(boris.name + " " + boris.secondName
                + " Index = " + boris.getId());
    }

}
