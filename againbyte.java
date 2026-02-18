import java.awt.*;
import java.util.*;
import java.util.HashSet;


public class againbyte {

    public static int countPaths(int i,int j,int n, int m) {
        if (i == n || j == m){
            return 0;
    }
            if (i == n-1 && j==m-1){
                return 1;
            }


        // Moving DowanWards
        int downpath = countPaths(i+1,j,n,m);
        //Moving Right
        int rightPath = countPaths(i,j+1,n,m);

        return downpath+rightPath;
    }


    public static void main(String args[]) {
     int n =3;
     int m=3;

     int totalPaths = countPaths(0,0,n,m);
        System.out.println(totalPaths);





    }
}



