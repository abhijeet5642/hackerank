import java.io.*;
import java.util.*;

public class StringA {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A =sc.next();
        String B = sc.next();
        
        int resultA =A.length();
        int resultB =B.length();
        System.out.println(resultA + resultB);
        boolean get =false;
        for(int i=0;i<A.length();i++){
            for(int j=i;j<B.length();j++){
                    if(A.charAt(i)>B.charAt(j)){
                        get =true;
                        break;
                    }
            }
            if(get){
                break;
            }
        }
        if(get){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}