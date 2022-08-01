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
		ImageIcon i = new ImageIcon("플러스버튼.jpg");
		ImageIcon i2= new ImageIcon("플러스버튼2.png");
		plusCount = new JButton(i);
		plusCount.setRolloverIcon(i2);
		
		plusCount.setBorderPainted(false);
		if (num == 1) {

			plusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count1 + 1) >= 10) {
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
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
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
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
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
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
						JOptionPane.showMessageDialog(null, "한 번에 9개 까지 가능합니다.");
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
		ImageIcon i = new ImageIcon("마이너스버튼.jpg");
		ImageIcon i2 = new ImageIcon("마이너스버튼2.png");
		MinusCount = new JButton(i);
		MinusCount.setRolloverIcon(i2);
		
		
		MinusCount.setBorderPainted(false);
		if (num == 1) {
			MinusCount.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if ((MyMenu.count1 - 1) <= 0) {
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
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
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
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
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
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
						JOptionPane.showMessageDialog(null, "최소 1개 이상 주문하셔야 합니다.");
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
		ImageIcon bas = new ImageIcon("장바구니로고.jpg");
		ImageIcon bas2 = new ImageIcon("장바구니로고2.jpg");
		JButton btnBuy = new JButton(bas);
		btnBuy.setRolloverIcon(bas2);
		btnBuy.setToolTipText("장바구니에 담습니다");
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
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
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
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
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
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
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
								JOptionPane.showMessageDialog(null, "수량을 추가했습니다");
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
