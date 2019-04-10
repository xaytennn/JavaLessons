package countuser;


public class Teacher extends User {
    String favorite;
    
    void sayMeASecret(){
        System.out.println("My favorite student is " + favorite + "! <3");
    }
    
    public Teacher(String name, String secondName, String favorite){
        super(name,secondName);
        this.favorite = favorite;
    }
}
