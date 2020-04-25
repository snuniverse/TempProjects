package com.demo;
import java.util.*;

public class TestArray {

	public static void main(String[] args) {
		int a[]= {1,9,2,4};
		maxProduct(a);

	}

	private static void maxProduct(int arr[]) {
		Arrays.sort(arr);
		int n=arr.length-1;
		int max=-1;
		int n1=-1,n2=-1;
		for(int i= n; i>=0;i--) {
			int num1 = arr[i];
			for(int j=i-1;j>=0;j--) {
				if(num1%3!=0 && arr[j]%3!=0) {
					continue;
				}
				if((num1*arr[j])%3==0) {
					max=num1*arr[j];
					n1=num1;n2=arr[j];
					break;
				}
			}
			if(max!=-1)break;
		}
		if(n1!=-1 && n2!=-1)
		System.out.println(n1 +"*" + n2 +"="+max);
	}
}
