import javax.swing.*;
import java.awt.*;

/**
 * The bagel class allows the user to select either a white or whole wheat bagel.
 */

public class BagelPanel extends JPanel
{
    // The following constants are used to indicate
    // the cost of each type of bagel.
    public final double WHITE_BAGEL = 1.25;
    public final double WHEAT_BAGEL = 1.50;
    
    private JRadioButton whiteBagel;
    private JRadioButton wheatBagel;
    private ButtonGroup bg;         //Radio button group
    
    /**
     * Constructor
     * 
     */
    
    public BagelPanel()
    { 
        //Create a grid layout manager with two rows and one column
        setLayout(new GridLayout(2, 1));
        
        // Create the radio buttons.
        whiteBagel = new JRadioButton("White", true);
        wheatBagel = new JRadioButton("Wheat");
        
        //Group The radio buttons
        bg = new ButtonGroup();
        bg.add(whiteBagel);
        bg.add(wheatBagel);
        
        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Bagel"));
        
        // Add the radio buttons to the panel.
        add(whiteBagel);
        add(wheatBagel);
    }
    /** getBagelCost method @ return the cost of the selected bagel
     * 
     * 
     */
    public double getBagelCost()
    { double bagelCost = 0.0;
        if (whiteBagel.isSelected())
        bagelCost = WHITE_BAGEL;
        else
        bagelCost = WHEAT_BAGEL;
        return bagelCost;
    }
}