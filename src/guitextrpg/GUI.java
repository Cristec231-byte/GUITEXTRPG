/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guitextrpg;

/**
 *
 * @author sianv
 */

import guitextrpg.RPG_Game.ChoiceHandler;
import java.awt.*;
import javax.swing.*;

public class GUI {
    JFrame window;
    //Start name Panel, Start Button Panel, Main Text Panel, Player Panel
    JPanel snP, sbP, mtP, cbP, pP;
    //Start name Labels, Health labels, Weapon Labels
    JLabel snL1, snL2, hpL, hpnL, wL, wnL;
    //Start Button, choice Buttons
    JButton sB, c1, c2, c3, c4;
    //Title Font
    Font tF = new Font("Calbri", Font.BOLD, 30);
    Font nF = new Font("Calbri", Font.BOLD, 20);
    Font sF = new Font("Calbri", Font.BOLD, 15);
    //Main Text area
    JTextArea mtA;
    JScrollPane sP;
    
    public void createGUI(ChoiceHandler cH) {
        //Window
        window = new JFrame();
        window.setSize(800, 600);
        window.setTitle("Curiosity's Conjuror: The Questing Magus");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.blue);
        window.setLayout(null);
        
        //Start Screen
        snP = new JPanel();
        snP.setBounds(50, 100, 700, 500);
        snP.setBackground(Color.blue);
        //add in title labels
        snL1 = new JLabel("Curiosity's Conjuror: The Questing Magus");
        snL1.setForeground(Color.white);
        snL1.setFont(tF);
        snP.add(snL1);
        
        
        snL2 = new JLabel("Text-RPG by Crist and Sian");
        snL2.setForeground(Color.white);
        snL2.setFont(tF);
        snP.add(snL2);
        
        //start button panel creation 
        sbP = new JPanel();
        sbP.setBounds(300, 400, 200, 100);
        sbP.setBackground(Color.blue);
        //Start Button
        sB = new JButton("START");
        sB.setBackground(Color.blue);
        sB.setForeground(Color.white);
        sB.setFont(nF);
        sB.setFocusPainted(false);
        sB.addActionListener(cH);
        sB.setActionCommand("start");
        sbP.add(sB);
        window.add(snP);
        window.add(sbP);
        
        //Main text Panel
        mtP = new JPanel();
        mtP.setBounds(100, 100, 600, 250);
        mtP.setBackground(Color.blue);
        window.add(mtP);
        
        //Main Text Area
        mtA = new JTextArea("Main");
        mtA.setBounds(100, 100, 600, 250);
        mtA.setBackground(Color.blue);
        mtA.setForeground(Color.white);
        mtA.setFont(sF);
        mtA.setLineWrap(true);
        mtA.setWrapStyleWord(true);
        mtA.setEditable(false);
        mtP.add(mtA);
        
        //Choice button Panel
        cbP = new JPanel();
        cbP.setBounds(75, 350, 600, 100);
        cbP.setBackground(Color.blue);
        cbP.setLayout(new GridLayout(2, 2));
        window.add(cbP);
        
        //Choice Buttons
        c1 = new JButton("choice1");
        c1.setBackground(Color.blue);
        c1.setForeground(Color.white);
        c1.setFont(nF);
        c1.addActionListener(cH);
        c1.setActionCommand("c1");
        cbP.add(c1);
        
        c2 = new JButton("choice2");
        c2.setBackground(Color.blue);
        c2.setForeground(Color.white);
        c2.setFont(nF);
        c2.addActionListener(cH);
        c2.setActionCommand("c2");
        cbP.add(c2);
        
        c3 = new JButton("choice3");
        c3.setBackground(Color.blue);
        c3.setForeground(Color.white);
        c3.setFont(nF);
        c3.addActionListener(cH);
        c3.setActionCommand("c3");
        cbP.add(c3);
        
        c4 = new JButton("choice4");
        c4.setBackground(Color.blue);
        c4.setForeground(Color.white);
        c4.setFont(nF);
        c4.addActionListener(cH);
        c4.setActionCommand("c4");
        cbP.add(c4);
        
        //player Panels
        pP = new JPanel();
        pP.setBounds(100, 15, 600, 50);
        pP.setBackground(Color.blue);
        pP.setLayout(new GridLayout(1, 4));
        window.add(pP);
        
        //Hp and weapon Labels for player paenel
        hpL = new JLabel("HP: ");
        hpL.setFont(nF);
        hpL.setForeground(Color.white);
        pP.add(hpL);
        
        hpnL = new JLabel();
        hpnL.setForeground(Color.white);
        hpnL.setFont(nF);
        pP.add(hpnL);
        
        wL = new JLabel("Weapon:");
        wL.setForeground(Color.white);
        wL.setFont(nF);
        pP.add(wL);
        
        wnL = new JLabel();
        wnL.setForeground(Color.white);
        wnL.setFont(nF);
        pP.add(wnL);
        
        window.setVisible(true);
    }   
}
