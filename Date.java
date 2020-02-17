import java.io.IOException;

import com.sun.jdi.Field;

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
      String [] dateSplit = d.split("/");

      if(dateSplit.length!=3){
         System.out.println("The date must be in the format mm/dd/yyyy");
         return;
      }

      // add this to a try catch
      try{
         
         this.day = Integer.parseInt(dateSplit[1]);
         this.month = Integer.parseInt(dateSplit[0]);
         this.year = Integer.parseInt(dateSplit[2]);
      }
      catch(Exception e){
         System.out.println(d+" is an invalid date.");
      }
      
   }
   
   public Date(Date d)
   {
      //this is a constructor
      this.day = d.day;
      this.month = d.month;
      this.year = d.year;
   }      

   //function to check if a year is leap
   public boolean isLeap(){
      if(this.year%4==0){
         if(this.year%100==0){
            if(this.year%400==0)
               return true;
            return false;
         }
         return true;
      }
      return false;
   }
   
   //checks if a date is valid
   public boolean isValid()
   {
      //check if it is less than or more than min or max values of days and months
       if(this.month<1||this.month>12||this.day<1||this.day>31||year<=0)
         return false;

         //check for february
       else if(this.month==2){
            if(this.day>29)
               return false;
            else if(this.day==29&&isLeap()==false)
               return false;
            
            return true;
       }

       //for all other months
       else if(this.day>30){
          if((month%7)%2==1)
            return true;
         return false;
       }

       return true;
       

   }
   
   @Override
   public String toString()
   {
       //use the format "month/day/year"
       return String.format("%d/%d/%d", this.month,this.day,this.year);

   }
   
   @Override
   public boolean equals(Object obj)
   {
      if(obj==this)
         return true;
      
      if(!(obj instanceof Date)){
         return false;
      }
      Date d = (Date) obj;
      return (d.day==this.day&&d.month==this.month&&d.year==this.year);
   }  

  

   public static void main(String[] args){
      Date testDate = new Date("02/29/2020");
      Date newDate = new Date("09/31/1995");
      Date nextDate = new Date(testDate);

      //is valid
      System.out.println(newDate.isValid());
      System.out.println(nextDate.isValid());
      Date nDate = new Date("02/29/2020");
      System.out.println(newDate.equals(nextDate));
      System.out.println(testDate.equals(nDate));

      System.out.println(nDate.toString());
      
   }

}




