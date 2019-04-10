package countuser;

public class User {
    
    protected Integer id;
    public String name;
    public String secondName;
    
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    static private Integer index = 1;
    public User(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
        this.id = index;
        index++;
    }
    public User(){
        this.id = index;
        index++;
    }
}
