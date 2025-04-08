package lesson6;

import java.util.HashMap;
import java.util.Map;

public class Exam implements Gradable {
    private String examId;
    private Course course;
    private String examDate;
    private int maxScore;
    private Map<Student, Integer> studentScores;

    public Exam(String examId, Course course, String examDate, int maxScore) {
        this.examId = examId;
        this.course = course;
        this.examDate = examDate;
        this.maxScore = maxScore;
        this.studentScores = new HashMap<>();
    }

    @Override
    public void giveGrade(Student student, int score) {
        if (score < 0 || score > maxScore) {
            throw new IllegalArgumentException("Score must be between 0 and " + maxScore);
        }
        studentScores.put(student, score);
        student.receiveGrade(course, score);
    }

    public String getExamId() {
        return examId;
    }

    public Course getCourse() {
        return course;
    }

    public String getExamDate() {
        return examDate;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public Map<Student, Integer> getStudentScores() {
        return studentScores;
    }
}
