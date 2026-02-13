import java.awt.*;
import java.util.*;


public class againbyte {

  public static void subSquences(String str, int idx, String newString){
      if (idx == str.length()){
          System.out.println(newString);
          return;
      }

      char currChar = str.charAt(idx);
      // to be in newString
      subSquences(str,idx+1,newString+currChar);
      // Not to be in NewString
      subSquences(str,idx+1,newString);
  }


    public static void main(String args[]) {

        String str = "abc";
        subSquences(str,0,"");




    }
}



