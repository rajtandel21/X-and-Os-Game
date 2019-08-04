/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noughts_and_crosses;

import javax.swing.JOptionPane;

/**
 *
 * @author RajT
 */
public class Model1 {
    
    
    boolean turn = false;
    
    public boolean getTurnData(){
        return turn;
    }
    
    //improvement of posPlaces by taking int values so that it can be checked
    //against switch. This way it will only check win position for that button
    //instead of all 8 win states every button click.
    String posPlaces[] = new String[9];
    
    
    //make method to check if there is winner and stop game
    //try to check all winning states with every turn first to complete game.
    //improvements can be to check winning states of the button clicked.
    public Boolean winnerFound(int i, String[] winplaces){
        boolean didPlayWin = false;
        //all winning states for X and O.
        //when a button is pressed only the winning states related to that
        // button will be checked to increase efficiency.
        //Improvement instead of checking for "x" and "o" differently change
        //so that depending on last turn who to check. (half code will be written)
        switch(i){
            case 1: if(winplaces[0] == "X" && winplaces[1] == "X" && winplaces[2] == "X"){
                //player X wins
                didPlayWin = true;
            } break;
            case 2: if(winplaces[0] == "O" && winplaces[1] == "O" && winplaces[2] == "O"){
                didPlayWin = true;
            } break;
            case 3: if(winplaces[0] == "X" && winplaces[3] == "X" && winplaces[6] == "X"){
                didPlayWin = true;
            } break;
            case 4: if(winplaces[0] == "O" && winplaces[3] == "O" && winplaces[6] == "O"){
                didPlayWin = true;
            } break;
            case 5: if(winplaces[0] == "X" && winplaces[4] == "X" && winplaces[8] == "X"){
                didPlayWin = true;
            } break;
            case 6: if(winplaces[0] == "O" && winplaces[4] == "O" && winplaces[8] == "O"){
                didPlayWin = true;
            } break;
            case 7: if(winplaces[3] == "X" && winplaces[4] == "X" && winplaces[5] == "X"){
                didPlayWin = true;
            } break;
            case 8: if(winplaces[3] == "O" && winplaces[4] == "O" && winplaces[5] == "O"){
                didPlayWin = true;
            } break;
            case 9: if(winplaces[6] == "X" && winplaces[7] == "X" && winplaces[8] == "X"){
                didPlayWin = true;
            } break;
            case 10: if(winplaces[6] == "O" && winplaces[7] == "O" && winplaces[8] == "O"){
                didPlayWin = true;
            } break;
            case 11: if(winplaces[1] == "X" && winplaces[4] == "X" && winplaces[7] == "X"){
                didPlayWin = true;
            } break;
            case 12: if(winplaces[1] == "O" && winplaces[4] == "O" && winplaces[7] == "O"){
                didPlayWin = true;
            } break;
            case 13: if(winplaces[2] == "X" && winplaces[5] == "X" && winplaces[8] == "X"){
                didPlayWin = true;
            } break;
            case 14: if(winplaces[2] == "O" && winplaces[5] == "O" && winplaces[8] == "O"){
                didPlayWin = true;
            } break;
            case 15: if(winplaces[2] == "X" && winplaces[4] == "X" && winplaces[6] == "X"){
                didPlayWin = true;
            } break;
            case 16: if(winplaces[2] == "O" && winplaces[4] == "O" && winplaces[6] == "O"){
                didPlayWin = true;
            } break;
            default : break;
        }
        return didPlayWin;
    }
}
