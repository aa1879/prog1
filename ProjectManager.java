import java.util.*;
/**
  
 @author  
 */
 
public class ProjectManager
{
   Scanner stdin = new Scanner(System.in);
   Team cs213 = new Team();
   public void run()
   {
	   
      
      boolean done = false;
      while ( !done )
      {
         String command = stdin.next();
         switch (command)  
         {   
            case "A": add();
		      break; 
            case "R": remove();
            break;
            case "P": print(); 
            break;    
            case "Q": quit();
            break;
            default: System.out.println("Command "+command+" is not supported."); 
            //deal with bad command here 
         }  
      }
     
      
      //write java code before you terminate the program
   } //run()
   
   private void add()
   {
         //must check if the date is valid
         String name = stdin.next();
         String date = stdin.next();
         Date tryDate = new Date(date);
         if(!tryDate.isValid()){
            System.out.println(tryDate.toString()+" is not a valid date.");
            return;
         }
	//must call the contains() method to check if a given 
   //team member is in the team already
         TeamMember newTeamMember = new TeamMember(name,tryDate);
         if(cs213.contains(newTeamMember)){
            System.out.println(newTeamMember.getName() + " " + newTeamMember.getStartDate().toString()+" is already a team member.");
            return;
         }
            
         cs213.add(newTeamMember);
         
   }
   
   private void remove()
   {
      //must check if the date is valid
         String name = stdin.next();
         String date = stdin.next();
         Date tryDate = new Date(date);
         if(!tryDate.isValid()){
            System.out.println(tryDate.toString()+" is not a valid date.");
            return;
         }

         TeamMember remTeamMember = new TeamMember(name, tryDate);
         if(cs213.contains(remTeamMember)){
            cs213.remove(remTeamMember);
            return;
         }
         System.out.println(remTeamMember.toString()+ " is not a team member.");
         return;
	   
   }
   
   private void print()
   {
      //must check if the team has 0 members. 
      if(cs213.isEmpty()){
         System.out.println("The team is empty");
         return;
      }
      cs213.print();
   }   

   private void quit(){
      print();
      System.out.println("The team is ready to go!");
      System.exit(0);
   }
} //ProjectManager
