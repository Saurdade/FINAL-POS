/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hims;

/**
 *
 * @author Kylle Mendoza
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hims;

public class Loginclass extends CashierAndLogin{
    //Diri pag file-handling
    public final int password;
    //Method or Constructor Overloading
    public Loginclass (String username, int password){
        super(username);
        this.password = password;
    }
   public String toString() {
		return super.toString()+password;
}

}