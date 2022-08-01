package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import food.FoodStoreInfo2;



public class FrameDeliveryReview extends JPanel {

   public FrameDeliveryReview() {

	// JPanel 기본 구조
      setBackground(new Color(255,255,255));
      setLayout(null);
      setSize(600, 800);

      //이미지
      ImageIcon pop = new ImageIcon("ㅇㅇㅇ.jpg");
      JLabel lbl = new JLabel(pop);
      lbl.setSize(600, 150);
      lbl.setLocation(-5, 0);
      add(lbl);
      
      //음식점 선택 창
      JPanel dis2 = new JPanel();
      dis2.setLayout(new GridLayout(1,3));
      dis2.setBounds(10, 150, 565, 60);
      dis2.setBackground(new Color(255,255,255));
      dis2.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "음식점 선택", TitledBorder.LEFT, TitledBorder.TOP, 
    		  new Font (" monospaced", Font.BOLD, 17), new Color(255, 153, 051)));
      
     
      String mName[] = { "홍콩반점0410", "땅스부대찌개", "아웃백스테이크하우스", "교촌치킨" };
      ButtonGroup group1 = new ButtonGroup();
      JRadioButton menuButton[] = new JRadioButton[4];

      for (int i = 0; i < mName.length; i++) {
         menuButton[i] = new JRadioButton(mName[i]);
         menuButton[i].setFont(new Font("monospaced", Font.BOLD, 14));
         menuButton[i].setBackground(new Color(255,255,255));
         dis2.add(menuButton[i]);
         group1.add(menuButton[i]);

      } 
      
      add(dis2);
      //메뉴 선택 창
      JPanel lb1 = new JPanel();
      lb1.setLayout(new GridLayout(2,2));
      lb1.setBounds(10, 210, 565, 80);
      lb1.setBackground(new Color(255,255,255));

      lb1.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY), "메뉴 선택", TitledBorder.LEFT, TitledBorder.TOP, 
    		  new Font (" monospaced", Font.BOLD, 17), new Color(255, 153, 051)));
      
 
      JRadioButton menuButton2[] = new JRadioButton[4];
      for (int i = 0; i < menuButton2.length; i++) {
    	  menuButton2[i] = new JRadioButton();
    	  menuButton2[i].setFont(new Font("monospaced", Font.BOLD, 14));
    	  menuButton2[i].setBackground(new Color(255,255,255));
	lb1.add(menuButton2[i]);
	menuButton2[i].setVisible(false);
      }
  add(lb1);
      
  String[] menus = new String[4];
  
  
      menuButton[0].addActionListener(new ActionListener() {
  		
  		@Override
  		public void actionPerformed(ActionEvent e) {
  			
  			
  			menuButton2[0].setText("짬뽕");
  			menuButton2[1].setText("짜장면");
  			menuButton2[2].setText("고추짬뽕밥");
  			menuButton2[3].setText("탕수육");
  			
  			
  			menuButton2[0].setVisible(true);
  			menuButton2[1].setVisible(true);
  			menuButton2[2].setVisible(true);
  			menuButton2[3].setVisible(true);
	
  				}
  				
  			});
  

        menuButton[1].addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			
    			menuButton2[0].setText("오리지널 부대찌개");
    			menuButton2[1].setText("치즈 부대찌개");
    			menuButton2[2].setText("베이컨 부대찌개");
    			menuButton2[3].setText("왕만두 부대찌개");
    			
    			
    			menuButton2[0].setVisible(true);
    			menuButton2[1].setVisible(true);
    			menuButton2[2].setVisible(true);
    			menuButton2[3].setVisible(true);
 			
    				}
    				
    			});
        
      
        menuButton[2].addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			
    			menuButton2[0].setText("투움바파스타");
    			menuButton2[1].setText("아웃백 스페셜 갈릭 스테이크");
    			menuButton2[2].setText("베이비 백립");
    			menuButton2[3].setText("오지치즈 후라이즈");
    			
    			
    			menuButton2[0].setVisible(true);
    			menuButton2[1].setVisible(true);
    			menuButton2[2].setVisible(true);
    			menuButton2[3].setVisible(true);

    				}
    				
    			});
        
        menuButton[3].addActionListener(new ActionListener() {
    		
    		@Override
    		public void actionPerformed(ActionEvent e) {
    			
    			
    			menuButton2[0].setText("교촌리얼후라이드");
    			menuButton2[1].setText("교촌반반오리지날");
    			menuButton2[2].setText("교촌레드콤보");
    			menuButton2[3].setText("교촌허니콤보");
    			
    			
    			menuButton2[0].setVisible(true);
    			menuButton2[1].setVisible(true);
    			menuButton2[2].setVisible(true);
    			menuButton2[3].setVisible(true);
		
    				}
    				
    			});
        
        add(dis2);
        
        
      //이름입력
      		JLabel nl1 = new JLabel();
      		nl1.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY),
      		        "이름", TitledBorder.LEADING, 
      		        TitledBorder.TOP,
      		        new Font (" monospaced", Font.BOLD, 17), 
      		        new Color(255, 153, 051)));
      		nl1.setSize(564,80);
      		nl1.setLocation(10, 460);
      		TextField tff = new TextField(50);
      		tff.setBounds(30, 490, 200, 30);
      		tff.setFont(new Font(" monospaced", Font.BOLD, 16));
      		nl1.setFont(new Font(" monospaced", Font.BOLD, 14));
      		
      		add(tff);
      		add(nl1);
      		
      		//평가
      		JLabel n2 = new JLabel();
      		n2.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY),
      		        "리뷰를 남겨주세요", TitledBorder.LEADING, 
      		        TitledBorder.TOP,
      		        new Font (" monospaced", Font.BOLD, 17), 
      		      new Color(255, 153, 051)));
      		TextField rev = new TextField(50);
      		n2.setSize(564, 150);
      		n2.setLocation(10, 540);
      		n2.setFont(new Font(" monospaced", Font.BOLD, 16));
      		rev.setBounds(30,580,520,100);
      		rev.setFont(new Font(" monospaced", Font.BOLD,16));
      		add(rev);
      		add(n2);
      		
      		
      		ImageIcon oo = new ImageIcon("리뷰작성.png");
      		
      		JButton bt = new JButton("",oo);
      		 
      		bt.setBounds(470, 700, 100, 50);
      		bt.setBackground(new Color(255,255,255));
      		add(bt);
      		bt.setEnabled(false);
      		bt.setFont(new Font(" monospaced", Font.BOLD, 14));
      		
      		rev.addTextListener(new TextListener() {
      			
      			@Override
      			public void textValueChanged(TextEvent e) {
      				if(rev.getText().equals("")) {
      					bt.setEnabled(false);
      					
      				}
      				else {
      					bt.setEnabled(true);
      				}
      				
      			}
      		});
        
        
        
        
        
      //평점 창 
      JPanel dis1 = new JPanel(); 
      dis1.setBackground(new Color(255,255,255));
      dis1.setSize(565, 170);
      dis1.setLocation(10, 290);
      dis1.setLayout(new GridLayout(0,6));
      dis1.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY),
            "평점", TitledBorder.LEADING, 
            TitledBorder.TOP,
            new Font (" monospaced", Font.BOLD, 17), 
            new Color(255, 153, 051)));
      
      
      
      
      String mName2[] = { "1점", "2점", "3점", "4점", "5점" };
      ButtonGroup group2 = new ButtonGroup();
      JRadioButton pt1[] = new JRadioButton[5];
      dis1.add(new JLabel("맛"));
      
      for (int i = 0; i < mName2.length; i++) {
    	  pt1[i] = new JRadioButton(mName2[i]);
    	  pt1[i].setBackground(new Color(255,255,255));

        dis1.add(pt1[i]);
        group2.add(pt1[i]);

      }
      
   
      ButtonGroup group3 = new ButtonGroup();
      JRadioButton pt2[] = new JRadioButton[5];
      dis1.add(new JLabel("배달 "));
      
      for (int i = 0; i < mName2.length; i++) {
    	  pt2[i] = new JRadioButton(mName2[i]);
    	  pt2[i].setBackground(new Color(255,255,255));
    	  
    	  dis1.add(pt2[i]);
    	  group3.add(pt2[i]);
    	  
      }
      
      ButtonGroup group4 = new ButtonGroup();
      JRadioButton pt3[] = new JRadioButton[5];
      dis1.add(new JLabel("양 "));
      
      for (int i = 0; i < mName2.length; i++) {
    	  pt3[i] = new JRadioButton(mName2[i]);
    	  pt3[i].setBackground(new Color(255,255,255));
    	  
    	  dis1.add(pt3[i]);
    	  group4.add(pt3[i]);
    	  
      }

      
    add(dis1);

		
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 if (pt1[0].isSelected() || pt1[1].isSelected() || pt1[2].isSelected() || pt1[3].isSelected()
		                  || pt1[4].isSelected()) {
		            	
		            	for(int i = 0; i < menuButton2.length; i++) {
		        			if(menuButton2[i].isSelected()) {
		        				menus[i] = menuButton2[i].getText();
		        			}
		        		}
		            

		           
		               int num = 0;
		               if (pt1[0].isSelected()) {
		                  num = 1;
		               } else if (pt1[1].isSelected()) {
		                  num = 2;
		               } else if (pt1[2].isSelected()) {
		                  num = 3;
		               } else if (pt1[3].isSelected()) {
		                  num = 4;
		               } else if (pt1[4].isSelected()) {
		                  num = 5;
		                  
		               }
		               int num2 = 0;
						if (pt2[0].isSelected()) {
							num2 = 1;
						} else if (pt2[1].isSelected()) {
							num2 = 2;
						} else if (pt2[2].isSelected()) {
							num2 = 3;
						} else if (pt2[3].isSelected()) {
							num2 = 4;
						} else if (pt2[4].isSelected()) {
							num2 = 5;
						}
						
						int num3 = 0;
						if (pt3[0].isSelected()) {
							num3 = 1;
						} else if (pt3[1].isSelected()) {
							num3 = 2;
						} else if (pt3[2].isSelected()) {
							num3 = 3;
						} else if (pt3[3].isSelected()) {
							num3 = 4;
						} else if (pt3[4].isSelected()) {
							num3 = 5;
						}

						for (int i = 0; i < menuButton2.length; i++) {
						    if (menuButton[i].isSelected()) {
							//작성한 후기를 영화 리스트에 추가
							new FoodStoreInfo2().inputReview(
									menuButton[i].getText(), menus[0], menus[1], menus[2], menus[3], 
								tff.getText(), rev.getText(), num, num2, num3);
					           }
		               } 

		             
		              

		            }
				
				
			}
			
		});
		
               bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rev.getText()=="") {
					JOptionPane.showMessageDialog(null, "리뷰를 작성해주세요");
				}
				else
				JOptionPane.showMessageDialog(null, tff.getText()+"님"+"\n"+"리뷰작성 감사합니다 ");
				FrameBase.getInstance(new DeliveryC());
				//System.exit(0);
				
			}
			
		});
		

   }// 생성자

}