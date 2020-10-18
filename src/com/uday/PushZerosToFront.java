package com.uday;

public class PushZerosToFront  {
	public static void main(String[] args) {
		int arr[] = {1, 2, 0, 4, 1, 0, 0, 9,0,10,0,5,2,0};
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=0) {
				if(arr[j]!=0) {
					j--;
				}else {
					arr[j]=arr[i];
					arr[i]=0;
					i++;
					j--;
				}
			}else {
				i++;
			}
		}
		for(int in=0;in<arr.length;in++) {
			System.out.println("value "+ arr[in]);
		}
	}
}
