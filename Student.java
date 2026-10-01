public class Student {

    // The student's full name
    private String name;

    // The student's ID number
    private int studentId;

    // The student's GPA
    private double gpa;

    // The student's completed credit hours
    private int creditHours;

    // Whether the student is a club member
    private boolean isMember;

    //Full constructor
public Student(String name, int studentId, double gpa, int creditHours, boolean isMember) {
    this.name = name;
    this.studentId = studentId;
    this.gpa = gpa;
    this.creditHours = creditHours;
    this.isMember = isMember;

    studentCount++; // Adding the increment studentCount by 1 for PART 6
}
    //Default constructor
public Student() {
    this.name = "Unknown";
    this.studentId = 0;
    this.gpa = 0.0;
    this.creditHours = 0;
    this.isMember = false;

    studentCount++; // Adding the increment studentCount by 1 for PART 6
}
public String getName() {
    return name;
}

public int getStudentId() {
    return studentId;
}

public double getGpa() {
    return gpa;
}

public int getCreditHours() {
    return creditHours;
}

public boolean getIsMember() {
    return isMember;
}
public void setName(String name) {
    this.name = name;
}

public void setStudentId(int studentId) {
    this.studentId = studentId;
}
// Validate that GPA is between 0.0 and 4.0
  public void setGpa(double gpa) {
    if (gpa < 0.0 || gpa > 4.0) {
        System.out.println("Invalid GPA. Must be between 0.0 and 4.0.");
    } else {
        this.gpa = gpa;
    }
}
    // Validate that credit hours are not negative
public void setCreditHours(int creditHours) {
    if (creditHours < 0) {
        System.out.println("Invalid credit hours. Cannot be negative.");
    } else {
        this.creditHours = creditHours;
    }
}

public void setIsMember(boolean isMember) {
    this.isMember = isMember;
}

public String getClassStanding() {
    if (creditHours >= 0 && creditHours <= 29) {
        return "Freshman";
    } else if (creditHours >= 30 && creditHours <= 59) {
        return "Sophomore";
    } else if (creditHours >= 60 && creditHours <= 89) {
        return "Junior";
    } else {
        return "Senior";
    }
}

public boolean isHonorsEligible() {
    return gpa >= 3.5 && creditHours >= 30;
}

public void addCredits(int credits) {
    if (credits < 0) {
        System.out.println("Invalid credits. Cannot be negative.");
    } else {
        creditHours += credits;
    }
}

public String getInitials() {
    int spaceIndex = name.indexOf(" ");

    if (spaceIndex == -1) {
        return name.substring(0, 1);
    } else {
        return name.substring(0, 1) + name.substring(spaceIndex + 1, spaceIndex + 2);
    }
}

public String toString() {
    return "Student: " + name +
           "\nID: " + studentId +
           "\nGPA: " + gpa +
           "\nCredits: " + creditHours +
           "\nClass Standing: " + getClassStanding() +
           "\nMember: " + isMember;
}

    // Keeps track of how many Student objects are created
private static int studentCount = 0;

    // Stores the school name
private static String schoolName = "MSU Denver";

public static int getStudentCount() {
    return studentCount;
}

public static String getSchoolName() {
    return schoolName;
}

}
