package countuser;

import java.util.logging.*;



/**
 *  class User
 *  @author Vladislav Sviridov <vladsviridov2203@gmail.com>
 *  @version 1.2
 */
public class User {

    protected Integer id;
    public String name;
    public String secondName;
    final static Logger log = Logger.getLogger(User.class.getName());

    /**
     * Getting Identifier
     * @return id - Identifier
     */
    public Integer getId(){
        return this.id;
    }

    /**
     * Setting Identifier
     * @param id - Identifier
     */
    public void setId(Integer id){
        this.id = id;
    }

    static private Integer index = 1;

    /**
     * Parameter Assignment
     * @param name - Name of User
     * @param secondName - SecondName of User
     */
    public User(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
        this.id = index;
        index++;
    }

    /**
     * Index count
     */
    public User(){
        this.id = index;
        index++;
    }

    /**
     * Log information
     */
    public static void logMessages(String str){
        log.info(str);
    }
}
