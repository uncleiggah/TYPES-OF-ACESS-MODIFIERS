import cure.Patient;
public class Doctor {
    public void viewPatient(Patient patient) {

        System.out.println("\n The Doctor's View ");
        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Sickness: " + patient.getSickness());
        System.out.println("Contact: " + patient.getcontact());
    }
}
