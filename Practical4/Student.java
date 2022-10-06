public class Student {
    private String studentID;
    private String name;
    private int numberOfQuizzes;
    private int totalQuizScore;

    // no-arg constructor
    public Student() {
        this("", "");
    }

    // constructor with 2 parameters
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        numberOfQuizzes = 0;
        totalQuizScore = 0;
    }

    // accessors
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfQuizzes() {
        return numberOfQuizzes;
    }

    // mutators
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addQuiz(int score) {
        numberOfQuizzes++;
        totalQuizScore += (score / 100.0 * 10);
    }

    public int getTotalScore() {
        return totalQuizScore;
    }

    public double getAverageQuizScore() {
        return (double) totalQuizScore / numberOfQuizzes;
    }

    // Q3
    public void modifyAddQuiz(int score) {
        numberOfQuizzes++;
        totalQuizScore += (score / 100.0 * 20);
    }

}
