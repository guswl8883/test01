package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import food.FoodStore;
import food.Menu;
import food.MyMenu;
import food.StoreInfoMethod;

public class FrameStoreInfo extends JPanel {

	public FrameStoreInfo(FoodStore c, ArrayList<Menu> m) {

		setBackground(new Color(255, 255, 255));
		setLayout(null);
		setSize(600, 800);
		setLocation(0, 0);

		// ��ư���ۿ� �ʿ��� ������
		StoreInfoMethod method = new StoreInfoMethod();
		
		// ���� ������ ���� �г�		
		Font infoF = new Font("monospaced", Font.BOLD, 25);
		TextArea infot = new TextArea(c.getStoreInfo(),0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		infot.setSize(510, 520);
		infot.setLocation(40, 70);
		infot.setVisible(false);
		infot.setEditable(false);
		infot.setFont(infoF);
		add(infot);
		
		// ���� ������ ���� �г�
		TextArea rev = new TextArea(c.getReview(), 0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		rev.setSize(510, 520);
		rev.setLocation(40, 70);
		rev.setVisible(false);
		rev.setEditable(false);
		rev.setFont(infoF);
		rev.setBackground(new Color(255, 255, 255));
		add(rev);
		
		// �� ��ư(�޴�,����,����)
		JButton btnmenu = new JButton("�޴�");
		JButton btninfo = new JButton("����");
		JButton btnrev = new JButton("����");

		btnmenu.setBounds(40, 40, 100, 20);
		btnmenu.setFont(new Font("monospaced", Font.BOLD, 15));
		btnmenu.setBackground(new Color(255, 255, 255));
		btnmenu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				infot.setVisible(false);
				rev.setVisible(false);
			}
		});
		
		btninfo.setBounds(btnmenu.getBounds());
		btninfo.setLocation((int) btnmenu.getLocation().getX() + 100, // ��ư��ġ
				(int) btnmenu.getLocation().getY());
		btninfo.setFont(new Font("monospaced", Font.BOLD, 15));
		btninfo.setBackground(new Color(255, 255, 255));
		btninfo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				infot.setVisible(true);
				rev.setVisible(false);
			}
		});

		btnrev.setBounds(btninfo.getBounds());
		btnrev.setLocation((int) btninfo.getLocation().getX() + 100, // ��ư��ġ
				(int) btninfo.getLocation().getY());
		btnrev.setFont(new Font("monospaced", Font.BOLD, 15));
		btnrev.setBackground(new Color(255, 255, 255));

		
		//���� ��ư
		btnrev.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				infot.setVisible(false);
				rev.setVisible(true); 
				rev.append(c.getReview2());
				
			}
		});

		add(btnmenu);
		add(btninfo);
		add(btnrev);

		// �޴�

		ImageIcon menul = new ImageIcon(c.getMenu(0) + ".jpg");
		JLabel lblmenu1 = new JLabel(menul);
		lblmenu1.setSize(120, 120);// ����̹��� ������
		lblmenu1.setLocation(40, 75);// ����̹��� ��ġ
		add(lblmenu1);

		ImageIcon menu2 = new ImageIcon(c.getMenu(1) + ".jpg");
		JLabel lblmenu2 = new JLabel(menu2);
		lblmenu2.setBounds(lblmenu1.getBounds());
		lblmenu2.setLocation((int) lblmenu1.getLocation().getX(), // ��ư��ġ
				(int) lblmenu1.getLocation().getY() + 130);
		add(lblmenu2);

		ImageIcon menu3 = new ImageIcon(c.getMenu(2) + ".jpg");
		JLabel lblmenu3 = new JLabel(menu3);
		lblmenu3.setBounds(lblmenu1.getBounds());
		lblmenu3.setLocation((int) lblmenu2.getLocation().getX(), // ��ư��ġ
				(int) lblmenu2.getLocation().getY() + 130);
		add(lblmenu3);

		ImageIcon menu4 = new ImageIcon(c.getMenu(3) + ".jpg");
		JLabel lblmenu4 = new JLabel(menu4);
		lblmenu4.setBounds(lblmenu1.getBounds());
		lblmenu4.setLocation((int) lblmenu3.getLocation().getX(), // ��ư��ġ
				(int) lblmenu3.getLocation().getY() + 130);
		add(lblmenu4);

		// �޴� ���� �ؽ�Ʈ
		TextArea story1 = new TextArea(c.getMenu(0) + " " + c.getMenuPrice(0) + "��"
				+"\n\n" 
				+m.get(0).getFooddInfo(), 0, 0, TextArea.SCROLLBARS_NONE);

		story1.setSize(330, 120);
		story1.setLocation((int) lblmenu1.getLocation().getX() + 120, (int) lblmenu1.getLocation().getY());
		story1.setBackground(new Color(255, 255, 255));
		story1.setFont(new Font("monospaced", Font.BOLD, 16));
		add(story1);

		TextArea story2 = new TextArea(c.getMenu(1) + " " + c.getMenuPrice(1) + "��"
				+"\n\n" 
				+m.get(1).getFooddInfo(), 0, 0, TextArea.SCROLLBARS_NONE);

		story2.setBounds(story1.getBounds());
		story2.setLocation((int) lblmenu2.getLocation().getX() + 120, (int) lblmenu2.getLocation().getY());
		story2.setBackground(new Color(255, 255, 255));
		story2.setFont(new Font("monospaced", Font.BOLD, 16));
		add(story2);

		TextArea story3 = new TextArea(c.getMenu(2) + " " + c.getMenuPrice(2) + "��"
				+"\n\n" 
				+m.get(2).getFooddInfo(), 0, 0, TextArea.SCROLLBARS_NONE);

		story3.setBounds(story1.getBounds());
		story3.setLocation((int) lblmenu3.getLocation().getX() + 120, (int) lblmenu3.getLocation().getY());
		story3.setBackground(new Color(255, 255, 255));
		story3.setFont(new Font("monospaced", Font.BOLD, 16));
		add(story3);

		TextArea story4 = new TextArea(c.getMenu(3) + " " + c.getMenuPrice(3) + "��"
				+"\n\n" 
				+m.get(3).getFooddInfo(), 0, 0, TextArea.SCROLLBARS_NONE);

		story4.setBounds(story1.getBounds());
		story4.setLocation((int) lblmenu4.getLocation().getX() + 120, (int) lblmenu4.getLocation().getY());
		story4.setBackground(new Color(255, 255, 255));
		story4.setFont(new Font("monospaced", Font.BOLD, 16));
		add(story4);
		

		// ù��° �޴��� � ���������� �����ش�.
		Font f = new Font("monospaced", Font.BOLD, 20);
		TextArea j = method.getCountArea();
		j.setSize(18, 30);
		j.setLocation(511, 111);

		JButton plusCount = method.getplusbutton(1, j);
		plusCount.setSize(20, 20);
		plusCount.setLocation(530, 120);

		JButton minusCount = method.getminusbutton(1, j);
		minusCount.setSize(20, 20);
		minusCount.setLocation(490, 120);

		add(minusCount);
		add(plusCount);
		add(j);

		// �ι�°���� �ø���ư
		TextArea j1 = method.getCountArea();
		j1.setSize(18, 30);
		j1.setLocation(511, 241);

		JButton plusCount1 = method.getplusbutton(2, j1);
		plusCount1.setSize(20, 20);
		plusCount1.setLocation(530, 250);

		JButton minusCount1 = method.getminusbutton(2, j1);
		minusCount1.setSize(20, 20);
		minusCount1.setLocation(490, 250);

		add(minusCount1);
		add(plusCount1);
		add(j1);

		// ����° �ø���ư
		TextArea j2 = method.getCountArea();
		j2.setSize(18, 30);
		j2.setLocation(511, 371);

		JButton plusCount2 = method.getplusbutton(3, j2);
		plusCount2.setSize(20, 20);
		plusCount2.setLocation(530, 380);

		JButton minusCount2 = method.getminusbutton(3, j2);
		minusCount2.setSize(20, 20);
		minusCount2.setLocation(490, 380);

		add(minusCount2);
		add(plusCount2);
		add(j2);

		// �׹�° �ø���ư
		TextArea j3 = method.getCountArea();
		j3.setSize(18, 30);
		j3.setLocation(511, 501);

		JButton plusCount3 = method.getplusbutton(4, j3);
		plusCount3.setSize(20, 20);
		plusCount3.setLocation(530, 510);

		JButton minusCount3 = method.getminusbutton(4, j3);
		minusCount3.setSize(20, 20);
		minusCount3.setLocation(490, 510);

		add(minusCount3);
		add(plusCount3);
		add(j3);

		// ����ư1(����) //�� ������ ù��° �޴� ����
		JButton btnBuy = method.getbuyButton(1, j, m);
		btnBuy.setSize(60, 50);
		btnBuy.setLocation(490, 144);
		btnBuy.setBorderPainted(false);

		add(btnBuy);
		// ����ư2(����) //�� ������ �ι�° �޴� ����

		JButton btnBuy2 = method.getbuyButton(2, j1, m);

		btnBuy2.setSize(60, 50);
		btnBuy2.setLocation(490, 144 + 130);
		btnBuy2.setBorderPainted(false);
		
		add(btnBuy2);

		// �޴�3��° ����ư
		JButton btnBuy3 = method.getbuyButton(3, j2, m);

		btnBuy3.setSize(60, 50);
		btnBuy3.setLocation(490, 144 + 130 + 130);
		btnBuy3.setBorderPainted(false);
		add(btnBuy3);

		// �޴�4 ����ư
		JButton btnBuy4 = method.getbuyButton(4, j3, m);

		btnBuy4.setSize(60, 50);
		btnBuy4.setLocation(490, 144 + 130 + 130 + 130);
		btnBuy4.setBorderPainted(false);

		add(btnBuy4);

		// �ϴ� �г�
		ImageIcon org = new ImageIcon("�ڷΰ���1.png");
		ImageIcon org2 = new ImageIcon("�ڷΰ���2.png");
		ImageIcon barket = new ImageIcon("��ٱ���1.png");
		ImageIcon barket2 = new ImageIcon("��ٱ���2.png");
		JButton btnback = new JButton(org);
		JButton btnget = new JButton(barket);
		btnget.setRolloverIcon(barket2);
		btnback.setRolloverIcon(org2);
		
		btnback.setBounds(40, 600, 250, 100);
		btnback.setFont(new Font("monospaced", Font.BOLD, 26));
		btnback.setBackground(Color.WHITE);
		btnget.setBorderPainted(false);

		btnget.setBounds(btnback.getBounds());
		btnget.setLocation((int) btnback.getLocation().getX() + 265, // ��ư��ġ
				(int) btnback.getLocation().getY());
		btnget.setFont(new Font("monospaced", Font.BOLD, 26));
		btnget.setBackground(Color.WHITE);
		btnback.setBorderPainted(false);
			
		btnget.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyMenu.resetcount();
				FrameBase.getInstance(new FrameBasket()); //��ٱ��Ϸ� ���� ��ư�Դϴ�. 
			}
		});
		
		
		btnback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyMenu.resetcount();
				FrameBase.getInstance(new FrameStoreSelect()); //����ȭ��,���� ����);

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
				JOptionPane.showMessageDialog(null, "ù�������Դϴ�.");
			}
		});
		
		add(lef);
		
		
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
				JOptionPane.showMessageDialog(null, "�������������Դϴ�.");	
			}
		});
		add(rig);
		
	}

}
