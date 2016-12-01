package com.in28minutes.java.beginners.program.examples.search;

public class LinearSearch {

	public static int search(int numbers[],int numberToFind){

		for(int i = 0;i< numbers.length;i++){
			if(numbers[i]==numberToFind){
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(LinearSearch.search(new int[]{1}, 15)); //-1
		System.out.println(LinearSearch.search(new int[]{15,2,3,8,7}, 3));//2
	}

}
