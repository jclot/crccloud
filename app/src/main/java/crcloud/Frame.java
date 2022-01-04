package crcloud;

import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class Frame {
    public Frame() 
        // Create a Window with a preferred dimension. 
        JFrame f = new JFrame(); 
        NavigationBar navigationBar = new NavigationBar();
        f.setJMenuBar(navigationBar.MenuBar());
        f.setSize(550, 300);
        f.setPreferredSize(new Dimension(550, 300));
        f.getContentPane().setBackground(Color.BLUE);
        f.pack();
        f.setVisible(true);
    }
}
