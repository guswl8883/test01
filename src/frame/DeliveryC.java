package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DeliveryC extends JPanel{

	public DeliveryC() {
	
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(600,800);
		
		ImageIcon img = new ImageIcon("deliv.jpg");
		JLabel jl = new JLabel(img);
		
		ImageIcon org = new ImageIcon("orange.png");
		Image ig = org.getImage();
		Image changeig = ig.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		ImageIcon changeorg = new ImageIcon(changeig);
		
		ImageIcon mchu = new ImageIcon("M주문하기.png");
		ImageIcon mpoc = new ImageIcon("M장바구니.png");
		ImageIcon mrev = new ImageIcon("M리뷰작성.png");
		
		ImageIcon mchu2 = new ImageIcon("M주문하기2.png");
		ImageIcon mpoc2 = new ImageIcon("M장바구니2.png");
		ImageIcon mrev2 = new ImageIcon("M리뷰작성2.png");
		
		JButton b1 = new JButton(mchu);
		JButton b2 = new JButton(mpoc);
		JButton b3 = new JButton(mrev);
		
		b1.setRolloverIcon(mchu2);
		b1.setBorderPainted(false);
		
		b2.setRolloverIcon(mpoc2);
		b2.setBorderPainted(false);
		
		b3.setRolloverIcon(mrev2);
		b3.setBorderPainted(false);
		
		jl.setSize(500, 447);
		jl.setLocation(40, 20);
		
		b1.setSize(360,90);
		b1.setLocation(115 , 460);
		b2.setSize(360,90);
		b2.setLocation(115,550);
		b3.setSize(360,90);
		b3.setLocation(115,640);
		
		add(jl);
		add(b1);
		add(b2);
		add(b3);
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			FrameBase.getInstance(new FrameStoreSelect());
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			FrameBase.getInstance(new FrameBasket());
				
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameDeliveryReview());
				
			}
		});
	
		setVisible(true);
	}

}

