package org.javathoughts.sardar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.javathoughts.*;

public class Runner implements Comparator<Laptop> {
	public static void main(String[] args) {
		List<Laptop> lapsList = new ArrayList<>();
		lapsList.add(new Laptop("Cyan", "HP", 800));
		lapsList.add(new Laptop("Blue", "Dell", 500));
		lapsList.add(new Laptop("Black", "Dell", 300));
		//lapsList.add(new Laptop("Blacfk", "Lenova2", 0));
		
		Comparator<Laptop> commer = new Comparator<Laptop>()
		{
			@Override
			public int compare(Laptop l1, Laptop l2){
				
				return l1.getBrand().compareTo(l2.getBrand());
				/*else 
					return -1;*/
			}
	
		};	
		
		Collections.sort(lapsList, commer);
		
		for(Laptop s : lapsList){
			System.out.println(s);
		}
	}

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return 0;
	}	
}

