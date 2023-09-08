import java.util.Scanner;
import java.lang.Math;
public class questions
{
    public static Scanner myscanner  = new Scanner(System.in);
   public static void q1(){
       int sum = 0;
       System.out.println("Enter the first number: ");
       sum = sum + myscanner.nextInt();
       System.out.println("Enter the second number: ");
       sum = sum + myscanner.nextInt();
       System.out.println("Enter the third number: ");
       sum = sum + myscanner.nextInt();
       System.out.println("The sum of the three numbers is: " + sum);
   }
   
   public static void q2(){
      int n1 = 0;
      int n2 = 0;
      int n3 = 0;
      System.out.println("Enter the first number: ");
      n1 = myscanner.nextInt();
      System.out.println("Enter the second number: ");
      n2 = myscanner.nextInt();
      System.out.println("Enter the third number: ");
      n3 = myscanner.nextInt();
      double ans = ((double)n1 + (double)n2 + (double)n3)/3;
      System.out.println("The average of the three numbers is: " + ans);
   }
   
   public static void q3(){
       int course1, course2, course3, course4;
       System.out.println("Enter your mark on course 1: ");
       course1 = myscanner.nextInt();
       System.out.println("Enter your mark on course 2: ");
       course2 = myscanner.nextInt();
       System.out.println("Enter your mark on course 3: ");
       course3 = myscanner.nextInt();
       System.out.println("Enter your mark on course 4: ");
       course4 = myscanner.nextInt();
       double average = ((double)course1 + (double)course2 + (double)course3 + (double)course4)/4;
       System.out.println("Your course average is: " + average);
    }
    
    public static void q4(){
       double course1, course2, course3, course4;
       System.out.println("Enter your mark on course 1: ");
       course1 = myscanner.nextDouble();
       System.out.println("Enter your mark on course 2: ");
       course2 = myscanner.nextDouble();
       System.out.println("Enter your mark on course 3: ");
       course3 = myscanner.nextDouble();
       System.out.println("Enter your mark on course 4: ");
       course4 = myscanner.nextDouble();
       
       double unround = (course1 + course2 + course3 + course4)/4;
       System.out.println(unround);
       unround = unround * 10;
       int nodec = (int)unround; // Remove all decimals after first one
       double rounded = (double)nodec;
       rounded = rounded/10;
       System.out.println("Your rounded course average is: "+rounded);
       
    }
    
    public static void q5(){
        double n1, n2;
       while(true){
           System.out.println("Enter a number from 1 to 9");
           n1 = myscanner.nextDouble();
           if(n1 <=9 && n1 >=1){
               break;
            }
           System.out.println("That is not a number from 1 to 9, try again");
        }
       while(true){
          System.out.println("Enter another number from 1 to 9");
          n2 = myscanner.nextDouble();
          if(n2 <=9 && n2 >=1){
              break;
           }
          System.out.println("That is not a number from 1 to 9, try again");
       }
       int addition = (int)n1+(int)n2;
       int subtraction = (int)n1-(int)n2;
       int multiplication = (int)n1*(int)n2; 
       double division = n1/n2;
       double power = Math.pow(n1,n2);
       System.out.println("Addition:"+addition+" Subtraction:"+subtraction+" Multiplication:"+multiplication+" Division:"+division+" Power:"+power);
    }
    
    public static void q6(){
        int num1, num2;
        System.out.println("Enter the first number: ");
        num1 = myscanner.nextInt();
        System.out.println("Enter the second number: ");
        num2 = myscanner.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        if (num1 > num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else if (num2 > num1){
            System.out.println(num2+" is greater than "+num1);
        }
        
        else{
            System.out.println("The two numbers are the same");
        }
    }
}
