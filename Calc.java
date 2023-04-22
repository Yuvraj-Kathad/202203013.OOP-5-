import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends Applet implements ActionListener 
{
	Button b1,b2,b3,b4; TextField t1,t2,t3;
	Label L1,L2,L3;

	public void init()
	{
		L1 = new Label("1st Number ");
		L1.setBounds(100,40,100,20);
		t1 = new TextField();
		t1.setBounds(210,40,100,20);

		L2 = new Label("2nd Number: ");
		L2.setBounds(100,80,100,20);
		t2 = new TextField();
		t2.setBounds(210,80,100,20);
		
		L3 = new Label("Result");
		L3.setBounds(100,120,100,20);
		t3 = new TextField();
		t3.setBounds(210,120,100,20);
		b1 = new Button("+");
		b1.setBounds(80,150,60,50);
		b2 = new Button("-");
		b2.setBounds(130,150,60,50);
		b3 = new Button("x");
		b3.setBounds(180,150,60,50);
		b4 = new Button("/");
		b4.setBounds(230,150,60,50);
		
		add(L1); add(L2);  add(L3);
		add(t1); add(t2);	 add(t3);
		add(b1);  add(b2);  add(b3);  add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setLayout(null);
	}

	public void actionPerformed(ActionEvent a)
	 {
		int x = Integer.parseInt(t1.getText());
		int y = Integer.parseInt(t2.getText());
		
		if(a.getSource()==b1) 
			t3.setText(String.valueOf(x+y));
		
		if(a.getSource()==b2) 
			t3.setText(String.valueOf(x-y));
		
		if(a.getSource()==b3) 
			t3.setText(String.valueOf(x*y));
		
		if(a.getSource()==b4)
			t3.setText(String.valueOf(x/y));
	}
}
