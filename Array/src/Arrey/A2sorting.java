package Arrey;

import java.util.Arrays;

public class A2sorting {
public static void main (String[]args) {
	int a[]= {1,3,5,0};
	int c[]=new int [10];
	int lastIndex=a.length -1;
	int m=0;
	//System.out.println(a[3]);
	Arrays.sort(a);
	for(int i=lastIndex; i>=0; i--) {
	c[m]=a[i];
	m++;
	}
	for (int i=0;i<=lastIndex; i++) {
	System.out.print(c[i]);
	}	
}
}
