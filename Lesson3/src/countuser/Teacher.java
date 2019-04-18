package countuser;

/**
 *  class Teacher
 *  @author Vladislav Sviridov <vladsviridov2203@gmail.com>
 *  @version 1.2
 */

public class Teacher extends User {
    String favorite;

    /**
     *  Print the text
     */
    void sayMeASecret(){
        User.logMessages("My favorite student is " + favorite + "! <3");
    }

    /**
     * Inheritance from User
     * @param name - Name of teacher
     * @param secondName - SecondName of teacher
     * @param favorite - Favorite User
     */
    public Teacher(String name, String secondName, String favorite){
        super(name,secondName);
        this.favorite = favorite;
    }
}
