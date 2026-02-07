import java.awt.*;
import java.util.*;


public class againbyte {

    public static int first = -1;
    public static int last = -1;

    public static void occuranceCount(String str, int idx, char el){

        if (idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }


        if (str.charAt(idx)== el){
            if (first == -1){
                first =idx;
            }else {
                last = idx;
            }

        }
        occuranceCount(str,idx+1, el);
    }

    public static void main(String args[]) {

        String str = "abdafgoisa";
        occuranceCount(str,0,'a');




    }
}



