package org.mart95777.smacxfiledemacifier;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class SmacxFileDemacifier extends JFrame {
	/**
	 * @param args
	 */
	public static final String VERSION = "1.0.0";
	JPanel mainPanel;
	
//	static JTextArea firstLabel;
//	static JTextArea AreaLabel;
//	static JTextArea SubAreaLabel;
//	static JButton butArea;
//	static JButton butSubArea;
//	static JButton butTest;
	
	
	public static void main(String[] args) {
		SmacxFileDemacifier frame = new SmacxFileDemacifier();

	}
	
	/**
	 * Methods for the constructor
	 */
	
	private void addcomponent(JPanel pn, JComponent cmp, int xpos, int ypos, int w, int h, int place, int stretch){
		GridBagConstraints gridcns = new GridBagConstraints();
		//GridBagConstraints(int gridx, int gridy, int gridwidth, int gridheight, double weightx, double weighty, int anchor, int fill, Insets insets, int ipadx, int ipady)
		gridcns.gridx = xpos;
		gridcns.gridy = ypos;
		gridcns.gridwidth = w;
		gridcns.gridheight = h;
		gridcns.weightx = 100;
		gridcns.weighty = 100;
		gridcns.insets = new Insets(5,5,5,5);
		gridcns.anchor = place;
		gridcns.fill = stretch;
		
		pn.add(cmp, gridcns);
	} // end private void addcomponent
	
	/**
	 * CONSTRUCTOR!
	 */
	public SmacxFileDemacifier(){
		super("SMACX File Demac Utility, ver. " + VERSION);
		this.setSize(700,500);
		this.setLocationRelativeTo(null);
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}

}
