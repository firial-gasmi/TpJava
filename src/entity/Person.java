package entity;

public class Person {
    private String myname;
    int myage;

    public Person(String myname, int myage) {
        this.myname = myname;
        this.myage = myage;
    }
    public String getMyname(){
        return myname;
    }

    public void setMyname(String newMyname){
        this.myname= newMyname;
    }


    public static void main(String[] args) {
       Person myprofile= new Person("firial", 23);

       myprofile.setMyname("Firial11");
        System.out.println("My age is "+myprofile.myage+" My name is "+myprofile.myname);
    }
    }
