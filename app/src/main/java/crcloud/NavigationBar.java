package crcloud; 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NavigationBar implements ActionListener {
   
    Font menuFont = new Font(Font.DIALOG, Font.BOLD, 17);

    private JMenuItem fileItem_close;
    String[] menuItem = {"Menu item #1", "Menu item #2", "Menu item #3"};
    String[] menuTitle = {"Games", "Settings", "Account", "FeedBack"};

    private final MouseListener mouseAction = new MouseAdapter() {
        @Override
        public void mouseEntered(MouseEvent e) {
            JMenu item = (JMenu) e.getSource();
            item.setOpaque(true);
            item.setSelected(true);
        };
    
        @Override
        public void mouseExited(MouseEvent e) {
            JMenu item = (JMenu) e.getSource();
            item.setOpaque(false);
            item.setSelected(false);
        };
    };

    public JMenuBar MenuBar() {
        // Cream.setMargin(new Insets(10, 10, 10, 10));te a MenuBar/NavigationPanel that controls all the menu items.
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(Menu(menuTitle[0]));
        menuBar.add(Menu(menuTitle[1]));
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(Menu(menuTitle[2]));
        menuBar.add(Menu(menuTitle[3]));
        menuBar.setForeground(Color.BLACK);
        return menuBar;
    }

    public JMenu Menu(String mainTitle) {
        // Create all the Menu Items. 
        JMenu m = new JMenu(mainTitle);
        m.add(menuItem[0]);
        m.add(menuItem[1]);
        m.add(menuItem[2]);
        m.setRolloverEnabled(true);
        m.addMouseListener(mouseAction);
        m.setBackground(new Color(0x0066FF));
        m.setFont(menuFont);
        return m;
    }

    @Override 
    public void actionPerformed(ActionEvent e) {
        JMenuItem source = (JMenuItem)e.getSource();
    }
}
    
