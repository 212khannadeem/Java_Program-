import java.awt.*;
import java.awt.event.*;
class  calc extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1, t2,t3;
	Button b1,b2,b3,b4;
	public calc()
	{
		l1=new Label("First Number");
		l2=new Label("Second Number");
		l3=new Label("Result");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		b1=new Button("Add");
		b2=new Button("Substraction");
		b3=new Button("Multiplication");
		b4=new Button("Divide");
		setTitle("Calculator Appliction");
		setSize(300,300);
		setBackground(Color.red);
		setLayout(new FlowLayout());
		setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);add(b2);add(b3);add(b4);
	}
	public static void main(String[] args) 
	{
		new calc();
		
	}
	public void actionPerformed(ActionEvent e)
	{
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		int result=0;
		if(e.getSource()==b1)
		{
		result=num1+num2;
		}
		if(e.getSource()==b2)
		{
		result=num1-num2;
		}
		if(e.getSource()==b3)
		{
		result=num1*num2;
		}
		if(e.getSource()==b4)
		{
		result=num1/num2;
		}
		
		t3.setText(Integer.toString(result));
	}
	
}
