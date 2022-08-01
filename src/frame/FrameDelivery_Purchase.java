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


//���������ܰ�
public class FrameDelivery_Purchase extends JPanel {
	
	public FrameDelivery_Purchase () {
		
		ImageIcon bk1 = new ImageIcon("�ڷΰ���1.png");
		ImageIcon bk2 = new ImageIcon("�ڷΰ���2.png");
		ImageIcon p1 = new ImageIcon("�����ϱ�.png");
		ImageIcon p2 = new ImageIcon("�����ϱ�2.png");
		setBackground(new Color(255,255,255)); //���� 
		setLayout(null);
		setSize(600,800);
		
		int total =0;
		for(int i = 0 ; i< MyMenu.buylist.size(); i++) {
			total += MyMenu.buylist.get(i).getPrice() * MyMenu.buylist.get(i).getCount();
		}
		
		//��Ʈ 
		Font font = (new Font("MONOSPACED", Font.BOLD , 15));
		
		//�ֹ�����
		
		JPanel b1 = new JPanel(); 
		b1.setLayout(new GridLayout(1, 5));
		b1.setBounds(40, 20, 500, 120); 
		b1.setBackground(new Color(255,255,255));
		b1.setBorder(
			new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "�ֹ�����", 
			TitledBorder.LEADING, 
			TitledBorder.TOP, 
			new Font("MONOSPACED", Font.BOLD , 17), 
			new Color(000, 000, 000) ));
			add(b1);
			
			TextArea MyMenu = new TextArea(""
					+ "�����ݾ� : " +	total+" ��", 0,0,TextArea.SCROLLBARS_NONE);
			b1.add(MyMenu);
			
		// ����� ��û���� 
		JPanel b2 = new JPanel(); 
		b2.setLayout(new GridLayout(1, 5));
		b2.setBounds(40, 150, 500, 70); 
		b2.setBackground(new Color(255,255,255));
		b2.setBorder(
			new TitledBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY),"���Ի���Բ�",
			TitledBorder.LEADING, 
			TitledBorder.TOP,
			new Font("MONOSPACED", Font.BOLD , 17), 
			new Color(000, 000, 000) ))); 
			add(b2);

			TextField req = new TextField(("��) �ܹ��� ���� �ּ���!!"), 30);
			b2.add(req);
			
			req.addFocusListener(new FocusListener() {
				
				@Override
				public void focusLost(FocusEvent e) {
				}
				
				@Override
				public void focusGained(FocusEvent e) {
					if(req.getText().equals("��) �ܹ��� ���� �ּ���!!")) {
						req.setText("");
					}
				}
			});
			
			
		//����� �Է�
		
		JPanel b3 = new JPanel(); // ����� �г� ����
		b3.setLayout(new GridLayout(5, 5));
		b3.setBounds(40, 250, 500, 180); // , ,���γ���
		b3.setBackground(new Color(255,255,255));
		b3.setBorder(
			new TitledBorder( new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), //�׵θ�����
			"�������", //����
			TitledBorder.LEADING, //�ؽ�Ʈ ���Ĺ��:��������
			TitledBorder.TOP, //�ؽ�Ʈ ǥ�� ��ġ : ���
			new Font("MONOSPACED", Font.BOLD , 20), //��Ʈ ��������
			new Color(000, 000, 000) )); //����
			add(b3);
			
		// �ּ�
				JLabel label = new JLabel();
				TextField adress = new TextField();
				b3.add(new Label("�ּ�"));	
				b3.add(adress);
				
		// ��ȭ��ȣ 		
				TextField phone = new TextField();
				b3.add(new Label("��ȣ"));
				b3.add(phone);
		// �Ϸ�		
				JButton btn = new JButton("�Է�");
				btn.setBackground(Color.orange);
				b3.add(btn);
				btn.setEnabled(false);
				
		// �Ϸ� ��ư Ȱ��ȭ 		
				adress.addTextListener(new TextListener() {
					
					@Override
					public void textValueChanged(TextEvent e) { //���ڸ� ĥ�� �Է��� �� �ְ� Ǯ���ٲ�
						
						if(btn.getText().equals("")){ //������ ������ 
							btn.setEnabled(false); //��ư ���
							
						}
					}
				});
				phone.addTextListener(new TextListener() {
					
					@Override
					public void textValueChanged(TextEvent e) { //���ڸ� ĥ�� �Է��� �� �ְ� Ǯ���ٲ�
						
						if(btn.getText().equals("")){ //������ ������ 
							btn.setEnabled(false); //��ư ���
							
						}else{
							btn.setEnabled(true);// �׷��� ������ ��ư Ȱ��ȭ
						}
					}
				});
				
				//�����ϱ� ��ư
				JButton btnBuy = new JButton(p1);
				//btnBuy.setBorderPainted(false);
				btnBuy.setEnabled(false);
				
				btnBuy.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					
							JOptionPane.showMessageDialog(
						 null , "              �ֹ�����!!"+"\n");
							
					FrameBase.getInstance(new FrameStoreSelect());
						
					}
					
				});
			
				
		//����� �Է� ��
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
	    				ta.append("�ּ� : " + adress.getText()+"\n");
	    				adress.setText("");
	    				ta.append("��ȣ : " + phone.getText()+"\n");
	    				phone.setText("");
	    				phone.requestFocus();
	    			}
	    			
	    		});
				
		// �������� 
				JPanel b4 = new JPanel(); 
				b4.setLayout(new FlowLayout());
				b4.setBounds(40, 500, 500, 70);
				b4.setBackground(new Color(255,255,255));
				b4.setBorder(
						new TitledBorder( new TitledBorder(new LineBorder(Color.LIGHT_GRAY)), //�׵θ�����
						"��������", //����
						TitledBorder.LEADING, //�ؽ�Ʈ ���Ĺ��:��������
						TitledBorder.TOP, //�ؽ�Ʈ ǥ�� ��ġ : ���
						new Font("MONOSPACED", Font.BOLD , 20), 
						new Color(000, 000, 000)));
						add(b4);
				
				Label laber3 = new Label("��������");
				CheckboxGroup group = new CheckboxGroup();
				Checkbox card = new Checkbox("ī��", group,true);
				Checkbox money = new Checkbox("����",group,false);
				Checkbox orgpay = new Checkbox("orangePay",group,false);
			
				
				Font font2 = (new Font("MONOSPACED", Font.BOLD , 25));
			
				b4.add(card);
				b4.add(money);
				b4.add(orgpay);
				
				b4.setVisible(true);
				
		
		//�ڷΰ��� ��ư
				
				JButton btnBack = new JButton(bk1);
				JButton btnBack2 = new JButton(bk2);
				btnBack.setBorderPainted(false); //��ư�׵θ�����
				btnBack.setRolloverIcon(bk2); //���콺 �ø��� �̹��� �����
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
				
				btnBuy.setBorderPainted(false); //��ư�׵θ�����
				btnBuy.setRolloverIcon(p2); //���콺 �ø��� �̹��� �����
				
				
				add(btnBuy);
							
				

	}//������/

}