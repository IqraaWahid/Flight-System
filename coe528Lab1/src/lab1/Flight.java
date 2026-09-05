/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author i2wahid
 */
public class Flight {
    //instance variables:
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    //constructor: assigning instance variables intial values:
    public Flight(int flightNumber, String origin, String destination, String departureTime, int capacity, double originalPrice){
        this.flightNumber=flightNumber;
        this.origin=origin;
        this.destination=destination;
        this.departureTime=departureTime;
        this.capacity=capacity;
        this.numberOfSeatsLeft=capacity; //number and seats and capacity are the same
        this.originalPrice=originalPrice;
        if(origin.equals(destination)){
            throw new IllegalArgumentException();
        }
    }
    
    public void setFlightNumber(int flightNumber){
        this.flightNumber=flightNumber;
    }
    
    public int getFlightNumber(){
        return this.flightNumber;
    }
    
    public void setOrigin(String origin){
        this.origin=origin;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public void setDestination(String destination){
        this.destination=destination;
    }
    
    public String getDestination(){
        return this.destination;
    }
    
    public void setDepartureTime(String departureTime){
        this.departureTime=departureTime;
    }
    
    public String getDepartureTime(){
        return this.departureTime;
    }
    
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){
        this.numberOfSeatsLeft=numberOfSeatsLeft;
    }
    
    public int getNumberOfSeatsLeft(){
        return this.numberOfSeatsLeft;
    }
    
    public void setOriginalPrice(double originalPrice){
        this.originalPrice=originalPrice;
    }
    
    public double getOriginalPrice(){
        return this.originalPrice;
    }
    
    /*a bookASeat() method. If the numberOfSeatsLeft is greater than 0,
    this method decrements the numberOfSeatsLeft variable and returns
    true. Otherwise, it returns false.*/
    public boolean bookSeat(){
        if(numberOfSeatsLeft>0){
            numberOfSeatsLeft--;
            return true;
        }
        else{
            return false;
        }
    }
    
    /*This class should override the toString method that returns a String
    representation of a Flight object. The String should include the flight
    number, the origin, the destination, the departure time and the original
    price. e.g., "Flight 1030, Toronto to Kolkata, 03/02/99 7:50 pm, original
    price: 1000$"*/
    public String toString(){
        return ("Flight " + flightNumber + ", " + origin + " to " + destination
                + ", " + departureTime + ", Original Price:" + originalPrice);
    }
}
