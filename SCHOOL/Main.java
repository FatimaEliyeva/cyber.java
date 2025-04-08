package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 20, "Male", "S001", "ali@edu.az", "Computer Science", 2));
        students.add(new Student("Aysel", 21, "Female", "S002", "aysel@edu.az", "Mathematics", 3));
        students.add(new Student("Kamran", 22, "Male", "S003", "kamran@edu.az", "Physics", 1));
        students.add(new Student("Leyla", 19, "Female", "S004", "leyla@edu.az", "Biology", 2));
        students.add(new Student("Orxan", 20, "Male", "S005", "orxan@edu.az", "Chemistry", 1));

        // Create teachers
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Prof. Ahmadov", 45, "Male", "T001", "ahmadov@edu.az", "Computer Science", 15));
        teachers.add(new Teacher("Dr. Mahmudova", 38, "Female", "T002", "mahmudova@edu.az", "Mathematics", 10));


        List<Course> courses = new ArrayList<>();
        Course javaCourse = new Course("CS101", "Java Programming", "Introduction to Java", 4);
        Course mathCourse = new Course("MATH201", "Advanced Mathematics", "Calculus and Algebra", 3);

        courses.add(javaCourse);
        courses.add(mathCourse);

        teachers.get(0).CourseTeaching(javaCourse);
        teachers.get(1).CourseTeaching(mathCourse);

        for (Student student : students) {
            student.joinCourse(javaCourse);
            student.joinCourse(mathCourse);
        }

        List<Exam> exams = new ArrayList<>();
        Exam javaExam = new Exam("EX001", javaCourse, "2023-05-15", 100);
        Exam mathExam = new Exam("EX002", mathCourse, "2023-05-20", 100);

        exams.add(javaExam);
        exams.add(mathExam);

      
        for (Student student : students) {
            javaExam.giveGrade(student, (int)(Math.random() * 50 + 50)); // Random grade between 50-100
            mathExam.giveGrade(student, (int)(Math.random() * 50 + 50));
        }

        try {
            ObjectMapper mapper = new ObjectMapper();

            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("students.json"), students);

            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("teachers.json"), teachers);

            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("courses.json"), courses);


            mapper.writerWithDefaultPrettyPrinter().writeValue(new File("exams.json"), exams);

            System.out.println("All data has been successfully written to JSON files.");
        } catch (Exception e) {
            GlobalExceptionHandler.handle(e);
        }
    }
}
