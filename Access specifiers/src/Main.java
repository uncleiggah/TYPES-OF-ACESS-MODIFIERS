import cure.Patient;
public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Sham",15,"Sleeping sickness","0774062066");
        Doctor doctor= new Doctor();
        Receptionist receptionist = new Receptionist();
        Administration administration = new Administration();
        System.out.println("\n PATIENT MANAGEMENT SYSTEM");
        doctor.viewPatient(patient);
        System.out.println("\n Receptionist");
        receptionist.viewsBasicInfor(patient);
        System.out.println("\n ADMINISTRATION");
        administration.FinancialInformation();
    }
}
