import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int Iq;
    private String[][] Schedule;
    private Family family;

    public Human(String name, String surname, int year, int Iq, String[][] Schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.Iq = Iq;
        this.Schedule = Schedule;
    }
    public String gettingName() {
        return name;
    }
    public void settingName(String name) {
        this.name = name;
    }
    public String gettingSurname() {
        return surname;
    }
    public void SettingSurname(String surname) {
        this.surname = surname;
    }
    public int GettingBirthYear() {
        return year;
    }
    public void SettingBirthYear(int year) {
        this.year = year;
    }
    public int GettingIq() {
        return Iq;
    }
    public void SettingIq(int Iq) {
        this.Iq = Iq;
    }
    public String[][] GettingSchedule() {
        return Schedule;
    }
    public void SettingSchedule(String[][] Schedule) {
        this.Schedule = Schedule;
    }
    public Family GettingFamily() {
        return family;
    }
    public void SettingFamily(Family family) {
        this.family = family;
    }
    @Override
    public String toString() {
        return "Human{Name='" + name + "', Surname='" + surname + "', Year=" + year +
                ", Iq=" + Iq + ", Schedule=" + Arrays.deepToString(Schedule) + "}";
    }
}