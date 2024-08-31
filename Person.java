public class Person{
    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private int age;

    public Person(){
        //default constructor
    }
    public Person(int id, String firstname, String lastname, String address, int age){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    
}