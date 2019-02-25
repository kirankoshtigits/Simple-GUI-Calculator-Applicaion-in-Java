import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener
{
	
	JLabel l;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4,b;
	
	public Calculator()
	{
		l=new JLabel("**********MY OWN APP**********");
		l.setBounds(30,10,200,20);
		add(l);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
		l1=new JLabel("Number 1");
		l1.setBounds(5,60,100,20);
		add(l1);
		
		l2=new JLabel("Number 2");
		l2.setBounds(5,110,100,20);
		add(l2);
		
		l3=new JLabel("Addition");
		l3.setBounds(5,160,100,20);
		add(l3);
		
		l4=new JLabel("Subtraction");
		l4.setBounds(5,210,100,20);
		add(l4);
		
		l5=new JLabel("Multiplication");
		l5.setBounds(5,260,100,20);
		add(l5);
		
		t1=new JTextField();
		t1.setBounds(90,60,70,30);
		add(t1);
		
		t2=new JTextField();
		t2.setBounds(90,110,70,30);
		add(t2);
		
		t3=new JTextField();
		t3.setBounds(90,160,70,30);
		add(t3);
		
		t4=new JTextField();
		t4.setBounds(90,210,70,30);
		add(t4);
		
		t5=new JTextField();
		t5.setBounds(90,260,70,30);
		add(t5);
		
		b=new JButton("");
		b.setBounds(170,60,70,90);
		add(b);
		
		b1=new JButton("Add");
		b1.setBounds(170,160,70,30);
		add(b1);
		
		b2=new JButton("Sub");
		b2.setBounds(170,210,70,30);
		add(b2);
		
		b3=new JButton("Mul");
		b3.setBounds(170,260,70,30);
		add(b3);
		
		b4=new JButton("Clear");
		b4.setBounds(5,310,235,30);
		add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}
	public void actionPerformed(ActionEvent ae)
	{
		int num1,num2;
		float add,sub,mul;
		num1=Integer.parseInt(t1.getText());
		num2=Integer.parseInt(t2.getText());
		
		if(ae.getSource()==b1)
		{
			add=num1+num2;
			t3.setText(" "+add);
		}
		else if(ae.getSource()==b2)
		{
			sub=num1-num2;
			t4.setText(" "+sub);
		}
		else if(ae.getSource()==b3)
		{
			mul=num1*num2;
			t5.setText(" "+mul);
		}
		else
		{
			t1.setText(null);
			t2.setText(null);
			t3.setText(null);
			t4.setText(null);
			t5.setText(null);
		}
	}
	public static void main(String args[])
	{
		new Calculator();
	}
}