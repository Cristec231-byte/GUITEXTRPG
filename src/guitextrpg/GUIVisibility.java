/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitextrpg;

/**
 *
 * @author capta
 */
public class GUIVisibility {
    GUI g;
    
    public GUIVisibility(GUI g) {
        this.g = g;
    }
    
    public void showStartScreen() {
        //Show Start Screen
        g.snP.setVisible(true);
        g.sbP.setVisible(true);
        
        //Hide Game Screen
        g.mtP.setVisible(false);
        g.cbP.setVisible(false);
        g.pP.setVisible(false);
    }
    
    public void StarttoIntro(){
        //Hide start Screen
        g.snP.setVisible(false);
        g.sbP.setVisible(false);
        
        //Show Game Screen
        g.mtP.setVisible(true);
        g.cbP.setVisible(true);
        g.pP.setVisible(true);
    }
}
