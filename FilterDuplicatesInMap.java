package org.sardar.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FilterDuplicatesInMap {

	public static final String im = "Learn Learn Java Programs again again";

	public static void main(String[] args) {
		String imSplit[] = im.split(" ");
		Map<String, Integer> fillStrings = new HashMap<String, Integer>();
		for (String s1 : imSplit) {
			if (fillStrings.get(s1) != null) {
				fillStrings.put(s1, fillStrings.get(s1) + 1);
			} else {
				fillStrings.put(s1, 1);
			}
		}

		Iterator<?> printString = fillStrings.entrySet().iterator();
		while (printString.hasNext()) {
			Map.Entry pair = (Map.Entry) printString.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		methodToFetchDuplicates(fillStrings);
	}
	
	private static void methodToFetchDuplicates(Map<String, Integer> fillStrings) {
		System.out.println("\n" + "Another way to find duplicates");
		Iterator<String> getKeys = fillStrings.keySet().iterator();
		while (getKeys.hasNext()) {
			String tempStr = getKeys.next();
			if (fillStrings.get(tempStr) > 1)
				System.out.println(tempStr + " Occured " + fillStrings.get(tempStr) + " time(s) ... ");
		}
	}
}






 
