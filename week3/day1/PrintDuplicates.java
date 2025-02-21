package week3.day1;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class PrintDuplicates {
	public static void main(String[] args) {

		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>(); 
		
		for (Integer eachItem : array) {
			map.put(eachItem, map.getOrDefault(eachItem, 0)+1);	
		}
		
		System.out.println(map); 
		
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();  		
		
		for (Entry<Integer, Integer> eachItem : entrySet) {  			
			if(eachItem.getValue()>=2) {
			 System.out.println("The array item "+ eachItem.getKey() + " has " + eachItem.getValue() + " duplicates");
			 
			 break;														
			}
		}
	}

}