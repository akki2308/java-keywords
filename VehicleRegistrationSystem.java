class VehicleRegistrationSystem {
    // Static variable shared across all vehicles
    private static double registrationFee = 5000.0; // Default registration fee

    // Final variable to ensure Registration Number cannot be changed
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor using 'this' to resolve ambiguity
    public VehicleRegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof VehicleRegistrationSystem) { // instanceof check
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        } else {
            System.out.println("Invalid vehicle object");
        }
    }

    public static void main(String[] args) {
        // Creating vehicle objects
        VehicleRegistrationSystem vehicle1 = new VehicleRegistrationSystem("John Doe", "Car", "ABC123");
        VehicleRegistrationSystem vehicle2 = new VehicleRegistrationSystem("Jane Smith", "Motorbike", "XYZ789");

        // Display vehicle details before updating registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update registration fee
        VehicleRegistrationSystem.updateRegistrationFee(6000.0);

        // Display vehicle details after updating registration fee
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
