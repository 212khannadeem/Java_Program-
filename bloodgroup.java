import java.util.*;
import java.awt.*;
import java.awt.event.*;
//  class Bloodgroup
// {
//     String str;
//     Bloodgroup(String s)
//     {
//         str=s;
//         switch (s) {
//             case "A+":
//             case "a+":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "A-":
//             case "a-":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "B+":
//             case "b+":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "B-":
//             case "b-":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "O+":
//             case "o+":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "O-":
//             case "o-":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "AB+":
//             case "ab+":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
//             case "AB-":
//             case "ab-":
//                 System.out.println("You may proceed. Your blood type is "+str);
//                 break;
        
//             default:
//                 System.out.println("Invalid Blood Type ");
//                 break;
//         }
//     }
// }

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
        setTitle("Calculator Appliction");
		setSize(300,300);
		setBackground(Color.red);
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
        // Scanner sc = new Scanner(System.in); 
        // System.out.print("Enter Your Name: ");  
        // String name= sc.nextLine();   
        // System.out.print("Enter Your Age: ");
        // int age = sc.nextInt();
        // System.out.println();
        // System.out.print("Enter Your Blood Group: ");
        // String bg = sc.next();
        // System.out.println();
        // Bloodgroup b = new Bloodgroup(bg);

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
		// t4.setText(Bloodgroup(bg));
	}
}  