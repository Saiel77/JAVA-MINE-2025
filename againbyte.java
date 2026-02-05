import java.awt.*;
import java.util.*;


public class againbyte {

    public static void reversePrint(String str, int idx){
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
            System.out.print(str.charAt(idx));
            reversePrint(str,idx-1);

    }



    public static void main(String args[]) {
        String str = "LOLO";
        reversePrint(str,str.length()-1);




    }
}



