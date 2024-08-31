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
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    //defining method
    public String getPersonInformation(){
        return this.id + " " + this.firstname + " " + this.lastname + " " + this.address + " " + this.age;
    }
}