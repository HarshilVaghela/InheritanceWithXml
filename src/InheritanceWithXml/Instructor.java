package InheritanceWithXml;

import java.util.ArrayList;
/**
 * Write a description of class Instructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor extends Person
{
    private String degree;
    private ArrayList<Course> courses;
    public Instructor(String f,String l,String d){
        super(f,l);
        degree=d;
        courses=new ArrayList<>();
    }
    public Instructor(){
        degree="unknown";
    }
    public void addCourse(Course c){
        courses.add(c);
    }
    public String getDegree(){
        return degree;
    }
    public void setDegree(String c){degree=c;}
    public String toString(){
        return this.getName()+", "+degree;
    }
}
