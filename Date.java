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
      //don't really know what's up here yet
      String [] dateSplit = d.split("/");
      this.day = Integer.parseInt(dateSplit[1]);
      this.month = Integer.parseInt(dateSplit[0]);
      this.year = Integer.parseInt(dateSplit[2]);
      
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

       if(this.month!=2)
         return true;
       
       if(this.day>29)
         return false;
      
       if(isLeap()==true)
         return true;

       if(this.day>28)
         return false;

      return true;
       

   }
   
   @Override
   public String toString()
   {
       //use the format "month/day/year"
       String stDate = String.format("%d/%d/%d", this.month,this.day,this.year);
       return stDate;

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
      Date testDate = new Date("02/29/2024");
      System.out.println(testDate.isLeap());
      
   }

}




