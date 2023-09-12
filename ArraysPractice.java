import java.util.Scanner;
import java.util.Arrays;
public class ArraysPractice
{
    private static Scanner scan = new Scanner (System.in);
    public static void arrayAdder () {
        // Declare my array and necessary variables
        int[] values;
        int numberOfValues, sum = 0;
        
        // Ask the user how many values?
        System.out.println("How many values?");
        numberOfValues = scan.nextInt();
        
        // Initialize the array to the user's chosen size
        values = new int[numberOfValues];
        
        for (int i = 0; i < values.length; i++){
            System.out.println("Enter value " + i);
            values[i] = scan.nextInt();
        }
        
        // Loop to add and display values:
        for (int i = 0; i < values.length; i++){
            sum += values[i]; // add to our sum
            System.out.print(values[i] + " "); // Display value + a space
            if (i == values.length - 1){ // last value?
                System.out.print ("= ");
            } else {
                System.out.print ("+ ");
            }
        }
        // Output the final sum to complete the line
        
        //Highest and Lowest
        int highest = values[0];
        int lowest= values[0];
        
        for(int i: values){
            if (i > highest){
                highest = i;
            }
            if (i < lowest){
                lowest = i;
            }
        }
        
        //Average value

        double average =(double)sum/numberOfValues;
        
        System.out.println (sum);
        System.out.println ("Highest: "+highest);
        System.out.println ("Lowest: "+lowest);
        System.out.println ("Average: "+average);
    }
    
    public static void diceRoll(){
        int numRolls;
        int [] sums; int [] results;
        int numDice;
        int sides;
                
        System.out.println ("How many sides do you want on your dice?");
        sides = scan.nextInt();
        
        
        System.out.println ("How many dice do you want?");
        numDice = scan.nextInt();
       
        System.out.println ("How many rolls do you want?");
        numRolls = scan.nextInt();
        sums = new int[numRolls]; 
        
        int totalCominations = (sides*numDice) -(numDice-1);
        System.out.println(totalCominations);
        results = new int[totalCominations];
        
        for(int i = 0; i < numRolls; i++){
            for(int j = 0; j <numDice; j++){
                int result = ((int)(Math.random() * sides) + 1);
                sums[i] = sums[i] + result;
            }
            for (int k = 0; k< results.length; k++){
                if(sums[i] -numDice == k){
                    results[k] += 1;
                }
            }
        }
        System.out.println("------------------------Result Distribution------------------------");
        for (int m=0; m < results.length; m++){
            double percentage = (double)results[m]/numRolls*100;
            double output = (double)Math.round(percentage * 10000) / 10000;
            System.out.println((m+numDice)+" :"+ output+"%");
        }
        System.out.println(Arrays.toString(sums));
        System.out.println(Arrays.toString(results));
    }
}

