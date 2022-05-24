package InheritanceWithXml;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 * Write a description of class As3C_driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class As3C_driver
{
   public static void main(String[] args)throws IOException{
       XMLDecoder dec=new XMLDecoder(new FileInputStream("As3-courses.xml"));
       Course c=(Course)dec.readObject();dec.close();
       ArrayList<Student> students=c.getStudents();
       System.out.println(students);
       
       Instructor i=c.getInstructor();
       System.out.println(students);
       FitnessFacility ff=new FitnessFacility("The dungeon");
       ff.addMember(i);
       for(Student s:students){
           ff.addMember(s);
        }
        System.out.println(ff.getMembers());
        ff.displayGymInfo();
        c.displayClassList();
    }
}
