class Education {

    String institutionName;
    String degree;
    String fieldOfStudy;
    int durationYears;
    String university;
    String location;
    int totalStudents;
    int totalFaculty;
    boolean government;
    String accreditation;
    double fees;
    String mediumOfInstruction;
    String semesterSystem;
    boolean hasHostel;
    boolean hasLibrary;
    boolean hasScholarship;
    String principalName;
    int establishedYear;
    String gradingSystem;
    boolean hasPlacement;

    Education(String institutionName, String degree, String fieldOfStudy,
              int durationYears, String university, String location,
              int totalStudents, int totalFaculty, boolean government,
              String accreditation, double fees, String mediumOfInstruction,
              String semesterSystem, boolean hasHostel, boolean hasLibrary,
              boolean hasScholarship, String principalName, int establishedYear,
              String gradingSystem, boolean hasPlacement) {

        this.institutionName = institutionName;
        this.degree = degree;
        this.fieldOfStudy = fieldOfStudy;
        this.durationYears = durationYears;
        this.university = university;
        this.location = location;
        this.totalStudents = totalStudents;
        this.totalFaculty = totalFaculty;
        this.government = government;
        this.accreditation = accreditation;
        this.fees = fees;
        this.mediumOfInstruction = mediumOfInstruction;
        this.semesterSystem = semesterSystem;
        this.hasHostel = hasHostel;
        this.hasLibrary = hasLibrary;
        this.hasScholarship = hasScholarship;
        this.principalName = principalName;
        this.establishedYear = establishedYear;
        this.gradingSystem = gradingSystem;
        this.hasPlacement = hasPlacement;
    }

    void displayEducation() {
        System.out.println("Institution Name: " + institutionName);
        System.out.println("Degree: " + degree);
        System.out.println("Field Of Study: " + fieldOfStudy);
        System.out.println("Duration (Years): " + durationYears);
        System.out.println("University: " + university);
        System.out.println("Location: " + location);
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Total Faculty: " + totalFaculty);
        System.out.println("Government: " + government);
        System.out.println("Accreditation: " + accreditation);
        System.out.println("Fees: " + fees);
        System.out.println("Medium Of Instruction: " + mediumOfInstruction);
        System.out.println("Semester System: " + semesterSystem);
        System.out.println("Has Hostel: " + hasHostel);
        System.out.println("Has Library: " + hasLibrary);
        System.out.println("Has Scholarship: " + hasScholarship);
        System.out.println("Principal Name: " + principalName);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Grading System: " + gradingSystem);
        System.out.println("Has Placement: " + hasPlacement);
        System.out.println("---------------------------------------");
    }
}