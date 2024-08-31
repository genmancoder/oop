public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person  p2 = new Person(1, "John", "Doe", "Banaybanay", 18);

        System.out.println("p1 " + p1.getId());

        Person []list = new Person[5];
        list[0] = p1;
        list[1] = p2;

        int id = list[1].getId();

        System.out.println(id);
        System.out.println(p2.getPersonInformation());
    }
}