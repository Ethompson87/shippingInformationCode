/*
Name: Eric Thompson
Purpose: Main class that creates the objects and prints the results about shipping information
Date Created: June 20, 2022
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class displayShippingInformation extends JFrame {

    private JTextField fullName = new JTextField(35);
    private JTextField address = new JTextField(35);
    private JTextField city = new JTextField(33);
    private JTextField state = new JTextField(35);
    private JTextField zipCode = new JTextField(35);
    private JButton submitButton = new JButton("Submit");
    private JButton cancelButton = new JButton("Cancel");
    public displayShippingInformation(){



        // Create panel p1 to display information to be inputed
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(5,2,10,2));
        p1.add(new JLabel("Full Name: "));
        p1.add(new JLabel("Address: "));
        p1.add(new JLabel("City: "));
        p1.add(new JLabel("State: "));
        p1.add(new JLabel("ZipCode"));

        //Create panel p2 to display the text fields for the descriptions
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(5,1,10,2));
        p2.add(fullName);
        p2.add(address);
        p2.add(city);
        p2.add(state);
        p2.add(zipCode);

        JPanel title = new JPanel();
        title.add(new JLabel("Enter Shipping Information"));

        JPanel button = new JPanel(new FlowLayout(FlowLayout.CENTER));
        button.add(submitButton, BorderLayout.WEST);
        button.add(cancelButton, BorderLayout.EAST);



        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.EAST);
        add(title, BorderLayout.NORTH);
        add(button, BorderLayout.SOUTH);

        submitButton.addActionListener(new ButtonListener());

        @Override
        public void actionPerformed(ActionEvent e){

        };
    };

    public static void main(String[] args){
        displayShippingInformation gridFrame = new displayShippingInformation();
        gridFrame.setTitle("Shipping Information");
        gridFrame.setSize(500,250);
        gridFrame.setResizable(false);
        gridFrame.setLocationRelativeTo(null);
        gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridFrame.setVisible(true);
    }
}
