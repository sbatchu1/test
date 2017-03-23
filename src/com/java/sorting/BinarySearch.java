package com.java.sorting;

public class BinarySearch {
	public static void main(String[] args){
		BinarySearch search = new BinarySearch();
		int[] arr = {3, 20, 35, 43, 50, 63, 105};
		System.out.println(search.binarySearch(arr, 0, arr.length-1, 34));
	}

	private int binarySearch(int[] arr, int left, int right, int elementToFind) {
		if(right >= left){
			int mid = (right + left) / 2;
			
			if(arr[mid] == elementToFind)
				return mid;
			
			if(elementToFind > arr[mid])
				return binarySearch(arr, mid+1, right, elementToFind);
			
			return binarySearch(arr, left, mid-1, elementToFind);
		}
		return -1;
	}

}
