public class methods
{
    public static void q1(String str){
        String reverse = "";
        char holder;
        for (int i = 0; i< str.length(); i++){
            holder = str.charAt(i);
            reverse = holder + reverse;
        }
        System.out.println(reverse);
    }
    public static String q2(String str){
        String reverse = "";
        char holder;
        for (int i = 0; i< str.length(); i++){
            holder = str.charAt(i);
            reverse = holder + reverse;
        }
        return reverse;
    }
    public static void q3(int length, int width){
        int area = length * width;
        int perimeter = 2*(length+width);
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
    public static int q4 (int nums[]){
        boolean even = false;
        int lowest = -1;
        for (int i : nums){
            if (i %2 == 0 && even == false || i < lowest){
                lowest = i;
                even = true;
            }
        }
        return lowest;
    }
}


