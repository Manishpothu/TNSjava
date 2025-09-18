package com.tns.java;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int r,s = 0;
		int t = n;
		
		while(n > 0)
		{
			r=n % 10;
			n=n / 10;
			s=s * 10 + r;
			
					
		}
		if(t == n) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
