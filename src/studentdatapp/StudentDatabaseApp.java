package studentdatapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many students do you want add to the database");
        int n = in.nextInt();
        Student[] stu = new Student[n];

        for (int i =0; i < n; i++) {
            stu[i] = new Student();
            stu[i].enroll();
            stu[i].viewTuition();
            stu[i].payTuition();
            System.out.println(stu[i].toString());
        }
    }
}
