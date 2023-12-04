import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * Write a description of class CSVReader here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSVReader
{
    private static Scanner s;
    private static StringTokenizer tokenizer;
    /**
     * Constructor for objects of class CSVReader
     */
    public CSVReader()
    {
        
    }
    
    public static void readData(){
        ArrayList <String> data = new ArrayList <>();
        try{
            s = new Scanner(new File("visadata_nocommas.csv"));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        boolean moreLines = true;
        int numOfLines = 0;
        int debit = 0;
        int credit = 0;
        while(moreLines){
            try{
                seperate(s.nextLine(),data);
                System.out.println("Index 3: "+ data.get(3));
                if(data.get(2).equals(null)){
                    credit++;
                }
                else{
                    credit++;
                }
                numOfLines++;
                data.removeAll(data);   
            }
            catch (NoSuchElementException e){
                moreLines = false;
                System.out.println("END");
            }
        }
        System.out.println("debilt: "+debit);
        System.out.println("credit: "+credit);
    }
    public static void printLines(){
        try{
            s = new Scanner(new File("visadata_nocommas.csv"));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        boolean moreLines = true;
        int numLines = 0;
        while(moreLines){
            try{
                System.out.println(s.nextLine());
                numLines++;
            }
            catch (NoSuchElementException e){
                moreLines = false;
                System.out.println("End");
            }
        }
    }
    public static String addAsterisk (String text){
        String updated = "";
        char curr;
        char nextCurr;
        for(int i = 0; i< text.length(); i++){
            curr = text.charAt(i);
            nextCurr = text.charAt(i+1);
            if(i+1 < length() && curr.equals("," )){
                if(curr.equals(nextCurr)){
                    updated = text.substring(0,i)+ '*' + text.substring(i);
                }
            }
        }
        return updated;
    }
    public static ArrayList<String> seperate(String text, ArrayList<String> data){
        tokenizer = new StringTokenizer(text, ",");
        boolean inQuotation = false;
        
        while(tokenizer.hasMoreTokens()){
            data.add(tokenizer.nextToken());
        }
        return data;
    }
}
