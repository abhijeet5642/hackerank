
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class printString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("string is");
        String S = in.next();
        System.out.println("start");
        int start = in.nextInt();
        System.out.println("end");
        int end = in.nextInt();
        for(int i=0;i<S.length();i++){
            if(i==start){
                for(int j =start;j<=end-1;j++){
                    System.out.print(S.charAt(j));
                }
            }
        }
    }
}
    
