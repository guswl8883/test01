package food;

//�޴��� �����ϱ����� �޴� Ŭ�����Դϴ�!
public class Menu {
	
	int price;
	String name;
	int count;
	String fooddInfo;
	

	public Menu(String name, int price, String foodInfo) {
		this.price=price;
		this.name=name;
		this.fooddInfo=foodInfo;
	}
	
	public String getFooddInfo() {
		return fooddInfo;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name+":"+price+"��";
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count += count;
	}
	public void minusCount(int count) {
		this.count -= count;
	}
	

}