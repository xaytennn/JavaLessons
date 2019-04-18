package countuser;
/**
 *  class Student
 *  @author Vladislav Sviridov <vladsviridov2203@gmail.com>
 *  @version 1.2
 */
public class Student extends User {
    Integer course;

    /**
     * Inheritance from User
     * @param name - Name of student
     * @param secondName - SecondName of student
     * @param course - Course of student
     */
    public Student(String name, String secondName, Integer course){
        super(name,secondName);
        this.course = course;
    }

}
