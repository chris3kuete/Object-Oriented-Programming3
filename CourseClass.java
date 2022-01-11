/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseclass;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author sa
 */
public class CourseClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int choice;

        System.out.println("enter the course name");
        String cn = scan.nextLine();

        System.out.println("enter the number of students");
        int numStu = scan.nextInt();
        
        System.out.println("Enter choice");
        choice = scan.nextInt();

        Course co = new Course(cn,numStu);

        

        while (choice < 4) {
            if (choice == 1) {
                System.out.println(co.getCourseName());
                co.addStudent("wade",3);
                System.out.println("Number of student in the course is " + co.getNumberOfStudents());
               
            } else if (choice == 2) {
                System.out.println(co.getCourseName());
                co.dropStudent("wade",1);
                System.out.println("Number of students in the course is " + co.getNumberOfStudents());
            }else if(choice == 3){
                System.out.println(co.getCourseName());
                co.clear();
                System.out.println("Number of Students in the course is "+ co.getNumberOfStudents());
                System.exit(0);
            }
            System.out.println("Enter choice");
            choice=scan.nextInt();
        }
        System.out.println("INVALID CHOICE");
       
    }

}
