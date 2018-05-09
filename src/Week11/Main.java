/*
 * @project Week11
 * @author  Osbardo Rodriguez
 * Date:    5/8/18
 */
package Week11;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

    	TextFieldFrame tf = new TextFieldFrame();
    	tf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	tf.setSize( 400, 400 );
    	tf.setLocation( 300, 200 );
    	tf.setVisible( true );
    }
}
