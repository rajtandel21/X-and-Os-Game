/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noughts_and_crosses;

/**
 *
 * @author RajT
 */
public class Noughts_and_crosses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Interface1 interface2 = new Interface1();
        Model1 model2 = new Model1();
        Controller1 theGame = new Controller1(interface2, model2);
        
        interface2.setVisible(true);
    }
    
}
