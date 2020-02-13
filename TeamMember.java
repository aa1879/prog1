/**
 
 @author Suraj Budhathoki  
 */

public class TeamMember 
{
   private String name;
   private Date   startDate;
   
   public TeamMember(String nm, Date date)
   {
      name=nm;
      startDate=date;
   }
   
   public Date getStartDate()
   {
	   return startDate;
      
   }
   
   // added later on to encapsulate var -->name
   public String getName() {
	   return name;
   }
   
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
   
   public String toString()
   {
       //name + " " + startDate;
	  return getName() +" " + getStartDate();
   }

   public static void main(String [] args)
   
   {
	   //testing the TeamMember class
	   Date d1 = new Date ("11/27/2011");
	
      TeamMember team = new TeamMember ("Suraj", d1 );
      System.out.println(team.toString());
   }
}