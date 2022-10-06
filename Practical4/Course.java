public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;
    private static int courseCount;

    public Course(String courseTitle, double feesPerStudent){
        this.courseTitle = courseTitle;
        this.feesPerStudent = feesPerStudent;
        noOfStudents = 0;
        studentNames = new String[100];
        courseCount++;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        Course.courseCount = courseCount;
    }

    public double calcFeesCollected(){
        return feesPerStudent * noOfStudents;
    }

    public void addStudent(String studentName){
        studentNames[noOfStudents] = studentName;
        noOfStudents++;
    }

    public String toString(){
        String string = "";
        string += "Course Title: " + courseTitle + "\n";
        string += "Fees Per Student: " + feesPerStudent + "\n";
        string += "No Of Students: " + noOfStudents + "\n";
        string += "Course count: " + courseCount + "\n";
        string += "Fees Collected: " + calcFeesCollected() + "\n";
        return string;
    }
}