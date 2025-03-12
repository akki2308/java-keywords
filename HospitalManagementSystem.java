class HospitalManagementSystem {
    // Static variable shared across all patients
    private static String hospitalName = "City Care Hospital";
    private static int totalPatients = 0;

    // Final variable to ensure patient ID cannot be changed
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor using 'this' to resolve ambiguity
    public HospitalManagementSystem(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++; // Increment total patient count
    }

    // Static method to display the total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details
    public void displayPatientDetails() {
        if (this instanceof HospitalManagementSystem) { // instanceof check
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        } else {
            System.out.println("Invalid patient object");
        }
    }

    public static void main(String[] args) {
        // Creating patient objects
        HospitalManagementSystem patient1 = new HospitalManagementSystem("Alice Johnson", 30, "Fever", 101);
        HospitalManagementSystem patient2 = new HospitalManagementSystem("Bob Williams", 45, "Diabetes", 102);

        // Display patient details
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Display total number of patients
        HospitalManagementSystem.getTotalPatients();
    }
}
