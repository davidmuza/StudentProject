package lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //создаем экземпляр класса для работы с массивом стран
        cycle: while (true) {
            System.out.println("1. Заполнить массив");
            System.out.println("2. Распечатать");
            System.out.println("3. Определить, сколько человек нуждаются в общежитии");
            System.out.println("4. Получить список студентов, изучавших французский язык в техникуме");
            System.out.println("5. Упорядочить студентов по фамилиям");
            System.out.println("6. Выход");
            System.out.print("Выберете пункт меню (1..6): ");
            int c = (new Scanner(System.in)).nextInt();
            switch (c) {
                case 1: Student.fillStudent(); break;
                case 2: Student.printStudent(); break;
                case 3: Student.countStudentNeedsDormitory(); break;
                case 4: Student.findFrenchStudiedInCollege(); break;
                case 5: Student.sortStudentsByLastName(); break;
                default: break cycle;
            }
        }
    }
}