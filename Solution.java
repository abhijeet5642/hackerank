import java.io.*;
import java.util.*;

public class Solution {
     static int b;
     static int h;

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
         b= sc.nextInt();
       h = sc.nextInt();
       if(b > 0 && h>0){
            int areaofp = b*h;
            System.out.println(areaofp);
        
       }
       else if( b<0 && h>0 || b>0 && h<0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
       }
    }
    }
