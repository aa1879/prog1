/**
  This class defines the property and methods of a team member
 @author Suraj Budhathoki 
 @Team-members: Suraj Budhathoki, Aayush Adhikari
 */

public class TeamMember 
{
   private String name;
   private Date   startDate;
   
   //constructor
   public TeamMember(String nm, Date date)
   {
      name=nm;
      startDate=date;
   }
   
   public Date getStartDate()
   {
	   return startDate;
      
   }
   
   public String getName() {
	   return name;
   }
   
   /**
    * Check if the given object is equal to the existing team member.
    * @param obj
    * @return boolean true/false
    */
   public boolean equals(Object obj)
   {
      if(obj==this)
         return true;
         
	   if(!(obj instanceof TeamMember)){
	         return false;
	      }
	   
	   TeamMember t = (TeamMember)obj;
       return (t.name.equals(this.name)&&t.startDate.equals(this.startDate));
   }  
   
   /*
    * Print the name and start date of the member
    */
   public String toString()
   {
       //name + " " + startDate;
	  return getName() +" " + getStartDate();
   }
   
   public static void main(String [] args)
   
   {
	   //testing the TeamMember class
	   Date d1 = new Date ("11/27/2011");
	   Date d2 = new Date("11/27/2011");
	
      TeamMember team = new TeamMember ("Suraj", d1 );

      TeamMember test = new TeamMember ("Suraj",d2);
      TeamMember test1= new TeamMember ("Ayush",d2);
      System.out.println(team.getName());
      System.out.println(team.getStartDate());
      System.out.println(team.equals(test));
      System.out.println(team.equals(test1));

      System.out.println(team.toString());
   }
}