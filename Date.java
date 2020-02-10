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
   
   public boolean isValid()
   {
       
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


