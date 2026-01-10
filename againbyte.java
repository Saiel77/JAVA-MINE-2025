import java.awt.*;
import java.util.*;


public class againbyte {

    public static void main(String args[]) {

        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + " "+ lastName;

        System.out.println(fullName.length());

        for (int i=0; i<fullName.length(); i++){

            System.out.println(fullName.charAt(i));
        }
    }
}



