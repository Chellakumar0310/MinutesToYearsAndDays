
package minutestoyearsanddays;



import java.util.Scanner;


public class MinutestoYearsanddays {

   
     public static void main(String[] args) {
         
         
         years();
        
        
    }

    private static void years() {
        Scanner in = new Scanner(System.in);
         System.out.println("Enter the Number of Minutes: ");
        int minutes = in.nextInt();
        
        int year = minutes / 525600;
        int remainingdays = minutes % 525600;
        int day = remainingdays / 1440;
        
        
        
        System.out.println(minutes+  " Minutes is approximately equal to "  +year+ " Years and " +day+ " days ");
        
        
      }
    
}

   
      



