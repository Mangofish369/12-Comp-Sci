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
            s = new Scanner(new File("visadata.csv"));
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        
        iterateData(data, s);
        
    }
    
    public static void iterateData(ArrayList<String> dataContainer, Scanner file){
        boolean moreLines = true;
        int numOfLines = 0;
        while(moreLines){
            try{
                dataContainer.add(file.nextLine());
            }
            catch (NoSuchElementException e){
                moreLines = false;
                System.out.println("END");
            }
        }
    }
    
    public static void seperate(String text){
        tokenizer = new StringTokenizer(text, ",");
        
        while(tokenizer.hasMoreTokens()){
            // do something
        }
    }
}
