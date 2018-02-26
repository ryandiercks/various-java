import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	
	private JButton calculate;
	private JButton exit;
	private JTextField wholeprice;
	private JTextField markup;
	private JPanel centerpanel;
	private JPanel northpanel;
	private JPanel southpanel;
	private JLabel label1;
	private JLabel label2;
	private JLabel heading;
	
	public Calculator()
	{
		setTitle("Retail Price Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BuildPanel();
		setLayout(new BorderLayout());
		add(centerpanel,BorderLayout.CENTER);
		add(northpanel,BorderLayout.NORTH);
		add(southpanel,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	
	public void BuildPanel()
	{
		
		calculate=new JButton("Calculate");
		calculate.addActionListener(new MyActionListener());
		exit=new JButton("Exit");
		exit.addActionListener(new MyActionListener());
		
		centerpanel=new JPanel();
		northpanel=new JPanel();
		southpanel=new JPanel();
		
		wholeprice=new JTextField(10);
		markup=new JTextField(10);
		
		label1=new JLabel("Enter wholesale Price($): ");
		label2=new JLabel("Enter Markup Percentage(%): ");
		
		centerpanel.setLayout(new GridLayout(2,2));
		centerpanel.add(label1);
		centerpanel.add(wholeprice);
		centerpanel.add(label2);
		centerpanel.add(markup);
		
		heading=new JLabel("Welcome To Retail Sale Price Calculator!");
		northpanel.add(heading);
		
		southpanel.add(calculate);
		southpanel.add(exit);
		
	}
	
	public class MyActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			
			if(e.getSource()==calculate)
			{
				double saleprice=Double.parseDouble(wholeprice.getText());
				double markupprice=saleprice*((Double.parseDouble(markup.getText()))/100);
				double retailprice=saleprice+markupprice;
				JOptionPane.showMessageDialog(null, "Retail Price= "+retailprice+"$");
			}
			else if(e.getSource()==exit)
			{
				System.exit(0);
			}
			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Calculator();
	}

}
