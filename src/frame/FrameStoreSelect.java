package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import food.FoodStore;
import food.FoodStoreInfo2;
import food.Menu;
import food.MenuCollect;
import food.MyMenu;
import food.undone;

public class FrameStoreSelect extends JPanel {

	public FrameStoreSelect() {
		
		
		// �⺻ �г� ����
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(600, 800);
		
		//�Ʒ����� �ʿ��� ��ü ����
		Font font = new Font("monospaced", Font.BOLD, 15);
		FoodStoreInfo2 food = new FoodStoreInfo2();
		undone un = new undone();
		
		// �߽İ���1
		ImageIcon img1 = new ImageIcon("ȫ�����0410.jpg");
		JButton btn1 = new JButton(img1);
		btn1.setName("ȫ�����0410");

		btn1.setSize(125, 125);
		btn1.setLocation(40, 50);
		
		//ȫ����� �̹����� Ŭ���ϸ� ȫ����� ������ ������ ��� �����ӽ�������� �гη� ����.
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuCollect c2 = new MenuCollect();
				ArrayList<Menu> m = c2.getHonkong();
				FoodStore c1 = new FoodStoreInfo2().searchStore("ȫ�����0410");
				FrameBase.getInstance(new FrameStoreInfo(c1, m));
			}
		});

		TextArea t1 = new TextArea("�߱���", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t1.setLocation(190, 50);
		t1.setSize(350, 125);
		t1.setText(food.searchStore("ȫ�����0410").getsName() + "\n\n\n" + food.searchStore("ȫ�����0410").getIntroduce());
		t1.setEditable(false);
		t1.setFont(font);

		add(t1);
		add(btn1);

		// ����2
		JButton btn11 = un.getbutton1("�߽ķΰ�1.jpg");
		TextArea t11 = un.getText1();

		add(t11);
		add(btn11);

		// ����3
		JButton btn12 = un.getbutton2("�߽ķΰ�2.jpg");
		TextArea t12 = un.getText2();

		add(t12);
		add(btn12);

		// ����4
		JButton btn13 = un.getbutton3("�߽ķΰ�3.jpg");
		TextArea t13 = un.getText3();

		add(t13);
		add(btn13);
		
		//����5 �ι�° ���������� ���� ����
		ImageIcon img14 = new ImageIcon("�߽ķΰ�4.png");
		JButton btn14 = new JButton(img14);
		btn14.setVisible(false);
		btn14.setSize(125, 125);
		btn14.setLocation(40, 50);
		add(btn14);
		TextArea t14 = new TextArea("�߱���", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t14.setLocation(190, 50);
		t14.setSize(350, 125);
		t14.setText("\n"
				+ "\n"
				+ "\n"
				+ "\t\t���ÿ� �����Դϴ�!");
		t14.setEditable(false);
		t14.setVisible(false);
		t14.setFont(font);
		add(t14);
		
		// �ѽİ���1

		ImageIcon img2 = new ImageIcon("�����δ��.png");
		JButton btn2 = new JButton(img2);
		btn2.setName("�����δ��");
		btn2.setSize(125, 125);
		btn2.setLocation(40, 50);
		//�̹����� Ŭ���ϸ� ������ ����(�޴�,��Ÿ���)�� ��� �����ӽ�������� �гη� ����.
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FoodStore c2 = new FoodStoreInfo2().searchStore("�����δ��");
				MenuCollect c3 = new MenuCollect();
				ArrayList<Menu> m = c3.getBudae();
				FrameBase.getInstance(new FrameStoreInfo(c2, m));
			}
		});

		TextArea t2 = new TextArea("�����δ��", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t2.setLocation(190, 50);
		t2.setSize(350, 125);
		t2.setText(food.searchStore("�����δ��").getsName() + "\n\n\n" + food.searchStore("�����δ��").getIntroduce());
		t2.setEditable(false);
		t2.setFont(font);

		add(t2);
		add(btn2);

		// ����2(�̱���)
		JButton btn21 = un.getbutton1("�ѽķΰ�1.jpg");
		TextArea t21 = un.getText1();

		add(t21);
		add(btn21);

		// ����3(�̱���)
		JButton btn22 = un.getbutton2("�ѽķΰ�2.jpg");
		TextArea t22 = un.getText2();

		add(t22);
		add(btn22);

		// ����4(�̱���)
		JButton btn23 = un.getbutton3("�ѽķΰ�3.jpg");
		TextArea t23 = un.getText3();

		add(t23);
		add(btn23);
		// ��İ���1

		ImageIcon img3 = new ImageIcon("�ƿ��齺����ũ�Ͽ콺.jpg");
		JButton btn3 = new JButton(img3);
		btn3.setName("�ƿ��齺����ũ�Ͽ콺");
		btn3.setSize(125, 125);
		btn3.setLocation(40, 50);
		//�̹����� Ŭ���ϸ� ������ ����(�޴�,��Ÿ���)�� ��� �����ӽ�������� �гη� ����.
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FoodStore c3 = new FoodStoreInfo2().searchStore("�ƿ��齺����ũ�Ͽ콺");
				MenuCollect c2 = new MenuCollect();
				ArrayList<Menu> m = c2.getOutback();
				FrameBase.getInstance(new FrameStoreInfo(c3, m));
			}
		});

		TextArea t3 = new TextArea("�ƿ��齺����ũ�Ͽ콺", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t3.setLocation(190, 50);
		t3.setSize(350, 125);
		t3.setText(
				food.searchStore("�ƿ��齺����ũ�Ͽ콺").getsName() + "\n\n\n" + food.searchStore("�ƿ��齺����ũ�Ͽ콺").getIntroduce());
		t3.setEditable(false);
		t3.setFont(font);

		add(t3);
		add(btn3);

		// ����2(�̱���)
		JButton btn31 = un.getbutton1("��ķΰ�1.jpg");
		TextArea t31 = un.getText1();

		add(t31);
		add(btn31);

		// ����3(�̱���)
		JButton btn32 = un.getbutton2("��ķΰ�2.jpg");
		TextArea t32 = un.getText2();

		add(t32);
		add(btn32);

		// ����4(�̱���)
		JButton btn33 = un.getbutton3("��ķΰ�3.png");
		TextArea t33 = un.getText3();

		add(t33);
		add(btn33);

		// ġŲ ����
		ImageIcon img4 = new ImageIcon("����ġŲ.jpg");
		JButton btn4 = new JButton(img4);
		btn4.setName("����ġŲ");
		btn4.setSize(125, 125);
		btn4.setLocation(40, 50);
		//�̹����� Ŭ���ϸ� ������ ����(�޴�,��Ÿ���)�� ��� �����ӽ�������� �гη� ����.
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FoodStore c4 = new FoodStoreInfo2().searchStore("����ġŲ");
				MenuCollect c2 = new MenuCollect();
				ArrayList<Menu> m = c2.getChieken();
				FrameBase.getInstance(new FrameStoreInfo(c4, m));
			}
		});

		TextArea t4 = new TextArea("����ġŲ", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t4.setLocation(190, 50);
		t4.setSize(350, 125);
		t4.setText(food.searchStore("����ġŲ").getsName() + "\n\n\n" + food.searchStore("����ġŲ").getIntroduce());
		t4.setEditable(false);
		t4.setFont(font);

		add(t4);
		add(btn4);

		// ����2(�̱���)
		JButton btn41 = un.getbutton1("ġŲ�ΰ�1.png");
		TextArea t41 = un.getText1();

		add(t41);
		add(btn41);

		// ����3(�̱���)
		JButton btn42 = un.getbutton2("ġŲ�ΰ�2.jpg");
		TextArea t42 = un.getText2();

		add(t42);
		add(btn42);

		// ����4(�̱���)
		JButton btn43 = un.getbutton3("ġŲ�ΰ�3.jpg");
		TextArea t43 = un.getText3();

		add(t43);
		add(btn43);
		
		
		//����� üũ�ڽ� ����
		CheckboxGroup group = new CheckboxGroup(); // �׷����� �߽�,�ѽ�,���,ġŲ 1���� üũ ����
		Label question = new Label("���� ���� �԰� ���� ������?! ");
		Checkbox chinese = new Checkbox("�߽�", group, true);
		Checkbox korean = new Checkbox("�ѽ�", group, false);
		Checkbox american = new Checkbox("���", group, false);
		Checkbox chicken = new Checkbox("ġŲ", group, false);
		Font f2 = new Font("monospaced", Font.BOLD, 20);
		question.setLocation(20, 10);
		question.setSize(300, 25);
		chinese.setBounds(question.getLocation().x + 300, question.getLocation().y, 50, 30);
		korean.setBounds(chinese.getLocation().x + 60, chinese.getLocation().y, 50, 30);
		american.setBounds(korean.getLocation().x + 60, chinese.getLocation().y, 50, 30);
		chicken.setBounds(american.getLocation().x + 60, chinese.getLocation().y, 50, 30);

		question.setFont(f2);
		chinese.setFont(font);
		korean.setFont(font);
		american.setFont(font);
		chicken.setFont(font);
		
		//���� ���� ��ư~ �ؽ�Ʈ�� ��� ����
		JButton[] j = { btn1, btn2, btn3, btn4, btn11, btn12, btn13, btn21, btn22, btn23, btn31, btn32, btn33, btn41,
				btn42, btn43, btn14 };
		TextArea[] t = { t1, t2, t3, t4, t11, t12, t13, t21, t22, t23, t31, t32, t33, t41, t42, t43, t14 };
		for (int i = 0; i < j.length; i++) {
			if (i == 0 || i == 4 || i == 5 || i == 6) {
				j[i].setVisible(true);
				t[i].setVisible(true);
				
			} else {
				j[i].setVisible(false);
				t[i].setVisible(false);
			}
		}
		
		
		
		//üũ�ڽ� �����۹�ư�� �̿�, ���� j t�� �̿��ؼ� �߽��� üũ�ϸ� �ٸ� �г��� ������ �ʰ� �����. �ٸ���쵵 ����������
		
		//�߽ĸ� ���̰�
		chinese.addItemListener(new ItemListener() { 

			@Override
			public void itemStateChanged(ItemEvent e) {
				for (int i = 0; i < j.length; i++) {
					if (i == 0 || i == 4 || i == 5 || i == 6) {
						j[i].setVisible(true);
						t[i].setVisible(true);
						
					} else {
						j[i].setVisible(false);
						t[i].setVisible(false);
					}
				}
			}
		});
		
		//�ѽĸ� ���̰�
		korean.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				for (int i = 0; i < j.length; i++) {
					if (i == 1 || i == 7 || i == 8 || i == 9) {
						j[i].setVisible(true);
						t[i].setVisible(true);
					} else {
						j[i].setVisible(false);
						t[i].setVisible(false);
					}

				}
			}
		});
		//��ĸ� ���̰�
		american.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				for (int i = 0; i < j.length; i++) {
					if (i == 2 || i == 10 || i == 11 || i == 12) {
						j[i].setVisible(true);
						t[i].setVisible(true);
					} else {
						j[i].setVisible(false);
						t[i].setVisible(false);
					}
				}
			}
		});
		//ġŲ�� ���̰�
		chicken.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {

				for (int i = 0; i < j.length; i++) {
					if (i == 3 || i == 13 || i == 14 || i == 15) {
						j[i].setVisible(true);
						t[i].setVisible(true);
					} else {
						j[i].setVisible(false);
						t[i].setVisible(false);
					}
				}
			}
		});
		
		// üũ�ڽ� ������ �гο� ����.,
		add(question);
		add(chinese);
		add(korean);
		add(american);
		add(chicken);
		setEnabled(true);

		// �ϴ� ��ư ����
		// �ϴ� �г�
		ImageIcon org = new ImageIcon("�ڷΰ���1.png");
		ImageIcon org2 = new ImageIcon("�ڷΰ���2.png");
		ImageIcon barket = new ImageIcon("��ٱ���1.png");
		ImageIcon barket2 = new ImageIcon("��ٱ���2.png");
		JButton btnback = new JButton(org);
		JButton btnget = new JButton(barket);
		btnget.setRolloverIcon(barket2);
		btnback.setRolloverIcon(org2);
		btnback.setToolTipText("����ȭ������ ���ư��ϴ�");
		
		btnback.setBounds(40, 600, 250, 100);
		btnback.setFont(new Font("monospaced", Font.BOLD, 26));
		btnget.setBorderPainted(false);

		btnget.setBounds(btnback.getBounds());
		btnget.setLocation((int) btnback.getLocation().getX() + 265, // ��ư��ġ
				(int) btnback.getLocation().getY());
		btnget.setFont(new Font("monospaced", Font.BOLD, 26));
		btnback.setBorderPainted(false);
			
		btnget.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyMenu.resetcount();
				FrameBase.getInstance(new FrameBasket()); //<<<<<<<<<<<<<<<��ٱ��Ϸ� ���� ��ư�Դϴ�!!! 
			}
		});
		
		
		btnback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyMenu.resetcount();
				FrameBase.getInstance(new DeliveryC()); //<<<<<<<<<<<<< �������� ���ư��� ��ư�Դϴ�!! 

			}
		});
		
		add(btnback);
		add(btnget);
		
		//ȭ�� �¿���ȯ ��ư
				//�¹�ư
				ImageIcon left= new ImageIcon("�¹�ư.png");
				ImageIcon left2= new ImageIcon("�¹�ư2.png");
				JButton lef= new JButton(left);
				lef.setRolloverIcon(left2);
				lef.setSize(40,22);
				lef.setLocation(0, 144 + 130 + 130 + 130+48);
				lef.setBorderPainted(false);
				lef.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(j[0].isVisible()||j[1].isVisible()||j[2].isVisible()||j[3].isVisible()) {
						JOptionPane.showMessageDialog(null, "ù�������Դϴ�.");
						}else {
							for(int i=0; i<j.length;i++) {
								if(i == 0 || i == 4 || i == 5 || i == 6) {
									j[i].setVisible(true);
									t[i].setVisible(true);
									j[16].setVisible(false);
									t[16].setVisible(false);
								}
									
							}
						}
					}
				});
				
				add(lef);
				
				//���ư
				ImageIcon right= new ImageIcon("���ư.png");
				ImageIcon right2= new ImageIcon("���ư2.png");
				JButton rig= new JButton(right);
				rig.setRolloverIcon(right2);
				rig.setSize(40,22);
				rig.setLocation(540, 144 + 130 + 130 + 130+48);
				rig.setBorderPainted(false);
				rig.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(j[15].isVisible()||j[12].isVisible()||j[9].isVisible()||j[16].isVisible()) {
						JOptionPane.showMessageDialog(null, "�������������Դϴ�.");
						}
						else {
							for(int i=0; i<j.length;i++) {
							if(i == 0 || i == 4 || i == 5 || i == 6) {
								j[i].setVisible(false);
								t[i].setVisible(false);
								j[16].setVisible(true);
								t[16].setVisible(true);
							}
								
						}
						
							
						}
					}
				});
				add(rig);
		
	}
}
