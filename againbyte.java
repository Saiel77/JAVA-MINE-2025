import  java.util.*;


interface Animal{
    void walk();

}


class Horse implements Animal{
    public void walk(){
        System.out.println("Horse walks ON 4 LEGS");
    }
}


public class againbyte{


public static void main(String args[]){

    Horse horse = new Horse();
    horse.walk();





    }

}