class UniversityStudentManagement {
    // Static variable shared across all students
    private static String universityName = "Global University";
    private static int totalStudents = 0;

    // Final variable to ensure Roll Number cannot be changed
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor using 'this' to resolve ambiguity
    public UniversityStudentManagement(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; // Increment total students
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Method to display student details
    public void displayStudentDetails() {
        if (this instanceof UniversityStudentManagement) { // instanceof check
            System.out.println("University: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object");
        }
    }

    // Method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof UniversityStudentManagement) { // instanceof check
            this.grade = newGrade;
            System.out.println(name + "'s grade updated to: " + grade);
        } else {
            System.out.println("Invalid student object");
        }
    }

    public static void main(String[] args) {
        // Creating student objects
        UniversityStudentManagement student1 = new UniversityStudentManagement("Alice Johnson", 101, "A");
        UniversityStudentManagement student2 = new UniversityStudentManagement("Bob Williams", 102, "B");

        // Display student details
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Update grade of a student
        student1.updateGrade("A+");

        // Display total students
        UniversityStudentManagement.displayTotalStudents();
    }
}
