/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package pizzaservingscalculator;

/* @author Harshit Jain */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PizzaServingsCalculator extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JTextField input;
    private final JButton calcBtn;
    private final JLabel label3;

    private JPanel line1 = new JPanel();
    private JPanel line2 = new JPanel();
    private JPanel line3 = new JPanel();
    
    public PizzaServingsCalculator(){
        super("Pizza Servings Calculator");
        setLayout(new GridLayout(4, 1));  // setting the layout of the frame to a 4 line grid layout
        label1 = new JLabel();
        label2 = new JLabel();
        input = new JTextField(5);
        calcBtn = new JButton("Calculate Servings");
        label3 = new JLabel();
        
        
        label1.setText("Pizza Servings Calculator");
        label1.setForeground(Color.red);
        line1.add(label1);
        
        label2.setText("Enter the size of the pizza in inches:");
        line2.add(label2);
        line2.add(input);

        line3.add(label3);
        
        calcBtn.setForeground(Color.BLUE);

        add(line1);
        add(line2);
        add(calcBtn);
        add(line3);

        ButtonHandler btn = new ButtonHandler();
        calcBtn.addActionListener(btn);
    
    }

    public static void main(String[] args) {
        PizzaServingsCalculator calc = new PizzaServingsCalculator();
        calc.setSize(350,300); // setting the size of your GUI
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }
    
    private class ButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            Double s = Math.pow((Double.parseDouble(input.getText()) / 8), 2);
            label3.setText("A " + input.getText() + " inch pizza will serve " + Math.round(s * 100.0) / 100.0 + " people.");
        }
    }
    

}
