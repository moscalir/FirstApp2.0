package com.example.moscalir.firstapp20;

/**
 * Created by Robert Moscaliuc on 15/10/18
 * @author Robert Moscaliuc
 * @version 1.1
 */
public class Vehicle {
    private String make;
    private int year;
    private String message;
    public static int counter = 0;
    //the default constructor
    public Vehicle() {
        this.make = "Volvo";
        this.year = 2012;
        this.message = "This is the default message";
    }
    /*
     *This contructor take two parameters
     */
    public Vehicle(String make,int year) {
        this.make = make;
        this.year = year;
        this.message="Your car is a " + make + "built in" + year + ".";
        count();
    }

    /**
     * The contrcutor that takes only the make of the care
     * @param make the make of your car
     */
    public Vehicle(String make) {
        this();
        this.make = make;
        message = "You didn't type in year value";
        count();
    }
    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
    private void count(){
        this.counter++;
    }

}
