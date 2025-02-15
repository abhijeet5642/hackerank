import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
// import java.util.Calender.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        java.time.LocalDate date = java.time.LocalDate.of(year,month,day);
        return date.getDayOfWeek().toString();

    }

}
        class printDay {
            public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        
                int month = Integer.parseInt(firstMultipleInput[0]);
                int day = Integer.parseInt(firstMultipleInput[1]);
                int year = Integer.parseInt(firstMultipleInput[2]);
        
                String res = Result.findDay(month, day, year);
        
                // Print result to console
                System.out.println(res);
        
                bufferedReader.close();
            
    }
}
