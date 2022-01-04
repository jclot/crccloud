package crcloud; 

import javax.swing.*;
import java.awt.*;

public class NavigationBar {
    
    public JMenuBar MenuBar() {
        // Create a MenuBar/NavigationPanel that controls all the menu items.
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(Menu("Menu 1"));
        menuBar.add(Menu("Menu 2"));
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(Menu("Menu 3"));
        menuBar.setBackground(Color.RED);
        menuBar.setForeground(Color.BLUE);
        return menuBar;
    }

    public JMenu Menu(String title) {
        // Create all the Menu Items. 
        JMenu m = new JMenu(title);
        m.add("Menu item #1 in " + title);
        m.add("Menu item #2 in " + title);
        m.add("Menu item #3 in " + title);
        return m;
    }
}
    
