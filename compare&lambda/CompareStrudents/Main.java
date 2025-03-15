//task2
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    double grade;
    String birthDate;
    String gender;
    public Student(int id, String name, double grade, String birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.birthDate = birthDate;
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public double getGrade() {
        return grade;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getGender() {
        return gender;
    }
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        int gradeCompare = Double.compare(s2.getGrade(), s1.getGrade());
        if (gradeCompare != 0) {
            return gradeCompare;
        }

        int birthDateCompare = s1.getBirthDate().compareTo(s2.getBirthDate());
        if (birthDateCompare != 0) {
            return birthDateCompare;
        }
        return s2.getGender().compareTo(s1.getGender()); //taking it from male to female
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Ali", 90.5, "2000-05-12", "M"));
        students.add(new Student(1, "Leyla", 85.3, "2001-08-21", "F"));
        students.add(new Student(2, "Orxan", 90.5, "1999-07-10", "M"));
        students.add(new Student(4, "Aysel", 90.5, "1999-07-10", "F"));

        Collections.sort(students);
        System.out.println("ASCENDING ORDER BASED ON ID ");
        for (Student s : students) {
            System.out.println(s);
        }
        students.sort(new StudentComparator());
        System.out.println("\nDESCENDING BASED ON GRADE,ASCENDING BASED ON BIRTHDATE,ASCENDING BASED ON GENDER:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
