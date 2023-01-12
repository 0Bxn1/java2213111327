import java.awt.*;
import javax.swing.*;

public class ex1 extends JFrame {
	
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	
	private JLabel lblLength,lblArea,lblPerimeter,lblWidth;
	private JTextField txtLength,txtArea,txtPerimeter;
	
	public ex1() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		lblLength = new JLabel("Enter the length",SwingConstants.RIGHT);
		lblWidth = new JLabel("Enter the width",SwingConstants.RIGHT);
		lblArea = new JLabel("Area: ",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter",SwingConstants.RIGHT);
		
		//txtLength = new JTxtLength("10");
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		add(lblLength);
		add(lblArea);
		add(lblWidth);
		add(lblPerimeter);
	}
	public static void main(String[] args) {
		ex1 L = new ex1();
	}



}
