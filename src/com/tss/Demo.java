package com.tss;

import java.util.Arrays;

abstract class Instrument {
	// abstract method
	public abstract void createSound();
}

class Guitar extends Instrument {

	public void createSound() {
		System.out.println("Strum");
	}
}

class Drum extends Instrument {
	
	public void createSound() {
		System.out.println("Bang!");
	}
}

public class Demo {
	public static void main(String args[]) {
		Instrument guitar = new Guitar();
		guitar.createSound();
//		
//		String[] test = new String[] {"one", "two", "three"};
//		System.out.println(Arrays.toString(test));
	}
}