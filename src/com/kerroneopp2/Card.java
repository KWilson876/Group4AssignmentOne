package com.kerroneopp2;

public class Card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    public Card() {
        super();
    }

    public Card(int cardNumber, double balance, int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    public static Card createCard(int cardNumber, double balance, int pin, boolean status) {
        return new Card(cardNumber, balance, pin, status);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void display() {
        System.out.println("Card Number: " + this.cardNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Pin: " + this.pin);
        System.out.println("Status: " + this.status);
    }
}

