public class practical4Q2 {
    public static void main(String[] args) {
        Student studentDetails = new Student("21WMD07999", "Nam Jack");
        Student studentDetails2 = new Student();

        studentDetails.addQuiz(100);
        studentDetails.addQuiz(90);
        studentDetails.addQuiz(80);
        studentDetails.addQuiz(70);
        studentDetails.addQuiz(60);

        studentDetails2.setStudentID("21WMD08888");
        studentDetails2.setName("Nicholas");
        studentDetails2.addQuiz(100);
        studentDetails2.addQuiz(90);
        studentDetails2.addQuiz(80);


        System.out.printf("Student ID: %s\nName: %s\nNumber of Quizzes: %d\nTotal Quiz Score: %d\nAverage Quiz Score: %.2f\n\n",
                studentDetails.getStudentID(), studentDetails.getName(), studentDetails.getNumberOfQuizzes(),
                studentDetails.getTotalScore(), studentDetails.getAverageQuizScore());
        System.out.printf("Student ID: %s\nName: %s\nNumber of Quizzes: %d\nTotal Quiz Score: %d\nAverage Quiz Score: %.2f\n\n",
                studentDetails2.getStudentID(), studentDetails2.getName(), studentDetails2.getNumberOfQuizzes(),
                studentDetails2.getTotalScore(), studentDetails2.getAverageQuizScore());
    }
}
