package entity;

public class Person {
    static String lastname ="Gasmi ";
    static String firstname ="Firial ";
    static int age = 23;
    public int niveau = 123;
    public static void main(String[] args){
        System.out.println(firstname+lastname+age);
        Person ali1 = new Person();
        Person person2 = new Person();
        ali1.firstname = "ali ben ali";
        ali1.lastname = "trabelsi";
        ali1.age = 24;

        /*
        person2.lastname = "farah";
        person2.firstname = "Gasmi";
        person2.age = 27;
        System.out.println(person1.firstname+person1.lastname+person1.age);
        System.out.println("First name is "+person2.firstname+"Last name is "+person2.lastname+person2.age);

        entity.Person myObj1 = new entity.Person();
        entity.Person myObj2 = new entity.Person();
        System.out.println(myObj1);
        System.out.println(myObj2);

         */
    }

}
