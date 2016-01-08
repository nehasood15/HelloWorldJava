import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWorldGUI extends JFrame  implements ActionListener{

 	private JTextArea displayBox;
 	private JButton printB, exitB;
	private static final int WIDTH = 200;
	private static final int HEIGHT = 200;
	
	public HelloWorldGUI()
	{
		setTitle("Hello World in Java");
		Container c = getContentPane();
		setSize(WIDTH, HEIGHT);
		c.setLayout(new GridLayout(3,1));

	
	
		// define textarea and buttons
		displayBox = new JTextArea(1,3);
		printB = new JButton("Print");
		exitB = new JButton("Exit");
		
		// button setup for action listener
		exitB.addActionListener(this);
		printB.addActionListener(this);
	
		// add items to pane
		c.add(displayBox);
		c.add(printB);
		c.add(exitB);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Print"))
		{
			displayBox.setText("Hello World"); 
		}
		else if (e.getActionCommand().equals("Exit")) 
			System.exit(0); // Close the application.
	}	



}


