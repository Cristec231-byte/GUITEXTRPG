/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guitextrpg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author capta
 */
public class RPG_Game {

    //ChoiceHandler instance for handling user chocies
    ChoiceHandler cH = new ChoiceHandler();
    //GUI instance for managing GUI
    GUI g = new GUI();
    //GUIVisibity instance for controling visibility
    GUIVisibility vm = new GUIVisibility(g);
    
    //story instance for game story
    Story s = new Story(g, this, vm);
    
    //Next Locations
    String nL1, nL2, nL3, nL4;
    
    public static void main(String[] args) {
        new RPG_Game();
    }
    
    public RPG_Game() {
        //Creation of GUI, player, and displaying start screen
        g.createGUI(cH);
        s.PlayerCreator();
        vm.showStartScreen();
    }
    
    public class ChoiceHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String Choice = event.getActionCommand(); // user choice
            
            switch(Choice) {
                //start game and handle user choices
                case "start": vm.StarttoIntro(); s.Intro();break;
                case "c1": s.selectLocation(nL1);break;
                case "c2": s.selectLocation(nL2);break;
                case "c3": s.selectLocation(nL3);break;
                case "c4": s.selectLocation(nL4);break;
            }
        }
    }
}
