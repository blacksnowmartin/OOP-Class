public class HIS {
    public static void main(String[] args) {
        Person pers1 = new Person(12345, "Haile");
        Person pers2 = new Staff("FA2125", "Jonathan", 123234);
        pers2.printDetails();
        System.out.println("---------------------");
        pers1.printDetails();
    }
}
