package org.javathoughts.sardar;

import java.util.*;

interface classInterface {
	default void classDisp() {
		System.out.println("Class Display");
	}
}

class Test implements classInterface {
	public static void main(String[] args) {
		
		classInterface cI = new Test();
		cI.classDisp();
		String s = "a2c6j1";
		String[] s2 = s.split("(?<=\\G..)");
		for (String s3 : s2) {
			char c = s3.charAt(0);
			//System.out.println("Value here is:" + (int) s3.charAt(1));
			int n = s3.charAt(1) - 48;
			for (int i = 0; i < n; i++) {
				System.out.print(c);
			}
		}
	}
}