package food;

import java.awt.BorderLayout;

import java.awt.Color;

import java.awt.Font;

import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DeliveryRev {

	public static void main(String[] args) {

		// 한글 입력 시 글씨가 뭉침
		// 돌아가기는 현재 닫기로 구현

		JFrame frame = new JFrame("리뷰");
		frame.setBounds(700, 100, 500, 700);
		// 프레임(가로 위치, 세로 위치, 가로 길이, 세로 길이)
		frame.setBackground(Color.CYAN);

		// 폰트
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

		// 입력창 패널
		JPanel pNorth = new JPanel();
		pNorth.setBackground(Color.PINK);

		// 입력창
		TextField tf = new TextField(30); // 입력상자의 길이
		JButton btn = new JButton("등록");
		btn.setEnabled(false);

		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);

		// 중간(화이트)
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

		// 리뷰들
		// 영어와 한글 글씨 굵기 차이 있음.
		ta.setText("맛있게 잘 먹었습니다~~\n" + "---------------------------------------------------\n" + "양 많아요\n"
				+ "---------------------------------------------------\n" + "넘 배불러서 놀랐어요 ,,,! 밥양 진짜 많아요 !!\n"
				+ "---------------------------------------------------\n" + "두 번째 주문이에요 항상 맛있는 음식 감사합니다\n"
				+ "---------------------------------------------------\n" + "와우 순삭했어요 다 먹었네여ㅠㅠ맛있습니다\n"
				+ "---------------------------------------------------\n" + "맛있어요!\n"
				+ "---------------------------------------------------\n" + "양도 많고, 맛도 좋고. 최고에요!\n"
				+ "---------------------------------------------------\n" + "맛있게 잘먹었습니당~~!!\n"
				+ "---------------------------------------------------\n" + "");

		ta.setBackground(Color.WHITE);
		ta.setFont(font);
		ta.setEditable(false);

		// 하단 (그레이)
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.LIGHT_GRAY);

		JButton btnSave = new JButton("돌아가기");

		pSouth.add(btnSave);

		frame.add(pNorth, BorderLayout.NORTH);

		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);

		frame.setVisible(true);
		frame.setResizable(false);

		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {

				if (tf.getText().equals("")) { // 내용이 없으면
					btn.setEnabled(false); // 버튼 잠금
				} else {
					btn.setEnabled(true); // 버튼 활성화
				}

			}
		});
		// -------------------------------------------------------------

		// 엔터키 동작
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {

				// TextField에 엔터값이 감지되면 아래 TextArea에 내용 추가
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {

					ta.append(tf.getText() + "\n---------------------------------------------------\n");

					tf.setText("");
					tf.requestFocus();
				}
			}
		});

		// "입력" 버튼 동작
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ta.append(tf.getText() + "\n---------------------------------------------------\n");

				tf.setText("");

				tf.requestFocus();

			}
		});

		// "돌아가기" 버튼 동작
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// 임시적으로 닫기 구현

			}
		});
		// ----------------------------------------------------------------

		// "X" 창 닫기
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);
			}
		});
	}

}
