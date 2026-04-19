/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
package Swings;
import javax.swing.*;
import java.awt.*;

public class TabbedColorDemo extends JFrame
{
    JTabbedPane tp;
    JPanel p1, p2, p3;

    TabbedColorDemo()
    {
        setTitle("Tabbed Pane Colors");
        setSize(400,300);

        tp = new JTabbedPane();

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();

        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        tp.addTab("Cyan", p1);
        tp.addTab("Magenta", p2);
        tp.addTab("Yellow", p3);

        add(tp);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[])
    {
        new TabbedColorDemo();
    }
}