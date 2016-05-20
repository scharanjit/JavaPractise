package j2ee1001;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class AwtExample extends Frame
{
	//private static final String South = null;
	AwtExample()
	{
		Panel panel = new Panel();
		panel.add(new Button("one"));
		panel.add(new Button("two"));
		panel.add(new Button("three"));
		add("West",panel);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtExample();
	}
}

