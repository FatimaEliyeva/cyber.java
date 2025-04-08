package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseId;
    private String courseName;
    private String description;
    private int creditHours;
    private Teacher instructor;
    private List<Student> enrolledStudents;

    public Course(String courseId, String courseName, String description, int creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.description = description;
        this.creditHours = creditHours;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void setInstructor(Teacher teacher) {
        this.instructor = teacher;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDescription() {
        return description;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
