public class HospitalInformationSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient(300, "John");
        Doctor salessio = new Doctor("Salessio", 305);
        patient1.printDetails();
        salessio.printDetails();
    }
}
