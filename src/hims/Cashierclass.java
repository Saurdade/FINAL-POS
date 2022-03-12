/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hims;

/**
 *
 * @author USER
 */
public class Cashierclass extends CashierAndLogin{
    public final String password;
    
    public Cashierclass (String username, String password){
        super(username);
        this.password = password;
    }
    public String toString() {
        return super.toString()+password;
    }
}
