import cure.Patient;
public class Receptionist {
    public void viewsBasicInfor(Patient patient) {
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Contact: " + patient.getcontact());
    }
}
