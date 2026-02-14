import java.awt.*;
import java.util.*;
import java.util.HashSet;


public class againbyte {

 public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };

    public static void printComb(String str, int idx, String Combination){

        if (idx == str.length()){
            System.out.println(Combination);
            return;
        }

        char CurrChar = str.charAt(idx);
        String Mapping = keypad[CurrChar-'0'];

        for (int i=0; i<Mapping.length(); i++){
            printComb(str,idx+1, Combination+Mapping.charAt(i));
        }
    }

    public static void main(String args[]) {

        String str = "23";
       printComb(str,0,"");




    }
}



