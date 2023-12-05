import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * CSV Reader Class
 * 
 * - Use the method readData() to see the analysis of your CIBC Visa account 
 *
 * @author Vincent
 * @version December 5,2023
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
        ArrayList <String> currString = new ArrayList <>();
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
        double sumOfDebits = 0;
        String updatedLine;
        while(moreLines){
            try{
                // Add the asterisk where the credit/debit goes so string tokenizer can detect it
                updatedLine = addAsterisk(s.nextLine()); 
                
                // Use string tokenizer to seperate the string into a token and add each token to the temporary arraylist
                seperate(updatedLine,currString); 
                if(currString.get(2).equals("*")){ // If the asterisk is infront of the transaction amount it is a credit transaction
                    credit++;
                }
                else{
                    debit++;
                    
                    //If it is a debit transaction, add the value to the total sum of debits
                    String debitValue = currString.get(2);
                    sumOfDebits += Double.parseDouble(debitValue);
                }
                numOfLines++;
                currString.removeAll(currString); // Empty the temporary arraylist of string  
            }
            catch (NoSuchElementException e){
                moreLines = false;
                //System.out.println("END");
            }
        }
        //Round sum of debits to 2 decimal places
        sumOfDebits  = (double)Math.round(sumOfDebits*100)/100;
        
        System.out.println("Total Transactions: " +(debit+credit));
        System.out.println("Total # of debit transactions: "+debit);
        System.out.println("Total # of credit transactions: "+credit);
        System.out.println("Value of all debits: " + sumOfDebits);
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
    /**
     * Method to add an Asterisk ('*') in empty spaces where debit/credit goes so it can be read by the string tokenizer
     * String tokenizer skips empty tokens ie. ",,"
     */
    public static String addAsterisk (String text){
        String updated = "";
        char curr;
        char nextCurr;
        for(int i = 0; i< text.length(); i++){
            curr = text.charAt(i);
            
            if(i+1 < text.length() && curr == ',' ){
                nextCurr = text.charAt(i+1);
                if(curr == nextCurr){
                    updated = text.substring(0,i+1)+ "*" + text.substring(i+1);
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
