package Myjava;

import java.util.*;

public class FindNumbers {
	public static void main(String args[]) {
		int [] nums= {1,2,3,1,4,5,1,3,1,6,1};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i],map.get(nums[i])+1);
			}
			else
				map.put(nums[i], 1);
		}
	//	Set<Integer> k=map.keySet();
		for(int a:map.keySet()) {
			if(map.get(a)>nums.length/3) {
				System.out.println(a);
			}
		}
				
	}

}
