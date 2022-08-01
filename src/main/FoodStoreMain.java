package main;

import frame.FrameBase;
import frame.FrameStoreSelect;

public class FoodStoreMain {

	public static void main(String[] args) {
		FrameBase.getInstance(new FrameStoreSelect());
	}
}
