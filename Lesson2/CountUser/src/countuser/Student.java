package countuser;

public class Student extends User {
    Integer course; 

    public Student(String name, String secondName, Integer course){
        super(name,secondName);
        this.course = course;
    }
    
}
