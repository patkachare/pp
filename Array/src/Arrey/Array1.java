package Arrey;

import java.util.Arrays;

public class Array1 {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4};
	System.out.println(a[0]);
	System.out.println(a[3]);
	int b=(int) a.length;
	Arrays.sort(a);
	System.out.println(a[0]);
	System.out.println(a[3]);
	
}
}
