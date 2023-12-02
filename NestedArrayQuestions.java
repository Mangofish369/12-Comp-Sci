import java.io.*;
import java.util.Arrays; 
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Exception;
public class NestedArrayQuestions
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
        print2dArray(map);
        
        System.out.println("Please enter a direction (L, R, U, D) or Stop: ");
        String direction = input.nextLine(); 
        while(!direction.equals ("Stop")){
            System.out.println(direction);
            try{
                move(direction, map, currCordinate);
                print2dArray(map);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid – you cannot move in that direction from your current position");
            }
            System.out.println("Please enter a direction (L, R, U, D) or Stop: ");
            direction = input.nextLine(); 
        }
    }
    
    public static void Question3(){
        int size = 3;
        String [][] grid = new String [size][size];
        populate2dArray(grid, "-");
        String [] teams = {"X","O"};
        String curPlayer = teams[0];
        print2dArray(grid);
        boolean turnComplete;
        
        while(!findWinner(grid, teams)){
            turnComplete = addPoint(grid, curPlayer);
            print2dArray(grid);
            if(turnComplete){
                curPlayer = changePlayer(curPlayer, teams);
            }
        }
    }
    
    /**
     * 2D arrays can better be visualized as a nested array
     *  - The first value represents rows (aka y-cord)
     *  - The second value represents the index of the nested array; you can imagine it as coloums in this case (aka x-cord)
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
    
    public static boolean addPoint(String [][] array, String player){
        Scanner input = new Scanner (System.in);
        System.out.println("Player: ["+player+"]'s x-cord: ");
        int x = input.nextInt(); 
        
        System.out.println("Player: ["+player+"]'s y-cord: ");
        int y = input.nextInt();
        Boolean turnComplete = false;
        
        try{
            String current = array[y][x];
            if(current == "-"){
                array[y][x] = player;
                turnComplete = true;
            } else{
                System.out.println("INVALID – space is taken");
                return turnComplete;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Coordinate is out of bounds");
        }
        return turnComplete;
    }
    public static String changePlayer (String curPlayer, String[] teams){
        if(curPlayer.equals(teams[0])){
            curPlayer = teams[1];
        } else{
            curPlayer = teams[0];
        }
        return curPlayer;
    }
    
    public static boolean findWinner (String[][] array, String[] teams){
        if(checkRows(array,teams) || checkColumns(array,teams) || checkDiagonals(array,teams)){
            return true;
        }
        return false;
    }
    
    public static boolean checkRows(String[][] array,String [] teams){
        for(String t : teams){
            for(int i = 0; i <array.length; i++){
                for(int j = 0; j < array[i].length; j++){
                    if(array[i][j].equals(t)){
                        if(j+2 < array[i].length && array[i][j+1].equals(t) && array[i][j+2].equals(t)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean checkColumns(String[][] array, String [] teams){
        for(String t: teams){
            for(int j = 0; j < array[0].length; j++){
                for(int i = 0; i < array.length; i++){
                    if(array[i][j].equals(t)){
                        if(i+2 < array.length && array[i+1][j].equals(t) && array[i+2][j].equals(t)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean checkDiagonals(String [][] array, String [] teams){
        for(String t: teams){
            for(int j = 0; j< array[0].length; j++){
                for(int i = 0; i < array.length; i++){
                    if(array[i][j].equals(t)){
                        if(i+2 < array.length && j+2 < array[0].length && array[i+1][j+1].equals(t) && array[i+2][j+2].equals(t)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static void populate2dArray(int [][] array, int value){
        for(int i = 0; i <array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = value;
            }
        }
    }
    public static void populate2dArray(String [][] array, String value){
        for(int i = 0; i<array.length; i++){
            for(int j =0; j < array[i].length; j++){
                array[i][j] = value;
            }
        }
    }
    public static int[] updateCord(int [] coordinate, int x, int y){
        coordinate[0] = x;
        coordinate[1] = y;
        return coordinate;
    }
    
    public static void print2dArray(int [][] array){
        for(int i = 0; i <array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    public static void print2dArray(String [][] array){
        for(int i = 0; i <array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
