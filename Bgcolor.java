import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Bgcolor extends Applet implements ItemListener
{
    Choice color = new Choice();
    public void init()
    {
        color.addItem("White");
        color.addItem("Black");
        color.addItem("Blue");
        color.addItem("Green");
        color.addItem("Red");
        color.addItem("Yellow");
        color.addItem("Orange");

        add(new Label("Choose a Background color: "));
        add(color);
        color.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e)
    {
        String name = color.getSelectedItem();

        switch (name) {
            case "Red":
                setBackground(Color.RED);
                break;
            case "Green":
                setBackground(Color.GREEN);
                break;
            case "Blue":
                setBackground(Color.BLUE);
                break;
            case "Black":
                setBackground(Color.BLACK);
                break;
            case "Orange":
                setBackground(Color.ORANGE);
                break;
            case "white":
                setBackground(Color.WHITE);
                break;
            case "Yellow":
                setBackground(Color.YELLOW);
                break;    
            default:
                setBackground(Color.WHITE);
        }
    }
}