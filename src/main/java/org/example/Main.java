package org.example;

public class Main {
    public static void main(String[] args) {
        //In the main calls my classes
        //In the main I create the objects of my classes
        //In the main I create an instance of my class
        //In the main I make copies of my classes and create objects

        Guests guestsClassObject=new Guests();
        Guests object2=new Guests(33,true,"Juan",10000);

        //Obtain the attribute values

        System.out.println(guestsClassObject.name);
        System.out.println(object2.name);
    }
}
