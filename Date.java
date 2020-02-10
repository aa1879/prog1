/**
  
 @author  Aayush Adhikari
 */
public class Date 
{
   private int  day;
   private int  month;
   private int  year;
   
   public Date(String d)
   {
      //use StringTokenizer to parse the String and create a Date object   
      //don't really know what's up here yet
      String [] dateSplit = d.split("/");
      this.month = dateSplit[0];
      this.day = dateSplit[1];
      this.year = dateSplit[2];  
   }
   
   public Date(Date d)
   {
      //this is a constructor
      this.day = d.day;
      this.month = d.month;
      this.year = d.year;
   }      

   //function to check if a year is leap
   public boolean isLeap(int year){
      if(year%4==0){
         if(year%100==0){
            if(year%400==0)
               return true;
            return false;
         }
         return true;
      }
      return false;
   }
   
   public boolean isValid()
   {
       if(this.month<1||this.month>12)
         return false;

       if(this.day>31)
         return false;
      
       if(this.month%2==1){
          return true;
       }

       if(this.day>30)
         return false;

       

   }
   
   @Override
   public String toString()
   {
       //use the format "month/day/year"
   }
   
   @Override
   public boolean equals(Object obj)
   {
       
   }  
}


