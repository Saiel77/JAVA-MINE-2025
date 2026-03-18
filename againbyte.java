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
   int age;

   public void printInfo(String name){
       System.out.println(name);
   }

   public void printInfo(int age){
       System.out.println(age);
   }
   public void printInfo(String name,int age){
       System.out.println(name + " " + age);
   }


}



public class againbyte{

    public static void main(String args[]){

     Student s1 =new Student();
     s1.name = "Sajiel";
     s1.age = 21;

     s1.printInfo(s1.name,s1.age);




    }

}