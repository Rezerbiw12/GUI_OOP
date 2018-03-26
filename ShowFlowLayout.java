import javax.swing.*;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;

public class ShowFlowLayout extends JFrame{
	private int num = 0;

	public ShowFlowLayout(){
		super("ShowFlowLayout");

	setLayout(new FlowLayout(FlowLayout.CENTER,10,20));

	JTextField textField = new JTextField(8);
	textField.setText(String.valueOf(num));

	JButton button = new JButton("Count");
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			textField.setText(String.valueOf(++num));
		}
	});
	add(new JLabel("Counter"));
	add(textField);
	add(button);

	}

	public static void main (String[] args){
	ShowFlowLayout frame = new ShowFlowLayout();
	frame.setTitle("Swing Counter");
	frame.setSize(400,110);
	frame.setLocationRelativeTo(null);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
}