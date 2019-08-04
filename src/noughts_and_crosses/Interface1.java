/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noughts_and_crosses;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

/**
 *
 * @author RajT
 */
public class Interface1 extends JFrame{
    
    //Buttons not private as they will be called in controler class
    //By the setAIcon function. 
    JButton num1 = new JButton();
    JButton num2 = new JButton();
    JButton num3 = new JButton();
    JButton num4 = new JButton();
    JButton num5 = new JButton();
    JButton num6 = new JButton();
    JButton num7 = new JButton();
    JButton num8 = new JButton();
    JButton num9 = new JButton();
    private JButton reset = new JButton("Reset");
    private JLabel personTurn = new JLabel();
    
    
    
    Interface1(){
      super("X and O Game");
      JPanel gameShow = new JPanel();
      
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setSize(400,400);
      
      gameShow.setLayout(new GridLayout(4,3,2,2));
      gameShow.setBackground(Color.DARK_GRAY);
      
      gameShow.add(num1);
      num1.setBackground(null);
      num1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num1.setBorder(new MatteBorder(0,0,1,1, Color.LIGHT_GRAY));
      
      gameShow.add(num2);
      num2.setBackground(null);
      num2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num2.setBorder(new MatteBorder(0,1,1,1, Color.LIGHT_GRAY));
      
      gameShow.add(num3);
      num3.setBackground(null);
      num3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num3.setBorder(new MatteBorder(0,1,1,0, Color.LIGHT_GRAY));
      
      gameShow.add(num4);
      num4.setBackground(null);
      num4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num4.setBorder(new MatteBorder(1,0,1,1, Color.LIGHT_GRAY));
      
      gameShow.add(num5);
      num5.setBackground(null);
      num5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num5.setBorder(new MatteBorder(1,1,1,1, Color.LIGHT_GRAY));
      
      gameShow.add(num6);
      num6.setBackground(null);
      num6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num6.setBorder(new MatteBorder(1,1,1,0, Color.LIGHT_GRAY));
      
      gameShow.add(num7);
      num7.setBackground(null);
      num7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num7.setBorder(new MatteBorder(1,0,0,1, Color.LIGHT_GRAY));
      
      gameShow.add(num8);
      num8.setBackground(null);
      num8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num8.setBorder(new MatteBorder(1,1,0,1, Color.LIGHT_GRAY));
      
      gameShow.add(num9);
      num9.setBackground(null);
      num9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      num9.setBorder(new MatteBorder(1,1,0,0, Color.LIGHT_GRAY));
      
      gameShow.add(personTurn);
      personTurn.setBackground(null);
      personTurn.setForeground(Color.WHITE);
      personTurn.setFont(new Font("Calibri", Font.BOLD, 18));
      
      gameShow.add(reset);
      reset.setBackground(null);
      reset.setForeground(Color.WHITE);
      reset.setFont(new Font("Calibri", Font.BOLD, 18));
      reset.setBorder(null);
      reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
      
      this.add(gameShow);
    }
    
    void setTurnDisplay(Boolean turn) {
        if(turn){
            personTurn.setText("Player O Turn");
        } else {
            personTurn.setText("Player X Turn");
        }
    }
    
    void addListener1(ActionListener listenForBtn1) {
        num1.addActionListener(listenForBtn1);
    }
    
    void addListener2(ActionListener listenForBtn2) {
        num2.addActionListener(listenForBtn2);
    }
    
    void addListener3(ActionListener listenForBtn3) {
        num3.addActionListener(listenForBtn3);
    }
    
    void addListener4(ActionListener listenForBtn4) {
        num4.addActionListener(listenForBtn4);
    }
    
    void addListener5(ActionListener listenForBtn5) {
        num5.addActionListener(listenForBtn5);
    }
    
    void addListener6(ActionListener listenForBtn6) {
        num6.addActionListener(listenForBtn6);
    }
    
    void addListener7(ActionListener lintenForBtn7) {
        num7.addActionListener(lintenForBtn7);
    }
    
    void addListener8(ActionListener lintenForBtn8) {
        num8.addActionListener(lintenForBtn8);
    }
    
    void addListener9(ActionListener listenForBtn9) {
        num9.addActionListener(listenForBtn9);
    }
    
    void addListener10(ActionListener listenForBtn10) {
        reset.addActionListener(listenForBtn10);
    }
    
    void errorMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }
    
    //Used ximg and oimg for the X and O icon image, but by setting setEnabled 
    //to false it grays out the image.
    //Using setDisabledIcon prevents gray out of images when button is disabled.
    
    ImageIcon xIcon = new ImageIcon(getClass().getResource("ximg.png"));
    ImageIcon oIcon = new ImageIcon(getClass().getResource("oimg.png"));
    
    void setAIcon(String btn, JButton numBtn){
        if(btn == "X"){
             numBtn.setIcon(xIcon);
             numBtn.setBackground(new Color(240, 28, 0));
             numBtn.setEnabled(false);
             numBtn.setDisabledIcon(xIcon);
        } else if(btn == "O"){
            numBtn.setIcon(oIcon);
            numBtn.setBackground(new Color(16, 232, 5));
            numBtn.setEnabled(false);
            numBtn.setDisabledIcon(oIcon);
        }
    }
    //improvement try to use buttons in array so that you dont have to 
    //change the value one by one and can loop through instead.
    void btnreset(){
        JButton[] loopNums = {num1, num2, num3, num4, num5, num6, num7, num8, num9}; 
        for(int i = 0; i < 9; i++){
            loopNums[i].setEnabled(true);
            loopNums[i].setBackground(null);
            loopNums[i].setIcon(null);
        }
    }
    
    
    /*message to display who won
    originally intended to be in the model class but had to change as
    the 'this' keyword is for the frame it will be created in
    so it was moved to interface instead*/
    //find way to reset or start over after message displayed.
    void msgPlayerOWins(){
        JOptionPane.showMessageDialog(this, "Player O Wins");
    }
    
    void msgPlayerXWins(){
        JOptionPane.showMessageDialog(this, "Player X Wins");
    }
}
