/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2ddrawingapplication;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author acv
 */
public class DrawingApplicationFrame extends JFrame
{

    // Create the panels for the top of the application. One panel for each
    // line and one to contain both of those panels.
    JPanel topPanel = new JPanel();
    JPanel firstLine = new JPanel();
    JPanel secondLine = new JPanel();

    // create the widgets for the firstLine Panel.
    JLabel shapeLabel = new JLabel("Shape: ");
    JComboBox shapeComboBox = new JComboBox<>(new String[]{"Line", "Oval" , "Rectangle"});

    JButton color1Button = new JButton("1st Color...");
    JButton color2Button = new JButton("2nd Color...");

    JButton undoButton = new JButton("Undo");
    JButton clearButton = new JButton("Clear");

    //create the widgets for the secondLine Panel.
    JLabel optionsLabel = new JLabel("Options: ");

    JCheckBox filledCheckBox = new JCheckBox("Filled");
    JCheckBox useGradientCheckBox = new JCheckBox("Use Gradient");
    JCheckBox dashedCheckBox = new JCheckBox("Dashed");

    JLabel lineWidthLabel = new JLabel("Line Width:");
    JSpinner lineWidthField = new JSpinner(new SpinnerNumberModel(10, 3, 100, 1));

    JLabel dashLengthLabel = new JLabel("Dash Length:");
    JSpinner dashLengthField = new JSpinner(new SpinnerNumberModel(15, 3, 100, 1));

    // Variables for drawPanel.
    DrawPanel drawPanel = new DrawPanel();
    ArrayList<MyShapes> allShapes = new ArrayList<MyShapes>();
    int lineWidth = 10;
    float dashLength = 15;
    Color c1 = Color.BLACK;
    Color c2 = Color.BLACK;

    // add status label
    JLabel statusLabel = new JLabel();
  
    // Constructor for DrawingApplicationFrame
    public DrawingApplicationFrame()
    {
        this.setLayout(new BorderLayout());
        topPanel.setLayout(new BorderLayout());

        // add widgets to panels
        // firstLine widgets
        firstLine.add(shapeLabel);
        firstLine.add(shapeComboBox);
        firstLine.add(color1Button);
        firstLine.add(color2Button);
        firstLine.add(undoButton);
        firstLine.add(clearButton);

        // secondLine widgets
        secondLine.add(optionsLabel);
        secondLine.add(filledCheckBox);
        secondLine.add(useGradientCheckBox);
        secondLine.add(dashedCheckBox);
        secondLine.add(lineWidthLabel);
        secondLine.add(lineWidthField);
        secondLine.add(dashLengthLabel); 
        secondLine.add(dashLengthField); 

        // add top panel of two panels
        topPanel.add(firstLine, BorderLayout.NORTH);
        topPanel.add(secondLine, BorderLayout.SOUTH);

        // add topPanel to North, drawPanel to Center, and statusLabel to South
        this.add(topPanel, BorderLayout.NORTH);
        this.add(drawPanel, BorderLayout.CENTER);
        this.add(statusLabel, BorderLayout.SOUTH);
        
        //add listeners and event handlers
        color1Button.addActionListener(listener -> {
            Color temp = c1;
            c1 = JColorChooser.showDialog(null, "Select Color 1", c1);
            if (c1 == null)
            {
                c1 = temp;
            }
        });
        color2Button.addActionListener(listener -> {
            Color temp = c2;
            c2 = JColorChooser.showDialog(null, "Select Color 2", c2);
            if (c2 == null)
            {
                c2 = temp;
            }
        });
        undoButton.addActionListener(listener -> {
            if(allShapes.size() > 0)
            {
                allShapes.remove(allShapes.size() - 1);
                drawPanel.repaint();
            }
        });
        clearButton.addActionListener(listener -> {
            allShapes.clear();
            drawPanel.repaint();
        });
    }

    // Create a private inner class for the DrawPanel.
    private class DrawPanel extends JPanel
    {
        Point startPoint;
        ArrayList<MyShapes> tempShapes = new ArrayList<MyShapes>();

        public DrawPanel()
        {
            setBackground(Color.WHITE);
            addMouseListener(new MouseHandler());
            addMouseMotionListener(new MouseHandler());
        }

        private MyShapes buildShape(Point start, Point end)
        {
            BasicStroke strk = dashedCheckBox.isSelected() 
                ? new BasicStroke(Integer.parseInt(lineWidthField.getValue().toString()), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 10, new float[]{Float.parseFloat(dashLengthField.getValue().toString())}, 0) 
                : new BasicStroke(Integer.parseInt(lineWidthField.getValue().toString()), BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND); 
            Paint paint = useGradientCheckBox.isSelected() 
                ? new GradientPaint(0, 0, c1, 50, 50, c2, true) 
                : new GradientPaint(0, 0, c1, 50, 50, c1, true);

            switch(shapeComboBox.getSelectedItem().toString())
            {
                case "Line":
                    return new MyLine(start, end, paint, strk);
                case "Oval":
                    return new MyOval(start, end, paint, strk, filledCheckBox.isSelected());
                case "Rectangle":
                    return new MyRectangle(start, end, paint, strk, filledCheckBox.isSelected());
                default:
                    return null;
            }
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            //loop through and draw each shape in the shapes arraylist
            for (MyShapes shape : allShapes) {
                shape.draw(g2d);
            }

            for (MyShapes shape : tempShapes) {
                shape.draw(g2d);
            }
            tempShapes.clear();
        }

        private class MouseHandler extends MouseAdapter implements MouseMotionListener
        {

            public void mousePressed(MouseEvent event)
            {
                startPoint = event.getPoint();
            }

            public void mouseReleased(MouseEvent event)
            {
                MyShapes currShape = buildShape(startPoint, event.getPoint());
                if (currShape != null)
                {
                    allShapes.add(currShape);
                    drawPanel.repaint();
                }
            }

            @Override
            public void mouseDragged(MouseEvent event)
            {
                statusLabel.setText("(" + event.getX() + "," + event.getY() + ")");
                MyShapes currShape = buildShape(startPoint, event.getPoint());
                if (currShape != null)
                {
                    tempShapes.add(currShape);
                    drawPanel.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent event)
            {
                statusLabel.setText("(" + event.getX() + "," + event.getY() + ")");
            }
        }
    }
}