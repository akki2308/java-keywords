class EmployeeManagementSystem {
    // Static variable shared across all employees
    private static String companyName = "TechCorp";
    private static int totalEmployees = 0;

    // Final variable to ensure Employee ID cannot be changed
    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this' to resolve ambiguity
    public EmployeeManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++; // Increment total employees
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof EmployeeManagementSystem) { // instanceof check
            System.out.println("Company: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object");
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem emp1 = new EmployeeManagementSystem("Alice Johnson", 101, "Software Engineer");
        EmployeeManagementSystem emp2 = new EmployeeManagementSystem("Bob Williams", 102, "Product Manager");

        // Display employee details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Display total employees
        EmployeeManagementSystem.displayTotalEmployees();
    }
}
