package InheritanceWithXml;

import java.util.ArrayList;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person implements Comparable<Student>
{
    private int year;
    private double gpa;
    private ArrayList<Course> courses;
    public Student(String f,String l,int y,double g){
        super(f,l);
        year=y;
        gpa=g;
        courses=new ArrayList<>();
    }
    public Student(){
        year=0;
        gpa=0.0;
    }
    public int getYear(){
        return year;
    }
    public double getGpa(){
        return gpa;
    }
    public void setYear(int y){year=y;}
    public void setGpa(double g){gpa=g;}
    public void addCourse(Course c){
        courses.add(c);
        c.addStudent(this);
    }
    public int compareTo(Student s){
        int i= lastName.compareTo(s.lastName);
        if (i==0){i=firstName.compareTo(s.firstName);}
        return i;
    }
    public String getInfo(){
        return lastName+", "+firstName+": year "+year+", "+"GPA: "+gpa;
    }
    public String toString(){
        return lastName+", "+firstName;
    }
}
