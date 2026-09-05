/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author i2wahid
 */

public class Manager {
    //instance variables;
    private Flight flights [];
    private Ticket tickets [];
    private int numFlights; //number of Flight objects created
    private int numTickets; //number of Ticket objects created
    
    //constructor: giving intial values to the instance variables:
    public Manager() {
        flights=new Flight [0];
        tickets=new Ticket [0];
        numFlights=0;
        numTickets=0;
    }
    
    /*this method should populate the array of flights. This method should ask
    the user to input information about the flights. (Hint: use Scanner class).*/
    public void createFlights(){
        Scanner input = new Scanner (System.in);
        System.out.println("User, enter the number of flights you want to create: ");        
        int n=input.nextInt();
        input.nextLine();
        
        flights=new Flight[n];
        numFlights=0; //////////////////////do we need this? Already intialized in the constructor
        
        for(int i=0;i<n;i++){
            System.out.println(); //add line
            System.out.println("------- Enter the info for Flight #" + (i+1) + " -------");
            
            System.out.println("Flight number: ");
            int flightNumber=input.nextInt();
            input.nextLine(); //this will clear the leftover newline so origin does get new line stored in it
            
            System.out.println("Enter the origin: ");
            String origin = input.nextLine();
            
            System.out.println("Enter the destination: ");
            String destination=input.nextLine();
            
            System.out.println("Departure Time (in the following format: date/month/year xx:xx): ");
            String departureTime=input.nextLine();
            
            System.out.println("Capacity: ");
            int capacity=input.nextInt();
            input.nextLine();
            
            System.out.println("Original Price: ");
            double originalPrice=input.nextDouble();
            input.nextLine();
            
            //since when a Flight object is created an exception can be thrown, put creation of Flight object in try-catch blocks:
            try{
                Flight f = new Flight(flightNumber, origin, destination, departureTime, capacity, originalPrice);
                flights[numFlights]=f;//add the flight created into the flights array
                numFlights++;//update every single time a flight is created
            }
            catch(IllegalArgumentException e){
                System.out.println("Flight enable to be created. Origin and destination cannot be the same!");
                System.out.println("Re-enter another flight info.");
                i--; //redo the same array element
            }
        }
        
        //after all flights have been created:
        
        int totalCapacity=0; //across all flights
        for(int i=0;i<numFlights;i++){
            totalCapacity+=flights[i].getCapacity();
        }
        tickets = new Ticket[totalCapacity];
        numTickets=0;
        
        System.out.println(numFlights + " flights have been created!");   
    }
    
    /*this method should display all the available flights from origin to destination.
    It should display only those flights that are not yet fully booked.*/
    public void displayAvailableFlight(String origin, String destination){
        System.out.println("Available flights: " + origin + " --> " + destination);
        boolean found=false;
        
        for(int i=0;i<numFlights;i++){
            Flight f=flights[i];
            
            boolean matchOrigin=f.getOrigin().equalsIgnoreCase(origin);
            boolean matchDestination=f.getDestination().equals(destination);
            boolean seatsAvail=f.getNumberOfSeatsLeft()>0;
            
            if(matchOrigin && matchDestination && seatsAvail){
                System.out.println(f.toString());
                System.out.println("Number of seats booked (at the moment): " + f.getNumberOfSeatsLeft()); ////////////////extra
                found=true; //found a seat
            }
            
            if(!found){
                System.out.println("No available flights for that route!");
            }
        }
    }
    
    //this method should return the Flight object for the specified flight number.
    public Flight getFlight(int flightNumber){
        for(int i=0;i<numFlights;i++){
            if(flights[i].getFlightNumber()==flightNumber){
                return flights[i];
            }
        }
        return null; //flight number does not exist
    }
    
    /*This method first tries to find a flight for the given flight number. If
    such flight exists, then it tries to book a seat in that flight. If booking
    is successful, then applies the appropriate discount on the price depending
    on the passenger being a member or a non-member (Polymorphism works here).
    Finally, it issues a ticket with the appropriate price.
    */
    public void bookSeat(int flightNumber, Passenger p){
        Flight f=getFlight(flightNumber);//find a flight for a given flight number
        
        if(f==null){
            System.out.println("No such flight exists with the flight number of " + flightNumber);
            return; //finish method
        }
        
        boolean booked=f.bookSeat();
        
        if(!booked){
            System.out.println("The flight is fully booked!");
            return; //finish method
        }
        
        double finalPrice=p.applyDiscount(f.getOriginalPrice());
        
        Ticket t = new Ticket (p, f, finalPrice); //create a ticket object
        
        if(numTickets<tickets.length){//if there is space
            tickets[numTickets]=t; //add ticket object into the tickets array
            numTickets++;
        }
        else{
            System.out.println("There are no tickets left!");
        }
        
        System.out.println("Seat has been booked for:\n" + t.toString());
    }
    
    /*
    his method should call all the other methods of the Manager class to see if
    they work. You are responsible for developing a con- vincing plan for the
    main method, i.e., for convincing the TA that your methods work properly.
    */
    public static void main(String[] args){
        Manager m=new Manager ();
        Scanner input=new Scanner(System.in);
        
        System.out.println("------ The Flight Booking System ------");
        
        //create flights:
        m.createFlights();
        
        //while(true){
            int choice;
            do{
                System.out.println(); //add line
                System.out.println("Choose (1, 2, 3, or 4): ");
                System.out.println("1) Display available flight");
                System.out.println("2) Get flight info");
                System.out.println("3) Book a seat");
                System.out.println("4) Exit");
                System.out.println("Selection: ");
                choice=input.nextInt();
                input.nextLine();

                if(choice==1){
                    System.out.println("Origin: ");
                    String origin=input.nextLine();

                    System.out.println("Destination: ");
                    String destination=input.nextLine();

                    m.displayAvailableFlight(origin, destination);
                }

                else if(choice==2){
                    System.out.println("Flight Number: ");
                    int flightNumber=input.nextInt();
                    input.nextLine();
                    
                    System.out.println(m.getFlight(flightNumber));
                }

                else if(choice==3){
                    System.out.println("Flight Number: ");
                    int flightNumber=input.nextInt();
                    input.nextLine();

                    System.out.println("Name: ");
                    String name=input.nextLine();

                    System.out.println("Age: ");
                    int age=input.nextInt();
                    input.nextLine();

                    int passengerType;
                    do{
                        System.out.println("Passenger Type: Member (1) or Non-Member (2): ");
                        passengerType=input.nextInt();
                        input.nextLine();
                    } while(passengerType!=1 && passengerType!=2);

                    Passenger p; //reference type is Passenger

                    if(passengerType==1){
                        System.out.println("Enter years of membership: ");
                        int yearsOfMembership=input.nextInt();
                        input.nextLine();
                        
                        p=new Member(name, age, yearsOfMembership);
                    }
                    else{
                        p=new NonMember(name, age);
                    }

                    m.bookSeat(flightNumber, p);
                }
                
                else if (choice==4){
                    System.out.println("Exit program.");
                    System.exit(0);//exit program
                }
                
                else {
                    System.out.println("Invalid choice. Try again...");
                }
            } while (choice!=4);
        //}
    }
}