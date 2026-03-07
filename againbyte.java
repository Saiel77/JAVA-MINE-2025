import  java.util.*;

class Pen{

    String color;
    String type;
    // TO Define Pen's Type and Color

    public void write(){

        System.out.println("Writing Somethin");
    }

}

public class againbyte{

    public static void main(String args[]){

        Pen pen1 = new Pen();
        pen1.type ="Ball";
        pen1.color="Blue";

        pen1.write();
    }

}