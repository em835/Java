
/*
Grade Calculator 
*/import java.util.Scanner;

public class DoLoop
{
  
   public static void main (String[] args)
   {
      int sum = 0, value, count = 0;
      double average;
      char answer;

      Scanner scan = new Scanner (System.in);

      
      System.out.print (" Enter grade : ");
      value = scan.nextInt();

      System.out.print("at any time enter 1000 to exit program");
      while (value != 1000) 
      {
         count++;

         sum += value;
       

         System.out.print (" Enter grade: ");
         value = scan.nextInt();
      }

      System.out.println ();
        
      {
         average = (double)sum / count;

         
         System.out.println ("The average is " +(average));
         if (average > 50)
         {
         System.out.println("pass");
         }
      }
   }
}
