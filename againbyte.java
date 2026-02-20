import java.awt.*;
import java.util.*;
import java.util.HashSet;


public class againbyte {

  public static int callGuests(int n){

      if (n <= 1){
          return 1;
      }
      //1st Way
      int way1 = callGuests(n-1);
      //2nd Way
      int way2 = (n-1)*callGuests(n-2);

      return way1 + way2;
  }

    public static void main(String args[]) {
     int n =4;

        System.out.println(callGuests(n));





    }
}



