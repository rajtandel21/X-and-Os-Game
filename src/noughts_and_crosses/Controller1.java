/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noughts_and_crosses;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author RajT
 */
public class Controller1 {
    
    //determine who's turn it is and display it in the jlabel
    
    private Interface1 interface2;
    private Model1 model2;
    
    //make sure to display draw message 
    //if all button are used and no winner is determined
    
    public Controller1(Interface1 interface2, Model1 model2) {
        this.interface2 = interface2;
        this.model2 = model2;
        
        
        this.interface2.addListener1(new Listener1());
        this.interface2.addListener2(new Listener2());
        this.interface2.addListener3(new Listener3());
        this.interface2.addListener4(new Listener4());
        this.interface2.addListener5(new Listener5());
        this.interface2.addListener6(new Listener6());
        this.interface2.addListener7(new Listener7());
        this.interface2.addListener8(new Listener8());
        this.interface2.addListener9(new Listener9());
        this.interface2.addListener10(new Listener10());
        
        this.interface2.setTurnDisplay(this.model2.getTurnData());
        
    }
    
    
    
    class Listener1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.getTurnData();
            if(whosTurn){
                //its X players turn make button turn red
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[0]="O";
                interface2.setAIcon("O", interface2.num1);
                //make sure this button cannot be clicked again
                //only works if the winning position is the button pressed.
                //may only work if all the buttons and win conditions are in place.
                if((model2.winnerFound(2, model2.posPlaces)) || (model2.winnerFound(4, model2.posPlaces)) || (model2.winnerFound(6, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
                
            } else {
                //its O players turn make button turn green 
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[0]="X";
                interface2.setAIcon("X", interface2.num1);
                //make sure this button cannot be clicked again
                if((model2.winnerFound(1, model2.posPlaces)) || (model2.winnerFound(3, model2.posPlaces)) || (model2.winnerFound(5, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.getTurnData();
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[1]="O";
                interface2.setAIcon("O", interface2.num2);
                if((model2.winnerFound(2, model2.posPlaces)) || (model2.winnerFound(12, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[1]="X";
                interface2.setAIcon("X", interface2.num2);
                if((model2.winnerFound(1, model2.posPlaces)) || (model2.winnerFound(11, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener3 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[2]="O";
                interface2.setAIcon("O", interface2.num3);
                if((model2.winnerFound(2, model2.posPlaces)) || (model2.winnerFound(14, model2.posPlaces)) || (model2.winnerFound(16, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[2]="X";
                interface2.setAIcon("X", interface2.num3);
                if((model2.winnerFound(1, model2.posPlaces)) || (model2.winnerFound(13, model2.posPlaces)) || (model2.winnerFound(15, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener4 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[3]="O";
                interface2.setAIcon("O", interface2.num4);
                if((model2.winnerFound(4, model2.posPlaces)) || (model2.winnerFound(8, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[3]="X";
                interface2.setAIcon("X", interface2.num4);
                if((model2.winnerFound(3, model2.posPlaces)) || (model2.winnerFound(7, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener5 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[4]="O";
                interface2.setAIcon("O", interface2.num5);
                if((model2.winnerFound(6, model2.posPlaces)) || (model2.winnerFound(8, model2.posPlaces)) || (model2.winnerFound(12, model2.posPlaces)) || (model2.winnerFound(16, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[4]="X";
                interface2.setAIcon("X", interface2.num5);
                if((model2.winnerFound(5, model2.posPlaces)) || (model2.winnerFound(7, model2.posPlaces)) || (model2.winnerFound(11, model2.posPlaces)) || (model2.winnerFound(15, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener6 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[5]="O";
                interface2.setAIcon("O", interface2.num6);
                if((model2.winnerFound(8, model2.posPlaces)) || (model2.winnerFound(14, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[5]="X";
                interface2.setAIcon("X", interface2.num6);
                if((model2.winnerFound(7, model2.posPlaces)) || (model2.winnerFound(13, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener7 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[6]="O";
                interface2.setAIcon("O", interface2.num7);
                if((model2.winnerFound(4, model2.posPlaces)) || (model2.winnerFound(10, model2.posPlaces)) || (model2.winnerFound(16, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[6]="X";
                interface2.setAIcon("X", interface2.num7);
                if((model2.winnerFound(3, model2.posPlaces)) || (model2.winnerFound(9, model2.posPlaces)) || (model2.winnerFound(15, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener8 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[7]="O";
                interface2.setAIcon("O", interface2.num8);
                if((model2.winnerFound(10, model2.posPlaces)) || (model2.winnerFound(12, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[7]="X";
                interface2.setAIcon("X", interface2.num8);
                if((model2.winnerFound(9, model2.posPlaces)) || (model2.winnerFound(11, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener9 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            boolean whosTurn = model2.turn;
            if(whosTurn){
                model2.turn=false;
                interface2.setTurnDisplay(false);
                model2.posPlaces[8]="O";
                interface2.setAIcon("O", interface2.num9);
                if((model2.winnerFound(6, model2.posPlaces)) || (model2.winnerFound(10, model2.posPlaces)) || (model2.winnerFound(14, model2.posPlaces))){
                    interface2.msgPlayerOWins();
                }
            } else {
                model2.turn=true;
                interface2.setTurnDisplay(true);
                model2.posPlaces[8]="X";
                interface2.setAIcon("X", interface2.num9);
                if((model2.winnerFound(5, model2.posPlaces)) || (model2.winnerFound(9, model2.posPlaces)) || (model2.winnerFound(13, model2.posPlaces))){
                    interface2.msgPlayerXWins();
                }
            }
        }
    }
    
    class Listener10 implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
            //after this button is pressed reset and start new game.
            //reset button array and enable buttons again.
            for(int i=0; i<9; i++){
                model2.posPlaces[i]="";
            }
            model2.turn=false;
            interface2.setTurnDisplay(false);
            interface2.btnreset();
        }
    }
    
}
