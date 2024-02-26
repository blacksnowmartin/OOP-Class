public class Person {
    int nationalId;
    String fName;
    String sName;
    String address;
    String gender;

    Person(int id, String first){
        fName = first;
        nationalId = id;
    }

    void printDetails(){
        System.out.println(nationalId);
        System.out.println(fName);
        System.out.println(sName);
        System.out.println(address);
        System.out.println(gender);
    }
}
