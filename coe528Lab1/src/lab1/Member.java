/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author i2wahid
 */
public class Member extends Passenger{
    //instance variables:
    private int yearsOfMembership;
    
    //constructor:
    public Member(String name, int age, int yearsOfMembership){
        super(name, age);
        this.yearsOfMembership=yearsOfMembership;        
    }
    
    /*
    If the member has membership for more than 5 years, then 50% discount will be
    applied. If the member has membership for more than 1 year but less than or
    equal to 5 years, then 10% discount will be applied. Otherwise no discount.
    */
    public double applyDiscount(double p){
        if(yearsOfMembership>5){
            return p*0.50;
        }
        else if(yearsOfMembership>1 && yearsOfMembership<=5){
            return p*0.10;
        }
        else{
            return p;
        }
    }
}
