public class practical5Q5 {
    public static void main(String[] args) {
        Student student = new Student("A12345", "Nicholas", "FASC");
        Student student2 = new Student("B12345", "Jack", "FAFB");
        Student student3 = new Student("C12345", "Shawn", "FASC");
        Student student4 = new Student("A12345", "Ethan", "FAFB");
        Student student5 = new Student("B12345", "Kuean", "FAAA");
        System.out.println(student.validateStudentID(student)?"Valid Student ID":"Invalid Student ID");
        System.out.println(student2.validateStudentID(student2)?"Valid Student ID":"Invalid Student ID");
        System.out.println(student3.validateStudentID(student3)?"Valid Student ID":"Invalid Student ID");
        System.out.println(student4.validateStudentID(student4)?"Valid Student ID":"Invalid Student ID");
        System.out.println(student5.validateStudentID(student5)?"Valid Student ID":"Invalid Student ID");
    }
}
