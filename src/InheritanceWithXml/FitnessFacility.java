package InheritanceWithXml;

import java.util.ArrayList;
/**
 * Write a description of class FitnessFacility here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FitnessFacility
{
   private static int lastNumber;
   private String name;
   private ArrayList<GymMember> members;
   private int mNumber;
   public FitnessFacility(String n){
       name=n;
       members=new ArrayList();
       mNumber=nextNumber();
    }
    public FitnessFacility(){
       name="unknown";
       lastNumber=1000;
       mNumber=nextNumber();
    }
    private int nextNumber(){
        return ++lastNumber;
    }
    public int getMnumber(){
        return mNumber;
    }
    public void setMnumber(int k){
        mNumber=k;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public ArrayList getMembers(){
        return members;
    }
    public void setMembers(ArrayList<GymMember> s){
        members=s;
    }
    public void addMember(GymMember g){
        members.add(g);//g.setMemberNumber(nextNumber());
    }
    public int getLastNumber(){
        return lastNumber;
    }
    public void setLastNumber(int l){
        lastNumber=l;
    }
    public void displayGymInfo(){
        System.out.println(name+": ");
        for (GymMember g:members){
            System.out.println(mNumber+" "+ g.getName());
        }
    }
}
