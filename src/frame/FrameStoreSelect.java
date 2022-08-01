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
		
		
		// 기본 패널 설정
		setBackground(Color.WHITE);
		setLayout(null);
		setSize(600, 800);
		
		//아래에서 필요한 객체 생성
		Font font = new Font("monospaced", Font.BOLD, 15);
		FoodStoreInfo2 food = new FoodStoreInfo2();
		undone un = new undone();
		
		// 중식가게1
		ImageIcon img1 = new ImageIcon("홍콩반점0410.jpg");
		JButton btn1 = new JButton(img1);
		btn1.setName("홍콩반점0410");

		btn1.setSize(125, 125);
		btn1.setLocation(40, 50);
		
		//홍콩반점 이미지를 클릭하면 홍콩반점 가게의 정보를 담고 프레임스토어인포 패널로 간다.
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuCollect c2 = new MenuCollect();
				ArrayList<Menu> m = c2.getHonkong();
				FoodStore c1 = new FoodStoreInfo2().searchStore("홍콩반점0410");
				FrameBase.getInstance(new FrameStoreInfo(c1, m));
			}
		});

		TextArea t1 = new TextArea("중국집", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t1.setLocation(190, 50);
		t1.setSize(350, 125);
		t1.setText(food.searchStore("홍콩반점0410").getsName() + "\n\n\n" + food.searchStore("홍콩반점0410").getIntroduce());
		t1.setEditable(false);
		t1.setFont(font);

		add(t1);
		add(btn1);

		// 가게2
		JButton btn11 = un.getbutton1("중식로고1.jpg");
		TextArea t11 = un.getText1();

		add(t11);
		add(btn11);

		// 가게3
		JButton btn12 = un.getbutton2("중식로고2.jpg");
		TextArea t12 = un.getText2();

		add(t12);
		add(btn12);

		// 가게4
		JButton btn13 = un.getbutton3("중식로고3.jpg");
		TextArea t13 = un.getText3();

		add(t13);
		add(btn13);
		
		//가게5 두번째 페이지부터 있을 가게
		ImageIcon img14 = new ImageIcon("중식로고4.png");
		JButton btn14 = new JButton(img14);
		btn14.setVisible(false);
		btn14.setSize(125, 125);
		btn14.setLocation(40, 50);
		add(btn14);
		TextArea t14 = new TextArea("중국집", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t14.setLocation(190, 50);
		t14.setSize(350, 125);
		t14.setText("\n"
				+ "\n"
				+ "\n"
				+ "\t\t예시용 가게입니다!");
		t14.setEditable(false);
		t14.setVisible(false);
		t14.setFont(font);
		add(t14);
		
		// 한식가게1

		ImageIcon img2 = new ImageIcon("땅스부대찌개.png");
		JButton btn2 = new JButton(img2);
		btn2.setName("땅스부대찌개");
		btn2.setSize(125, 125);
		btn2.setLocation(40, 50);
		//이미지를 클릭하면 가게의 정보(메뉴,기타등등)를 담고 프레임스토어인포 패널로 간다.
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FoodStore c2 = new FoodStoreInfo2().searchStore("땅스부대찌개");
				MenuCollect c3 = new MenuCollect();
				ArrayList<Menu> m = c3.getBudae();
				FrameBase.getInstance(new FrameStoreInfo(c2, m));
			}
		});

		TextArea t2 = new TextArea("땅스부대찌개", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t2.setLocation(190, 50);
		t2.setSize(350, 125);
		t2.setText(food.searchStore("땅스부대찌개").getsName() + "\n\n\n" + food.searchStore("땅스부대찌개").getIntroduce());
		t2.setEditable(false);
		t2.setFont(font);

		add(t2);
		add(btn2);

		// 가게2(미구현)
		JButton btn21 = un.getbutton1("한식로고1.jpg");
		TextArea t21 = un.getText1();

		add(t21);
		add(btn21);

		// 가게3(미구현)
		JButton btn22 = un.getbutton2("한식로고2.jpg");
		TextArea t22 = un.getText2();

		add(t22);
		add(btn22);

		// 가게4(미구현)
		JButton btn23 = un.getbutton3("한식로고3.jpg");
		TextArea t23 = un.getText3();

		add(t23);
		add(btn23);
		// 양식가게1

		ImageIcon img3 = new ImageIcon("아웃백스테이크하우스.jpg");
		JButton btn3 = new JButton(img3);
		btn3.setName("아웃백스테이크하우스");
		btn3.setSize(125, 125);
		btn3.setLocation(40, 50);
		//이미지를 클릭하면 가게의 정보(메뉴,기타등등)를 담고 프레임스토어인포 패널로 간다.
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FoodStore c3 = new FoodStoreInfo2().searchStore("아웃백스테이크하우스");
				MenuCollect c2 = new MenuCollect();
				ArrayList<Menu> m = c2.getOutback();
				FrameBase.getInstance(new FrameStoreInfo(c3, m));
			}
		});

		TextArea t3 = new TextArea("아웃백스테이크하우스", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t3.setLocation(190, 50);
		t3.setSize(350, 125);
		t3.setText(
				food.searchStore("아웃백스테이크하우스").getsName() + "\n\n\n" + food.searchStore("아웃백스테이크하우스").getIntroduce());
		t3.setEditable(false);
		t3.setFont(font);

		add(t3);
		add(btn3);

		// 가게2(미구현)
		JButton btn31 = un.getbutton1("양식로고1.jpg");
		TextArea t31 = un.getText1();

		add(t31);
		add(btn31);

		// 가게3(미구현)
		JButton btn32 = un.getbutton2("양식로고2.jpg");
		TextArea t32 = un.getText2();

		add(t32);
		add(btn32);

		// 가게4(미구현)
		JButton btn33 = un.getbutton3("양식로고3.png");
		TextArea t33 = un.getText3();

		add(t33);
		add(btn33);

		// 치킨 가게
		ImageIcon img4 = new ImageIcon("교촌치킨.jpg");
		JButton btn4 = new JButton(img4);
		btn4.setName("교촌치킨");
		btn4.setSize(125, 125);
		btn4.setLocation(40, 50);
		//이미지를 클릭하면 가게의 정보(메뉴,기타등등)를 담고 프레임스토어인포 패널로 간다.
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FoodStore c4 = new FoodStoreInfo2().searchStore("교촌치킨");
				MenuCollect c2 = new MenuCollect();
				ArrayList<Menu> m = c2.getChieken();
				FrameBase.getInstance(new FrameStoreInfo(c4, m));
			}
		});

		TextArea t4 = new TextArea("교촌치킨", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		t4.setLocation(190, 50);
		t4.setSize(350, 125);
		t4.setText(food.searchStore("교촌치킨").getsName() + "\n\n\n" + food.searchStore("교촌치킨").getIntroduce());
		t4.setEditable(false);
		t4.setFont(font);

		add(t4);
		add(btn4);

		// 가게2(미구현)
		JButton btn41 = un.getbutton1("치킨로고1.png");
		TextArea t41 = un.getText1();

		add(t41);
		add(btn41);

		// 가게3(미구현)
		JButton btn42 = un.getbutton2("치킨로고2.jpg");
		TextArea t42 = un.getText2();

		add(t42);
		add(btn42);

		// 가게4(미구현)
		JButton btn43 = un.getbutton3("치킨로고3.jpg");
		TextArea t43 = un.getText3();

		add(t43);
		add(btn43);
		
		
		//상단의 체크박스 구현
		CheckboxGroup group = new CheckboxGroup(); // 그룹형식 중식,한식,양식,치킨 1가지 체크 가능
		Label question = new Label("오늘 내가 먹고 싶은 음식은?! ");
		Checkbox chinese = new Checkbox("중식", group, true);
		Checkbox korean = new Checkbox("한식", group, false);
		Checkbox american = new Checkbox("양식", group, false);
		Checkbox chicken = new Checkbox("치킨", group, false);
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
		
		//위에 가게 버튼~ 텍스트를 모두 담음
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
		
		
		
		//체크박스 아이템버튼을 이용, 위에 j t를 이용해서 중식을 체크하면 다른 패널은 보이지 않게 감춘다. 다른경우도 마찬가지다
		
		//중식만 보이게
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
		
		//한식만 보이게
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
		//양식만 보이게
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
		//치킨만 보이게
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
		
		// 체크박스 구성을 패널에 담음.,
		add(question);
		add(chinese);
		add(korean);
		add(american);
		add(chicken);
		setEnabled(true);

		// 하단 버튼 구성
		// 하단 패널
		ImageIcon org = new ImageIcon("뒤로가기1.png");
		ImageIcon org2 = new ImageIcon("뒤로가기2.png");
		ImageIcon barket = new ImageIcon("장바구니1.png");
		ImageIcon barket2 = new ImageIcon("장바구니2.png");
		JButton btnback = new JButton(org);
		JButton btnget = new JButton(barket);
		btnget.setRolloverIcon(barket2);
		btnback.setRolloverIcon(org2);
		btnback.setToolTipText("이전화면으로 돌아갑니다");
		
		btnback.setBounds(40, 600, 250, 100);
		btnback.setFont(new Font("monospaced", Font.BOLD, 26));
		btnget.setBorderPainted(false);

		btnget.setBounds(btnback.getBounds());
		btnget.setLocation((int) btnback.getLocation().getX() + 265, // 버튼위치
				(int) btnback.getLocation().getY());
		btnget.setFont(new Font("monospaced", Font.BOLD, 26));
		btnback.setBorderPainted(false);
			
		btnget.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyMenu.resetcount();
				FrameBase.getInstance(new FrameBasket()); //<<<<<<<<<<<<<<<장바구니로 가는 버튼입니다!!! 
			}
		});
		
		
		btnback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MyMenu.resetcount();
				FrameBase.getInstance(new DeliveryC()); //<<<<<<<<<<<<< 메인으로 돌아가는 버튼입니다!! 

			}
		});
		
		add(btnback);
		add(btnget);
		
		//화면 좌우전환 버튼
				//좌버튼
				ImageIcon left= new ImageIcon("좌버튼.png");
				ImageIcon left2= new ImageIcon("좌버튼2.png");
				JButton lef= new JButton(left);
				lef.setRolloverIcon(left2);
				lef.setSize(40,22);
				lef.setLocation(0, 144 + 130 + 130 + 130+48);
				lef.setBorderPainted(false);
				lef.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(j[0].isVisible()||j[1].isVisible()||j[2].isVisible()||j[3].isVisible()) {
						JOptionPane.showMessageDialog(null, "첫페이지입니다.");
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
				
				//우버튼
				ImageIcon right= new ImageIcon("우버튼.png");
				ImageIcon right2= new ImageIcon("우버튼2.png");
				JButton rig= new JButton(right);
				rig.setRolloverIcon(right2);
				rig.setSize(40,22);
				rig.setLocation(540, 144 + 130 + 130 + 130+48);
				rig.setBorderPainted(false);
				rig.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(j[15].isVisible()||j[12].isVisible()||j[9].isVisible()||j[16].isVisible()) {
						JOptionPane.showMessageDialog(null, "마지막페이지입니다.");
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
