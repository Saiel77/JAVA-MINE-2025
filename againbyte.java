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

class Student{
    String name;
    String age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class againbyte{

    public static void main(String args[]){

     Student s1 =new Student();
     s1.name = "Saiel";
     s1.age = "21";

     s1.printInfo();


    }

}