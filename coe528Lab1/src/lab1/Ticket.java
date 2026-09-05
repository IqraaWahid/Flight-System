/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author i2wahid
 */
public class Ticket {
    //instance variables:
    private Passenger passenger; //aggregation relationship
    private Flight flight; //aggregation relationship
    private double price;//actual ticket price
    private static int number; //static AND instance variables have default values (int: 0)
    
    //constructor: giving intial values for the instance variables
    public Ticket(Passenger passenger, Flight flight, double price){
        this.passenger=passenger;
        this.flight=flight;
        this.price=price;
        number++; //every time a ticket object is created, it gets a unique ticket number of increments of 1
    }
    
    public String toString(){
        return (passenger.getName() + ", Flight " + flight.getFlightNumber() + ", " + flight.getOrigin() + " to " + flight.getDestination()
                + ", " + flight.getDepartureTime() + ", Original Price:" + flight.getOriginalPrice() + ", Ticket Price: " + price);
    }
}
