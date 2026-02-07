import java.awt.*;
import java.util.*;


public class againbyte {

  public static void printNewString(String str,int idx,int count,String newString){

      if (idx == str.length()){
          for (int i=0; i<count; i++){
              newString += 'x';
          }
          System.out.println(newString);
          return;
      }

      char currChar = str.charAt(idx);
      if(currChar == 'x'){
          count++;
          printNewString(str,idx+1,count, newString);
      }else {
          newString += currChar;
          printNewString(str, idx+1, count, newString);
      }
  }


    public static void main(String args[]) {

        String str = "axbxxdx";
        printNewString(str,0,0,"");




    }
}



