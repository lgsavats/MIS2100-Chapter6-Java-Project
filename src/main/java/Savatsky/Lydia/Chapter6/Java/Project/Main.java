package Savatsky.Lydia.Chapter6.Java.Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(130, 20, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(140, 66, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel Numerator = new JLabel("Numerator");
		Numerator.setBounds(49, 25, 73, 16);
		frame.getContentPane().add(Numerator);
		
		JLabel Denominator = new JLabel("Denominator");
		Denominator.setBounds(46, 71, 87, 16);
		frame.getContentPane().add(Denominator);
		
		JLabel Result = new JLabel("Result");
		Result.setBounds(50, 145, 61, 16);
		frame.getContentPane().add(Result);
		
		JButton btnNewButton = new JButton("Calculate");
		
		
		btnNewButton.setBounds(130, 104, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 double numerator = Double.parseDouble(Numerator.getText()); 
				 
				 double denominator = Double.parseDouble(Denominator.getText());
				 
				 
				 try {
					
					//instantiate SimpleMath class 
					SimpleMath simpleMathObject = new SimpleMath();
					
					//store results of divide method into variable called result
					Double result = simpleMathObject.divide(numerator,denominator);
					
				 } catch (ArithmeticException e1) {
					 Result.setText("Cannot divide by 0");
					 
				 }
				
				 
					
			}
		});
		
		
		
	}
}
