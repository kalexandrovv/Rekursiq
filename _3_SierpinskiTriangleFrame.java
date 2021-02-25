package REKURSIQ;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class _3_SierpinskiTriangleFrame extends JFrame {
	static int r = 0, gr = 0, b = 255;
	
	private int order = 0;
	
	

	//private JTextField jtfOrder = new JTextField("0", 5); // Order
	private _3_SierpinskiTrianglePanel trianglePanel = new _3_SierpinskiTrianglePanel(); // To display the pattern

	JButton plusButton = new JButton("+");
	JButton minusButton = new JButton("-");
	
	public _3_SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(minusButton);
		panel.add(plusButton);
		//panel.add(jtfOrder);
		//jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		plusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.increaseOrder();
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.decreaseOrder();
			}
		});

	}

}