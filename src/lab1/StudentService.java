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
}
