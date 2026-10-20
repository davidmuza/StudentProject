package lab1;

import java.util.Scanner;

public class StudentService {
    private static Student[] students;

    static {
        students = new Student[]{
                new Student("Иванов", true, "Школа", "Английский"),
                new Student("Сидоров", true, "Техникум", "Немецкий"),
                new Student("Смирнов", true, "Техникум", "Французский"),
                new Student("Петров", false, "Техникум", "Французский")
        };
    };

    public static void printStudent() {
        System.out.println("\nХарактеристики студентов:");

        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
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

    public static Student findByName(String lastName) {
        System.out.println("Поиск студента: " + lastName);
        for (int i = 0; i < students.length; i++) {
            if (students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        }
        return null;
    }
}
