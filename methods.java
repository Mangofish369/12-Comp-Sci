public class methodsPratice
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
        System.out.println("Area: "+area+"Perimeter: "+perimeter);
    }
}


