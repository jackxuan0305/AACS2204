public class practical4Q5 {
    public static void main(String[] args){

        Course courseDetails = new Course("Introduction to Computers", 250);

        courseDetails.addStudent("Ali Said");
        courseDetails.addStudent("Wong Ken");
        courseDetails.addStudent("Peter Lim");

        for (int i = 0; i < courseDetails.getNoOfStudents(); i++){
            System.out.println("Student Name: " + courseDetails.getStudentNames()[i]);
        }
            System.out.println(courseDetails.toString());
    }
}
