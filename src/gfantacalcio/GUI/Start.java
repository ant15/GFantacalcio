
package gfantacalcio.GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Start extends JFrame{

	private	JPanel topPanel;
	private	JList listbox;
        private JButton crea;
        private JButton crea1;
        private JButton crea2;
        private JButton crea3;
        private JButton crea4;

	public Start(){
		
                setTitle( "GFANTACALCIO" );
		setSize( 500, 300 );
		
                topPanel = new JPanel();
                topPanel.setLayout(null);
		
                crea = new JButton();
                crea.setBounds(300, 170, 150, 45);
                
		crea1 = new JButton();
                crea2 = new JButton();
                crea3 = new JButton();
                crea4 = new JButton();
		
                String	listData[] =
		{
			"Item 1",
			"Item 2",
			"Item 3",
			"Item 4"
		};

		listbox = new JList( listData );
                listbox.setBounds(300, 50, 150, 100);
                
                topPanel.add(listbox);
                topPanel.add(crea);
                topPanel.add(crea1);
                topPanel.add(crea2);
                topPanel.add(crea3);
                topPanel.add(crea4);
                
                setVisible(true);
		
                getContentPane().add( topPanel );
        }
}
