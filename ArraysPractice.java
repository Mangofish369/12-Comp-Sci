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
        System.out.println (sum);
        System.out.println ("Highest: "+highest);
        System.out.println ("Lowest: "+lowest);
    }
    
    public static void diceRoll(){
        int numRolls;
        int [] sums; int [] results;
        int numDice = 2;
        int sides = 6;
        int totalCominations = (sides+sides) -1; 
        results = new int[totalCominations];
       
        System.out.println ("How many rolls do you want?");
        numRolls = scan.nextInt();
        sums = new int[numRolls]; 
        
        for(int i = 0; i < numRolls; i++){
            for(int j = 0; j <numDice; j++){
                int result = ((int)(Math.random() * 6) + 1);
                sums[i] = sums[i] + result;
            }
            for (int k = 0; k< results.length; k++){
                if(sums[i] -2 == k){
                    results[k] += 1;
                }
            }
        }
        System.out.println(Arrays.toString(sums));
        System.out.println(Arrays.toString(results));
    }
}

