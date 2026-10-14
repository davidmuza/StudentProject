package lab1;

import java.util.Scanner;

public class Student {
    private String lastName;
    private boolean needsDormitory;
    private String previousEducation;
    private String languageStudied;
    private static Student[] students;

    static {
        students = new Student[]{
            new Student("Иванов", true, "Школа", "Английский"),
            new Student("Сидоров", true, "Техникум", "Немецкий"),
            new Student("Смирнов", true, "Техникум", "Французский"),
            new Student("Петров", false, "Техникум", "Французский")
        };
    };

    public Student(String lastName, boolean needsDormitory, String previousEducation, String languageStudied) {
        this.setLastName(lastName);
        this.setNeedsDormitory(needsDormitory);
        this.setPreviousEducation(previousEducation);
        this.setLanguageStudied(languageStudied);
    }

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Фамилия: ");
        this.setLastName(sc.nextLine());
        System.out.print("Нуждается ли в общежитии: ");
        this.setNeedsDormitory(sc.nextBoolean());
        sc.nextLine();
        System.out.print("Что окончил: ");
        this.setPreviousEducation(sc.nextLine());
        System.out.print("Какой язык изучал: ");
        this.setLanguageStudied(sc.nextLine());
    }

    public String toString() {
        return String.format("Студент: %s | Общежитие: %s | Окончил: %s | Язык: %s", this.lastName, this.needsDormitory ? "Да" : "Нет", this.previousEducation, this.languageStudied);
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String value) {
        if (value.isEmpty()) {
            System.out.println("Недопустимое значение!");
        }

        this.lastName = value;
    }

    public boolean isNeedsDormitory() {
        return this.needsDormitory;
    }

    public void setNeedsDormitory(boolean value) {
        this.needsDormitory = value;
    }

    public String getPreviousEducation() {
        return this.previousEducation;
    }

    public void setPreviousEducation(String value) {
        if (value.isEmpty()) {
            System.out.println("Недопустимое значение!");
        }

        this.previousEducation = value;
    }

    public String getLanguageStudied() {
        return this.languageStudied;
    }

    public void setLanguageStudied(String value) {
        if (value.isEmpty()) {
            System.out.println("Недопустимое значение!");
        }

        this.languageStudied = value;
    }

    public static void fillStudent() {
        System.out.print("Введите количество студентов: ");
        int n = (new Scanner(System.in)).nextInt();
        students = new Student[n];
        System.out.println("Введите информацию о студентах: ");

        for(int i = 0; i < students.length; i++) {
            System.out.println("Студент " + (i + 1) +  "=>");
            students[i] = new Student();
        }

    }

    public static void countStudentNeedsDormitory() {
        int count = 0;

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            if (s.isNeedsDormitory()) {
                ++count;
            }
        }

        System.out.println("Количество студентов, нуждающихся в общежитии: " + count);
    }

    public static void findFrenchStudiedInCollege() {
        System.out.println("Cписок студентов, изучавших французский язык в техникуме:");
        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            String previousEducation = s.getPreviousEducation().toLowerCase();
            String languageStudied = s.getLanguageStudied().toLowerCase();
            if (previousEducation.equals("техникум") && languageStudied.equals("французский")) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Студентов, изучавших французский язык в техникуме не найдено!");
        }

    }

    public static void sortStudentsByLastName() {
        if (students != null && students.length >= 2) {
            for(int i = 0; i < students.length - 1; i++) {
                for(int j = 0; j < students.length - 1 - i; j++) {
                    if (students[j].getLastName().compareTo(students[j + 1].getLastName()) > 0) {
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                    }
                }
            }

        }
    }
}
