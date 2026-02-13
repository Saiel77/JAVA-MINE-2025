import java.awt.*;
import java.util.*;


public class againbyte {

  public static boolean[] map = new boolean[26];

  public static void removeDuplicates(String str, int idx, String newString){

      if (idx == str.length()){
          System.out.println(newString);
          return;
      }


      char Currentchar = str.charAt(idx);
      if (map[Currentchar - 'a']){
          removeDuplicates(str, idx+1, newString);
      }else {
          newString += Currentchar;
          map[Currentchar-'a']= true;
          removeDuplicates(str, idx+1, newString);
      }


  }


    public static void main(String args[]) {

        String str = "abbcda";
        removeDuplicates(str,0,"");




    }
}



