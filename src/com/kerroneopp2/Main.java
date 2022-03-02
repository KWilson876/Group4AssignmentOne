// Group Members: Kerrone Wilson - 1817001549 | Tukeisha Brown - 1300067096 | Erroldo McCarthy - 2017001806

package com.kerroneopp2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Your Identification Number: ");
        int idNumber = myObj.nextInt();

        System.out.println("Enter Your First Name: ");
        String firstName = myObj.next();

        System.out.println("Enter Your Last Name: ");
        String lastName = myObj.next();

        System.out.println("Enter Your Age: ");
        int age = myObj.nextInt();

        System.out.println("Enter Your Card Number: ");
        int cardNumber = myObj.nextInt();

        System.out.println("Enter Your Balance: ");
        double balance = myObj.nextDouble();

        System.out.println("Enter PIN: ");
        int pin = myObj.nextInt();

        System.out.println("Enter Status: ");
        boolean status = myObj.nextBoolean();

        Client obj1 = new Client(idNumber, firstName, lastName);
        obj1.setAge(age);
        Card card = Card.createCard(cardNumber, balance, pin, status);
        obj1.setCard(card);
        obj1.display();
        System.out.println("\nCard Info | Detail: ");
        obj1.getCard().display();

        obj1.getCard().setStatus(true);
        obj1.getCard().setCardNumber(45678);
    }
}



