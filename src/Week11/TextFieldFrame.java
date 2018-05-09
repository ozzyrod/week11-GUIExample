/*
 * @project Week11
 * @author  Osbardo Rodriguez
 * Date:    5/8/18
 */
package Week11;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class TextFieldFrame extends JFrame {
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	private JButton calcButton;

	public TextFieldFrame() {
		super( "GUI Example for Java" ); // Calls JFrame's constructor and allows us to add a title.
		setLayout( new FlowLayout() );

		tf1 = new JTextField( 10 );
		add( tf1 );

		tf2 = new JTextField( 10 );
		add( tf2 );

		tf3 = new JTextField( 10 );
		tf3.setEditable( false );
		add( tf3 );

		calcButton = new JButton( "Calculate" );
		add( calcButton );

		ButtonHandler bh = new ButtonHandler(); // Create a handler object
		calcButton.addActionListener( bh ); // Pass the handler object into the listener.
	}

	// If you want to create a handler, you need to add a listener and event for it.
	private class ButtonHandler implements ActionListener {

		public void actionPerformed( ActionEvent ae ) { // Action Event added.
			int n = Integer.parseInt( tf1.getText() );

			int d = Integer.parseInt( tf2.getText() );

			tf3.setText( Integer.toString( n / d ) );

			// You don't need a loop when creating error handling inside of a GUIs
		}
	}
}
