package crcloud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage {
    
    public JPanel textField() {
            
        JTextField textField = new JTextField(16);
        JButton searchButton = new JButton("Search");
        JPanel panel = new JPanel();

        panel.add(textField);
        panel.add(searchButton);

        return panel; 
    } 
        

}
