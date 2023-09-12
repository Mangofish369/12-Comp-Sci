import java.util.Scanner; //Hellooooo 
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;
public class questions
{
    public static Scanner myscanner  = new Scanner(System.in);
    public static Random rand = new Random();
    public static void q1(){
       int sum = 0;
       String[] sufix = {"st","nd","rd"};
       for (int i = 0; i<3; i++){
           System.out.println("Enter "+(i+1)+sufix[i]+" number");
           sum = sum + myscanner.nextInt();
       }
       System.out.println("The sum of the three numbers is: "+sum);
   }
   
   public static void q2(){
      int sum = 0;
      String[] sufix = {"st","nd","rd"};
      for (int i = 0; i<3; i++){
           System.out.println("Enter "+(i+1)+sufix[i]+" number");
           sum = sum + myscanner.nextInt();
       }
      double average = (double)sum/3;
      System.out.println(average);
   }
   
   public static void q3(){
       int sum = 0;
       String[] sufix = {"st","nd","rd","th"};
       for (int i = 0; i<4; i++){
           System.out.println("Enter "+(i+1)+sufix[i]+" course mark");
           sum = sum + myscanner.nextInt();
       }
       double average = (double)sum/4;
       System.out.println("Your course average is: " + average);
    }
    
    public static void q4(){
       int sum = 0;
       String[] sufix = {"st","nd","rd","th"};
       for (int i = 0; i<4; i++){
           System.out.println("Enter "+(i+1)+sufix[i]+" course mark");
           sum = sum + myscanner.nextInt();
       }
       // Divide total by 4, then multiply by 10 for one decimal place
       // Round the number, and then shift back by one decimal place to get the final answer
       double roundedAverage = (double)Math.round((double)sum/4 * 10)/10;
       System.out.println("Your rounded course average is: " + roundedAverage);
       
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
    
    public static void q7(){
        int score = 0;
        for (int i = 0; i<3; i++){
            int randNum1 = rand.nextInt(100);
            int randNum2 = rand.nextInt(100);
            System.out.println("What is "+randNum1+"+"+randNum2);
            int ans = myscanner.nextInt();
            if(ans == randNum1+randNum2){
                score++;
                System.out.println("Correct");
            }
            else{
                System.out.println("Wrong");
            }
        }
        System.out.println("You got "+score+" out of 3");
    }
    
    public static void q8(){
        int num1, num2, num3;
        int sort[] = new int[3];
        System.out.println("Enter the first number: ");
        num1 = myscanner.nextInt();
        sort[0] = num1;
        System.out.println("Enter the second number: ");
        num2 = myscanner.nextInt();
        sort[1] = num2;
        System.out.println("Enter the third number: ");
        num3 = myscanner.nextInt();
        sort[2] = num3;
        Arrays.sort(sort);
        int smallest = sort[0];
        System.out.println("The smallest number is "+smallest);
    }
    
    public static void q9(){
        int yourAge;
        while(true){
            System.out.println("What is your age ");
            yourAge = myscanner.nextInt();
            if (yourAge >= 0){
                break;
            }
        }
        if (yourAge <13){
            System.out.println("You are a child");
        }
        else if (yourAge >= 13 && yourAge <= 19){
            System.out.println("You are a teenager");
        }
        else if (yourAge >= 20 && yourAge <= 65){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a senior citizen");
        }
    }
    
    public static void q10(){
        System.out.println("How many numbers do you want to enter?");
        int length = myscanner.nextInt();
        int nums [] = new int[length];
        for(int i = 0; i<length;i++){
            System.out.println("Enter the first number: ");
            nums[i] = myscanner.nextInt();
        }
        for(int i: nums){
            String str = "#";
            String repeated = str.repeat(i);
            System.out.println(repeated);
        }
    }
    
}