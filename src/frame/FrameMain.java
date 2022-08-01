package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameMain extends JFrame{

	public FrameMain() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Orange 배달");
		
		Container de = this.getContentPane();
		de.setBackground(Color.white);
		setSize(500,800);
		
		this.setLayout(null);;
		
		ImageIcon img = new ImageIcon("dele.png");
		JLabel jl = new JLabel(img);
		
		ImageIcon org = new ImageIcon("orange.png");
		
		JButton b1 = new JButton("주문하기",org);
		JButton b2 = new JButton("장바구니",org);
		
		b1.setBackground(Color.orange);
		b2.setBackground(Color.orange);
		
		jl.setSize(500, 700);
		jl.setLocation(0, -45);
		b1.setSize(250, 100);
		b1.setLocation((int) (getSize().getWidth() / 2)-250, 
		(int) (getLocation().getY() /2 )+ 675);
		b2.setSize(250,100);
		b2.setLocation((int) (getSize().getWidth() / 2), 
		(int) (getLocation().getY() /2 +675));
		b1.setFont(new Font("monospaced",Font.BOLD,18));
		b2.setFont(new Font("monospaced", Font.BOLD,18));
		
		
		
		this.add(jl);
		this.add(b1);
		this.add(b2);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		setVisible(true);
		
	}
}