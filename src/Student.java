

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Student implements Study {

    private String name, surname, gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", gender: " + gender + '\'' +
                ", dateOfStart: " + dateOfStart +
                ", educationCenter: " + educationCenter +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {

        System.out.println("Окуган жери: " + educationCenter.getName());


    }

    @Override
    public void getStudentsStudyingYear() {

        System.out.println("Канча жыл окуган: " + (2024 - getDateOfStart().getYear()));

    }
}