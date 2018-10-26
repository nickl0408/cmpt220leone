import java.util.ArrayList;

import java.util.Scanner;

public class TestC {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        Course c = new Course("Math");
        c.addStudent("Jack");
        c.addStudent("Matt");
        c.addStudent("Nick");

        ArrayList<String> students = c.getStudents();
        System.out.println("List of Students ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out
                .println("\nEnter the Name of student to whome you want to drop :");
        name = input.next();
        c.dropS(name);

        System.out.println("\nList of Students After Removal:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}