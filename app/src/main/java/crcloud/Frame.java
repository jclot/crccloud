package crcloud;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class Frame {
    public Frame() { 
        // Create a Window with a preferred dimension. 
        JFrame f = new JFrame(); 
        NavigationBar navigationBar = new NavigationBar();
        HomePage homePage = new HomePage();

        f.setJMenuBar(navigationBar.MenuBar());
        f.add(homePage.textField());

        f.setSize(1024, 768);
        f.setPreferredSize(new Dimension(1024, 768));
        f.getContentPane().setBackground(Color.GRAY);
        f.pack();
        f.setVisible(true);
    }
}
