package InheritanceWithXml;

import java.util.Comparator;
/**
 * Write a description of class StudentRegistration here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRegistrationComparator implements Comparator<Student>
{
 public int compare(Student s1,Student s2){
    int t=s2.getYear()-s1.getYear();
    if(t==0){t=(s2.getGpa()-s1.getGpa()>0?+1:s2.getGpa()-s1.getGpa()<0?-1:0);}
    return t;
    }  
}
