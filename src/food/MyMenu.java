package food;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
//장바구니에 쓰일 클래스로, 장바구니는 싱글톤으로 작성되었습니다.
public class MyMenu {

	private static MyMenu instance;

	//장바구니역할을 해줄 배열방.
	public static ArrayList<Menu> buylist = new ArrayList<Menu>();
	
	//각 메뉴의 갯수를 정할 수 있는 수량설정값, 1~9까지 조작가능
	public static int count1 = 1;
	public static int count2 = 1;
	public static int count3 = 1;
	public static int count4 = 1;
	
	//해당 클래스의 객체를 갖고갑니다
	public static MyMenu getMyMenu() {
		if (instance == null) {
			instance = new MyMenu();
		}
		return instance;
	}
	
	//장바구니에 음식을 담는 메서드
	public static void add(Menu m) {
		buylist.add(m);
		JOptionPane.showMessageDialog(null, m.getName() + "을 장바구니에 담았습니다.");
	}
	
	//장바구니를 비우는 메서드
	public static void clear() {
		buylist.clear();
		JOptionPane.showMessageDialog(null,"장바구니를 비웠습니다.");
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
	//모든 count 초기화
	public static void resetcount() {
		MyMenu.count1=1;
    	MyMenu.count2=1;
    	MyMenu.count3=1;
    	MyMenu.count4=1;
	}

}