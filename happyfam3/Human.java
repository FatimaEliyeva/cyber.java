import java.util.Arrays;
import java.util.Map;

import java.util.TreeMap;
public class Human {
    private String name;
    private String surname;
    private int year;
    private int Iq;
    //private String[][] Schedule;
    private Family family;
    private Map<DayOfWeek, String> schedule;

    public Human(String name, String surname, int year, int Iq, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.Iq = Iq;
        this.schedule = schedule;
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
    /*public String[][] GettingSchedule() {
        return Schedule;
    }
    public void SettingSchedule(String[][] Schedule) {
        this.Schedule = Schedule;
    } */

    public Family GettingFamily() {
        return family;
    }
    public void SettingFamily(Family family) {
        this.family = family;
    }
    /*@Override
    public String toString() {
        return "Human{Name='" + name + "', Surname='" + surname + "', Year=" + year +
                ", Iq=" + Iq + ", Schedule=" + Arrays.deepToString(Schedule) + "}";
    } */
    public void printSchedule() {
        for (Map.Entry<DayOfWeek, String> entry : schedule.entrySet()) {
            System.out.println(entry.getKey().GetName() + " - " + entry.getValue());
        }
    }
    /*
    @Override
    public String toString() {
        return name + " " + surname + " (" + year + ") - IQ: " + Iq;
    } */
    /*public void printSchedule() {
        // Cədvəli sıralayırıq
        Map<DayOfWeek, String> sortedSchedule = new TreeMap<>(this.schedule);

        // Sıralanmış cədvəli çap etmək
        for (Map.Entry<DayOfWeek, String> entry : sortedSchedule.entrySet()) {
            System.out.println(entry.getKey().name() + " - " + entry.getValue());  // DayOfWeek.name() istifadə edirik
        }
    }
*/
    // toString metodu
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(surname).append(" (").append(year).append(") - IQ: ").append(Iq).append("\n");
        sb.append("Schedule:\n");

        // Schedule-nu əlavə edirik
        Map<DayOfWeek, String> sortedSchedule = new TreeMap<>(this.schedule);
        for (Map.Entry<DayOfWeek, String> entry : sortedSchedule.entrySet()) {
            sb.append(entry.getKey().name()).append(" - ").append(entry.getValue()).append("\n");
        }

        return sb.toString();
    }
    @SuppressWarnings("removal")
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Human object is being garbage collected .");

    }
}