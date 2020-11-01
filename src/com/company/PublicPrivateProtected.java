package com.company;

public class PublicPrivateProtected {

    public String owner; //this variable is visible throughout the application because it is public
    private double balance; //this variable is only visible in this class
    protected int age; //this variable is accessible in this class and any sub classes because it is protected

    public double getBalance() {...} //this is visible throughout the application because it is public

    public void deposit(double dollars) {...} //this is visible throughout the application because it is public

    public void withdraw(double dollars) {...} //this is visible throughout the application because it is public

    protected void setBalance(double dollars) {...} //this method is accessible in this class and any sub classes because it is protected

    protected void transfer(PublicPrivateProtected other, double amount) {...} //this method is accessible in this class and any sub classes because it is protected

    private String getOwner() {...} //this is only accessible in this class because it is private

}
