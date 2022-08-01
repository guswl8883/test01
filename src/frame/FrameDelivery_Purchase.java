package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import food.MyMenu;


//최종결제단계
public class FrameDelivery_Purchase extends JPanel {
	
	public FrameDelivery_Purchase () {
		
		ImageIcon bk1 = new ImageIcon("뒤로가기1.png");
		ImageIcon bk2 = new ImageIcon("뒤로가기2.png");
		ImageIcon p1 = new ImageIcon("결제하기.png");
		ImageIcon p2 = new ImageIcon("결제하기2.png");
		setBackground(new Color(255,255,255)); //배경색 
		setLayout(null);
		setSize(600,800);
		
		int total =0;
		for(int i = 0 ; i< MyMenu.buylist.size(); i++) {
			total += MyMenu.buylist.get(i).getPrice() * MyMenu.buylist.get(i).getCount();
		}
		
		//폰트 
		Font font = (new Font("MONOSPACED", Font.BOLD , 15));
		
		//주문내역
		
		JPanel b1 = new JPanel(); 
		b1.setLayout(new GridLayout(1, 5));
		b1.setBounds(40, 20, 500, 120); 
		b1.setBackground(new Color(255,255,255));
		b1.setBorder(
			new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "주문내역", 
			TitledBorder.LEADING, 
			TitledBorder.TOP, 
			new Font("MONOSPACED", Font.BOLD , 17), 
			new Color(000, 000, 000) ));
			add(b1);
			
			TextArea MyMenu = new TextArea(""
					+ "결제금액 : " +	total+" 원", 0,0,TextArea.SCROLLBARS_NONE);
			b1.add(MyMenu);
			
		// 사장님 요청사항 
		JPanel b2 = new JPanel(); 
		b2.setLayout(new GridLayout(1, 5));
		b2.setBounds(40, 150, 500, 70); 
		b2.setBackground(new Color(255,255,255));
		b2.setBorder(
			new TitledBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY),"가게사장님께",
			TitledBorder.LEADING, 
			TitledBorder.TOP,
			new Font("MONOSPACED", Font.BOLD , 17), 
			new Color(000, 000, 000) ))); 
			add(b2);

			TextField req = new TextField(("예) 단무지 많이 주세요!!"), 30);
			b2.add(req);
			
			req.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					if(req.getText().equals("예) 단무지 많이 주세요!!")) {
						req.setText("");
					}
				}
			});
			
			
		//배송지 입력
		
		JPanel b3 = new JPanel(); // 배송지 패널 생성
		b3.setLayout(new GridLayout(5, 5));
		b3.setBounds(40, 250, 500, 180); // , ,가로넓이
		b3.setBackground(new Color(255,255,255));
		b3.setBorder(
			new TitledBorder( new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), //테두리없음
			"배달정보", //내용
			TitledBorder.LEADING, //텍스트 정렬방식:양쪽정렬
			TitledBorder.TOP, //텍스트 표시 위치 : 상단
			new Font("MONOSPACED", Font.BOLD , 20), //폰트 지정안함
			new Color(000, 000, 000) )); //색상
			add(b3);
			
		// 주소
				JLabel label = new JLabel();
				TextField adress = new TextField();
				b3.add(new Label("주소"));	
				b3.add(adress);
				
		// 전화번호 		
				TextField phone = new TextField();
				b3.add(new Label("번호"));
				b3.add(phone);
		// 완료		
				JButton btn = new JButton("입력");
				btn.setBackground(Color.orange);
				b3.add(btn);
				btn.setEnabled(false);
				
		// 완료 버튼 활성화 		
				adress.addTextListener(new TextListener() {
					
					@Override
					public void textValueChanged(TextEvent e) { //글자를 칠때 입력할 수 있게 풀어줄께
						
						if(btn.getText().equals("")){ //내용이 없으면 
							btn.setEnabled(false); //버튼 잠금
							
						}
					}
				});
				phone.addTextListener(new TextListener() {
					
					@Override
					public void textValueChanged(TextEvent e) { //글자를 칠때 입력할 수 있게 풀어줄께
						
						if(btn.getText().equals("")){ //내용이 없으면 
							btn.setEnabled(false); //버튼 잠금
							
						}else{
							btn.setEnabled(true);// 그렇지 않으면 버튼 활성화
						}
					}
				});
				
				//결제하기 버튼
				JButton btnBuy = new JButton(p1);
				//btnBuy.setBorderPainted(false);
				btnBuy.setEnabled(false);
				
				btnBuy.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
							JOptionPane.showMessageDialog(
						 null , "              주문성공!!"+"\n");
							
					FrameBase.getInstance(new FrameStoreSelect());
						
					}
					
				});
			
				
		//배송지 입력 값
				TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_NONE);
				ta.setBounds(42,440,500,50);
	            ta.setBackground(new Color(255,255,255));
	            ta.setFont(font);
	            ta.setEditable(false);      
	            add(ta);	
	            btn.addActionListener(new ActionListener() {
	    			
	    			@Override
	    			public void actionPerformed(ActionEvent e) {
	    				
	    				btnBuy.setEnabled(true);
	    				ta.append("주소 : " + adress.getText()+"\n");
	    				adress.setText("");
	    				ta.append("번호 : " + phone.getText()+"\n");
	    				phone.setText("");
	    				phone.requestFocus();
	    			}
	    			
	    		});
				
		// 결제수단 
				JPanel b4 = new JPanel(); 
				b4.setLayout(new FlowLayout());
				b4.setBounds(40, 500, 500, 70);
				b4.setBackground(new Color(255,255,255));
				b4.setBorder(
						new TitledBorder( new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), //테두리없음
						"결제수단", //내용
						TitledBorder.LEADING, //텍스트 정렬방식:양쪽정렬
						TitledBorder.TOP, //텍스트 표시 위치 : 상단
						new Font("MONOSPACED", Font.BOLD , 20), 
						new Color(000, 000, 000)));
						add(b4);
				
				Label laber3 = new Label("결제수단");
				CheckboxGroup group = new CheckboxGroup();
				Checkbox card = new Checkbox("카드", group,true);
				Checkbox money = new Checkbox("현금",group,false);
				Checkbox orgpay = new Checkbox("orangePay",group,false);
			
				
				Font font2 = (new Font("MONOSPACED", Font.BOLD , 25));
			
				b4.add(card);
				b4.add(money);
				b4.add(orgpay);
				
				b4.setVisible(true);
				
		
		//뒤로가기 버튼
				
				JButton btnBack = new JButton(bk1);
				JButton btnBack2 = new JButton(bk2);
				btnBack.setBorderPainted(false); //버튼테두리없앰
				btnBack.setRolloverIcon(bk2); //마우스 올리면 이미지 변경됨
				btnBack2.setBorderPainted(false); 
				btnBack.setBackground(new Color(255,255,255));
				btnBack.setSize(250, 100);
				btnBack.setLocation(40, 600);
				add(btnBack);
				
				btnBack.addActionListener(new ActionListener() {
			
					@Override
					public void actionPerformed(ActionEvent e) {
						FrameBase.getInstance(new FrameBasket()); 
					}
				});
				
				btnBuy.setBackground(new Color(255,255,255));
				btnBuy.setSize(250, 100);
				btnBuy.setLocation(300, 600);
				
				btnBuy.setBorderPainted(false); //버튼테두리없앰
				btnBuy.setRolloverIcon(p2); //마우스 올리면 이미지 변경됨
				
				
				add(btnBuy);
							
				

	}//생성자/

}