import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * https://estindev.tistory.com/entry/JFrame-열기-종료-닫기-정리
 * @author ITSC
 *
 */
public class Frame extends JFrame implements ActionListener{

	JButton btnShow;
	
	public Frame() {
		setSize(400, 100);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* dispose */
		JButton btnDispose = new JButton("Dispose");
		btnDispose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
				System.exit(0);
			}
		});
		btnExit.setBounds(120, 10, 100, 50);
		getContentPane().add(btnExit);
		
		/* anotherFrame */
		btnShow = new JButton("Show Another Frame");
		btnShow.addActionListener(this);
		btnShow.setBounds(230, 10, 170, 50);
		getContentPane().add(btnShow);
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnShow)) {
			System.out.println("hi");
			new AnotherFrame(this);
		}
	}
}
