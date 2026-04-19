/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
countries on console whenever the countries are selected on the list.*/
package Swings;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryCapitalDemo extends JFrame implements ListSelectionListener
{
    JList<String> countryList;

    String countries[] = {
        "USA", "India", "Vietnam", "Canada", "Denmark",
        "France", "Great Britain", "Japan", "Africa",
        "Greenland", "Singapore"
    };

    CountryCapitalDemo()
    {
        setTitle("Country Capital Demo");
        setSize(400,400);
        setLayout(new FlowLayout());

        countryList = new JList<String>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane sp = new JScrollPane(countryList);

        countryList.addListSelectionListener(this);

        add(sp);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void valueChanged(ListSelectionEvent e)
    {
        String country = countryList.getSelectedValue();

        if(country != null)
        {
            if(country.equals("USA"))
                System.out.println("Capital: Washington D.C.");
            else if(country.equals("India"))
                System.out.println("Capital: New Delhi");
            else if(country.equals("Vietnam"))
                System.out.println("Capital: Hanoi");
            else if(country.equals("Canada"))
                System.out.println("Capital: Ottawa");
            else if(country.equals("Denmark"))
                System.out.println("Capital: Copenhagen");
            else if(country.equals("France"))
                System.out.println("Capital: Paris");
            else if(country.equals("Great Britain"))
                System.out.println("Capital: London");
            else if(country.equals("Japan"))
                System.out.println("Capital: Tokyo");
            else if(country.equals("Africa"))
                System.out.println("Africa is a continent, not a country");
            else if(country.equals("Greenland"))
                System.out.println("Capital: Nuuk");
            else if(country.equals("Singapore"))
                System.out.println("Capital: Singapore");
        }
    }


    public static void main(String args[])
    {
        new CountryCapitalDemo();
    }
}
