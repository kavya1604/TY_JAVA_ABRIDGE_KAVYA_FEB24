package com.capgemini.assignment.third;

public class Long {




public static void main(String[] args) {
	long[] l=new long[3];
	l[0]=300l;
	l[1]=5000l;
	l[2]=3590l;
	printArrayData(l);
	long[] a=getArrayData();
	printArrayData(a);
	
}

	
static void printArrayData(long[] l) {
	for(int i=0;i<3;i++) 
		System.out.println(l[i]);
	}
	static long[] getArrayData() {
		long[] values= {5490l,6587l,5458l};
		return values;
		}
	
}
