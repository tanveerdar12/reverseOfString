import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class reverseString {
    static String reverseString(String s, String r, int i){
        if(i<0){
            return r;
        }
        //i= s.length();

      return  reverseString(s,r+s.charAt(i),i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.next();

        //String rev = " ";
        int i =str.length();

        System.out.println( reverseString(str," ",i-1));

    }
}
