import java.util.Arrays;
public class FastSort
{
    public FastSort()
    {
        
    }
    
    /**
     * This is the fastest, least complicated and easiest to read
     * sorting algorithm. Without a doubt a once in a life time invention.
     */
    public static void recursionSort(int [] array){
        for(int i = 0; i < array.length-1; i++){
            int currNum = array[i];
            int nextNum = array[i+1];
            if(currNum > nextNum){
                array[i] = nextNum;
                array[i+1] = currNum;
                System.out.println(Arrays.toString(array));
                recursionSort(array);
            }
        }
    }
    public static void swap(int[] array, int first, int second){
        int firstValue = array[first];
        int secondValue = array [second];
        
        array[first] = secondValue;
        array[second] = firstValue;
    }
}
