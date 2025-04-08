package lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Human {
    private String major;
    private int yearOfStudy;
    private List<Course> enrolledCourses;
    private Map<Course, Integer> grades;

    public Student(String name, int age, String gender, String id, String email,
                   String major, int yearOfStudy) {
        super(name, age, gender, id, email);
        this.major = major;
        this.yearOfStudy = yearOfStudy;
        this.enrolledCourses = new ArrayList<>();
        this.grades = new HashMap<>();
    }

    public void joinCourse(Course course) {
        enrolledCourses.add(course);
        course.enrollStudent(this);
        System.out.println(getName() + " joined course: " + course.getCourseName());
    }

    public void receiveGrade(Course course, int grade) {
        grades.put(course, grade);
        System.out.println(getName() + " received grade " + grade + " for " + course.getCourseName());
    }

    public String getMajor() {
        return major;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Map<Course, Integer> getGrades() {
        return grades;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Student: %s, Major: %s, Year: %d, ID: %s%n",
                getName(), major, yearOfStudy, getId());
    }
}
