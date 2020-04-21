import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         
         */
         String output = null;
         try
         {
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssaa");
        Date date = parseFormat.parse(s);
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        output = displayFormat.format(date);
        
         }
         catch(ParseException pe){
                pe.printStackTrace();
         }
        return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
