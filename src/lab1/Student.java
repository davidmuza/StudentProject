package lab1;

import java.util.Scanner;

public class Student {
    private String lastName;
    private boolean needsDormitory;
    private String previousEducation;
    private String languageStudied;

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
}
