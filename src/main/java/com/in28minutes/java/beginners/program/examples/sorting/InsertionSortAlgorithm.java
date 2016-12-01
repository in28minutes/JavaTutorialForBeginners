package com.in28minutes.java.beginners.program.examples.sorting;

import java.util.Arrays;

public class InsertionSortAlgorithm {
	
	public static int[] insertionSort(int[] numbers) {
		
			  //At each pass
			  //0 to index-1 is sorted;
			  //element at index is bubbled up to the right place between 0 and index -1	
			  for(int index = 1;index<numbers.length;index++){
			    //Get the current element
				int current = numbers[index];
			    				
			    int i = index-1;
			    while(i>=0 && numbers[i]>current){
			      numbers[i+1] = numbers[i];
			      numbers[i]=current;
			      i = i-1;
			    }
			  }
			  return numbers;
	}

	public static void main(String[] args) {
		int sorted[] = InsertionSortAlgorithm.insertionSort(new int[] { 25, 35,
				12, 0, -1 });
		System.out.println(Arrays.toString(sorted));
	}

}
