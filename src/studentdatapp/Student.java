package studentdatapp;

import java.util.Scanner;

public class Student {
    private String first_name;
    private String last_name;
    private int gradeYear = 0;
    private String studentId;
    private int id = 100;
    private String courses = "";
    private int tuitionBalance;
    private int costOfBalance = 600;

    Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter student first name");
        this.first_name = in.next();
        System.out.println("Please enter student last name");
        this.last_name = in.next();
        System.out.println("Please enter student grade");
        this.gradeYear = in.nextInt();

        setStudentId();

        System.out.println(first_name + " " + last_name + " " + gradeYear + " " + studentId);
    }

    private void setStudentId() {
        id++;
        this.studentId = gradeYear+""+id;
    }

    public void enroll() {
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter the course you want to enroll into ");
            String course = in.next();
            if(!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = costOfBalance + tuitionBalance;
            } else {
                break;
            }
        } while (1 != 0);
        System.out.println("Thank you for enrolling to Ani Academy");
    }

    public void viewTuition() {
        System.out.println("You currently owe: " +tuitionBalance);
    }

    public void payTuition() {
        Scanner in = new Scanner(System.in);
        System.out.println("How much would you like to pay");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Your new balance is: " +tuitionBalance);
    }

    @Override
    public String toString(){
        return "\nName: " + first_name + " " + last_name +
                "\nGrade: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourse Enrolled: " + courses +
                "\nBalance: £" + tuitionBalance;
    }
}

