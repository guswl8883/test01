package main;

import frame.FrameBase;
import frame.FrameStoreSelect;

public class TestMain {
	
	/*
	public static void main(String[] args) {
		new FrameMain();
	}
	*/
	
	public static void main(String[] args) {
		FrameBase.getInstance(new FrameStoreSelect());
	}
	
	
	/*
	public static void main(String[] args) {
		FrameBase.getInstance(new FrameBasket_2());
	}
	*/
	
}
