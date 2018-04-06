/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg021_finddog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class FindDog extends JFrame {

    JLabel label0 = new JLabel();
    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel[] choiceLabel = new JLabel[3];
    ImageIcon dog = new ImageIcon("dog3.jpg");
    JButton newButton = new JButton();
    int dogLocation;
    Random myRandom = new Random();
    
    public static void main(String[] args) {
        new FindDog().setVisible(true);
    }
    
    public FindDog() {
        setTitle("Find the Dog");
        setResizable(false);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent evt)
            {
                exitForm(evt);
            }
        });
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints;
        
        choiceLabel[0] = label0;
        choiceLabel[1] = label1;
        choiceLabel[2] = label2;
        for (int i = 0; i < 3; i++){
            gridConstraints = new GridBagConstraints();
            choiceLabel[i].setPreferredSize(new Dimension(dog.getIconWidth(), dog.getIconHeight()));
            choiceLabel[i].setOpaque(true);
            choiceLabel[i].setBackground(Color.BLUE);
            getContentPane().setBackground(Color.YELLOW);
            gridConstraints.gridx = i;
            gridConstraints.gridy = 0;
            gridConstraints.insets = new Insets(10,10,10,10);
            getContentPane().add(choiceLabel[i], gridConstraints);
            choiceLabel[i].addMouseListener(new MouseAdapter()
            {
                public void mouseClicked(MouseEvent e)
                { 
                    labelMouseClicked(e);
                }
            });
        }
        
        newButton.setText("Play Again");
        pack();
    }
    
    private void labelMouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void exitForm(WindowEvent evt) {
        System.exit(0);
    }
}
