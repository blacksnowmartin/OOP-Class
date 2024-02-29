public class Staff extends Person {
    String staffId;

    Staff(String aStaffId, String staffName, int nationalId) {
        super(nationalId, staffName);
        this.staffId = aStaffId;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("StaffPayroll: " + staffId);
    }
}
