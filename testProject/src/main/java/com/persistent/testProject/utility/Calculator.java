package com.persistent.testProject.utility;

public class Calculator {
	public int sum(int...x) {
		int s=0;
		for(int i=0;i<x.length;i++) {
			s = s + x[i];
		}
		return s;
	}
	public int square(int x) {
		return x*x;
	}
	public int power(int x, int n) {
		int res=1;
		for(int i=1;i<=n;i=i+1) {
			res = res * x;
		}
		return res;
	}
	
}
