import entity.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void afficherhello(){
        System.out.println("Hello");
    }
    public void ranimanichstatic(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        afficherhello();
        Main raniobject= new Main();
        raniobject.ranimanichstatic();



        /*
        Person ali1 = new Person();
        ali1.niveau = 10;
        System.out.println(ali1.niveau);

         */
    }
    }

    /*
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    static void checkAge(int age) {
        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static int doubleGame(int x) {
        return x * 2;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
        */

        /*this is a comment
        System.out.print(777 - 9);*/
        /*
        System.out.print(88);
        System.out.println(11);

        String fullName = "majus";
        String fullname = "minus";
        System.out.println(fullName);
        System.out.println(fullname);

        String name1 = "Firial";
        System.out.println(name1 + " " + "the Queen");
        String name2 = "Farah";
        //String all = name1 + name2;
        System.out.println(name1 +" "+ name2); // concatination (.concat)

        final int num1 = 5; //the final name of var should be majuscule more  clear
        System.out.println(num1);
        int num2 = 20;
        System.out.println("the sum is ="+num1+num2);
        System.out.println("the sum is ="+(num1+num2));

        int a = 5, b= 6, c=4;
        System.out.println(a+b+c);

        int d, e, f;
        d = e = f = 10;
        System.out.println(d+e+f);

        int one = 4;
        int two = 6;
        int sum;
        sum = one + two;
        System.out.println("First number is : "+one);
        System.out.println("Second number is : "+two);
        System.out.println("the sum of both is : "+sum);

        int m = 15;
        float h = 12.1f;
        System.out.println(m*h);

        float flo = 18.33f;
        System.out.println(flo);

        char sexe = 'F';
        System.out.println(sexe);

        boolean bool = true;
        System.out.println(bool);

        String firstname ="Good morning everyone";
        System.out.println("Good morning everyone: " + firstname.length());

        int x=5;
        int y=3;
        System.out.println(x%y);

        String nameAcademy = "SHerbrooke";
        System.out.println(nameAcademy.toLowerCase());
        System.out.println(nameAcademy.toUpperCase());

        String word ="Good evening";
        System.out.println(word.indexOf("o"));
        System.out.println(word.charAt(5));

        String txt1 = "texte1";
        String txt2 = "texte100";
        System.out.println(txt1.equals(txt2)); //equals

        String txt3 = "   bonjour   ";
        System.out.println(txt3.trim()); //delete spaces

        String r = "pizza ";
        String t = "is ";
        String s = "yummy";
        String result = r.concat(t).concat(s);
        System.out.println(result);

        String cat = "it\'s okay ";
        System.out.println(cat); // we have also (\\) (\') (\'') (\n new line) (\t big space) (\b normal space)

        System.out.println(Math.sqrt(64)); // for calculate racine caree
        System.out.println(Math.max(5, 10)); // for found the maximum of both
        System.out.println(Math.abs(144));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.random()); // it gives a random number of double
        System.out.println(Math.round(15.4)); // it turns a float number at integer
        System.out.println(Math.ceil(14.4)); // it gives the nearest up value
        System.out.println(Math.floor(14.4)); // it gives the nearest down value

        boolean isJavaFun = true;
        boolean isWaterWet = false;
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is water wet? " + isWaterWet);

        int numb1 = 5;
        int numb2 = 10;
        System.out.println(numb1>numb2);

        int v = 10;
        System.out.println(v == 10);

        int myAge = 25;
        int votingAge = 18;
        if (myAge >= votingAge){
            System.out.println("Old enough to vote");
        } else {
            System.out.println("Not old enough to vote");
        }


        boolean isRaining = true;
        if (isRaining){
            System.out.println("Bring an umbrella");
        }

        if (20 > 18){
            System.out.println("20 is greater");
        }

        int weather = 2 ; // 1 = raining, 2 = sunny, 3 = cloudy
        if (weather == 1) {
            System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
            System.out.println("Wear sunglasses.");
        } else {
            System.out.println("Just go outside normally.");
        }

        int time = 22;
        String message = (time < 12) ? "Good Morning" : (time < 18) ? "Good Afternoon" : "Good Evevning";
        System.out.println(message); // one hand if else

        int age = 20; //boolean with if else
        boolean isCitizen = true;
        if (age >= 18) {
            System.out.println("Old enough to vote.");
            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }

        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest
        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        int day = 4; //switch
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        int countdown = 3; //while
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");

        int i = 10; // do while
        do {
            System.out.println("i is " + i);
            i++;
        } while (i < 5);

        int summ = 0; // boucle for
        for (int j = 1; j <= 5; j++) {
            summ = summ + j;
        }
        System.out.println("Sum is " + summ);

        for (int l = 0; l < 10; l++) { // the break to  quit the loop
            if (l == 4) {
                break; // continue for skipping one iteration
            }
            System.out.println(l);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"}; //array or new string to create empty array
        cars[0] = "Opel";
        System.out.println(cars[0]); // Now outputs Opel instead of Volvo
        System.out.println(cars.length); // to find how many elemnts

        String[] seats = {"Jenny", "Liam", "Angie", "Bo"}; //array with loop
        for (int n = 0; n < seats.length; n++) {
            System.out.println("Seat number " + n + " is taken by " + seats[n]);
        }

        myMethod(); // method called
        myMethod();
        myMethod();

        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        checkAge(20);

        for (int z = 1; z <= 5; z++) {
            System.out.println("Double of " + z + " is " + doubleGame(z));
        }

        int myNum1 = plusMethod(8, 5); //overloading
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

        System.out.println("Factorial of 5 is " + factorial(5));


        int o = 50;
        int p = 50;
        System.out.println(o+p);
        */

