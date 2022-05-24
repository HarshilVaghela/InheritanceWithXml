package InheritanceWithXml;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class decoide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class As3B_Driver {public static void main(String [] args)throws IOException{
XMLDecoder dec=new XMLDecoder(new FileInputStream("As3-people.xml"));
 ArrayList<Student> students=(ArrayList) dec.readObject();dec.close();
 StudentRegistrationComparator src=new StudentRegistrationComparator();
 Collections.sort(students,src);
 System.out.println("Registration order: ");
 for (Student s:students){
     System.out.println(s.getInfo());
    }
    XMLEncoder z=new XMLEncoder(
            new FileOutputStream("As3-students.xml"));
        z.writeObject(students);
        z.close();
        System.out.println("data added to As3-students.xml");
}}
