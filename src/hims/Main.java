/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hims;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 *
 * @author USER
 */
public class Main {
    Main(){
    Loginclass cal = new Loginclass("Admin",123);
    Cashierclass cl = new Cashierclass("Admin","password");
    
    CashierAndLogin[] array1 = {cal};
    //    System.out.println(array1[0]);
    String array = array1.toString();
    String uname = (array = "Admin");
     
    CashierAndLogin[] array2 = {cl};
    //    System.out.println(array2[0]);
    String arrayy = array2.toString();
    String upass = (arrayy = "Admin");
    
    JFrame frame = new JFrame();
    frame.setSize(420,420);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    //frame.setLayout(new GridLayout(0,1));
    frame.setLayout(null);
    int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
    int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
    frame.setLocation((screenWidth - frame.getWidth())/2, (screenHeight - frame.getHeight())/3);
    
    JPanel panel1 = new JPanel();
    panel1.setBorder(BorderFactory.createEmptyBorder(15, 35, 15, 35));
    //panel1.setLayout(new FlowLayout(2));
    
    JLabel j = new JLabel();
        j.setBounds(50,100,75,25);
        j.setText("Username");
    //    panel1.add(j);
    JTextField user = new JTextField();
        user.setBounds(125,100,200,25);
    //    panel1.add(user);
    
    JLabel p = new JLabel();
        p.setBounds(50,150,75,25);
        p.setText("Password");
    //    panel1.add(p);
    JTextField pass = new JTextField();
        pass.setBounds(125,150,200,25);
    //    panel1.add(pass);

    JButton login = new JButton();
        login.setBounds(125,200,100,25);
        login.setText("Login");
    //    panel1.add(login);
    
    JButton exit = new JButton();
        exit.setBounds(225,200,100,25);
        exit.setText("Exit");
    //    panel1.add(exit);
    
    frame.add(j);
    frame.add(user);
    frame.add(p);
    frame.add(pass);
    frame.add(login);
    frame.add(exit);
    frame.setTitle("Point of Sales System");
    //panel1.setVisible(true);
    frame.setVisible(true);
        
login.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try {
            if((user.getText() == null ? uname == null : user.getText().equals(uname)) && (pass.getText() == null ? upass == null : pass.getText().equals(upass))){
                sale s = new sale();
                frame.hide();
                s.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(frame, "Incorrect Username and/or Password");
            }
        
        }catch (Exception f) {
               System.out.println("Exception: " + f);
        }


}
});
exit.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        try {
            System.exit(0);
        }catch (Exception f) {
               System.out.println("Exception: " + f);
        }
}
});
    

//main closing
    }    
    
    public static void main(String args[]){
     
     new Main();
    }
    }

