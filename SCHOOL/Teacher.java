package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human implements Teachable {
    private String specialization;
    private int yearsOfExperience;
    private List<Course> teachingCourses;

    public Teacher(String name, int age, String gender, String id, String email,
                   String specialization, int yearsOfExperience) {
        super(name, age, gender, id, email);
        this.specialization = specialization;
        this.yearsOfExperience = yearsOfExperience;
        this.teachingCourses = new ArrayList<>();
    }

    @Override
    public void CourseTeaching(Course course) {
        teachingCourses.add(course);
        course.setInstructor(this);
        System.out.println(getName() + " is now teaching " + course.getCourseName());
    }

    public List<Course> getTeachingCourses() {
        return teachingCourses;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Teacher: %s, Specialization: %s, Experience: %d years%n",
                getName(), specialization, yearsOfExperience);
    }
}
