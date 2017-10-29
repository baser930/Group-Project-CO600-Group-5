/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TicTacToe implements ActionListener{
    //Winning combinations
    private int[][] winCombo = new int[][] {
        {0, 1, 2},{3, 4, 5},{6, 7, 8}, //horizontal win
        {0, 3, 6},{1, 4, 7},{2, 5, 8}, //vertical win
        {0, 4, 8},{2, 4, 6} //diagonal win
    };
    //Whose Turn it is
    private int count = 0;
    private String letter = "";
    
    public void actionPerformed(ActionEvent a){
    count++;
    
    if(count % 2 == 0){
        letter = "O";
    } else {
        letter = "X";
    }
    
    //Who won
    }

    
    public static void main(String[] args) {
    }
    
}
