package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;

import food.MyMenu;

public class FrameBasket extends JPanel {
	
	public FrameBasket() {
		//Queue 오류 막기위한것
		if(MyMenu.buylist.isEmpty()) {
			JOptionPane.showMessageDialog(null, "현재 장바구니가 비어있습니다");
		}
		
		//JPanel 구조
		setBackground(Color.white);
		setLayout(null);
		setSize(600, 800);
		
		//폰트
		Font font15 = (new Font("MONOSPACED", Font.BOLD , 15));
		Font font17 = (new Font("MONOSPACED", Font.BOLD , 17));
		
		//장바구니 틀
		JPanel basket = new JPanel(); 
		basket.setLayout(new GridLayout(1, 5));
		basket.setBounds(20, 10, 540, 550); 
		basket.setBackground(Color.white);
		basket.setBorder(new TitledBorder( null, "장바구니", TitledBorder.LEADING, TitledBorder.TOP, new Font("MONOSPACED", Font.BOLD , 25), new Color(000, 000, 000) ));
		
		//번호, 상풍명, 판매가, 수량, 주문금액
		JLabel abcde = new JLabel("수량   판매가격    주문금액  상품명");
		//abcde.setLocation(50,60);
		abcde.setBounds(50, -10, 500, 200);
		abcde.setFont(font17);
		add(abcde);
		
		//그냥 하나씩 다하기 16개의 패널을 만들어두고 Str값 넣기 이제 사이즈만큼 for문을 돌리고 거기서 그만큼 꺼내서 대입
		if(!MyMenu.buylist.isEmpty()) {
			for(int z=0; z<MyMenu.buylist.size(); z++) {
				switch(z) {
		
				case 0 :
					String Str0 = ""; 
					Str0 +="        " + MyMenu.buylist.get(0).getPrice() + "원       "  + MyMenu.buylist.get(0).getPrice() * MyMenu.buylist.get(0).getCount() + "원     " + MyMenu.buylist.get(0).getName();
					JLabel a = new JLabel(Str0); 
					a.setBounds(50, 15, 500, 200);
					a.setFont(font15);
					add(a);
					
					int asp1 = 0 ;
					asp1 += MyMenu.buylist.get(0).getCount();
					JSpinner aa = new JSpinner();
					aa.setValue(asp1);
					aa.setLocation(50, 100);
					aa.setSize(50, 25);
					add(aa);
					
					JButton aaa = new JButton();
					aaa.setLocation(25, 100);
					aaa.setSize(20,20);
					aaa.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int aaaa = (Integer)aa.getValue();
							if(aaaa>0 && aaaa<10) {
							
								if(aaaa > MyMenu.buylist.get(0).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(aaaa == MyMenu.buylist.get(0).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(0).minusCount(aaaa);
									MyMenu.buylist.remove(0);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(aaaa < MyMenu.buylist.get(0).getCount()) {
									MyMenu.buylist.get(0).minusCount(aaaa);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(aaa);
					break;
		
				case 1 :
					String Str1 = "";
					Str1 += "        " + MyMenu.buylist.get(1).getPrice() + "원       "  + MyMenu.buylist.get(1).getPrice() * MyMenu.buylist.get(1).getCount() + "원     " + MyMenu.buylist.get(1).getName();
					JLabel b = new JLabel(Str1);
					b.setBounds(50, 40, 500, 200);
					b.setFont(font15);
					add(b);
					
					int bsp1 = 0 ;
					bsp1 += MyMenu.buylist.get(1).getCount();
					JSpinner bb = new JSpinner();
					bb.setValue(bsp1);
					bb.setLocation(50, 125);
					bb.setSize(50, 25);
					add(bb);
					
					JButton bbb = new JButton();
					bbb.setLocation(25, 125);
					bbb.setSize(20,20);
					bbb.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int bbbb = (Integer)bb.getValue();							
							if(bbbb>0 && bbbb<10) {
								
								if(bbbb > MyMenu.buylist.get(1).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(bbbb == MyMenu.buylist.get(1).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(1).minusCount(bbbb);
									MyMenu.buylist.remove(1);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(bbbb < MyMenu.buylist.get(1).getCount()) {
									MyMenu.buylist.get(1).minusCount(bbbb);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(bbb);
					
					break;
		
				case 2 :
					String Str2 = "";
					Str2 += "        " + MyMenu.buylist.get(2).getPrice() + "원       "  + MyMenu.buylist.get(2).getPrice() * MyMenu.buylist.get(2).getCount() + "원     " + MyMenu.buylist.get(2).getName();
					JLabel c = new JLabel(Str2);
					c.setBounds(50, 65, 500, 200); // 좌표값 수정
					c.setFont(font15);
					add(c);
					
					int csp1 = 0 ;
					csp1 += MyMenu.buylist.get(2).getCount();
					JSpinner cc = new JSpinner();
					cc.setValue(csp1);
					cc.setLocation(50, 150);
					cc.setSize(50, 25);
					add(cc);
					
					JButton ccc = new JButton();
					ccc.setLocation(25, 150);
					ccc.setSize(20,20);
					ccc.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int cccc = (Integer)cc.getValue();							
							if(cccc>0 && cccc<10) {
								
								if(cccc > MyMenu.buylist.get(2).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(cccc == MyMenu.buylist.get(2).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(2).minusCount(cccc);
									MyMenu.buylist.remove(2);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(cccc < MyMenu.buylist.get(2).getCount()) {
									MyMenu.buylist.get(2).minusCount(cccc);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(ccc);
					
					break;
		
				case 3 :
					String Str3 = "";
					Str3 += "        " + MyMenu.buylist.get(3).getPrice() + "원       "  + MyMenu.buylist.get(3).getPrice() * MyMenu.buylist.get(3).getCount() + "원     " + MyMenu.buylist.get(3).getName();
					JLabel d = new JLabel(Str3);
					d.setBounds(50, 90, 500, 200); // 좌표값 수정
					d.setFont(font15);
					add(d);
					
					int dsp1 = 0 ;
					dsp1 += MyMenu.buylist.get(3).getCount();
					JSpinner dd = new JSpinner();
					dd.setValue(dsp1);
					dd.setLocation(50, 175);
					dd.setSize(50, 25);
					add(dd);
					
					JButton ddd = new JButton();
					ddd.setLocation(25, 175);
					ddd.setSize(20,20);
					ddd.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int dddd = (Integer)dd.getValue();							
							if(dddd>0 && dddd<10) {
								
								if(dddd > MyMenu.buylist.get(3).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(dddd == MyMenu.buylist.get(3).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(3).minusCount(dddd);
									MyMenu.buylist.remove(3);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(dddd < MyMenu.buylist.get(3).getCount()) {
									MyMenu.buylist.get(3).minusCount(dddd);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(ddd);
					
					break;
		
				case 4 :
					String Str4 = "";
					Str4 +=  "        " + MyMenu.buylist.get(4).getPrice() + "원       "  + MyMenu.buylist.get(4).getPrice() * MyMenu.buylist.get(4).getCount() + "원     " + MyMenu.buylist.get(4).getName();
					JLabel e = new JLabel(Str4);
					e.setBounds(50, 115, 500, 200); // 좌표값 수정
					e.setFont(font15);
					add(e);
					
					int esp1 = 0 ;
					esp1 += MyMenu.buylist.get(4).getCount();
					JSpinner ee = new JSpinner();
					ee.setValue(esp1);
					ee.setLocation(50, 200);
					ee.setSize(50, 25);
					add(ee);
					
					JButton eee = new JButton();
					eee.setLocation(25, 200);
					eee.setSize(20,20);
					eee.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int eeee = (Integer)ee.getValue();							
							if(eeee>0 && eeee<10) {
								
								if(eeee > MyMenu.buylist.get(4).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(eeee == MyMenu.buylist.get(4).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(4).minusCount(eeee);
									MyMenu.buylist.remove(4);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(eeee < MyMenu.buylist.get(4).getCount()) {
									MyMenu.buylist.get(4).minusCount(eeee);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(eee);
					
					break;
		
				case 5 :
					String Str5 = "";
					Str5 +=  "        " + MyMenu.buylist.get(5).getPrice() + "원       "  + MyMenu.buylist.get(5).getPrice() * MyMenu.buylist.get(5).getCount() + "원     " + MyMenu.buylist.get(5).getName();
					JLabel f = new JLabel(Str5);
					f.setBounds(50, 140, 500, 200); // 좌표값 수정
					f.setFont(font15);
					add(f);
					
					int fsp1 = 0 ;
					fsp1 += MyMenu.buylist.get(5).getCount();
					JSpinner ff = new JSpinner();
					ff.setValue(fsp1);
					ff.setLocation(50, 225);
					ff.setSize(50, 25);
					add(ff);
					
					JButton fff = new JButton();
					fff.setLocation(25, 225);
					fff.setSize(20,20);
					fff.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int ffff = (Integer)ff.getValue();							
							if(ffff>0 && ffff<10) {
								
								if(ffff > MyMenu.buylist.get(5).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(ffff == MyMenu.buylist.get(5).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(5).minusCount(ffff);
									MyMenu.buylist.remove(5);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(ffff < MyMenu.buylist.get(5).getCount()) {
									MyMenu.buylist.get(5).minusCount(ffff);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(fff);
					
					break;
		
				case 6 :
					String Str6 = "";
					Str6 += "        " + MyMenu.buylist.get(6).getPrice() + "원       "  + MyMenu.buylist.get(6).getPrice() * MyMenu.buylist.get(6).getCount() + "원     " + MyMenu.buylist.get(6).getName();
					JLabel g = new JLabel(Str6);
					g.setBounds(50, 165, 500, 200); // 좌표값 수정
					g.setFont(font15);
					add(g);
					
					int gsp1 = 0 ;
					gsp1 += MyMenu.buylist.get(6).getCount();
					JSpinner gg = new JSpinner();
					gg.setValue(gsp1);
					gg.setLocation(50, 250);
					gg.setSize(50, 25);
					add(gg);
					
					JButton ggg = new JButton();
					ggg.setLocation(25, 250);
					ggg.setSize(20,20);
					ggg.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int gggg = (Integer)gg.getValue();							
							if(gggg>0 && gggg<10) {
								
								if(gggg > MyMenu.buylist.get(6).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(gggg == MyMenu.buylist.get(6).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(6).minusCount(gggg);
									MyMenu.buylist.remove(6);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(gggg < MyMenu.buylist.get(6).getCount()) {
									MyMenu.buylist.get(6).minusCount(gggg);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(ggg);
					
					break;
		
				case 7 :
					String Str7 = "";
					Str7 += "        " + MyMenu.buylist.get(7).getPrice() + "원       "  + MyMenu.buylist.get(7).getPrice() * MyMenu.buylist.get(7).getCount() + "원     " + MyMenu.buylist.get(7).getName();
					JLabel h = new JLabel(Str7);
					h.setBounds(50, 190, 500, 200); // 좌표값 수정
					h.setFont(font15);
					add(h);
					
					int hsp1 = 0 ;
					hsp1 += MyMenu.buylist.get(7).getCount();
					JSpinner hh = new JSpinner();
					hh.setValue(hsp1);
					hh.setLocation(50, 275);
					hh.setSize(50, 25);
					add(hh);
					
					JButton hhh = new JButton();
					hhh.setLocation(25, 275);
					hhh.setSize(20,20);
					hhh.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int hhhh = (Integer)hh.getValue();							
							if(hhhh>0 && hhhh<10) {
								
								if(hhhh > MyMenu.buylist.get(7).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(hhhh == MyMenu.buylist.get(7).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(7).minusCount(hhhh);
									MyMenu.buylist.remove(7);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(hhhh < MyMenu.buylist.get(7).getCount()) {
									MyMenu.buylist.get(7).minusCount(hhhh);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(hhh);
					
					break;
		
				case 8 :
					String Str8 = "";
					Str8 += "        " + MyMenu.buylist.get(8).getPrice() + "원       "  + MyMenu.buylist.get(8).getPrice() * MyMenu.buylist.get(8).getCount() + "원     " + MyMenu.buylist.get(8).getName();
					JLabel i = new JLabel(Str8);
					i.setBounds(50, 215, 500, 200); // 좌표값 수정
					i.setFont(font15);
					add(i);
					
					int isp1 = 0 ;
					isp1 += MyMenu.buylist.get(8).getCount();
					JSpinner ii = new JSpinner();
					ii.setValue(isp1);
					ii.setLocation(50, 300);
					ii.setSize(50, 25);
					add(ii);
					
					JButton iii = new JButton();
					iii.setLocation(25, 300);
					iii.setSize(20,20);
					iii.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int iiii = (Integer)ii.getValue();							
							if(iiii>0 && iiii<10) {
								
								if(iiii > MyMenu.buylist.get(8).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(iiii == MyMenu.buylist.get(8).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(8).minusCount(iiii);
									MyMenu.buylist.remove(8);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(iiii < MyMenu.buylist.get(8).getCount()) {
									MyMenu.buylist.get(8).minusCount(iiii);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(iii);
					
					break;
		
				case 9 :
					String Str9 = "";
					Str9 += "        " + MyMenu.buylist.get(9).getPrice() + "원       "  + MyMenu.buylist.get(9).getPrice() * MyMenu.buylist.get(9).getCount() + "원     " + MyMenu.buylist.get(9).getName();
					JLabel j = new JLabel(Str9);
					j.setBounds(50, 240, 500, 200); // 좌표값 수정
					j.setFont(font15);
					add(j);
					
					int jsp1 = 0 ;
					jsp1 += MyMenu.buylist.get(9).getCount();
					JSpinner jj = new JSpinner();
					jj.setValue(jsp1);
					jj.setLocation(50, 325);
					jj.setSize(50, 25);
					add(jj);
					
					JButton jjj = new JButton();
					jjj.setLocation(25, 325);
					jjj.setSize(20,20);
					jjj.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int jjjj = (Integer)jj.getValue();							
							if(jjjj>0 && jjjj<10) {
								
								if(jjjj > MyMenu.buylist.get(9).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(jjjj == MyMenu.buylist.get(9).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(9).minusCount(jjjj);
									MyMenu.buylist.remove(9);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(jjjj < MyMenu.buylist.get(9).getCount()) {
									MyMenu.buylist.get(9).minusCount(jjjj);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(jjj);
					
					break;
		
				case 10 :
					String Str10 = "";
					Str10 += "        " + MyMenu.buylist.get(10).getPrice() + "원       "  + MyMenu.buylist.get(10).getPrice() * MyMenu.buylist.get(10).getCount() + "원     " + MyMenu.buylist.get(10).getName();
					JLabel k = new JLabel(Str10);
					k.setBounds(50, 265, 500, 200); // 좌표값 수정
					k.setFont(font15);
					add(k);
					
					int ksp1 = 0 ;
					ksp1 += MyMenu.buylist.get(10).getCount();
					JSpinner kk = new JSpinner();
					kk.setValue(ksp1);
					kk.setLocation(50, 350);
					kk.setSize(50, 25);
					add(kk);
					
					JButton kkk = new JButton();
					kkk.setLocation(25, 350);
					kkk.setSize(20,20);
					kkk.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int kkkk = (Integer)kk.getValue();							
							if(kkkk>0 && kkkk<10) {
								
								if(kkkk > MyMenu.buylist.get(10).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(kkkk == MyMenu.buylist.get(10).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(10).minusCount(kkkk);
									MyMenu.buylist.remove(10);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(kkkk < MyMenu.buylist.get(10).getCount()) {
									MyMenu.buylist.get(10).minusCount(kkkk);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(kkk);
					
					break;
		
				case 11 :
					String Str11 = "";
					Str11 += "        " + MyMenu.buylist.get(11).getPrice() + "원       "  + MyMenu.buylist.get(11).getPrice() * MyMenu.buylist.get(11).getCount() + "원     " + MyMenu.buylist.get(11).getName();
					JLabel l = new JLabel(Str11);
					l.setBounds(50, 290, 500, 200); // 좌표값 수정
					l.setFont(font15);
					add(l);
					
					int lsp1 = 0 ;
					lsp1 += MyMenu.buylist.get(11).getCount();
					JSpinner ll = new JSpinner();
					ll.setValue(lsp1);
					ll.setLocation(50, 375);
					ll.setSize(50, 25);
					add(ll);
					
					JButton lll = new JButton();
					lll.setLocation(25, 375);
					lll.setSize(20,20);
					lll.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int llll = (Integer)ll.getValue();							
							if(llll>0 && llll<10) {
								
								if(llll > MyMenu.buylist.get(11).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(llll == MyMenu.buylist.get(11).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(11).minusCount(llll);
									MyMenu.buylist.remove(11);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(llll < MyMenu.buylist.get(11).getCount()) {
									MyMenu.buylist.get(11).minusCount(llll);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(lll);
					
					break;
		
				case 12 :
					String Str12 = "";
					Str12 += "        " + MyMenu.buylist.get(12).getPrice() + "원       "  + MyMenu.buylist.get(12).getPrice() * MyMenu.buylist.get(12).getCount() + "원     " + MyMenu.buylist.get(12).getName();
					JLabel m = new JLabel(Str12);
					m.setBounds(50, 315, 500, 200); // 좌표값 수정
					m.setFont(font15);
					add(m);
					
					int msp1 = 0 ;
					msp1 += MyMenu.buylist.get(12).getCount();
					JSpinner mm = new JSpinner();
					mm.setValue(msp1);
					mm.setLocation(50, 400);
					mm.setSize(50, 25);
					add(mm);
					
					JButton mmm = new JButton();
					mmm.setLocation(25, 400);
					mmm.setSize(20,20);
					mmm.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int mmmm = (Integer)mm.getValue();							
							if(mmmm>0 && mmmm<10) {
								
								if(mmmm > MyMenu.buylist.get(12).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(mmmm == MyMenu.buylist.get(12).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(12).minusCount(mmmm);
									MyMenu.buylist.remove(12);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(mmmm < MyMenu.buylist.get(12).getCount()) {
									MyMenu.buylist.get(12).minusCount(mmmm);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(mmm);
					
					break;
		
				case 13 :
					String Str13 = "";
					Str13 += "        " + MyMenu.buylist.get(13).getPrice() + "원       "  + MyMenu.buylist.get(13).getPrice() * MyMenu.buylist.get(13).getCount() + "원     " + MyMenu.buylist.get(13).getName();
					JLabel n = new JLabel(Str13);
					n.setBounds(50, 340, 500, 200); // 좌표값 수정
					n.setFont(font15);
					add(n);
					
					int nsp1 = 0 ;
					nsp1 += MyMenu.buylist.get(13).getCount();
					JSpinner nn = new JSpinner();
					nn.setValue(nsp1);
					nn.setLocation(50, 425);
					nn.setSize(50, 25);
					add(nn);
					
					JButton nnn = new JButton();
					nnn.setLocation(25, 425);
					nnn.setSize(20,20);
					nnn.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int nnnn = (Integer)nn.getValue();							
							if(nnnn>0 && nnnn<10) {
								
								if(nnnn > MyMenu.buylist.get(13).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(nnnn == MyMenu.buylist.get(13).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(13).minusCount(nnnn);
									MyMenu.buylist.remove(13);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(nnnn < MyMenu.buylist.get(13).getCount()) {
									MyMenu.buylist.get(13).minusCount(nnnn);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(nnn);
					
					break;
		
				case 14 :
					String Str14 = "";
					Str14 += "        " + MyMenu.buylist.get(14).getPrice() + "원       "  + MyMenu.buylist.get(14).getPrice() * MyMenu.buylist.get(14).getCount() + "원     " + MyMenu.buylist.get(14).getName();
					JLabel o = new JLabel(Str14);
					o.setBounds(50, 365, 500, 200); // 좌표값 수정
					o.setFont(font15);
					add(o);
					
					int osp1 = 0 ;
					osp1 += MyMenu.buylist.get(14).getCount();
					JSpinner oo = new JSpinner();
					oo.setValue(osp1);
					oo.setLocation(50, 450);
					oo.setSize(50, 25);
					add(oo);
					
					JButton ooo = new JButton();
					ooo.setLocation(25, 450);
					ooo.setSize(20,20);
					ooo.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int oooo = (Integer)oo.getValue();							
							if(oooo>0 && oooo<10) {
								
								if(oooo > MyMenu.buylist.get(14).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(oooo == MyMenu.buylist.get(14).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(14).minusCount(oooo);
									MyMenu.buylist.remove(14);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(oooo < MyMenu.buylist.get(14).getCount()) {
									MyMenu.buylist.get(14).minusCount(oooo);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(ooo);
					
					break;
					
				case 15 :
					String Str15 = "";
					Str15 += "        " + MyMenu.buylist.get(15).getPrice() + "원       "  + MyMenu.buylist.get(15).getPrice() * MyMenu.buylist.get(15).getCount() + "원     " + MyMenu.buylist.get(15).getName();
					JLabel p = new JLabel(Str15);
					p.setBounds(50, 390, 500, 200); // 좌표값 수정
					p.setFont(font15);
					add(p);
					
					int psp1 = 0 ;
					psp1 += MyMenu.buylist.get(15).getCount();
					JSpinner pp = new JSpinner();
					pp.setValue(psp1);
					pp.setLocation(50, 475);
					pp.setSize(50, 25);
					add(pp);
					
					JButton ppp = new JButton();
					ppp.setLocation(25, 45);
					ppp.setSize(20,20);
					ppp.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							int pppp = (Integer)pp.getValue();							
							if(pppp>0 && pppp<10) {
								
								if(pppp > MyMenu.buylist.get(15).getCount()) {
									JOptionPane.showMessageDialog(null, "수량을 초과했습니다");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(pppp == MyMenu.buylist.get(15).getCount()) {
									JOptionPane.showMessageDialog(null, "장바구니에서 제외됬습니다");
									MyMenu.buylist.get(15).minusCount(pppp);
									MyMenu.buylist.remove(15);
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
								else if(pppp < MyMenu.buylist.get(15).getCount()) {
									MyMenu.buylist.get(15).minusCount(pppp);
									JOptionPane.showMessageDialog(null, "수량이 정상 변경 됬습니다.");
									FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "1-9까지의 수량을 입력해주세요");
								FrameBase.getInstance(new FrameBasket()); //다시 창띄우기
							}
						}
					});
					add(ppp);
					
					break;
				}
			}
		}

		ImageIcon begin1 = new ImageIcon("처음으로.png");
		ImageIcon begin2 = new ImageIcon("처음으로2.png");
		ImageIcon payment1 = new ImageIcon("결제하기.png");
		ImageIcon payment2 = new ImageIcon("결제하기2.png");
		
		JButton begin = new JButton(begin1);
		begin.setRolloverIcon(begin2);
		begin.setBorderPainted(true);
		
		JButton payment = new JButton(payment1);
		payment.setRolloverIcon(payment2);
		payment.setBorderPainted(true);

		begin.setBorder(null);
		payment.setBorder(null);
		begin.setBounds(40,600,250,100);
			
		begin.setFont(new Font("MONOSPACED", Font.BOLD, 20));
		payment.setSize(250, 100);
		payment.setLocation(
                (int)begin.getLocation().getX()+265,//버튼위치
                (int)begin.getLocation().getY());
		payment.setFont(new Font("MONOSPACED", Font.BOLD, 20));
		
		//버튼 이벤트(처음으로, 결제하기)
		begin.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				//일단 테스트용
				FrameBase.getInstance(new DeliveryC());
			}
		});
		payment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(MyMenu.buylist.isEmpty()) {
					JOptionPane.showMessageDialog(null, "장바구니가 비어있습니다");
					FrameBase.getInstance(new FrameStoreSelect());
				}
				
			else if(!MyMenu.buylist.isEmpty()) {
				FrameBase.getInstance(new FrameDelivery_Purchase());
				}
				
				}
			});
		
		add(begin); //처음버튼
		add(payment); //결제버튼
		add(abcde); // 이게 덮어써서 뒤로
		add(basket); // 이게 덮어써서 제일 마지막에 추가
		
	}
}