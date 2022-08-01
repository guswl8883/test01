package food;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class StoreInfoMethod {

	public StoreInfoMethod() {
	}

	public JButton getplusbutton(int num, TextArea j) {

		JButton plusCount = new JButton();
		ImageIcon i = new ImageIcon("�÷�����ư.jpg");
		ImageIcon i2= new ImageIcon("�÷�����ư2.png");
		plusCount = new JButton(i);
		plusCount.setRolloverIcon(i2);
		
		plusCount.setBorderPainted(false);
		if (num == 1) {

			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count1 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "�� ���� 9�� ���� �����մϴ�.");
					} else {
						MyMenu.count1 += 1;
						j.setText(String.valueOf(MyMenu.count1));
					}
				}
			});

		} else if (num == 2) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count2 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "�� ���� 9�� ���� �����մϴ�.");
					} else {
						MyMenu.count2 += 1;
						j.setText(String.valueOf(MyMenu.count2));
					}
				}
			});
		} else if (num == 3) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count3 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "�� ���� 9�� ���� �����մϴ�.");
					} else {
						MyMenu.count3 += 1;
						j.setText(String.valueOf(MyMenu.count3));
					}
				}
			});
		} else if (num == 4) {
			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count4 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "�� ���� 9�� ���� �����մϴ�.");
					} else {
						MyMenu.count4 += 1;
						j.setText(String.valueOf(MyMenu.count4));
					}
				}
			});
		}
		return plusCount;

	}

	public JButton getminusbutton(int num, TextArea j) {
		JButton MinusCount = new JButton();
		ImageIcon i = new ImageIcon("���̳ʽ���ư.jpg");
		ImageIcon i2 = new ImageIcon("���̳ʽ���ư2.png");
		MinusCount = new JButton(i);
		MinusCount.setRolloverIcon(i2);
		
		
		MinusCount.setBorderPainted(false);
		if (num == 1) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count1 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1�� �̻� �ֹ��ϼž� �մϴ�.");
					} else {
						MyMenu.count1 -= 1;
						j.setText(String.valueOf(MyMenu.count1));
					}
				}
			});
		} else if (num == 2) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count2 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1�� �̻� �ֹ��ϼž� �մϴ�.");
					} else {
						MyMenu.count2 -= 1;
						j.setText(String.valueOf(MyMenu.count2));
					}
				}
			});

		} else if (num == 3) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count3 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1�� �̻� �ֹ��ϼž� �մϴ�.");
					} else {
						MyMenu.count3 -= 1;
						j.setText(String.valueOf(MyMenu.count3));
					}
				}
			});
		} else if (num == 4) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count4 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "�ּ� 1�� �̻� �ֹ��ϼž� �մϴ�.");
					} else {
						MyMenu.count4 -= 1;
						j.setText(String.valueOf(MyMenu.count4));
					}
				}
			});
		}
		return MinusCount;
	}

	public TextArea getCountArea() {
		Font f = new Font("monospaced", Font.BOLD, 22);
		TextArea j = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		j.setEditable(false);
		j.setText("1");
		j.setFont(f);
		return j;
	}

	public JButton getbuyButton(int num, TextArea j, ArrayList<Menu> m) {
		ImageIcon bas = new ImageIcon("��ٱ��Ϸΰ�.jpg");
		ImageIcon bas2 = new ImageIcon("��ٱ��Ϸΰ�2.jpg");
		JButton btnBuy = new JButton(bas);
		btnBuy.setRolloverIcon(bas2);
		btnBuy.setToolTipText("��ٱ��Ͽ� ����ϴ�");
		if (num == 1) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyMenu.buylist.isEmpty()) {
						m.get(num - 1).setCount(MyMenu.count1);
						MyMenu.add(m.get(num - 1));
						MyMenu.count1 = 1;
						j.setText(String.valueOf(MyMenu.count1));
					} else if (!MyMenu.buylist.isEmpty()) {
						for (int i = 0; i < MyMenu.buylist.size(); i++) {
							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
								MyMenu.buylist.get(i).setCount(MyMenu.count1);
								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
								MyMenu.count1 = 1;
								j.setText(String.valueOf(MyMenu.count1));
								break;
							}
						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
								m.get(num - 1).setCount(MyMenu.count1);
								MyMenu.add(m.get(num - 1));
								MyMenu.count1 = 1;
								j.setText(String.valueOf(MyMenu.count1));
							}
						 
					}
				}
				
			});
		} else if (num == 2) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyMenu.buylist.isEmpty()) {
						m.get(num - 1).setCount(MyMenu.count2);
						MyMenu.add(m.get(num - 1));
						MyMenu.count2 = 1;
						j.setText(String.valueOf(MyMenu.count2));
					} else if (!MyMenu.buylist.isEmpty()) {
						for (int i = 0; i < MyMenu.buylist.size(); i++) {
							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
								MyMenu.buylist.get(i).setCount(MyMenu.count2);
								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
								MyMenu.count2 = 1;
								j.setText(String.valueOf(MyMenu.count2));
							}
						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
								m.get(num - 1).setCount(MyMenu.count2);
								MyMenu.add(m.get(num - 1));
								MyMenu.count2 = 1;
								j.setText(String.valueOf(MyMenu.count2));
							}
						 
					}
				}
				
			});
		} else if (num == 3) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyMenu.buylist.isEmpty()) {
						m.get(num - 1).setCount(MyMenu.count3);
						MyMenu.add(m.get(num - 1));
						MyMenu.count3 = 1;
						j.setText(String.valueOf(MyMenu.count3));
					} else if (!MyMenu.buylist.isEmpty()) {
						for (int i = 0; i < MyMenu.buylist.size(); i++) {
							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
								MyMenu.buylist.get(i).setCount(MyMenu.count3);
								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
								MyMenu.count3 = 1;
								j.setText(String.valueOf(MyMenu.count3));
							}
						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
								m.get(num - 1).setCount(MyMenu.count3);
								MyMenu.add(m.get(num - 1));
								MyMenu.count3 = 1;
								j.setText(String.valueOf(MyMenu.count3));
							}
						 
					}
				}
				
			});
		} else if (num == 4) {
			btnBuy.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if (MyMenu.buylist.isEmpty()) {
						m.get(num - 1).setCount(MyMenu.count4);
						MyMenu.add(m.get(num - 1));
						MyMenu.count4 = 1;
						j.setText(String.valueOf(MyMenu.count4));
					} else if (!MyMenu.buylist.isEmpty()) {
						for (int i = 0; i < MyMenu.buylist.size(); i++) {
							if (MyMenu.buylist.get(i).getName().equals(m.get(num - 1).getName())) {
								MyMenu.buylist.get(i).setCount(MyMenu.count4);
								JOptionPane.showMessageDialog(null, "������ �߰��߽��ϴ�");
								MyMenu.count4 = 1;
								j.setText(String.valueOf(MyMenu.count4));
							}
						} if (!MyMenu.buylist.contains(m.get(num - 1))) {
								m.get(num - 1).setCount(MyMenu.count4);
								MyMenu.add(m.get(num - 1));
								MyMenu.count4 = 1;
								j.setText(String.valueOf(MyMenu.count4));
							}
						 
					}
				}
				
			});
		}
		return btnBuy;
	}

}
