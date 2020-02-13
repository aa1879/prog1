import java.util.Arrays;

/**
  
 @author Suraj Budhathoki 
 */
public class Team 
{
   private final int NOT_FOUND = -1;
   private final int GROW_SIZE = 4; //initial and grow size
   private TeamMember [] team;
   private int numMembers;
   
   public Team()
   {
      //this is the default constructor
	   numMembers=0;
	   team= new TeamMember [this.GROW_SIZE];
   }
   
   
   /*
    * Find the index of the member in the team
    * returns -1 if the member does not exists on the team
    */
   private int find(TeamMember m)
   {
	   int mLocation=-1;
	   
	   for(int i=0;i<team.length;i++) {
		   if(team[i]==m) {
			   mLocation=i;
			   break;
		   }
	   }
	   
	   return (mLocation==this.NOT_FOUND) ? this.NOT_FOUND : mLocation;
       
   }
   
   
   /*
    * Grow the team size by factor GROW_SIZE if the team capacity is full
    */
   private void grow()
   {
	   TeamMember [] growTeam = new TeamMember[this.team.length+this.GROW_SIZE];
	   
	   for(int i=0;i<this.team.length;i++) {
		   growTeam[i]=this.team[i];
	   }
	   
	   this.team=growTeam;
       
   }
   
   /*
    * Check if no members exists on the team;
    */
   public boolean isEmpty()
   {
       return (team.length==0);
   }
   
   public void add(TeamMember m)
   {     
	   if(!contains(m)) {
		   
		   //check if team size is full or not
		   if(numMembers+1!=team.length) {
	        	team[numMembers]=m;
	        	numMembers++;
	        }else {
	        	grow();
	        	team[numMembers]=m;
	        	numMembers++;
	      
	        } 
	   }else { // member already exists on the team
		   System.out.println(m.toString() +" " +" is already on the team");
	   }
       
   }
   
   public boolean remove(TeamMember m)
   {
	   if(contains(m)) {
		   
		   int mLocation = find(m);
		   
		   removeMemberAtIndex(mLocation);
		   
		   System.out.println(m.toString()+ " "+"has left the team");
		   
		   return true;
		   
	   }else { //member does not exists on the team
		  System.out.println(m.toString()+ " "+"is not a team member");
		  
	   }
       
	   return false;
   } 
   
   /*
    * remove the member located at this special index
    * Finally resize the array
    */
   private void removeMemberAtIndex(int mLocation) {
	// TODO Auto-generated method stub
	
	   TeamMember [] dummyArray = new TeamMember[this.team.length];
	   
	   for(int i=0,k=0;i<dummyArray.length;i++) {
		   
		   if(i==mLocation)
			   continue;
		   
		   dummyArray[k++]=this.team[k];
	   }
	   
	   this.team=dummyArray;
   }

//check if the member already exists on the team
public boolean contains(TeamMember m)
   {
	for(int i=0;i<this.team.length;i++) {
		
		if(team[i]==m) {
			return true;
		}
		
	}
      return false;
  } 
   
   public void print()
   {
      //set up a for loop and call the toString() method
	   System.out.println("We have the following team members: ");
	   
	   for(int i=0;i<=numMembers;i++) {
		   System.out.println(team[i].toString());
	   }
   } 
}
