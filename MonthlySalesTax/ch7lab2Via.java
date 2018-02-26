
import javax.swing.*;
import java.text.DecimalFormat;
import java.awt.event.*;
import java.awt.*;

/**
   The MetricConverterWindow class lets the user enter a
   distance in kilometers. Radio buttons can be selected to
   convert the kilometers to miles, feet, or inches.
 */

public class ch7lab2Via
{


  private JPanel panel;				  // A holding panel
  private JLabel minutesLabel;		   // A lable for the minutes
  private JTextField minutesTextField;	  // To hold user input of minutes
  private JRadioButton daytimeButton;	  // To select datyime 
  private JRadioButton eveningButton;	   // To select evening
  private JRadioButton peakButton;	 // To select peak
  private ButtonGroup radioButtonGroup;  // To group radio buttons
  private final int WINDOW_WIDTH = 400;  // Window width
  private final int WINDOW_HEIGHT = 100; // Window height

  /**
	  Constructor
   */

  public  ch7lab2Via()
  {
	// Set the title.
	setTitle("Long Distance Calls");

	// Set the size of the window.
	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	// Specify an action for the close button.
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// Build the panel and add it to the frame.
	buildPanel();

	// Add the panel to the frame's content pane.
	add(panel);

	// Display the window.
	setVisible(true);
  }

  private void setVisible(boolean b) 
  {
	
	
}

private void add(JPanel panel2) 
{
	
	
}

private void setDefaultCloseOperation(int exitOnClose) {
	
	
}

private void setSize(int wINDOWWIDTH, int wINDOWHEIGHT) {
	
	
}

private void setTitle(String string) {
	
	
}

/**
 * The buildPanel method adds a label, text field,
 * and three buttons to a panel.
   */

  private void buildPanel()
  {
	// Create the label, text field, and radio buttons.
	minutesLabel = new JLabel("Enter the minutes used");
	minutesTextField = new JTextField(10);
	daytimeButton = new JRadioButton("Daytime Rate");
	eveningButton = new JRadioButton("Evening Rate");
	peakButton = new JRadioButton("Peak Rate");

	// Group the radio buttons.
	radioButtonGroup = new ButtonGroup();
	radioButtonGroup.add(daytimeButton);
	radioButtonGroup.add(eveningButton);
	radioButtonGroup.add(peakButton);

	// Add action listeners to the radio buttons.
	daytimeButton.addActionListener(new RadioButtonListener());
	eveningButton.addActionListener(new RadioButtonListener());
	peakButton.addActionListener(new RadioButtonListener());

	// Create a panel and add the components to it.
	panel = new JPanel();
	panel.add(minutesLabel);
	panel.add(minutesTextField);
	panel.add(daytimeButton);
	panel.add(eveningButton);
	panel.add(peakButton);
  }

  /**
   * Private inner class that handles the event when
   * the user clicks one of the radio buttons.
   */

  private class RadioButtonListener implements ActionListener
  {
	public void actionPerformed(ActionEvent e)
	{
	  String input;		  // To hold the user's input
	  String rateTo = ""; // The rate that is payed
	  double result = 0.0;   // To hold the conversion

	  // Get the kilometers entered.
	  input = minutesTextField.getText();

	  // Determine which radio button was clicked.
	  if (e.getSource() == daytimeButton)
	  {
		// Multiply by daytime rate.
		rateTo = " dollars.";
		result = Double.parseDouble(input) * 0.07;
	  }
	  else if (e.getSource() == eveningButton)
	  {
		// Multiply by eveing rate.
		rateTo = " dollars.";
		result = Double.parseDouble(input) * 0.12;
	  }
	  else if (e.getSource() == peakButton)
	  {
		// Multiply by peak rate
	   rateTo = " inches.";
		result = Double.parseDouble(input) * 0.05;
	  }

	  // Display the final price
	  JOptionPane.showMessageDialog(null, input + 
		  " The price of your minutes used are as follows; " + result + rateTo);
	}
  }

  /**The main method creates an instance of the ch7lab2Via class, displaying its window.
   */

  public static void main(String[] args)
  {
	ch7lab2Via mcw = 
	  new ch7lab2Via();
  }
}

