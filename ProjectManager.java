import java.util.*;
/**
  
 @author Aayush Adhikari
 */
 
public class ProjectManager
{
   Scanner stdin = new Scanner(System.in);
   String [] input;
   Team cs213 = new Team();
   public void run()
   {
	   
      
      boolean done = false;
      while ( !done )
      {
         input = stdin.nextLine().split(" ");

         if(input.length!=3&&input.length!=1){
            System.out.println("Invalid format for input");
            continue;
         }
         String command = input[0];
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
   
   /**  
    * method to add a memeber to the team
    */
   private void add()
   {
         //must check if the date is valid
         String name = input[1];
         String date = input[2];
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
   
   /**  
    * method to remove a teammmember from the team
    */
   private void remove()
   {
      //must check if the date is valid
         String name = input[1];
         String date = input[2];
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
   
   /**
    * print the list of team members in the team
    */
   private void print()
   {
      //must check if the team has 0 members. 
      if(cs213.isEmpty()){
         System.out.println("The team is empty");
         return;
      }
      cs213.print();
   }   

   /**
    * method to print the list of team members and exit the program, run of Q command
    */
   private void quit(){
      print();
      if(!cs213.isEmpty())
         System.out.println("The team is ready to go!");
      System.exit(0);
   }
} //ProjectManager
