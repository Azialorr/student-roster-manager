public class RosterManager {
    public static void main(String[] args) {

        Student student1 = new Student("Ada Lovelace", 10452, 3.75, 45, true); // Creating student 1 w/ full constructor
        Student student2 = new Student(); // Creating student 2 w/ default constructor
        // Confirm that both Student objects were created 
        System.out.println("Student 1 was created.");
        System.out.println("Student 2 was created.");

        // Printing out Student 1 info
        System.out.println("\nStudent 1 info:");
        System.out.println(student1.getName());
        System.out.println(student1.getStudentId());
        System.out.println(student1.getGpa());
        System.out.println(student1.getCreditHours());
        System.out.println(student1.getIsMember());
        // Print Student 2 information before updates
        System.out.println("\nStudent 2 info:");
        System.out.println(student2.getName());
        System.out.println(student2.getStudentId());
        System.out.println(student2.getGpa());
        System.out.println(student2.getCreditHours());
        System.out.println(student2.getIsMember());

        // Update Student 2 information
        student2.setName("Alan Turing");
        student2.setStudentId(20398);
        student2.setGpa(3.20);
        student2.setCreditHours(92);
        student2.setIsMember(false);
        // Printing out updated info on Student 2
        System.out.println("\nStudent 2 info After Updates:");
        System.out.println(student2.getName());
        System.out.println(student2.getStudentId());
        System.out.println(student2.getGpa());
        System.out.println(student2.getCreditHours());
        System.out.println(student2.getIsMember());

        // Test validation for invalid GPA and credit hour values
        student2.setGpa(5.0);
        student2.setCreditHours(-10);

        System.out.println("\nTesting student methods:");
        System.out.println("Student 1 standing: " + student1.getClassStanding());
        System.out.println("Student 1 honors eligible: " + student1.isHonorsEligible());
        System.out.println("Student 1 initials: " + student1.getInitials());

        System.out.println("\nAdding 30 credits to Student 1...");
        student1.addCredits(30);
        System.out.println("Student 1 new credits: " + student1.getCreditHours());
        System.out.println("Student 1 new standing: " + student1.getClassStanding());

        System.out.println("\nPrinting student1 using toString:");
        System.out.println(student1);

        System.out.println("\nTesting static methods:");
        System.out.println("School: " + Student.getSchoolName());
        System.out.println("Total students created: " + Student.getStudentCount());

        // Static methods are called using the class name because they belong to the class, not one object.

        System.out.println("========================================");
        System.out.println("       STUDENT ROSTER REPORT");
        System.out.println("========================================");
        System.out.println("School: " + Student.getSchoolName());
        System.out.println("Total Students Enrolled: " + Student.getStudentCount());
        System.out.println("----------------------------------------");
        System.out.println(student1);
        System.out.println("Initials: " + student1.getInitials());
        System.out.println("Class Standing: " + student1.getClassStanding());
        System.out.println("Honors Eligible: " + student1.isHonorsEligible());
        System.out.println("----------------------------------------");
        System.out.println(student2);
        System.out.println("Initials: " + student2.getInitials());
        System.out.println("Class Standing: " + student2.getClassStanding());
        System.out.println("Honors Eligible: " + student2.isHonorsEligible());
        System.out.println("----------------------------------------");
        System.out.println("Adding 30 credits to " + student1.getName() + "...");
        student1.addCredits(30);
        System.out.println("Updated Class Standing: " + student1.getClassStanding());
        System.out.println("========================================");
    }
}
