public class Student {
    private String studentID;
    private String name;
    private String school;

    public Student(String studentID, String name, String school) {
        this.studentID = studentID;
        this.name = name;
        this.school = school;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean validateStudentID(Student student) {
        if (student.getStudentID().length() != 6) {
            return false;
        }
        for (int i = 0; i < student.getStudentID().length(); i++) {
            if (i == 0) {
                if (!Character.isLetter(student.getStudentID().charAt(i))) {
                    return false;
                }

                if (student.getSchool() == "FASC") {
                    if (student.getStudentID().charAt(i) != 'A') {
                        return false;
                    }
                }
                else if (student.getSchool() == "FAFB") {
                    if (student.getStudentID().charAt(i) != 'B') {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }

            else {
                if (!Character.isDigit(student.getStudentID().charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
