package week1;

public class Student {
  
    // TODO: khai báo các thuộc tính cho Student
    private String name;
    private String id;
    private String group;
    private String email;       
    // TODO: khai báo các phương thức getter, setter cho Student
    //SETTER:
    public void setName(String N){
        this.name = N;
    }
    public void setId(String I){
        this.id = I;
    }
    public void setGroup(String G){
        this.group = G;
    }
    public void setEmail(String E){
        this.email = E;
    }
    
    //GETTER
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public String getGroup(){
        return this.group;
    }
    public String getEmail(){
        return this.email;
    }
    /**
     * 
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
