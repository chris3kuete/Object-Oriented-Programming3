/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseclass;

/**
 *
 * @author sa
 */
public class Course {

    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course(String courseName) {

        this.courseName = courseName;
    }

    public Course(String c,int nst) {
        this.students = new String[students.length];
        courseName = c;
        numberOfStudents = nst;
    }

    public void addStudent(String student,int n) {
        
        if (numberOfStudents > students.length) {
            String[] newArr;
            newArr = new String[students.length *2];
            for (int i = 0; i < students.length; i++) {
                newArr[i] = students[i];

            }
            newArr[numberOfStudents+=n] = student;
            
        }else{
            String[] newArr;
            newArr = new String[students.length *2];
            for (int i = 0; i < students.length; i++) {
                newArr[i] = students[i];

            }
            newArr[numberOfStudents+=n] = student;
            
            
        }

    }

    public String[] getStudents() {

        String[] newArr = new String[10];
        for (int i = 0; i <= students.length; i++) {
            newArr[i] = students[i];

        }
        return newArr;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student,int n) {
        
       
            String[] newArr = new String[students.length*2];
        for (int i = 0; i < students.length; i++) {
            
            newArr[i]=students[i];
            
        }
        newArr[numberOfStudents-=n]=student;

    }

    public void clear() {
        numberOfStudents = 0;

    }

}
