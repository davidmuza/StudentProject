package lab1;

public class StudentService {
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
}
