import java.io.*;
import java.util.Arrays; 
import java.util.Scanner;
public class newQuestions
{
    public static void Question1 (){
        int [][] multiplicationTable = new int [25][25];
        
        // Initalize 1st row  
        for (int i = 1; i < 26; i ++){
            multiplicationTable [0][i-1] = i;
        }
        
        
        // Initalize 1st column
        for (int j = 1; j<26; j++){
            multiplicationTable[j-1][0] = j;
        }
        
        // Iterate through 2d array to populate each line, by multipling their idices together
        for (int i = 1; i < 26; i ++){
            for (int j = 1; j<26; j++){
                multiplicationTable [i-1][j-1] = i*j;
                
                // "\t" gives spacing between each integer
                System.out.print(multiplicationTable[i-1][j-1] + "\t ");
            }
            // "\n" creates a new line
            System.out.println("\n ");
        }
    }
    
    public static void Question2(){
        int width = 5;
        int height = 5;
        int [][] map = new int [width][height];
        Scanner input = new Scanner (System.in);
     
        map[0][0] = 1;
        print2dArray(map);
        
        System.out.println("Please enter a direction (L, R, U, D) or Stop: ");
        String direction = input.nextLine(); 
    }
    
    public static void print2dArray(int [][] array){
        for(int i = 0; i <5; i++){
            for(int j = 0; j < 5; j++){
                array[i][j] = 0;
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
