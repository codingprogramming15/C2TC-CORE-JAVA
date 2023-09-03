package com.tnsif.srccodes;

public class Arrayaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,5,78,96,74,25,12,2,36,96,11,22,44,66,77};
		 
		int sum =0;
		for (int i =0;i<array.length;i++) {
			sum += array[i];
	}
	int average = sum / array.length;
	System.out.println("average:"+average);
}
}

	


