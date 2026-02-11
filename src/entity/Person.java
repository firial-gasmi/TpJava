package entity;

public class Person {
   String myname;
   int myage;

    public Person(String myname, int myage) {
        this.myname = myname;
        this.myage = myage;
    }

    /*public Person(String name, int age){
           myage = age;
           myname = name;
       }*/
    /*public Person(){

    }*/
    public static void main(String[] args) {
       Person myprofile= new Person("firial", 23);
        System.out.println("My age is "+myprofile.myage+" My name is "+myprofile.myname);
    }
    }
