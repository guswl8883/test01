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

		// �ѱ� �Է� �� �۾��� ��ħ
		// ���ư���� ���� �ݱ�� ����

		JFrame frame = new JFrame("����");
		frame.setBounds(700, 100, 500, 700);
		// ������(���� ��ġ, ���� ��ġ, ���� ����, ���� ����)
		frame.setBackground(Color.CYAN);

		// ��Ʈ
		Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

		// �Է�â �г�
		JPanel pNorth = new JPanel();
		pNorth.setBackground(Color.PINK);

		// �Է�â
		TextField tf = new TextField(30); // �Է»����� ����
		JButton btn = new JButton("���");
		btn.setEnabled(false);

		pNorth.add(tf);
		pNorth.add(btn);
		pNorth.setFont(font);

		// �߰�(ȭ��Ʈ)
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

		// �����
		// ����� �ѱ� �۾� ���� ���� ����.
		ta.setText("���ְ� �� �Ծ����ϴ�~~\n" + "---------------------------------------------------\n" + "�� ���ƿ�\n"
				+ "---------------------------------------------------\n" + "�� ��ҷ��� ������ ,,,! ��� ��¥ ���ƿ� !!\n"
				+ "---------------------------------------------------\n" + "�� ��° �ֹ��̿��� �׻� ���ִ� ���� �����մϴ�\n"
				+ "---------------------------------------------------\n" + "�Ϳ� �����߾�� �� �Ծ��׿��Фи��ֽ��ϴ�\n"
				+ "---------------------------------------------------\n" + "���־��!\n"
				+ "---------------------------------------------------\n" + "�絵 ����, ���� ����. �ְ���!\n"
				+ "---------------------------------------------------\n" + "���ְ� �߸Ծ����ϴ�~~!!\n"
				+ "---------------------------------------------------\n" + "");

		ta.setBackground(Color.WHITE);
		ta.setFont(font);
		ta.setEditable(false);

		// �ϴ� (�׷���)
		Panel pSouth = new Panel();
		pSouth.setFont(font);
		pSouth.setBackground(Color.LIGHT_GRAY);

		JButton btnSave = new JButton("���ư���");

		pSouth.add(btnSave);

		frame.add(pNorth, BorderLayout.NORTH);

		frame.add(ta, BorderLayout.CENTER);
		frame.add(pSouth, BorderLayout.SOUTH);

		frame.setVisible(true);
		frame.setResizable(false);

		tf.addTextListener(new TextListener() {

			@Override
			public void textValueChanged(TextEvent e) {

				if (tf.getText().equals("")) { // ������ ������
					btn.setEnabled(false); // ��ư ���
				} else {
					btn.setEnabled(true); // ��ư Ȱ��ȭ
				}

			}
		});
		// -------------------------------------------------------------

		// ����Ű ����
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {

				// TextField�� ���Ͱ��� �����Ǹ� �Ʒ� TextArea�� ���� �߰�
				if (e.getKeyChar() == KeyEvent.VK_ENTER) {

					ta.append(tf.getText() + "\n---------------------------------------------------\n");

					tf.setText("");
					tf.requestFocus();
				}
			}
		});

		// "�Է�" ��ư ����
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				ta.append(tf.getText() + "\n---------------------------------------------------\n");

				tf.setText("");

				tf.requestFocus();

			}
		});

		// "���ư���" ��ư ����
		btnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// �ӽ������� �ݱ� ����

			}
		});
		// ----------------------------------------------------------------

		// "X" â �ݱ�
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "���α׷��� �����մϴ�.");
				System.exit(0);
			}
		});
	}

}
