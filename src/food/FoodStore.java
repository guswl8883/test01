package food;

import java.util.ArrayList;

public class FoodStore {
	
	String sName; // 가게 이름
	int price; //메뉴들 가격 총합
	String introduce; //가게 소개
	
	String StoreInfo; //가게 정보
	String review; //(평점+이름+한줄평) 가게 음식 평가
	String review2; //리뷰 추가
	
	ArrayList<Menu> menulist=new ArrayList<Menu>();// 메뉴의 이름과 가격정보 배열방
	
	
	
	public FoodStore(String sName, String introduce, ArrayList<Menu> menulist, String StoreInfo, String review) {
		this.sName=sName;
		this.introduce=introduce;
		this.menulist=menulist;
		this.StoreInfo=StoreInfo;
		this.review=review;
	}
	
	public String getStoreInfo() {
		return StoreInfo;
	}

	public void setStoreInfo(String storeInfo) {
		StoreInfo = storeInfo;
	}

	public ArrayList<Menu> getMenulist() {
		return menulist;
	}

	public void setMenulist(ArrayList<Menu> menulist) {
		this.menulist = menulist;
	}
	
	public String getMenu(int num) {
		return menulist.get(num).getName();
	}
	
	public int getMenuPrice(int num) {
		return menulist.get(num).getPrice();
	}
	
	public ArrayList<Menu> getmenulist() {
		return menulist;
	}

	public void setmenulist(ArrayList<Menu> menulist) {
		this.menulist = menulist;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getReview() {
		return review;
	}
	
	
	
	
	
	double score;
	int total; //평점 누적합		
	int personScore; //방금 등록한 평점
	String rev; //한줄 평 등록
	int personNum; //평점 등록한 사람 수
	String reviewName = ""; //평점 등록한 사람 이름
	String menu1;
	String menu2;
	String menu3;
	String menu4;
	

	
	int DL2; //음식양 평가
	int DL3; //배달 평가
	
	
	
	
	public String getsName() {
		return sName;
	}
	public void setsName(String cName) {
		this.sName = cName;
	}
	
	public int getPersonScore() {
		return personScore;
	}

	public void setPersonScore(int personScore) {
		this.personScore = personScore;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice() {
		for(int i=0; i<menulist.size();i++) {
		this.price +=menulist.get(i).price;
		}
	}
	
	
	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getPersonNum() {
		return personNum;
	}

	public void setPersonNum() {
		this.personNum++;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getRev() {
		return rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}
	
	public String getreviewName() {
		return reviewName;
	}
	
	public void setreviewName(String reviewName) {
		this.reviewName = reviewName;
	}
	
	public String getmenu1() {
		return menu1;
	}
	
	public void setmenu1(String menu1) {
		this.menu1 = menu1;
	}
	public String getmenu2() {
		return menu2;
	}
	
	public void setmenu2(String menu2) {
		this.menu2 = menu2;
	}
	public String getmenu3() {
		return menu3;
	}
	
	public void setmenu3(String menu3) {
		this.menu3 = menu3;
	}
	public String getmenu4() {
		return menu4;
	}
	
	public void setmenu4(String menu4) {
		this.menu4 = menu4;
	}
	
	
	public int getDL2() {
		return DL2;
	}
	
	public int getDL3() {
		return DL3;
	}
	
	
	public void setDL2(int DL2) {
		this.DL2 = DL2;
	}
	
	public void setDL3(int DL3) {
		this.DL3 = DL3;
	}
		

	
	public double getScore() {
		return score;
	}

	public void setScore() {
		this.score = (double)this.total / this.personNum;
	}

	public String getReview2() {
		return review2;
	}

	//수정시작 4//////////////////////////////////////////////////////////////////////////
	public void setReview2() {
		
		String star = null;
		String star2 = null;
		String star3 = null;
		String star4 = null;
		
		if(this.menu1 == null) {
			this.menu1 = "";
		}
		if(this.menu2 == null) {
			this.menu2 = "";
		}
		if(this.menu3 == null) {
			this.menu3 = "";
		}
		if(this.menu4 == null) {
			this.menu4 = "";
		}
		
		if( this.total/3 == 5) {
			star = "★★★★★";
		}else if( this.total/3 == 4) {
			star = "★★★★★";
		}else if( this.total/3 == 3) {
			star = "★★★★☆";
		}else if( this.total/3 == 2) {
			star = "★★★☆☆";
		}else if( this.total/3 == 1) {
			star = "★★☆☆☆";
		}
		
		if( this.personScore == 5) {
			star2 = "★★★★★";
		}else if( this.personScore == 4) {
			star2 = "★★★★☆";
		}else if( this.personScore == 3) {
			star2 = "★★★☆☆";
		}else if( this.personScore == 2) {
			star2 = "★★☆☆☆";
		}else if( this.personScore == 1) {
			star2 = "★☆☆☆☆";
		}
		
		if( this.DL2 == 5) {
			star3 = "★★★★★";
		}else if( this.DL2 == 4) {
			star3 = "★★★★☆";
		}else if( this.DL2 == 3) {
			star3 = "★★★☆☆";
		}else if( this.DL2 == 2) {
			star3 = "★★☆☆☆";
		}else if( this.DL2 == 1) {
			star3 = "★☆☆☆☆";
		}
		
		if( this.DL3 == 5) {
			star4 = "★★★★★";
		}else if( this.DL3 == 4) {
			star4 = "★★★★☆";
		}else if( this.DL3 == 3) {
			star4 = "★★★☆☆";
		}else if( this.DL3 == 2) {
			star4 = "★★☆☆☆";
		}else if( this.DL3 == 1) {
			star4 = "★☆☆☆☆";
		}
		
		this.review2 = 
		
				              "╔═════════════════╗\n"
	                        + "          "+this.reviewName+" 님 "+star+"\n"
							+ "╚═════════════════╝\n"
							+ " "+this.menu1+" "+this.menu2+" "+this.menu3+" "+this.menu4+ "\n"
							+ "     ╭────────────╮\n" 						
							+ "           음식맛  "+star2+" \n" 
							+ "           음식양  "+star3+" \n" 
							+ "   \t\t     배달   "+star4+" \n" 
							+ "     ╰────────────╯\n"
							+ "            \t       \n" 
							+ " "+rev+"\n"
							+ "═══════════════════\n"
							+ "\n";
		
		
	}

	//수정시작 4 끝///////////////////////////////////////////////////////////////////////////////////
	
	
	public int gettotalprice() {
		int sum=0;
		for(int i=0; i<MyMenu.buylist.size(); i++) {
			sum += MyMenu.buylist.get(i).getPrice()*MyMenu.buylist.get(i).getCount();
		}return sum;
	}
	
}
