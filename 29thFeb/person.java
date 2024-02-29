public class Person {
    int id;
    String name;

    public Person(int anId, String aName){
        id = anId;
        name = aName;
    }

    public void printDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
