package InheritanceWithXml;


/**
 * Abstract class Person - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Person implements GymMember
{
    protected String firstName;
    protected String lastName;
    protected int memberNumber;
    public Person(String f,String l){
        firstName=f;
        lastName=l;
        
    }
    public Person(){
        this("unknown","unknown");
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String l){
        lastName=l;
    }
    public int getMemberNumber(){
        return memberNumber;
    }
    public void setMemberNumber(int k){
        memberNumber=k;
    }
    public void setFirstName(String f){
        firstName=f;
    }
    public String getName(){
        return firstName+" "+lastName;
    }
    public String toString(){
        return lastName+", "+firstName;
    }
    /*public void setMemberNumber(FitnessFacility f){
        ff.addMember(this);
        memberNumber=ff.getNumber();
    }*/
}
