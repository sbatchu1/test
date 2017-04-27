package com.java.sorting;

public class SelectionSort {

	public void sort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int min_idx = i;
			boolean swapRequired = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[min_idx]) {
					System.out.println("iteration :"+j);
					min_idx = j;
					swapRequired = true;
				}
			}

			if(swapRequired){
				int temp = arr[min_idx];
				arr[min_idx] = arr[i];
				arr[i] = temp;
			}

		}

	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		SelectionSort ss = new SelectionSort();
		int[] arr = {2,1,8,7,4};
		ss.printArray(arr);
		ss.sort(arr);
		ss.printArray(arr);

	}

}
