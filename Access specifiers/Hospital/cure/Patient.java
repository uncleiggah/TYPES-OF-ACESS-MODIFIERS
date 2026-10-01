package cure;

public class Patient {
    private static String Name;
    private static int Age;
    private static String sickness;
    private static String contact;

    public Patient(String name, int age, String sickness, String contact) {
        this.Name = name;
        this.Age = age;
        this.sickness = sickness;
        this.contact = contact;
    }

    public static String getName() {
        return Name;
    }

    public static int getAge() {
        return Age;
    }

    public static String getSickness() {
        return sickness;
    }

    public static String getcontact() {
        return contact;
    }
    public void setSickness(String sickness) {
        this.sickness = sickness;
    }
}
