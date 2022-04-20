package Calculator;

//public class Calculator {
//
//}

import java.awt.*;

import javax.swing.*;

import java.awt.event.*;
                         // the calculator window frame is bcz we have extended JFrame
public class Calculator extends JFrame implements ActionListener {    
    /**
	 * 
	 */
	//JPanel :- collection of component
	private static final long serialVersionUID = 1L;
	JPanel[] row = new JPanel[5];
    JButton[] button = new JButton[19];
    String[] buttonString = {"7", "8", "9", "+",
                             "4", "5", "6", "-",
                             "1", "2", "3", "*",
                             ".", "/", "C", "�",
                             "+/-", "=", "0"};
    int[] dimW = {430,70,150,140};//dimW : dimension width
    int[] dimH = {50, 60};//dimH : dimension height
    //creating an object of Dimension class
    Dimension displayDimension = new Dimension(dimW[0], dimH[0]);
    Dimension regularDimension = new Dimension(dimW[1], dimH[1]);
    Dimension rColumnDimension = new Dimension(dimW[2], dimH[1]);
    Dimension zeroButDimension = new Dimension(dimW[3], dimH[1]);
    boolean[] function = new boolean[4];
    double[] temporary = {0, 0};
    JTextArea display = new JTextArea(2,25);
    Font font = new Font("Times new Roman", Font.BOLD, 20);
    
  //calling the constructor 
    Calculator() {
    	//setting the title of the JFrame ie, Calculator
        super("Calculator");//parent class of calculator is JFrame we are calling that class constructor
        setDesign();//used to set the basic design
        //setting the dimension of the window
        setSize(500, 350);//this function is provided by JFrame
        setResizable(false);//to resize the window we can expand and shrink the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);//to close the window on clicking the cross(X)
        GridLayout grid = new GridLayout(5,5);
        setLayout(grid);//this will set the layout of JFrame
        
        for(int i = 0; i < 4; i++)
            function[i] = false;
        
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
        FlowLayout f2 = new FlowLayout(FlowLayout.CENTER,1,1);//Deciding the vertical and horizontal gap between the buttons
        for(int i = 0; i < 5; i++)
            row[i] = new JPanel();//Initializing every row with JPanel
        
        row[0].setLayout(f1);//layout if 0th row 
        
        for(int i = 1; i < 5; i++)
            row[i].setLayout(f2);
        
        for(int i = 0; i < 19; i++) {
            button[i] = new JButton();//creating an object of button
            button[i].setText(buttonString[i]);//setting the text of the button
            button[i].setBackground(Color.white);//setting the color of the background
            button[i].setFont(font);//setting the font of the button
            button[i].addActionListener(this);
        }
        
        //JTextArea
        display.setFont(font);
        display.setEditable(false);//to edit the JTextArea
        display.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        display.setPreferredSize(displayDimension);
        
        //setting the dimension of remaining buttons
        for(int i = 0; i < 14; i++)
            button[i].setPreferredSize(regularDimension);
        for(int i = 14; i < 18; i++)
            button[i].setPreferredSize(rColumnDimension);
        button[18].setPreferredSize(zeroButDimension);
        
        row[0].add(display); // Adds text view to JPanel
        add(row[0]); // Adds JPanel to Frame
        
        for(int i = 0; i < 4; i++)
            row[1].add(button[i]);
        row[1].add(button[14]);
        add(row[1]);
        
        for(int i = 4; i < 8; i++)
            row[2].add(button[i]);
        row[2].add(button[15]);
        add(row[2]);
        
        for(int i = 8; i < 12; i++)
            row[3].add(button[i]);
        row[3].add(button[16]);
        add(row[3]);
        
        row[4].add(button[18]);
        for(int i = 12; i < 14; i++)
            row[4].add(button[i]);
        row[4].add(button[17]);
        add(row[4]);
        
        setVisible(true);
        
    }
    
    public void clear() {
        try {
            display.setText("");
            for(int i = 0; i < 4; i++)
                function[i] = false;
            for(int i = 0; i < 2; i++)
                temporary[i] = 0;
        } catch(NullPointerException e) {  
        }
    }
    
    public void getSqrt() {
        try {
            double value = Math.sqrt(Double.parseDouble(display.getText()));
            display.setText(Double.toString(value));
        } catch(NumberFormatException e) {
        }
    }
    
    public void getPosNeg() {
        try {
            double value = Double.parseDouble(display.getText());
            if(value != 0) {
                value = value * (-1);
                display.setText(Double.toString(value));
            }
            else {
            }
        } catch(NumberFormatException e) {
        }
    }
    
    public void getResult() {
        double result = 0;
        temporary[1] = Double.parseDouble(display.getText());
        try {
            if(function[2] == true)
                result = temporary[0] * temporary[1];
            else if(function[3] == true)
                result = temporary[0] / temporary[1];
            else if(function[0] == true)
                result = temporary[0] + temporary[1];
            else if(function[1] == true)
                result = temporary[0] - temporary[1];
            display.setText(Double.toString(result));
            for(int i = 0; i < 4; i++)
                function[i] = false;
        } catch(NumberFormatException e) {
        }
    }
    
    public final void setDesign() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception e) {   
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    	
        if(ae.getSource() == button[0])
            display.append("7");
        if(ae.getSource() == button[1])
            display.append("8");
        if(ae.getSource() == button[2])
            display.append("9");
        if(ae.getSource() == button[3]) {
        	//button[3].setText("H");
            //add function[0]
            temporary[0] = Double.parseDouble(display.getText());
            function[0] = true;
            display.setText("");
        }
        if(ae.getSource() == button[4])
            display.append("4");
        if(ae.getSource() == button[5])
            display.append("5");
        if(ae.getSource() == button[6])
            display.append("6");
        if(ae.getSource() == button[7]) {
            //subtract function[1]
            temporary[0] = Double.parseDouble(display.getText());
            function[1] = true;
            display.setText("");
        }
        if(ae.getSource() == button[8])
            display.append("1");
        if(ae.getSource() == button[9])
            display.append("2");
        if(ae.getSource() == button[10])
            display.append("3");
        if(ae.getSource() == button[11]) {
            //multiply function[2]
            temporary[0] = Double.parseDouble(display.getText());
            function[2] = true;
            display.setText("");
        }
        if(ae.getSource() == button[12])
            display.append(".");
        if(ae.getSource() == button[13]) {
            //divide function[3]
            temporary[0] = Double.parseDouble(display.getText());
            function[3] = true;
            display.setText("");
        }
        if(ae.getSource() == button[14])
            clear();
        if(ae.getSource() == button[15])
            getSqrt();
        if(ae.getSource() == button[16])
            getPosNeg();
        if(ae.getSource() == button[17])
            getResult();
        if(ae.getSource() == button[18])
            display.append("0");
    }
    
    public static void main(String[] arguments) {
        Calculator c = new Calculator();
    }
}

