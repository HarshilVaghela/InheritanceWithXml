package InheritanceWithXml;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Course
{
   private String courseNumber;
   private String courseName;
   private ArrayList<Student> students;
   private Instructor i;
   public Course(String n,String s){
       courseNumber=n;
       courseName=s;
       students=new ArrayList();
    }
    public Course(){
       this("unknown","unknown");
    }
    public void addStudent(Student s){
        students.add(s);
    }
    public String getCourseNumber(){
        return courseNumber;
    }
    public void setCourseNumber(String k){
        courseNumber=k;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String k){
        courseName=k;
    }
    public Instructor getInstructor(){
        return i; 
    }
    public ArrayList getStudents(){
        return students;
    }
    public void setStudents(ArrayList<Student> s){
        students=s;
    }
    public void setInstructor(Instructor k){
        i=k;
        k.addCourse(this);
    }
    public void setInstructors(Instructor d){i=d;}
    
    public void displayClassList(){
        
         System.out.println(courseNumber+" "+courseName+"\n"+"Instructor: "+i+"\n"+"Students:");
         Collections.sort(students);
         for(Student s:students){
             System.out.println(s);
            }
         System.out.println();   
    }
}
