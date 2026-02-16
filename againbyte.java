import java.awt.*;
import java.util.*;
import java.util.HashSet;


public class againbyte {

 public static void permutationabc(String str, String Permutation){

     if (str.length()== 0){
         System.out.println(Permutation);
         return;
     }
     for (int i=0; i<str.length(); i++){
         char currChar = str.charAt(i);
         String newString = str.substring(0,i)+str.substring(i+1);
         permutationabc(newString,Permutation+currChar);

     }
 }

    public static void main(String args[]) {
     String str = "abc";
     permutationabc(str,"");






    }
}



