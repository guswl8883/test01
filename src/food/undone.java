package food;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
//미구현된 가게를 생성하는 방입니다.
public class undone {
	
			//가게2
			public undone() {
			
			}
			
			public Font font = new Font("monospaced", Font.BOLD , 15);
			
			public JButton getbutton1 (String storename) {
			ImageIcon img11=new ImageIcon(storename);
			JButton btn11 = new JButton(img11);
			btn11.setSize(125, 125);
			btn11.setLocation(40 ,185);
			btn11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "영업시간이 아닙니다.");
				}
			});
			return btn11;
			}
			
			public JButton getbutton2 (String storename) {
				ImageIcon img11=new ImageIcon(storename);
				JButton btn11 = new JButton(img11);
				btn11.setSize(125, 125);
				btn11.setLocation(40 , 320);
				btn11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "영업시간이 아닙니다.");
					}
				});
				return btn11;
				}
			
			public JButton getbutton3 (String storename) {
				ImageIcon img11=new ImageIcon(storename);
				JButton btn11 = new JButton(img11);
				btn11.setSize(125, 125);
				btn11.setLocation(40 , 455);
				btn11.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "영업시간이 아닙니다.");
					}
				});
				return btn11;
				}
			
			public TextArea getText1 () {
				TextArea t11=new TextArea("",
						0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
				t11.setLocation(190,185);
				t11.setSize(350,125);
				t11.setText("\n"
						+ "\n"
						+ "\n"
						+ "\t\t예시용 가게입니다!");
				t11.setEditable(false);
				t11.setFont(font);
				return t11;
				}
			
			public TextArea getText2 () {
				TextArea t11=new TextArea("",
						0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
				t11.setLocation(190,320);
				t11.setSize(350,125);
				t11.setText("\n"
						+ "\n"
						+ "\n"
						+ "\t\t예시용 가게입니다!");
				t11.setEditable(false);
				t11.setFont(font);
				return t11;
				}
			
			public TextArea getText3 () {
				TextArea t11=new TextArea("",
						0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
				t11.setLocation(190,455);
				t11.setSize(350,125);
				t11.setText("\n"
						+ "\n"
						+ "\n"
						+ "\t\t예시용 가게입니다!");
				t11.setEditable(false);
				t11.setFont(font);
				return t11;
				}
			
		}