/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author i2wahid
 */
public abstract class Passenger {
    //instance variables:
    private String name;
    private int age;
    
    //constructor: intializing the instance variables
    public Passenger(String name, int age){
        this.name=name;
        this.age=age;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    
    public int getAge(){
        return age;
    }
    
    //abstract method: this class cannot be instantiated
    public abstract double applyDiscount(double p);
}
