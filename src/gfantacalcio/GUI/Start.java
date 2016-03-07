
package gfantacalcio.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends JFrame{

	private	JPanel topPanel;
	private	JList listbox;

	public Start(){
		
                setTitle( "GFANTACALCIO" );
		setSize( 1000, 500 );
		setBackground( Color.gray );
		// Create a panel to hold all other components
		topPanel = new JPanel();
                topPanel.setLayout(new GridLayout(4, 2, 10, 10));
		getContentPane().add( topPanel );

		// Create some items to add to the list
		String	listData[] =
		{
			"Item 1",
			"Item 2",
			"Item 3",
			"Item 4"
		};

		listbox = new JList( listData );
                
                setVisible(true);
		topPanel.add( listbox, BorderLayout.CENTER );
	}
}
