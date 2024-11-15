package PracticeCode;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
       
        Scanner X = new Scanner(System.in);

      
        System.out.println("Enter Your Height:");
        int height = X.nextInt();

        System.out.println("Enter Your Weight:");
        int weight = X.nextInt();

        System.out.println("Enter Your Cutoff Mark:");
        int cutoffMark = X.nextInt();

        
        if (height >= 170 && height <= 180) 
        {
            System.out.println("Your height is between 170 and 180. You are selected for height.");

           
            if (weight >= 65 && weight <=80) 
            {
                System.out.println("Your weight is between 65 and 80. You are selected for weight.");

              
                if (cutoffMark >= 140 && cutoffMark <= 160)
                {
                    System.out.println("Your cutoff mark is between 170 and 180. You are selected.");
                }
                else 
                {
                    System.out.println("Your cutoff mark is low, better luck next time.");
                }
            } 
            else
            {
                System.out.println("Your weight is not in the selected range, better luck next time.");
            }
        }
        else 
        {
            System.out.println("Your height is not in the selected range, better luck next time.");
        }

       
        X.close();
    }
}
