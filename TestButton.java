import java.awt.*;
import java.awt.event.*;
class  TestButton extends Frame implements ActionListener 
{
	Button b1,b2,b3;
	TestButton()
	{
		b1 = new Button("RED");
		b2 = new Button("GREEN"); 
		b3 = new Button("BLUE");
		setBackground(Color.gray);
		b1.setBackground(Color.red);
		b2.setBackground(Color.green);
		b3.setBackground(Color.blue);
		setTitle("TEST BUTTON");
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		add(b1);add(b2);add(b3);
	}
	public static void main(String[] args) 
	{
		new TestButton();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			setBackground(Color.red);
			b1.setBackground(Color.gray);
			b2.setBackground(Color.green);
			b3.setBackground(Color.blue);
		}
		if(e.getSource()==b2)
		{
			setBackground(Color.green);
			b2.setBackground(Color.gray);
			b1.setBackground(Color.red);
			b3.setBackground(Color.blue);
		}
		if(e.getSource()==b3)
		{
			setBackground(Color.blue);
			b3.setBackground(Color.gray);
			b1.setBackground(Color.red);
			b2.setBackground(Color.green);
		}
	}
}
