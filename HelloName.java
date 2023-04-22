import java.applet.Applet;
import java.awt.Graphics;
import java.util.*;

public class HelloName extends Applet{

public void paint(Graphics a)
{
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your name: ");
	//a.drawString("Your Name ",250,200);
	String x = sc.nextLine();
	a.drawString("Hello "+x,250,250);
}	
}