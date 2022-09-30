import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnotherFrame extends JFrame{
	public AnotherFrame(JFrame previous) {
		setSize(430, 110);
		setLocation(0, 120);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/* dispose */
		JButton btnDispose = new JButton("Dispose");
		btnDispose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		btnDispose.setBounds(10, 10, 100, 50);
		getContentPane().add(btnDispose);
		
		/* exit */
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new AnotherFrame(previous);
				previous.dispose();
			}
		});
		btnExit.setBounds(120, 10, 100, 50);
		getContentPane().add(btnExit);
		
		setVisible(true);
	}	
}
