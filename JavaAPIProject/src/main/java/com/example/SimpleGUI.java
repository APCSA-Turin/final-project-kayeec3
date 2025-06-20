package com.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SimpleGUI{
    public static void main(String[] args) {
        // Create the main frame
        System.out.println("Is headless? " + java.awt.GraphicsEnvironment.isHeadless());
        if (GraphicsEnvironment.isHeadless()) {
            System.out.println("Cannot start GUI: running in a headless environment.");
            System.exit(1);
        }
        JFrame frame = new JFrame("Data Viewer");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JLabel titleLabel = new JLabel("Enter city name:", SwingConstants.CENTER);
        JTextField inputField = new JTextField(); //input text 
        JButton fetchButton = new JButton("Fetch Data");//a button fetches data when pressed
        JTextArea outputArea = new JTextArea();//where the fetched data will output 
        outputArea.setEditable(false);

        // Layout setup
        JPanel panel = new JPanel(new GridLayout(4, 1)); //create the JPanel object
        
        panel.add(titleLabel);
        panel.add(inputField);
        panel.add(fetchButton);
        panel.add(outputArea);

        //We have added components to our panel, then we add the PANEL to our FRAME
        frame.add(panel); 

        // Button behavior
        fetchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String city = inputField.getText().trim();
                if (!city.isEmpty()) {
                    // Placeholder for data — replace with real API call 
                    String result = "You searched for: " + city;
                    outputArea.setText(result);
                } else {
                    outputArea.setText("Please enter a city.");
                }
            }
        });

        frame.setVisible(true);
    }
}
