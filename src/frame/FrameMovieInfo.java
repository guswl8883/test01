package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import food.FoodStore;
//각 영화를 클릭했을 때 보여지는 상세페이지
public class FrameMovieInfo extends JPanel {
	
	public int movieflag = 0;
	
	public FrameMovieInfo(FoodStore m) {
		
		 // JPanel 구조
				setBackground(new Color(250, 244, 192));
				setLayout(null);
				setSize(600, 800);
			//포스터 부분	
			final int movieNum = 4;
				
				String[] movieurl = { 
						"땅스부대찌개.png",
						"홍콩반점0410.jpg",
						"교촌치킨.jpg", 
						"아웃백스테이크하우스.jpg"};

				ImageIcon[] storeImg = new ImageIcon[movieNum];

				for (int i = 0; i < movieNum; i++) {
			
					storeImg[i] = new ImageIcon(movieurl[i]);
					if (m.getsName().equals("땅스부대찌개")) {
						movieflag = 0;
					} else if (m.getsName().equals("홍콩반점0410")) {
						movieflag = 1;
					} else if (m.getsName().equals("교촌치킨")) {
						movieflag = 2;
					} else if (m.getsName().equals("아웃백스테이크하우스")) {
						movieflag = 3;
					}
				}//for
				//이미지를 JLable에 붙여서 출력
					JLabel img = new JLabel( storeImg[movieflag] );
					img.setBounds(50, 13, 150, 150);
					add(img);
					
				// 영화 관련 정보 텍스트
					TextArea story = new TextArea(
							"\n◎메뉴" + "\n" + "   " + m.getsName() + 
							"\n\n" + "◎평     점" + "\n" + "   " + 
							String.format("%.1f", m.getPersonScore()) + " / 5 점\n\n" + 
							"◎설명" + "\n" + "   " + m.getIntroduce(),
							0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
					story.setSize(580, 280);
					story.setLocation(0, 375);
					story.setBackground(new Color(0xFFD700));
					story.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
					add(story);
					story.setEditable(false);
					
			JButton btnReview = new JButton("리뷰 보기");

					btnReview.setBackground(new Color(229, 216, 92));
					btnReview.setSize(150, 40);
					btnReview.setLocation(400, 325);
					btnReview.setFont(new Font("나눔고딕코딩", Font.BOLD, 18));
					


					
					add(btnReview);

					//하단의 버튼
					JPanel bottomSet = new JPanel();

					bottomSet.setBounds(0, 660, 600, 100);
					bottomSet.setLayout(null);
					bottomSet.setBackground(new Color(0xFFD700));

					JButton btnBack = new JButton("뒤로가기");
					btnBack.setBackground(new Color(0xA6A6A6));
					btnBack.setSize(183, 87);
					btnBack.setLocation(5, 0);
					btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
					bottomSet.add(btnBack);

					int buttonNum = movieflag;
					btnBack.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FrameBase.getInstance(new FrameStoreSelect());
						}
					});
					
					JButton btnHome = new JButton("처음 화면으로");

					btnHome.setBackground(new Color(0xA6A6A6));
					btnHome.setSize(183, 87);
					btnHome.setLocation(198, 0);
					btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
					bottomSet.add(btnHome);

					btnHome.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FrameBase.getInstance(new DeliveryC());
						}
					});
					
					JButton btnBuy = new JButton("장바구니");

					btnBuy.setBackground(new Color(0xA6A6A6));
					btnBuy.setSize(183, 87);
					btnBuy.setLocation(391, 0);
					btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
					bottomSet.add(btnBuy);

					btnBuy.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent e) {
							FrameBase.getInstance(new FrameBasket());
						}
					});

					add(bottomSet, BorderLayout.SOUTH);
					}
	

}




