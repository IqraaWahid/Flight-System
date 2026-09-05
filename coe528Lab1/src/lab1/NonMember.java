/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author i2wahid
 */
public class NonMember extends Passenger{
    
    //constructor:
    public NonMember(String name, int age){
        super(name, age);
    }
    
    public double applyDiscount(double p){
        if (getAge()>65){
            return p*0.1;
        }
        else{
            return p;
        }
    }
}