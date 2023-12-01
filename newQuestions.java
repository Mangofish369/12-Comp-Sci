import java.io.*;
import java.util.Arrays; 
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
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
        
        populate2dArray(map,0);
        map[0][0] = 1;
        int [] currCordinate = {0,0}; 
        print2dArray(map, width, height);
        
        System.out.println("Please enter a direction (L, R, U, D) or Stop: ");
        String direction = input.nextLine(); 
        while(!direction.equals ("Stop")){
            System.out.println(direction);
            try{
                move(direction, map, currCordinate);
                print2dArray(map, width, height);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid – you cannot move in that direction from your current position");
            }
            System.out.println("Please enter a direction (L, R, U, D) or Stop: ");
            direction = input.nextLine(); 
        }
    }
    
    /**
     * 2D arrays function in a way where x-cordinates represent coloums and y-coordinates represent rows
     * To work around this, the x and y values must be switched around
     */
    public static void move(String direction, int [][] array, int [] coordinate){
        int x = coordinate[0];
        int y = coordinate [1];
        if(direction.equals("L")){
            array[y][x] = 0;
            array[y][x-1] = 1;
            coordinate = updateCord(coordinate,x-1,y); 
        } else if(direction.equals("R")){
            array[y][x] = 0;
            array[y][x+1] = 1;
            coordinate = updateCord(coordinate,x+1,y); 
        } else if(direction.equals ("U")){
            array[y][x] = 0;
            array[y-1][x] = 1;
            coordinate = updateCord(coordinate,x,y-1); 
        } else if(direction.equals ("D")){
            array[y][x] = 0;
            array[y+1][x] = 1;
            coordinate = updateCord(coordinate,x,y+1); 
        }
    }
    
    public static void populate2dArray(int [][] array, int value){
        for(int i = 0; i <5; i++){
            for(int j = 0; j < 5; j++){
                array[i][j] = value;
            }
        }
    }
    public static int[] updateCord(int [] coordinate, int x, int y){
        coordinate[0] = x;
        coordinate[1] = y;
        return coordinate;
    }
    
    public static void print2dArray(int [][] array, int width, int height){
        for(int i = 0; i <height; i++){
            for(int j = 0; j < width; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
