import  java.util.*;

class Pen{

    String color;
    String type;
    // TO Define Pen's Type and Color

    public void write(){

        System.out.println("Writing Somethin");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

public class againbyte{

    public static void main(String args[]){

        Pen pen1 = new Pen();
        pen1.type ="Ball";
        pen1.color="Blue";

        Pen pen2 = new Pen();
        pen2.type = "Gel";
        pen2.color = "Black";

        pen1.printColor();
        pen2.printColor();


    }

}