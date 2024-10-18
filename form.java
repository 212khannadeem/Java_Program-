import java.util.*;
import java.awt.*;
import java.awt.event.*;

class form extends Frame implements ActionListener
{  
    Label l1,l2,l3;
	TextField t1, t2,t3,t4;
	Button b1;
    public form()
    {
        l1=new Label("Enter Your Name");
		l2=new Label("Enter Your Age");
		l3=new Label("Enter Your Blood Group");
        t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
        t4=new TextField(30);
        b1=new Button("Sign Up");
        setTitle("Blood Bank Application");
		setSize(300,300);
		setBackground(Color.gray);
        l1.setBackground(Color.blue);
        l2.setBackground(Color.blue);
        l3.setBackground(Color.blue);
        b1.setBackground(Color.blue);
		setLayout(new FlowLayout());
		setVisible(true);
        b1.addActionListener(this);
        add(l1);add(t1);
		add(l2);add(t2);
		add(l3);add(t3);
		add(b1);
        add(t4);
    }   
    public static void main(String[] args)  
    {  
        new form();

    }  
    public void actionPerformed(ActionEvent e)
	{
		String name=t1.getText();
		int age=Integer.parseInt(t2.getText());
        String bg=t3.getText();
		// Bloodgroup b = new Bloodgroup(bg);
		if(e.getSource()==b1)
		{
            switch (bg) {
                case "A+":
                case "a+":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "A-":
                case "a-":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "B+":
                case "b+":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "B-":
                case "b-":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "O+":
                case "o+":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "O-":
                case "o-":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "AB+":
                case "ab+":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
                case "AB-":
                case "ab-":
                        t4.setText("You may proceed. Your blood type is "+bg);
                    break;
            
                default:
                        t4.setText("Invalid Blood Group");
                    break;
            }
        }
	}
}  