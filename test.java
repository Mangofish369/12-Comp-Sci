import java.util.Queue;
import java.util.LinkedList;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{


    /**
     * Constructor for objects of class test
     */
    public test()
    {

    }

    public static void q1(){
        Queue q = new LinkedList<String>();
        q.add("Zero");
        q.add("One");
        q.add("Two");
        q.add("Three");
        q.add("Four");
        
        //q.remove(1);
        System.out.println(q.remove(1));
    }
}
