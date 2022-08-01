package food;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
//��ٱ��Ͽ� ���� Ŭ������, ��ٱ��ϴ� �̱������� �ۼ��Ǿ����ϴ�.
public class MyMenu {

	private static MyMenu instance;

	//��ٱ��Ͽ����� ���� �迭��.
	public static ArrayList<Menu> buylist = new ArrayList<Menu>();
	
	//�� �޴��� ������ ���� �� �ִ� ����������, 1~9���� ���۰���
	public static int count1 = 1;
	public static int count2 = 1;
	public static int count3 = 1;
	public static int count4 = 1;
	
	//�ش� Ŭ������ ��ü�� �����ϴ�
	public static MyMenu getMyMenu() {
		if (instance == null) {
			instance = new MyMenu();
		}
		return instance;
	}
	
	//��ٱ��Ͽ� ������ ��� �޼���
	public static void add(Menu m) {
		buylist.add(m);
		JOptionPane.showMessageDialog(null, m.getName() + "�� ��ٱ��Ͽ� ��ҽ��ϴ�.");
	}
	
	//��ٱ��ϸ� ���� �޼���
	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null,"��ٱ��ϸ� ������ϴ�.");
	}
	
	public static void countmenu1(int c) {
		count1 = c;
	}

	public static void countmenu2(int c) {
		count2 = c;
	}

	public static void countmenu3(int c) {
		count3 = c;
	}

	public static void countmenu4(int c) {
		count4 = c;
	}
	//��� count �ʱ�ȭ
	public static void resetcount() {
		MyMenu.count1=1;
    	MyMenu.count2=1;
    	MyMenu.count3=1;
    	MyMenu.count4=1;
	}

}