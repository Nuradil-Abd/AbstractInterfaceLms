import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        EducationCenter school = new School("45","Kyrgyzstan", LocalDate.of(1991,9,1));
        EducationCenter university = new University("AUCA", "USA", LocalDate.of(2012, 3,5));
        EducationCenter college = new College("KGUSTA","Russia",LocalDate.of(1995,7,12));


        Student[] students = {new Student("Atai","Abakirov", "male", LocalDate.of(2005, 9, 5), school),
                new Student("Tagai","Bekturov", "male", LocalDate.of(2005, 9, 5), school),
                new Student("Atai","Abakirov", "female", LocalDate.of(2010, 9, 5), university),
                new Student("Azat","Abakirov", "male", LocalDate.of(2006, 9, 5), university),
                new Student("Alina","Baktybekova", "female", LocalDate.of(2008, 9, 5), school),
                new Student("Atai","Abakirov", "male", LocalDate.of(1999, 9, 5), college),
                new Student("Aizat","Askarova", "female", LocalDate.of(2020, 9, 5), school),
                new Student("Aida","Asanakunova", "female", LocalDate.of(2005, 9, 5), college),
                new Student("ASYL","Abakirov", "male", LocalDate.of(2012, 9, 5), school),
                new Student("Askat","Osmonov", "male", LocalDate.of(2018, 9, 5), university),

        };

//        System.out.println(Arrays.toString(students));
        allStudentsFullInfo(students);
    }
    public static void allStudentsFullInfo(Student[] students){

        for (Student student : students) {
            System.out.println(student);
            student.getStudentsEducationCenter();
            student.getStudentsStudyingYear();

        }


    }

}