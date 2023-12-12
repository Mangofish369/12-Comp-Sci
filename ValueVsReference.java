import java.util.Arrays;

public class ValueVsReference
{
public static void q1(){
    int x = 10;
    int y = x;
    x++;
    System.out.println(x);
    System.out.println(y);
}

public static void q2(){
    String a = "Computer";
    String b = a;
    a += "s";
    System.out.println(a);
    System.out.println(b);
}

public static void q3(){
    int[] vals = {5, 5, 5};
    int[] vals2 = vals;
    vals[1]++;
    vals2[0]--;
    System.out.println(Arrays.toString(vals));
    System.out.println(Arrays.toString(vals2));
}

public static void q4() {
    String letters = "abc";
    String more = letters + "efg";
    letters = more;
    more += "hij";
    System.out.println(letters);
    System.out.println(more);
}

public static void q5() {
    int[] vals = {0, 0, 0, 0};
    int[] vals2 = vals;
    add2ToAll(vals);
    add2ToAll(vals2);
    System.out.println(Arrays.toString(vals));
    System.out.println(Arrays.toString(vals2));
}
private static void add2ToAll (int[] arr){
    for (int i = 0; i < arr.length; i++){
        arr[i] += 2;
    }
}

public static void q6 () {
    String name = "Vincent";
    String name2 = name;
    shorten(name);
    shorten(name2);
    System.out.println(name);
    System.out.println(name2);
}
private static void shorten (String s){
    int half = s.length() / 2;
    // This will change so to be 
    // equal to the first half of s
    s = s.substring (0, half);
}


public static void main (String[] args){
   System.out.println("=====   Q1   ======");
   q1();
   System.out.println("=====   Q2   ======");
   q2();
   System.out.println("=====   Q3   ======");
   q3();
   System.out.println("=====   Q4   ======");
   q4();
   System.out.println("=====   Q5   ======");
   q5();
   System.out.println("=====   Q6   ======");
   q6();
}
    
}
