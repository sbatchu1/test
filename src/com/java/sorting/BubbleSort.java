package com.java.sorting;

public class BubbleSort {
	
	public void sort(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if(arr[j] < arr[i])
				{
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i]= temp;
				}
			}
		}
		
	}
	
	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	
	public static void main(String[] args){
		BubbleSort bs = new BubbleSort();
		int[] arr = {65, 25, 12, 22, 11};
		bs.printArray(arr);
		bs.sort(arr);
		bs.printArray(arr);
		
	}

}
