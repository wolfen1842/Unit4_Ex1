package it391.jsieglaff.unit4;

import java.util.Arrays;

public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentIDs = { 6501,9503,7557,5535,5601,9001,9888,8801,9767,7815};
		System.out.println("List of Student IDs unsorted: " + Arrays.toString(studentIDs));
		
		int low = 0;
		int high = studentIDs.length-1;
		
		sortAsc(studentIDs, low,high);
		
		System.out.println("Sorted List: " + Arrays.toString(studentIDs));
	}

	private static void sortAsc(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		if(arr == null || arr.length == 0)
			return;
		
		if(low>=high)
			return;
		
		int middle = low + (high-low)/2;
		int pivot = arr[middle];
		
		int i = low, j=high;
		
		while(i<=j) {
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j]>pivot) {
				j--;
			}
			
			if(i <= j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		
		if(low<j) {
			sortAsc(arr,low,j);
		}
		
		if(high>i)
			sortAsc(arr,i,high);
	}

}

